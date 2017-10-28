package br.com.pmattiollo.tradevalidationapi.model.trade;

public enum LegalEntity {

	CS_ZURICH("CS Zurich");

	private String value;

	private LegalEntity(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
