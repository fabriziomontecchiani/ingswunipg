package ecommerce.custom;

import ecommerce.model.Ordine;
import ecommerce.model.Sconto;

public class ScontoPercentuale implements Sconto {

	private float percentualeSconto;

	public ScontoPercentuale(float percentualeSconto) {
		this.percentualeSconto = percentualeSconto;
	}

	@Override
	public float applica(Ordine ordine) {
		return ordine.calcolaTotaleEuro() * (1 - this.percentualeSconto);
	}

}
