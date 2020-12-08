package com.RMG.GitAPI;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth2Test {
	@Test
	public void oAuthTest() {
		Response res=given()
			.formParam("client_id", "OAR_India")
			.formParam("client_secret", "8021dea602586ccb261f7ed55fc91e27")
			.formParam("grant_type", "client_credentials")
			
		.when()
			.post("http://coop.apps.symfonycasts.com/token");
		//res.then().log().all();
		String token = res.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
			.auth().oauth2(token)
			.pathParam("USER_ID", "1550")
		.when()
			.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
		.then()	
			.assertThat().statusCode(200)
			.log().all();
			
			
	}
}
