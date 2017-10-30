package br.com.pmattiollo.tradevalidationapi.event;

import br.com.pmattiollo.tradevalidationapi.model.trade.Trade;

public class DateValidationEvent extends ValidationEvent {
	
	private static final long serialVersionUID = 1L;

	public DateValidationEvent(Object source, Trade trade) {
		super(source);
	}

	@Override
	public void validate() {
		System.out.println("Teste");
	}

}
