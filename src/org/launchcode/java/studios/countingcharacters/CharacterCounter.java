package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args){
        String myString = "";

        try {

            File myFile = new File("./src/org/launchcode/java/studios/countingcharacters/string.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                myString += myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        HashMap<String,Integer> charactersCount = new HashMap<>();

        for(int i=0; i<myString.length(); i++){
            String key = Character.toString(myString.charAt(i));
            int value;
            if (!charactersCount.containsKey(key)){
                value=1;
            }else{
                value = charactersCount.get(key)+1;
            }
            charactersCount.put(key,value);
        }
        for (Map.Entry<String, Integer> characterCount : charactersCount.entrySet()) {
            System.out.println(characterCount.getKey() + " (" + characterCount.getValue() + ")");
        }




    }


}
