package ecommerce.custom;

import ecommerce.model.Cliente;
import ecommerce.model.Ordine;

public class OrdineConSMS extends Ordine{

	public OrdineConSMS(Cliente cliente) {
		super(cliente);
	}

	@Override
	protected void doPostPagamento() {
		System.out.println("Invio SMS...");
	}

}
