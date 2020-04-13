
package pilhadinamica;


public class PilhaDinamica {
    public static void main(String[] args) {
        // TODO code application logic here
         new PilhaDinamica();
    }
    public PilhaDinamica(){
        Pilha p = new Pilha();
       if( p.isEmpty() ) {
            System.out.println("A pilha está vazia");
        }
       
       p.push(new Trabalhador("MATEUS", 9500, 'M'));
       p.push(new Trabalhador("JULIA", 7500, 'F'));
       p.push(new Trabalhador("PAULO", 2500, 'M'));
       p.push(new Trabalhador("BEATRIZ", 5500, 'F'));
       p.push(new Trabalhador("JULIO", 1500, 'M'));
       p.push(new Trabalhador("MARTA", 9500, 'F'));
       
       //guardando os trabalhados em um vetor como solicitado
       Trabalhador trab[]={
           new Trabalhador("MATEUS", 9500, 'M'),
           new Trabalhador("JULIA", 7500, 'F'),
           new Trabalhador("PAULO", 2500, 'M'),
           new Trabalhador("BEATRIZ", 5500, 'F'),
           new Trabalhador("JULIO", 1500, 'M'),
           new Trabalhador("MARTA", 9500, 'F')
       };
       //ordenando-os
       bubbleSort(trab);         
        System.out.println("Vetor ordenado pelos nomes dos Trabalhadores:");
        visualizar(trab);
       
        
       if( !p.isEmpty() ) {
            System.out.println("A pilha não está vazia");
        }
        
        System.out.println("O valor no topo da pilha é " + p.top() + "\n");
     
        System.out.println("O conteúdo da pila é " + p.toString() + "\n");

        while( !p.isEmpty() ) {
                
                System.out.println("Retirado o valor " + p.pop() + " da pilha");
        }
   
    }
    //metodo de ordenação bubbleSort para ordenar os trabalhadores
        public  <E extends Comparable<E>> boolean bubbleSort(Trabalhador vetor []){
        if (vetor == null) return false;        
        for (int i = 0; i <vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
              if (vetor[j].getNome().compareToIgnoreCase(vetor[j+1].getNome()) > 0) {
                  
                    Trabalhador tmp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = tmp;
               }
            }
        }
        return true;
    }
    //metodo para visualização
    public <E> void visualizar(E vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\n");
        }
        System.out.println();
    }
    
}
