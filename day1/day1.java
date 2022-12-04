package Advent_Calendar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day1{
    public static void main(String args[]) {
        try {
            String strLine;
            Integer intSum=0;
            List <Integer> listRichestTonttes=new ArrayList<Integer>();
            List <Integer> listBiggestSums=new ArrayList<Integer>();
            listBiggestSums.add(0,0);
            listRichestTonttes.add(0,0);
            Integer intTontte=1;
            Integer intTotal=0;
            BufferedReader br = new BufferedReader(new FileReader("data_day_1.txt"));

            try {
                while ((strLine=br.readLine())!=null){
                    if (strLine.isEmpty()){
                        if (listBiggestSums.size()==1) {
                            listBiggestSums.add(1,intSum);
                            listRichestTonttes.add(1,intTontte);
                        }
                        else if (listBiggestSums.size()==2) {
                            listBiggestSums.add(2,intSum);
                            listRichestTonttes.add(2,intTontte);                            
                        }
                        else if (listBiggestSums.get(0)<intSum) {
                            listBiggestSums.set(2,listBiggestSums.get(1));
                            listRichestTonttes.set(2,listRichestTonttes.get(1)); 
                            listBiggestSums.set(1,listBiggestSums.get(0));
                            listRichestTonttes.set(1,listRichestTonttes.get(0));                           
                            listBiggestSums.set(0,intSum);
                            listRichestTonttes.set(0,intSum);
                        }
                        else if (listBiggestSums.get(1)<intSum) {
                            listBiggestSums.set(2,listBiggestSums.get(1));
                            listRichestTonttes.set(2,listRichestTonttes.get(1)); 
                            listBiggestSums.set(1,intSum);
                            listRichestTonttes.set(1,intTontte);                            
                        }
                        else if (listBiggestSums.get(2)<intSum) {
                            listBiggestSums.set(2,intSum);
                            listRichestTonttes.set(2,intTontte);                            
                        }
                        intSum=0;
                        intTontte=intTontte+1;                                               
                    } else{
                        intSum=intSum+Integer.parseInt(strLine);
                    }

                }
                System.out.println("Most calories has Tontte nummer: " + listRichestTonttes);
                System.out.println("Calories: " + listBiggestSums);
                intTotal=listBiggestSums.get(0)+listBiggestSums.get(1)+listBiggestSums.get(2);
                System.out.println("Total: " + intTotal);

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