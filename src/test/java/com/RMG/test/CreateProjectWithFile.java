package com.RMG.test;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class CreateProjectWithFile {

	@Test
	public void createProjectWithFile()
	{
		File proj = new File(System.getProperty("user.dir")+"/Project.json");
		given()
		.baseUri("http://localhost:8084")
		.contentType(ContentType.JSON)
		.body(proj)  
	.when()
		.post("/addProject")
	.then()
		.assertThat().statusCode(201)
	.and()
		.log().all();
	}
}
