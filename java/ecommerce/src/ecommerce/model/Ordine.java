package ecommerce.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public abstract class Ordine {
	
	private Collection<ElementoOrdine> elementi;
	private Sconto strategiaSconto;
	private Cliente cliente;
	private Date dataOrdine;
	
	public Ordine(Cliente cliente) {
		this.cliente = cliente;
		this.elementi = new ArrayList<ElementoOrdine>();
		this.strategiaSconto = new NoSconto();
		this.dataOrdine = new Date();
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Date getDataOrdine() {
		return this.dataOrdine;
	}
	
	public Sconto getStrategiaSconto() {
		return this.strategiaSconto;
	}
	
	public void setStrategiaSconto(Sconto s) {
		this.strategiaSconto = s;
	}
	
	public float calcolaTotaleConScontoEuro() {
		return this.strategiaSconto.applica(this);
	}
	
	public void aggiungiElemento(ElementoOrdine eo) {
		this.elementi.add(eo);
	}
	
	public Iterator<ElementoOrdine> getElementi(){
		return this.elementi.iterator();
	}
	
	public float calcolaTotaleEuro() {
		float tot = 0;
		for(ElementoOrdine eo:elementi) {
			float prezzo = eo.getPrezzoElemento();
			tot += prezzo;
		}
		return tot;
	}
	
	public void paga() {
		System.out.println("PAGAMENTO DI EURO "+this.calcolaTotaleConScontoEuro());
		this.doPostPagamento();
	}
	
	protected abstract void doPostPagamento();
}
