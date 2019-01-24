/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intarray;
import java.util.Scanner;

public class IntArray {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        
        for (int i = 0; i < 5; i++){
           System.out.print("Enter an integer:");
            array[i] = sc.nextInt();
        }
           System.out.print("First to last:");     
        for (int j = 0; j < 5; j++){
            
            System.out.print(array[j]+" ");
        }
            System.out.print("\nLast to first:");    
       for(int counter=array.length; counter > 0;counter--){
            System.out.print(array[counter -1 ] + " ");
}
    }
    
}
