package document;

public class HtmlDocument implements Document {
    @Override
    public void open() {
        System.out.println("document.HtmlDocument opened");
    }

    @Override
    public void close() {
        System.out.println("document.HtmlDocument closed");
    }

    @Override
    public void save() {
        System.out.println("document.HtmlDocument saved");
    }
}
