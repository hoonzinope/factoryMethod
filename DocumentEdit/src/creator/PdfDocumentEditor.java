package creator;

import document.Document;
import document.PdfDocument;

public class PdfDocumentEditor extends DocumentEditor {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
