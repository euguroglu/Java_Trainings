package com.uguroglu;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.net.URL;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws IOException {

        URL jsonUrl = new URL("urlhere");
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = mapper.readValue(jsonUrl,Map.class);
        JSONObject j = new JSONObject(map);
        //System.out.println(j.getJSONArray("processGroups"));
        StringBuilder sb = new StringBuilder();
        try (PrintWriter writer = new PrintWriter("/Users/eugurluoglu/desktop/Book1.csv")){
            for (int i = 0; i < j.getJSONArray("processGroups").length(); i++){
                //System.out.println(j.getJSONArray("processGroups").getJSONObject(i));
                //System.out.println(j.getJSONArray("processGroups").getJSONObject(i).getJSONObject("component"));
                //System.out.println(j.getJSONArray("processGroups").getJSONObject(i).getJSONObject("component").get("name"));
                Object name =  j.getJSONArray("processGroups").getJSONObject(i).getJSONObject("component").get("name");
                sb.append(name);
                sb.append('\n');

                System.out.println(sb.toString());
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e){
            System.out.println(e);
        }


    }



}
