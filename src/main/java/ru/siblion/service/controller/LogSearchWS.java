package ru.siblion.service.controller;

import org.apache.commons.configuration.ConfigurationException;
import org.xml.sax.SAXException;
import ru.siblion.service.model.request.SearchInfo;
import ru.siblion.service.model.response.LogSearchResult;
import ru.siblion.service.model.response.SearchInfoResult;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

@Stateless
@WebService
public class LogSearchWS {

    @Inject
    private SearchResultManager searchResultManager;

    @Inject
    private FileManager fileManager;

    @WebMethod
    public LogSearchResult logSearchAsync(SearchInfo searchInfo) throws ParseException, TransformerException, IOException, JAXBException, SQLException, SAXException, ConfigurationException {
        LogSearchResult logSearchResult = new LogSearchResult();
        if (fileSearch(searchInfo)) {
            logSearchResult.setResponse(fileManager.getFileAbsolutePath());
        } else {
            generateFile(searchInfo);
            logSearchResult.setResponse(fileManager.getFileAbsolutePath());
        }

        return logSearchResult;

    }

    @WebMethod
    public SearchInfoResult logSearchSync(SearchInfo searchInfo) throws IOException, ConfigurationException {
        return searchResultManager.searchLogs(searchInfo);
    }

    @WebMethod(exclude = true)
    private boolean fileSearch(SearchInfo searchInfo) throws SQLException, ParseException {
        return fileManager.fileSearch(searchInfo);
    }

    @WebMethod(exclude = true)
    private void generateFile(SearchInfo searchInfo) throws TransformerException, IOException, JAXBException, SQLException, SAXException, ConfigurationException {
        String absolutePath = fileManager.generateFileAbsolutePath(searchInfo.getFileExtention());
        fileManager.setFileAbsolutePath(absolutePath);
        fileManager.generateFile(searchInfo);
    }
}
