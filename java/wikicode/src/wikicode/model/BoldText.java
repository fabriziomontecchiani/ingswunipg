package wikicode.model;

public class BoldText extends DocumentPart{
	@Override
	public String acceptParser(Parser parser) {
		return parser.parse(this);
	}
}
