package wikicode.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class WikiCodeDoc {
	
	private State status;
	private Collection<DocumentPart> parts;

	public WikiCodeDoc(State status) {
		this.status = status;
		this.parts = new LinkedList<DocumentPart>();
	}

	public State getStatus() {
		return this.status;
	}

	public void setStatus(State status) {
		this.status = status;
	}

	public void addPart(DocumentPart part) {
		status.handleEdit(this);
		parts.add(part);
	}

	public void removePart(DocumentPart part) {
		status.handleEdit(this);
		parts.remove(part);
	}

	public Iterator<DocumentPart> getParts() {
		return parts.iterator();
	}

	public String acceptParser(Parser parser) {
		status.handleExport(this);
		String text = "";
		for (DocumentPart part : parts) {
			text += part.acceptParser(parser);
		}
		return text;
	}

	public boolean canClose() {
		return status.handleClosing(this);
	}
}
