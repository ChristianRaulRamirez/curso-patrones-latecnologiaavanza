package com.lta.patronescreacionales.factory.method;

class SpreadsheetDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening spreadsheet document...");
    }

    @Override
    public void save() {
        System.out.println("Saving spreadsheet document...");
    }

    @Override
    public void close() {
        System.out.println("Closing spreadsheet document...");
    }
}