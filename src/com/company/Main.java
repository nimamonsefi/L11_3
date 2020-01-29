package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name", "Tehran University");
        jsonObject1.put("build", "1934");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name", "Sharif University");
        jsonObject2.put("build", "1966");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name", "Shahid Beheshti University");
        jsonObject3.put("build", "1959");

        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name", "Amirkabir University");
        jsonObject4.put("build", "1928");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);

        JSONArray jsonArray1 = null;
        try {
            jsonArray1 = (JSONArray) new JSONParser().parse("[{\"name\":\"Tehran University\",\"build\":\"1934\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray2 = null;
        try {
            jsonArray2 = (JSONArray) new JSONParser().parse("[{\"name\":\"Sharif University\",\"build\":\"1966\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray3 = null;
        try {
            jsonArray3 = (JSONArray) new JSONParser().parse("[{\"name\":\"Shahid Beheshti University\",\"build\":\"1959\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray4 = null;
        try {
            jsonArray4 = (JSONArray) new JSONParser().parse("[{\"name\":\"Amirkabir University\",\"build\":\"1928\"}]");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("**------Array-----**");
        for (Object object : jsonArray1) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Name : " + jsonObject.get("name"));
            System.out.println("Bulid : " + jsonObject.get("build"));
        }
        System.out.println("---------------");
        for (Object object : jsonArray2) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Name : " + jsonObject.get("name"));
            System.out.println("Bulid : " + jsonObject.get("build"));
        }
        System.out.println("---------------");
        for (Object object : jsonArray3) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Name : " + jsonObject.get("name"));
            System.out.println("Bulid : " + jsonObject.get("build"));
        }
        System.out.println("---------------");
        for (Object object : jsonArray4) {
            JSONObject jsonObject = (JSONObject) object;
            System.out.println("Name : " + jsonObject.get("name"));
            System.out.println("Bulid : " + jsonObject.get("build"));
        }
    }
}