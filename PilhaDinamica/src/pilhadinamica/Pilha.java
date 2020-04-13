
package pilhadinamica;

public class Pilha implements PilhaDinamicaInterface {
    
    private Node topo = null;
    
    public Pilha(){
        topo = null;
    }
    
    @Override
    public Node push(Object x) {
       try {  
                    if(x == null) return null;
                    Node novo = new Node(); 
                    novo.setValue(x);       
                    novo.setNext(topo); 
                    topo = novo;
                    return novo;
            } catch(Exception ex) {
                    return null;  
            }         
    }

    @Override
    public Object pop() {
        if (topo == null) return null;
            Object valor = topo.getValue();
            Node temp = topo; 
            topo = topo.getNext(); 
            temp = null;  
            return valor;
    }

    @Override
    public Object top() {
         if(topo == null) return null; else return topo.getValue();
    }

    @Override
    public boolean isEmpty() {
        return (topo == null);
    }
    
    public String toString(){
          if( !isEmpty() ) {
              String resp = "";
              Node aux = topo;
              while(aux!=null) {            
                resp = aux.getValue().toString() + resp;
                aux = aux.getNext();
                if(aux != null)resp = ", " + resp;
              }
              return ( "p: [ " + resp + " ]"  );
            }
            else return (  "p: [ ]"  );  
    }
    public String toString_v02() { 
    if( !isEmpty() ) {
              String resp = "";
              Node aux = topo;
              while(aux!=null) {            
                resp = aux.getValue().toString() + "\n" + resp;
                aux = aux.getNext();
              }
              return ("p: [\n" + resp + " ]");
            }
            else return (  "p: [ ]"  ); 
              
            }
            
    }
