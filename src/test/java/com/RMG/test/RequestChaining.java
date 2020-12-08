package com.RMG.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaining {
	@Test
	public void requestChaining()
	{
		Response res = given()
				.get("http://localhost:8084/projects");
		//	res.then()
				//.log().all();
			String project_ID = res.jsonPath().get("[2].projectId");
			System.out.println(project_ID);
			
		given()
			.contentType(ContentType.JSON)
			.pathParam("projectID", project_ID)
			.get("http://localhost:8084/projects/{projectID}")
		.then()
			.assertThat().statusCode(200)
			.log().all();
			
			
	}
}
