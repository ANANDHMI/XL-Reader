package com.example.jsonParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.File;
import java.util.List;

public class JsonProcessor {

    public static void main(String[] args){
        try{
            ObjectMapper mapper=new ObjectMapper();
            String inputString="{\n" +
                    "\t\"id\":123,\n" +
                    "\t\"name\":\"Pankaj Kumar\",\n" +
                    "\t\"permanent\":true,\n" +
                    "\t\"address\":{\n" +
                    "\t\t\t\"street\":\"El Camino Real\",\n" +
                    "\t\t\t\"city\":\"San Jose\",\n" +
                    "\t\t\t\"zipcode\":95014\n" +
                    "\t\t},\n" +
                    "\t\"phoneNumbers\":[9988664422, 1234567890],\n" +
                    "\t\"role\":\"Developer\"\n" +
                    "}";
            //read the input json structured String and change into a object
            Developer jsonToObject = mapper.readValue(inputString,Developer.class);

            //write the json into a json file
            mapper.writeValue(new File("/home/anandh.andrews@zucisystems.com/Downloads/Andrew/XL-Reader/target/text_json.txt"),jsonToObject);

            //write the json into txt file
            mapper.writeValue(new File("/home/anandh.andrews@zucisystems.com/Downloads/Andrew/XL-Reader/target/file_json.json"),jsonToObject);
            System.out.println(jsonToObject);


        }catch(Exception e){
            e.printStackTrace();

        }
    }

    @Data
    static class Developer{
        private String id;
        private String name;
        private String permanent;
        private Address address;
        private List<Long> phoneNumbers;
        private String role;

    }

    @Data
    static class Address{
        private String street;
        private String city;
        private Long zipcode;

    }
}
