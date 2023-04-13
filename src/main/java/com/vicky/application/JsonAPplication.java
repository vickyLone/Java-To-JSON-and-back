package com.vicky.application;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonAPplication {

	public static void main(String[] args) throws IOException {
           
		PersonEntity entity = new PersonEntity(101,"John","Lenon");
		// Object to JSON
        Gson gson = new Gson();
        String json = gson.toJson(entity);
        
         FileWriter writer = new FileWriter("person.json");
         writer.write(json);
         System.out.println("JSON Created succefully" + json);
         writer.close();

      
        
             
        
System.out.println("==========================================================================================");        
        //JSON to Object
        
        PersonEntity person = gson.fromJson(json, PersonEntity.class);
        System.out.println(person);
        
        
        
		
		
	}

}
