package com.RMG.test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {

	@Test
	public void createProjectTest()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Ankush");
		jobj.put("createdOn", "12/08/2020");
		jobj.put("projectId", "TY_01");
		jobj.put("projectName", "RMGYantra");
		jobj.put("status", "OnGoing");
		jobj.put("teamSize", "5");
		
		RequestSpecification con = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(jobj.toJSONString());
		
		Response res = con.when()
		.post("http://localhost:8084/addProject");
		
		res.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
