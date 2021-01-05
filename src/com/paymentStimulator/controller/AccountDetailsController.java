package com.paymentStimulator.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentStimulator.model.TransferRefund.OrderItems;
import com.paymentStimulator.model.TransferRefund.OrderResponse;
import com.paymentStimulator.model.TransferRefund.RestApiConfig;

@RestController
public class AccountDetailsController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@PostMapping(path = "/createOrder", consumes = "application/json", produces = "application/json")
	public OrderResponse accountDetail(@RequestBody OrderItems orderRequest) {
		OrderResponse details = hitApi(orderRequest);

		return details;

	}

	private OrderResponse hitApi(OrderItems orderRequest) {
		RestApiConfig<OrderItems> restApiConfig = new RestApiConfig<OrderItems>();
		OrderResponse customerDetailsEnquiryApiResponse = (OrderResponse) restApiConfig
				.doPost("https://apiv2.shiprocket.in/v1/external/orders/create/adhoc", orderRequest);
		return customerDetailsEnquiryApiResponse;

	}

}
