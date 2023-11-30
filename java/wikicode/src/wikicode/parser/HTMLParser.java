package wikicode.parser;

import wikicode.model.BoldText;
import wikicode.model.Hyperlink;
import wikicode.model.Parser;
import wikicode.model.PlainText;

public class HTMLParser implements Parser{

	@Override
	public String parse(PlainText part) {
		return part.getText();
	}

	@Override
	public String parse(BoldText part) {
		return "<b>" + part.getText() + "</b>";
	}

	@Override
	public String parse(Hyperlink part) {
		return "<a href=\"" + part.getUrl() + "\">" + part.getText() + "</a>";
	}

}
