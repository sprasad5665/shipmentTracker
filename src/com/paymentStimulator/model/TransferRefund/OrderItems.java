package com.paymentStimulator.model.TransferRefund;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name","sku","units","selling_price","discount","tax","hsn" })
public class OrderItems {
	@JsonProperty("name")
	private String name;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("units")
	private String units;
	@JsonProperty("selling_price")
	private String sellingPrice;
	@JsonProperty("discount")
	private String discount;
	@JsonProperty("tax")
	private String tax;
	@JsonProperty("hsn")
	private String hsn;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}
	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}
	@JsonProperty("units")
	public String getUnits() {
		return units;
	}
	@JsonProperty("units")
	public void setUnits(String units) {
		this.units = units;
	}
	@JsonProperty("selling_price")
	public String getSellingPrice() {
		return sellingPrice;
	}
	@JsonProperty("selling_price")
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	@JsonProperty("discount")
	public String getDiscount() {
		return discount;
	}
	@JsonProperty("discount")
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	@JsonProperty("tax")
	public String getTax() {
		return tax;
	}
	@JsonProperty("tax")
	public void setTax(String tax) {
		this.tax = tax;
	}
	@JsonProperty("hsn")
	public String getHsn() {
		return hsn;
	}
	@JsonProperty("hsn")
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}


	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
