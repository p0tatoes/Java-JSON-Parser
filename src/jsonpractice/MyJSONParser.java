/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonpractice;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 *
 * @author mpdeloja
 */
public class MyJSONParser {

    /**
     *
     * @param fileName - String. path to the JSON file to be parsed
     *
     * Parses the given JSON file and prints out the values in a tabular form
     */
    public void parseJSON(String fileName) {
        try {
            /**
             * Parses the JSON file and converts it into an iterator in order to
             * process the values
             */
            JSONParser parser = new JSONParser();
            Object employeesObject = parser.parse(new FileReader(fileName));
            JSONObject employeesJSON = (JSONObject) employeesObject;
            JSONArray employee = (JSONArray) employeesJSON.get("users");
            Iterator itrEmployee = employee.iterator();

            /**
             * Iterates over the objects inside the "users" object and prints
             * out the values in a tabular form
             */
            System.out.printf("%-40s%-40s%-40s%-40s%-40s\n", "First Name", "Last Name", "Email", "Phone Number", "ID");
            while (itrEmployee.hasNext()) {
                Iterator<Map.Entry> itrEmployeeInfo = ((Map) itrEmployee.next()).entrySet().iterator();
                while (itrEmployeeInfo.hasNext()) {
                    /**
                     * Values from the individual arrays in the "users" objects
                     * are retrieved
                     */
                    Map.Entry employeeInfo = itrEmployeeInfo.next();
                    System.out.printf("%-40s", employeeInfo.getValue());
                }
                System.out.println(); // Serves as line break
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
