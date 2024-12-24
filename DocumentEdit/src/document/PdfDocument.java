package document;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("document.PdfDocument opened");
    }

    @Override
    public void close() {
        System.out.println("document.PdfDocument closed");
    }

    @Override
    public void save() {
        System.out.println("document.PdfDocument saved");
    }
}
