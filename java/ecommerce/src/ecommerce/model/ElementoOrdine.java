package ecommerce.model;

public class ElementoOrdine {
	
	private Prodotto prodotto;
	private int quantit‡;

	public ElementoOrdine(Prodotto prodotto, int quantit‡) {
		this.prodotto = prodotto;
		this.quantit‡ = quantit‡;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public int getQuantit‡() {
		return quantit‡;
	}

	public void aggiungi(int quantit‡Aggiunta) {
		this.quantit‡ += quantit‡Aggiunta;
	}
	
	public float getPrezzoElemento() {
		return getQuantit‡() * getProdotto().getPrezzo();
	}
}
