/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jsonpractice;

/**
 *
 * @author mpdeloja
 *
 * Main class.
 */
public class JSONPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creates an instance of MyJSONParser class to test "parseJSON"
         * function on employees json file. Should print out all data fields in
         * a tabular form
         */
        MyJSONParser myParser = new MyJSONParser();
        myParser.parseJSON("employees.json");
    }

}
