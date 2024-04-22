package com.lta.patronescreacionales.factory.method;

public class Test {
    public static void main(String[] args) {

        Document textDocument = DocumentFactory.createDocument("text");
        textDocument.open();
        textDocument.save();
        textDocument.close();

        Document spreadsheetDocument = DocumentFactory.createDocument("spreadsheet");
        spreadsheetDocument.open();
        spreadsheetDocument.save();
        spreadsheetDocument.close();

    }
}
