package Advent_Calendar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class day1{
    public static void main(String args[]) {
        try {
            String strLine;
            Integer intSum=0;
            Integer intRichestTontte=0;
            Integer intBiggestSum=0;
            Integer intTontte=1;
            BufferedReader br = new BufferedReader(new FileReader("data_day_1.txt"));

            try {
                while ((strLine=br.readLine())!=null){
                    if (strLine.isEmpty()){
                        if (intBiggestSum<intSum) {
                            intBiggestSum=intSum;
                            intRichestTontte=intTontte;
                        } 
                        intSum=0;
                        intTontte=intTontte+1;                                               
                    } else{
                        intSum=intSum+Integer.parseInt(strLine);
                    }

                }
                System.out.println("Most calories has Tontte nummer: " + intRichestTontte);
                System.out.println("Calories: " + intBiggestSum);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}