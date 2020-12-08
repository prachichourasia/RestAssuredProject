package com.RMG.test;



import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import groovyjarjarantlr.LexerSharedInputState;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProject {

	@Test
	public void deleteProjectTest()
	{
		given()
			.baseUri("http://localhost")
			.port(8084)
			.contentType(ContentType.JSON)
			.pathParam("projectId", "TY_PROJ_205")
		.when()
			.delete("/projects/{projectId}")
		.then()
			.assertThat().statusCode(204)
		.and()
			.assertThat().time(lessThan(5L), TimeUnit.SECONDS)
			.log().all();
					
	}
}
