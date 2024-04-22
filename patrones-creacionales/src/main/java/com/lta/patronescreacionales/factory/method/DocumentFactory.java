package com.lta.patronescreacionales.factory.method;

public class DocumentFactory {

    public static Document createDocument(String type) {
        switch (type.toLowerCase()) {
            case "text":
                return new TextDocument();
            case "spreadsheet":
                return new SpreadsheetDocument();
            default:
                throw new IllegalArgumentException("Invalid document type: " + type);
        }
    }

}
