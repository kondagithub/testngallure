package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.qameta.allure.Allure;

public class GeneralUtil {

	public static void writeDataToAllureReport(ObjectMapper mapper, String requestType, Object object) throws JsonProcessingException {
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		Allure.addAttachment(requestType, "application/json", json);
	}
	
	public static void writeDataToAllureReport(ObjectMapper mapper, String requestType, String data) throws JsonMappingException, JsonProcessingException {
        Object jsonObject = mapper.readValue(data, Object.class);
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
        Allure.addAttachment(requestType, "application/json", json);
	}
	
}
