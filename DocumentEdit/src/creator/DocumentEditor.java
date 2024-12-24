package creator;

import document.Document;

public abstract class DocumentEditor {
    public abstract Document createDocument();

    public void editDocument() {
        Document document = createDocument();
        document.open();
        document.save();
        document.close();
    }
}
