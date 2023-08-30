import ecommerce.custom.MenoCaroMetà;
import ecommerce.custom.OrdineConSMS;
import ecommerce.custom.ScontoPercentuale;
import ecommerce.model.Cliente;
import ecommerce.model.ElementoOrdine;
import ecommerce.model.Ordine;
import ecommerce.model.Prodotto;

public class Test {

	public static void main(String[] args) {
		Ordine o = new OrdineConSMS(new Cliente());
		o.aggiungiElemento(new ElementoOrdine(new Prodotto("AAA", 10.0f), 1));
		o.aggiungiElemento(new ElementoOrdine(new Prodotto("BBB", 5.5f), 2));
		o.aggiungiElemento(new ElementoOrdine(new Prodotto("CCC", 2.0f), 3));
		System.out.println("TOTALE NO SCONTO: " + o.calcolaTotaleConScontoEuro());
		o.setStrategiaSconto(new ScontoPercentuale(0.5f));
		System.out.println("TOTALE SCONTO 50%: " + o.calcolaTotaleConScontoEuro());
		o.setStrategiaSconto(new MenoCaroMetà());
		System.out.println("TOTALE MENO CARO META': " + o.calcolaTotaleConScontoEuro());
		o.paga();
	}

}
