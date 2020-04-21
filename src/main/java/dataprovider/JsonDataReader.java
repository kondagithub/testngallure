package dataprovider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import dto.AuthenticationRequest;
import managers.FileReaderManager;

public class JsonDataReader {
	
	private final String authenticationFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "AuthenticationRequest.json";
	
	public AuthenticationRequest getAuthenticationData(ObjectMapper mapper) throws IOException {
		AuthenticationRequest authentication;
		try {
			authentication = mapper.readValue(new File(authenticationFilePath), AuthenticationRequest.class);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + authenticationFilePath);
		} 
		return authentication;
	}
	
}
