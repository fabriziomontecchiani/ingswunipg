import wikicode.model.BoldText;
import wikicode.model.Hyperlink;
import wikicode.model.Parser;
import wikicode.model.PlainText;
import wikicode.model.WikiCodeDoc;
import wikicode.parser.HTMLParser;
import wikicode.state.EmptyState;

public class Test {

	public static void main(String[] args) {
		WikiCodeDoc doc = new WikiCodeDoc(new EmptyState());
		System.out.println(doc.getStatus().toString()+", can be closed: "+doc.canClose());

		BoldText title = new BoldText();
		title.setText("SOME TITLE: ");
		Hyperlink link = new Hyperlink();
		link.setText("MY PAGE");
		link.setUrl("https://www.google.it");
		PlainText text = new PlainText();
		text.setText(" BYE BYE ");
		doc.addPart(title);
		doc.addPart(link);
		doc.addPart(text);
		System.out.println(doc.getStatus().toString()+", can be closed: "+doc.canClose());
		
		Parser p1 = new HTMLParser();
		System.out.println("EXPORT: "+doc.acceptParser(p1));
		System.out.println(doc.getStatus().toString()+", can be closed: "+doc.canClose());
	}

}
