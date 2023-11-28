package wikicode.state;

import wikicode.model.State;
import wikicode.model.WikiCodeDoc;

public class EmptyState implements State{
	
	@Override
	public void handleExport(WikiCodeDoc doc) {}

	@Override
	public boolean handleClosing(WikiCodeDoc doc) {
		return true;
	}
	
	@Override
	public void handleEdit(WikiCodeDoc doc) {
		doc.setStatus(new ModifiedState());
	}

	public String toString() {
		return "Document in empty state";
	}
}
