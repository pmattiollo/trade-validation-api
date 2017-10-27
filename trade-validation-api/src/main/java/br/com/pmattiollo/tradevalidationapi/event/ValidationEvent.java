package br.com.pmattiollo.tradevalidationapi.event;

import org.springframework.context.ApplicationEvent;

public abstract class ValidationEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;

	public ValidationEvent(Object source) {
		super(source);
	}
	
	public abstract void validate();

}
