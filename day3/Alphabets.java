package day3;

import java.util.HashMap;

public class Alphabets {

    private Integer n=1;
    private HashMap <Character,Integer> map = new HashMap<Character,Integer>();
    
    public HashMap<Character,Integer> getAlphabets(){
        for (char chr='a' ; chr <= 'z' ; chr++) {
            map.put(chr,n);
            n++;
        }

        for (char Chr='A' ; Chr<= 'Z' ; Chr++) {
            map.put(Chr,n);
            n++;
        }

        return map;
    }

}
