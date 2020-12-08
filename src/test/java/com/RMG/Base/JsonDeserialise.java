package com.RMG.Base;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class JsonDeserialise {

	@Test
	public void sample() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		Project project = mapper.readValue(new File("./Project.json"), Project.class);
		
		System.out.println(project.createdBy);
		System.out.println(project.createdOn);
		System.out.println(project.projectName);
	}
}
