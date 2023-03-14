package com.example.jsonNodeReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;

import java.util.*;

public class JsonNodeReader {

    public static void main(String args[]) throws Exception {

        String nodes="[{\"qn\":\"question\",\"ans\":\"answer\"},{\"qn\":\"question1\",\"ans\":\"answer1\"}]";
        ObjectMapper map = new ObjectMapper();
        JsonNode node = map.readTree(nodes);
//        List<KeyPair> keyValuePairList=KeyPair.toKeyPair(node);
//        keyValuePairList.forEach(keyPair -> {
//            System.out.println(keyPair.getAttributeKey());
//            System.out.println(keyPair.getAttributeValue());
//        });

    }
}

    @Data
    @Builder
    class KeyPair{
    private String attributeKey;
    private String attributeValue;



    }