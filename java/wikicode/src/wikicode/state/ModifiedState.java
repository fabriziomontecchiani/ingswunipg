package wikicode.state;

import wikicode.model.State;
import wikicode.model.WikiCodeDoc;

public class ModifiedState implements State{

	@Override
	public void handleExport(WikiCodeDoc doc) {
		doc.setStatus(new UnmodifiedState());
	}

	@Override
	public boolean handleClosing(WikiCodeDoc doc) {
		return false;
	}

	@Override
	public void handleEdit(WikiCodeDoc doc) {
		doc.setStatus(new ModifiedState());
	}
	
	public String toString() {
		return "Document in modified state";
	}

}
