/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;

import java.util.ArrayList;

/**
 *
 * @author pp2mfpl2
 */
public class PP2 {
    Pilha p = new Pilha();
    ArrayList<Carro>vetor = new ArrayList<>();
    private Carro f1 = new Carro("Onix", "General Motors", 2020, "FKD-4C73");
    private Carro f2 = new Carro("Camaro", "General Motors", 2020, "FKD-4A73");
    private Carro f3 = new Carro("Montana", "General Motors", 2020, "FKD-4B73");
    private Carro f4 = new Carro("Bolt", "General Motors", 2020, "FKD-4E73");
    private Carro f5 = new Carro("Cruze", "General Motors", 2020, "FKD-4J73");
    public static void main(String[] args) {
        new PP2();
       
    }
    
    public PP2() {
        
        p.push(f1);
        p.push(f2);
        p.push(f3);
        p.push(f4);
        p.push(f5);
        vetor.add(f1);
        vetor.add(f2);
        vetor.add(f3);
        vetor.add(f4);
        vetor.add(f5);
        
        System.out.println("Elemento que ficou no topo da pilha: "+p.top() + "\n");
        
        
         while(!p.isEmpty()){
            Carro elemento = (Carro) p.pop();
           System.out.println(" Extraindo elementos da pilha: " + elemento);
           
        
   }
       Carro x;
       int j,i;
     for(i=1; i<vetor.size(); i++){
         x =  vetor.get(i); 
         j=i;
         while(j>0 && x.getNome().compareToIgnoreCase(vetor.get(j-1).getNome())<0){
            vetor.set(j, vetor.get(j-1));
             
            
             j--;
              
         }
       
        vetor.set(j, x);
     }
   System.out.println("\n"+vetor); 
  }
}  


