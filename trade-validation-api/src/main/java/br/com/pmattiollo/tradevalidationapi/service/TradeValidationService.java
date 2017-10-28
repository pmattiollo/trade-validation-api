package br.com.pmattiollo.tradevalidationapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class TradeValidationService {
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	public void validate() {
		
	}

}
