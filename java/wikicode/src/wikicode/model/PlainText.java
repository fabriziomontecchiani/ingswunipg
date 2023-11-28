package wikicode.model;

public class PlainText extends DocumentPart {
	@Override
	public String acceptParser(Parser parser) {
		return parser.parse(this);
	}
}
