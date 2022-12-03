package day3;

public class Duplicates {

    private Character character;
    
    public Character getDuplicate(String string1,String string2,String string3,Integer len){
        for (int i=0 ; i<len ; i++ ) {
            if (string1.contains(Character.toString(string3.charAt(i)))) {
                if (string2.contains(Character.toString(string3.charAt(i)))) {
                    character=string3.charAt(i);
                    break;
                }
            }
        }

        return character;
    }

}
