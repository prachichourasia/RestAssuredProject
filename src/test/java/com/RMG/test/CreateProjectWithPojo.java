package com.RMG.test;

import org.testng.annotations.Test;

import com.RMG.Base.Project;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithPojo {

	@Test
	public void createProjectTest()
	{
		Project proj = new Project("Rasa", "8/12/2020", "OAR", "On Going", 10);
		
		given()
			.baseUri("http://localhost:8084")
			.contentType(ContentType.JSON)
			.body(proj, ObjectMapperType.JACKSON_1)  
		.when()
			.post("/addProject")
		.then()
			.assertThat().statusCode(201)
		.and()
			.log().all();
	}
}
