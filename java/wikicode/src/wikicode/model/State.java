package wikicode.model;

public interface State {
	void handleEdit(WikiCodeDoc doc);

	void handleExport(WikiCodeDoc doc);

	boolean handleClosing(WikiCodeDoc doc);
}
