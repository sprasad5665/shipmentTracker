package com.paymentStimulator.model.TransferRefund;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestApiConfig<T> {
	private static Logger LOGGER = LoggerFactory.getLogger(RestApiConfig.class);

	public Object doPost(String URI, T requestMessageObj) {
		String responseMessage = null;
		Object parsedResponseMessage = null;
		try {

			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getClasses().add(JacksonJsonProvider.class);

			Client client = Client.create(clientConfig);

			WebResource webResource = client.resource(URI);
			String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjExMjA2NTksImlzcyI6Imh0dHBzOi8vYXBpdjIuc2hpcHJvY2tldC5pbi92MS9leHRlcm5hbC9hdXRoL2xvZ2luIiwiaWF0IjoxNjA5ODI5NTQ0LCJleHAiOjE2MTA2OTM1NDQsIm5iZiI6MTYwOTgyOTU0NCwianRpIjoiMHZBUlR2NG1ObTNVbDhSRSJ9.kCpx36ZqGm-dV31GdoKa7Lt0VvxApnKPq5ZD-O6oeR8";

			LOGGER.debug("requestMessageObj .... {}", requestMessageObj.toString());
			ObjectMapper mapper = new ObjectMapper();
			ClientResponse response = webResource.header("Authorization", token).accept(MediaType.APPLICATION_JSON)
					.type(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, mapper.writeValueAsString(requestMessageObj));

			LOGGER.info("response received from server {}", response);
			LOGGER.info("response status from server {}", response.getStatus());

			if (response.getStatus() != 200) {

			}

			LOGGER.debug("Output from Server .... \n");
			responseMessage = response.getEntity(String.class);
			if (requestMessageObj instanceof OrderItems) {
				parsedResponseMessage = (OrderResponse) JSONUtils.parse(responseMessage, OrderResponse.class);
				
			}
		} catch (UniformInterfaceException e) {
			LOGGER.error("ERROR {}", e);
			// } catch (FileNotFoundException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (NoSuchAlgorithmException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (CertificateException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (KeyManagementException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (UnrecoverableKeyException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (KeyStoreException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
		} catch (ClientHandlerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return parsedResponseMessage;
	}

}
