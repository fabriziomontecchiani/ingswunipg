package wikicode.model;

public class Hyperlink extends DocumentPart{
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String acceptParser(Parser parser) {
		return parser.parse(this);
	}
}
