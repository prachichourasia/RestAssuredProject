package com.RMG.Base;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class JsonSerialization {

	@Test
	public void sample() throws JsonGenerationException, JsonMappingException, IOException
	{
		Project proj = new Project("Rasakumar", "8/12/2020", "Jio", "Completed", 9);
		
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.writeValue(new File("./Project.json"), proj);
		
		
	}
}
