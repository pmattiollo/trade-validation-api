package br.com.pmattiollo.tradevalidationapi.model.validation;

public class ValidationMessage {

	private String simpleMessage;
	private String DetailedMessage;

	public String getSimpleMessage() {
		return simpleMessage;
	}

	public void setSimpleMessage(String simpleMessage) {
		this.simpleMessage = simpleMessage;
	}

	public String getDetailedMessage() {
		return DetailedMessage;
	}

	public void setDetailedMessage(String detailedMessage) {
		DetailedMessage = detailedMessage;
	}

}
