package ru.siblion.util;

public enum FileExtension { PDF("PDF"), LOG("LOG"), DOC("DOC"), XML("XML"), HTML("HTML"), RTF("RTF");

    private final String fileExtension;

    FileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}