package br.com.pmattiollo.tradevalidationapi.model.trade;

import java.time.LocalDate;

public class Trade {

	private Customer customer;
	private String ccyPair;
	private Type type;
	private Style style;
	private String direction;
	private String strategy;
	private LocalDate tradeDate;
	private Double amount1;
	private Double amount2;
	private Double rate;
	private LocalDate valueDate;
	private LocalDate deliveryDate;
	private LocalDate expiryDate;
	private LocalDate excerciseStartDate;
	private String payCcy;
	private Double premium;
	private String premiumCcy;
	private String premiumType;
	private LocalDate premiumDate;
	private String legalEntity;
	private String trader;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCcyPair() {
		return ccyPair;
	}

	public void setCcyPair(String ccyPair) {
		this.ccyPair = ccyPair;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public LocalDate getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(LocalDate tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Double getAmount1() {
		return amount1;
	}

	public void setAmount1(Double amount1) {
		this.amount1 = amount1;
	}

	public Double getAmount2() {
		return amount2;
	}

	public void setAmount2(Double amount2) {
		this.amount2 = amount2;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public LocalDate getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public LocalDate getExcerciseStartDate() {
		return excerciseStartDate;
	}

	public void setExcerciseStartDate(LocalDate excerciseStartDate) {
		this.excerciseStartDate = excerciseStartDate;
	}

	public String getPayCcy() {
		return payCcy;
	}

	public void setPayCcy(String payCcy) {
		this.payCcy = payCcy;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public String getPremiumCcy() {
		return premiumCcy;
	}

	public void setPremiumCcy(String premiumCcy) {
		this.premiumCcy = premiumCcy;
	}

	public String getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}

	public LocalDate getPremiumDate() {
		return premiumDate;
	}

	public void setPremiumDate(LocalDate premiumDate) {
		this.premiumDate = premiumDate;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getTrader() {
		return trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

}
