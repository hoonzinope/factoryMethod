import creator.DocumentEditor;
import creator.PdfDocumentEditor;
import creator.TextDocumentEditor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DocumentEditor editor = new TextDocumentEditor();
        editor.editDocument();

        editor = new PdfDocumentEditor();
        editor.editDocument();
    }
}