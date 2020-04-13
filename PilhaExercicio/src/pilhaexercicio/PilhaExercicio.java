
package pilhaexercicio;


public class PilhaExercicio {
    private Pilha p = null;
    public static void main(String[] args) {
        // TODO code application logic here
        new PilhaExercicio();
    }
    public PilhaExercicio(){
        SimulacaoVeiculos();
        System.out.println("Pilha inicial:");
       System.out.println( p.toString() ); 
        System.out.println("Retirando e esvaziando a pilha:");
       while ( !p.isEmpty() ) {
           Veiculo ve = (Veiculo)p.pop();
           System.out.println(ve);
           
       }
       if ( p.isEmpty() ) System.out.println("Impossível retirar da pilha. Pilha vazia.");  
         
    }
    
    public void SimulacaoVeiculos(){
        p = new Pilha(7);
        
        p.push(new Veiculo("100-ABC", "AUDI", "SPORT", 2010));
        p.push(new Veiculo("200-CBA", "Hyundai", "SEDAN", 2015));
        p.push(new Veiculo("300-DEF", "Hyundai", "SEDAN", 2009));
        p.push(new Veiculo("400-FED", "PORSCH", "SPORT", 2017));
        p.push(new Veiculo("500-GHI", "AUDI", "SPORT", 2020));
        p.push(new Veiculo("600-IHG", "CHERVROLET", "COMFORT", 2008));
        p.push(new Veiculo("700-JKL", "VOLKSWAGEN", "SPORT", 2021));
        
    }
}
