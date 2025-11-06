package br.edu.atitus.currency_service.clients;

import java.util.Collections;

public class CurrencyBCFallback implements CurrencyBCClient{

	@Override
	public CurrencyBCResponse getCurrency(String moeda) {
		CurrencyBCResponse fallback = new CurrencyBCResponse();
		fallback.setValue(Collections.emptyList());
		return fallback;
	}

}
