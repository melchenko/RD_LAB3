package com.company.lesson4;

import java.util.HashMap;

public class HashExample {

    public HashMap<Character, Integer> convertStringToHashmaps(String str){

        char [] myCharArray = str.toCharArray ();
        HashMap<Character, Integer> myHashMap = new HashMap<>();

        for(char c: myCharArray) {

            //if (myHashMap.containsKey(myCharArray[i]))

//            int result=1;
//            for(int j = 0; j < myCharArray.length; j++){
//                if (myCharArray[j]==myCharArray[i]) result++;
//            }
            myHashMap.put(c, myHashMap.getOrDefault(c, 0)+1 );
        }
        return myHashMap;
    }

}
