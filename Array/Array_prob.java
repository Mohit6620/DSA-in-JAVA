package Array;
import java.util.Scanner;

public class Array_prob {
    Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        Array_prob a = new Array_prob();
        a.temperature();
    }


    void temperature (){
        int count = 0 , total =0  , days = 0;
        System.out.println("enter total number of days");
        int size = sc.nextInt();
        int temp [] = new int[size];
        for (int i = 0 ; i < size ; i ++){
            System.out.println("write temp for "+ (i+1) + " day" );
            temp[i]=sc.nextInt();
            count ++;
            total +=temp[i];    
        }
        for (int i = 0 ; i < size ; i ++){
        if ((total/count) <= temp [i]){
            days ++ ;
            System.out.println("total days greater than average temperature is " + days + " " + " and days is " + temp[i]);
        }    
    }

}
}
