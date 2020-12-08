package com.RMG.test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject {

	@Test
	public void updateProjectTest()
	{
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("createdBy", "Avinash");
		map.put("createdOn", "12/08/2020");
		map.put("projectId", "TY_01");
		map.put("projectName", "Google");
		map.put("status", "Completed");
		map.put("teamSize", 7);
		
		given()
			.contentType(ContentType.JSON)
			.baseUri("http://localhost")
			.port(8084)
			.body(map)
		.when()
			.put("/projects/TY_PROJ_205")
		.then()
			.assertThat().statusCode(200)
		.log().all();	
			
	}
}
