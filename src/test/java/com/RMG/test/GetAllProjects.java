package com.RMG.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProjects {

	@Test
	public void getAllProjectTest()
	{
		given()
			.contentType(ContentType.JSON)
		//.when()  Not maindatory 
			.get("http://localhost:8084/projects")
		.then()
			.assertThat().statusCode(200)
		.and()
			.assertThat().contentType(ContentType.JSON)
		.log().all();	
					
	}
}
