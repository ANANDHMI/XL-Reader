package com.example.jsonReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonReader {

    public static void main(String args[]) throws Exception {
        String jsonString = "{\n" +
                "            \"id\": 3,\n" +
                "            \"questionParts\": [\n" +
                "                {\n" +
                "                    \"content\": \"#)\",\n" +
                "                    \"position\": {\n" +
                "                        \"left\": 338.954,\n" +
                "                        \"upper\": 427.504,\n" +
                "                        \"right\": 467.03799999999995,\n" +
                "                        \"lower\": 469.144,\n" +
                "                        \"file\": \"/home/mars/Downloads/ilovepdf_pages-to-jpg (2)//question/32.jpg\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"answerParts\": [\n" +
                "                {\n" +
                "                    \"content\": \"316\",\n" +
                "                    \"position\": {\n" +
                "                        \"left\": 484.21999999999997,\n" +
                "                        \"upper\": 433.056,\n" +
                "                        \"right\": 537.328,\n" +
                "                        \"lower\": 466.36800000000005,\n" +
                "                        \"file\": \"/home/mars/Downloads/ilovepdf_pages-to-jpg (2)//answer/33.jpg\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"1/5\",\n" +
                "                    \"position\": {\n" +
                "                        \"left\": 552.948,\n" +
                "                        \"upper\": 424.728,\n" +
                "                        \"right\": 613.866,\n" +
                "                        \"lower\": 466.36800000000005,\n" +
                "                        \"file\": \"/home/mars/Downloads/ilovepdf_pages-to-jpg (2)//answer/34.jpg\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"2191876141812\",\n" +
                "                    \"position\": {\n" +
                "                        \"left\": 624.8000000000001,\n" +
                "                        \"upper\": 421.952,\n" +
                "                        \"right\": 863.7860000000001,\n" +
                "                        \"lower\": 460.81600000000003,\n" +
                "                        \"file\": \"/home/mars/Downloads/ilovepdf_pages-to-jpg (2)//answer/35.jpg\"\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"content\": \"121\",\n" +
                "                    \"position\": {\n" +
                "                        \"left\": 435.79800000000006,\n" +
                "                        \"upper\": 449.712,\n" +
                "                        \"right\": 479.534,\n" +
                "                        \"lower\": 516.336,\n" +
                "                        \"file\": \"/home/mars/Downloads/ilovepdf_pages-to-jpg (2)//answer/40.jpg\"\n" +
                "                    }\n" +
                "                }\n" +
                "            ]\n" +
                "        }";
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.readValue(jsonString, ObjectNode.class);
        if(node.has("id")) {
            List<JsonNode> ids=new ArrayList<>();
            Map<JsonNode, JsonNode> integerStringMap=new HashMap<>();

            ids.add(node.get("questionParts"));
            integerStringMap.put(node.get("id"),node.get("questionParts"));
            System.out.println(ids);
        }
    }
}
