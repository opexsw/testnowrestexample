package com;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.yaml.snakeyaml.Yaml;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

/* This annotation tell JUnit to do it's parameterized magic */
@RunWith(Parameterized.class)
public class APITest {

	@Parameters(name = "ApiTest{index}:{0}")
	public static List<Object[]> getData() throws FileNotFoundException {
		/* Load the file from the resources directory */
		ClassLoader classloader = APITest.class.getClassLoader();
		InputStream input = classloader.getResourceAsStream("RestAPIEndpoints.yaml");
		System.out.println("----------");

		/* Parse the YAML */
		Yaml yaml = new Yaml();
		List<Map<String, Object>> object = (List<Map<String, Object>>) yaml.load(input);
		List<Object[]> parameters = new ArrayList();

		for (Map<String, Object> o : object) {
			Object[] l = o.values().toArray();
			parameters.add(l);
		}

		return parameters;

	}

	public enum Operation {
		GET, PUT, POST, DELETE
	}

	/* These are the parameters from the YAML */
	private String fName;
	private Operation fOperation;
	private String fPath;
	private String fJson;
	private int fExpected;
	private String fuserName;
	private String fpassword;
	private String fcontent_type;

	/* Parameters are passed to the constructor */
	public APITest(String name, String userName, String password, String operation, String path, String json,
			String content_type, int expected) {
		fName = name;
		fOperation = Operation.valueOf(operation);
		fPath = path;
		fJson = json;
		fExpected = expected;
		fuserName = userName;
		fpassword = password;
		fcontent_type = content_type;
	}

	@Test
	public void testCase() {
		System.out.println("Running " + fName + "...\n");

		/* Create an HTTP Client */
		Client client = Client.create();
		// client.addFilter(new HTTPBasicAuthFilter(USERNAME , PASSWORD));
		String uri = fPath;
		System.out.println("URL is===" + uri);
		WebResource webResource = client.resource(uri);
		ClientResponse response = null;

		/* Send the right request according to operation parameter */
		switch (fOperation) {
		case GET:
			response = webResource.accept(fcontent_type).get(ClientResponse.class);
			break;
		case POST:
			response = webResource.accept(fcontent_type).header("Content-Type", fcontent_type).post(ClientResponse.class, uri);
			break;
		case PUT:
			response = webResource.accept(fcontent_type).header("Content-Type", fcontent_type).put(ClientResponse.class, fJson);
			break;
		case DELETE:
			response = webResource.delete(ClientResponse.class);
			break;
		default:
			break;
		}
		/* Check the status code */
		assertEquals(fExpected, response.getStatus());
	}

	@Before
	public void setUp() {
		/* This bit is up to you. Make sure your web server is listening */
	}

}