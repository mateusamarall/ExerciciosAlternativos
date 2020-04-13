
package bubblesortdois;

import java.util.Arrays;

public class BubbleSortDois {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros [] ={4,2,10,123,-3,32,0,34,12,91,56,3,21,87,61};
        int tmp = 0;
        for(int i=0; i < numeros.length; i++){
        for(int j=0; j < numeros.length; j++){
             if(numeros[i]< numeros[j]){
                tmp = numeros[i];
               numeros[i] = numeros[j];
               numeros[j] = tmp;
                 } 

            }

        }
        
        System.out.println(Arrays.toString(numeros)); 
    }
    
}
