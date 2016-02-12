/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotelbeds.hotelapimodel.auto.common.SimpleTypes.RateType;
import com.hotelbeds.hotelapimodel.auto.convert.json.RateSerializer;
import java.math.BigDecimal;
import javax.validation.Valid;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
public class BasicRate {

	@JsonProperty
	private String rateKey;
	private String rateClass;
	@Valid
	private RateType rateType;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal net;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal discount;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal discountPCT;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal sellingRate;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal hotelSellingRate;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal amount;
	private String hotelCurrency;
	private Boolean hotelMandatory;
	private Integer allotment;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal commission;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal commissionVAT;
	@JsonSerialize(using = RateSerializer.class)
	private BigDecimal commissionPCT;


}