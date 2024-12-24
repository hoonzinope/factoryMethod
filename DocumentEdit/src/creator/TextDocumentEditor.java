package creator;

import document.Document;
import document.TextDocument;

public class TextDocumentEditor extends DocumentEditor {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
