package day3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main{
    public static void main(String args[]){
        try {
            Character duplicate;
            Integer length;
            Integer sum=0;
            String strLine;
            String compartment1;
            String compartment2;
            String compartment3;
            Duplicates dp = new Duplicates();
            Alphabets ap = new Alphabets();
            HashMap <Character,Integer> map = ap.getAlphabets();

            try (BufferedReader br = new BufferedReader(new FileReader("day3/data_day_3.txt"))) {

                while (true) {
                    strLine=br.readLine();
                    if (strLine==null) {
                        break;
                    }
                    length=strLine.length();
                    compartment1=strLine;
                    if((compartment2=br.readLine())==null){
                        break;
                    }
                    if((compartment3=br.readLine())==null){
                        break;
                    }
                    duplicate=dp.getDuplicate(compartment1,compartment2,compartment3,length);
                    sum=sum+map.get(duplicate);
                }
                System.out.println("Sum of priotites: " + sum);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}