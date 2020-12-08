package com.RMG.GitAPI;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GitApiTest {
	@Test
	public void authenticationTest()
	{
		//http://api.github.com
		//user/repos
		given()
			.contentType(ContentType.JSON)
			.baseUri("http://api.github.com")
			.auth()
				.basic("ankushavinash", "avinash@9472")
				.pathParam("owner", "ankushavinash")
				.pathParam("repo", "CatchPoint")
				.get("/repos/{owner}/{repo}")
			.then()
				.assertThat().statusCode(200)
				.and()
				.body("name", Matchers.equalTo("CatchPoint"))
				.log().all();
				
				
	}
}
