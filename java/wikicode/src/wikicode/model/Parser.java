package wikicode.model;

public interface Parser {

	String parse(PlainText part);

	String parse(BoldText part);

	String parse(Hyperlink part);

}
