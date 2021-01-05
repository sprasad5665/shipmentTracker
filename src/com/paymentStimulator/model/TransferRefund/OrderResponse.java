package com.paymentStimulator.model.TransferRefund;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "order_id", "shipment_id", "status", "status_code", "onboarding_completed_now", "awb_code",
		"courier_company_id", "courier_name" })
public class OrderResponse {
	@JsonProperty("order_id")
	private float order_id;
	@JsonProperty("shipment_id")
	private float shipment_id;
	@JsonProperty("status")
	private String status;
	@JsonProperty("status_code")
	private float status_code;
	@JsonProperty("onboarding_completed_now")
	private float onboarding_completed_now;
	@JsonProperty("awb_code")
	private String awb_code;
	@JsonProperty("courier_company_id")
	private String courier_company_id;
	@JsonProperty("courier_name")
	private String courier_name;

	// Getter Methods

	@JsonProperty("order_id")
	public float getOrder_id() {
		return order_id;
	}

	@JsonProperty("shipment_id")
	public float getShipment_id() {
		return shipment_id;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status_code")
	public float getStatus_code() {
		return status_code;
	}

	@JsonProperty("onboarding_completed_now")
	public float getOnboarding_completed_now() {
		return onboarding_completed_now;
	}

	@JsonProperty("awb_code")
	public String getAwb_code() {
		return awb_code;
	}

	@JsonProperty("courier_company_id")
	public String getCourier_company_id() {
		return courier_company_id;
	}

	@JsonProperty("courier_name")
	public String getCourier_name() {
		return courier_name;
	}

	// Setter Methods
	@JsonProperty("order_id")
	public void setOrder_id(float order_id) {
		this.order_id = order_id;
	}

	@JsonProperty("shipment_id")
	public void setShipment_id(float shipment_id) {
		this.shipment_id = shipment_id;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("status_code")
	public void setStatus_code(float status_code) {
		this.status_code = status_code;
	}

	@JsonProperty("onboarding_completed_now")
	public void setOnboarding_completed_now(float onboarding_completed_now) {
		this.onboarding_completed_now = onboarding_completed_now;
	}

	@JsonProperty("awb_code")
	public void setAwb_code(String awb_code) {
		this.awb_code = awb_code;
	}

	@JsonProperty("courier_company_id")
	public void setCourier_company_id(String courier_company_id) {
		this.courier_company_id = courier_company_id;
	}

	@JsonProperty("courier_name")
	public void setCourier_name(String courier_name) {
		this.courier_name = courier_name;
	}
}
