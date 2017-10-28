package br.com.pmattiollo.tradevalidationapi.model.validation;

public interface BusinessRule<T, S> {
	
	public S validate(T data);

}
