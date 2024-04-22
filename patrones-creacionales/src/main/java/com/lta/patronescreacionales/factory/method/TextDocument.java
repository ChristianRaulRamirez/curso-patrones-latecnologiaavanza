package com.lta.patronescreacionales.factory.method;

class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening text document...");
    }

    @Override
    public void save() {
        System.out.println("Saving text document...");
    }

    @Override
    public void close() {
        System.out.println("Closing text document...");
    }
}
