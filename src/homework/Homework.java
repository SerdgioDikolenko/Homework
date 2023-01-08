
package homework;

import java.util.Scanner;


public class Homework {


    public static void main(String[] args) {
  int dataA=15;
  int dataB=17;
  int dataC=5;
        
        
        Scanner myScnr=new Scanner(System.in);
      
        System.out.println("Дано число dataA : " + dataA);
        System.out.println("Дано число dataB : " + dataB);
        System.out.println("Дано число dataC : " + dataC);
        
        System.out.println("находим максимальное и уменьшаем на 2:");
        
        if ((dataA > dataB) && (dataA > dataC)) 
        {
            int a = dataA - 2;
            System.out.println("max: dataA-2: получаем " + a);
        }        
        if ((dataB > dataA) && (dataB > dataC)) 
        {
            int b = dataB - 2;
            System.out.println("max: dataB-2: получаем " + b);
        }         
        if ((dataC > dataA) && (dataC > dataB)) 
        {
            int c = dataC - 2;
            System.out.println("max: dataC-2: получаем " + c);
        }        
        System.out.println("находим минимальное и увеличиваем на 2:");          
        if ((dataA < dataB) && (dataA < dataC)) 
        {
            int a = dataA + 2;
            System.out.println("min: dataA+2: получаем " + a);
        }
        if ((dataB < dataA) && (dataB < dataC)) 
        {
            int b = dataB + 2;
            System.out.println("min: dataB+2: получаем " + b);
        }
        if ((dataC < dataA) && (dataC < dataB)) 
        {
            int c = dataC + 2;
            System.out.println("min: dataB+2: получаем " + c);
        }
    }
    
}
