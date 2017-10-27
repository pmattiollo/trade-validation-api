package br.com.pmattiollo.tradevalidationapi.event.listener;

import org.springframework.context.ApplicationListener;

import br.com.pmattiollo.tradevalidationapi.event.ValidationEvent;

public class ValidationListener implements ApplicationListener<ValidationEvent> {

	@Override
	public void onApplicationEvent(ValidationEvent event) {
		event.validate();
	}

}
