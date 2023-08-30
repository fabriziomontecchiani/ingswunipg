package ecommerce.model;

public class Prodotto {
	
	private String codice;
	private float prezzo;
	
	public Prodotto(String codice, float prezzo) {
		this.codice = codice;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public float getPrezzo() {
		return prezzo;
	}
}
