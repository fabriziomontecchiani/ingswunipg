package ecommerce.model;

public class NoSconto implements Sconto {

	@Override
	public float applica(Ordine ordine) {
		return ordine.calcolaTotaleEuro();
	}

}
