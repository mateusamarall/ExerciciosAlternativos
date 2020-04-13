
package bubblesortum;

import java.util.Arrays;
import java.util.Locale;

public class BubbleSortUm {
    Locale ptBr = new Locale("pt", "BR");
    public static void main(String[] args) {
        
        // TODO code application logic here
        String paises[]= {"México", "Brasil", "Cubaa", "Chile", "Argentina", "Espanha"};
        String tmp;
        for(int i=0; i < paises.length -1; i++){
           for(int j=0;  j <paises.length -1 - i; j++){
               if(paises[j].compareToIgnoreCase(paises[j+1])>0){
                   tmp = paises[j];
                   paises[j]= paises[j+1];
                   paises[j+1]= tmp;
                   
                    
               }
             
           }
           
        }
        System.out.println(paises.length);
        System.out.println(Arrays.toString(paises)); 
        
    }
    
}
