package br.com.pmattiollo.tradevalidationapi.model.validation;

import java.util.List;

import br.com.pmattiollo.tradevalidationapi.model.trade.Trade;

public class TradeValidationResult {

	private Trade trade;
	private List<ValidationMessage> messages;

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	public List<ValidationMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<ValidationMessage> messages) {
		this.messages = messages;
	}

}
