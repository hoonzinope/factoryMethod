package document;

import document.Document;

public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("document.TextDocument opened");
    }

    @Override
    public void close() {
        System.out.println("document.TextDocument closed");
    }

    @Override
    public void save() {
        System.out.println("document.TextDocument saved");
    }
}
