package ecommerce.custom;

import java.util.Iterator;

import ecommerce.model.ElementoOrdine;
import ecommerce.model.Ordine;
import ecommerce.model.Sconto;

public class MenoCaroMetà implements Sconto {

	@Override
	public float applica(Ordine ordine) {
		ElementoOrdine menoCaro = findMenoCaro(ordine);
		float prezzoMenoCaro = menoCaro.getProdotto().getPrezzo();
		int qntMenoCaro = menoCaro.getQuantità();
		float totaleEuro = ordine.calcolaTotaleEuro();
		totaleEuro -= prezzoMenoCaro * qntMenoCaro;
		totaleEuro += (prezzoMenoCaro / 2) * qntMenoCaro;
		return totaleEuro;
	}

	private ElementoOrdine findMenoCaro(Ordine ordine) {
		Iterator<ElementoOrdine> elementi = ordine.getElementi();
		ElementoOrdine menoCaro = null;
		while (elementi.hasNext()) {
			ElementoOrdine elemento = elementi.next();
			float prezzo = elemento.getProdotto().getPrezzo();
			if (menoCaro == null || prezzo < menoCaro.getProdotto().getPrezzo()) {
				menoCaro = elemento;
			}
		}
		return menoCaro;
	}

}
