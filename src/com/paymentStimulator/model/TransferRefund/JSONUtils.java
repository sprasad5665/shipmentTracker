package com.paymentStimulator.model.TransferRefund;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {
	private static Logger LOGGER = LoggerFactory.getLogger(JSONUtils.class);

	public static Object parse(String message, Class<?> class1) {
		ObjectMapper mapper = new ObjectMapper();
		Object parsedMessage = null;
		try {
			parsedMessage = mapper.readValue(message, class1);
		} catch (IOException e) {
			LOGGER.error(" Message Format Exception while parsing {}", e);
			// throw new payment exception add error code error message
		}
		return parsedMessage;
	}

}
