
package pilhaexercicio;


public class Pilha implements PilhaInterface {
    
    private int topo;	
	private int MAX;	
	private Object memo[];
        
        public Pilha(){
            topo = -1;
            MAX = 7;
            memo = new Object[MAX];
            
        }

        public Pilha(int qtde) {
		topo = -1;
		MAX = qtde;
		memo = new Object[MAX];
	}
    @Override
    public boolean isEmpty() {
        return(topo==-1);
    }

    @Override
    public boolean isFull() {
        return(topo==MAX-1);
    }

    @Override
    public Object push(Object x) {
       if(!isFull()) {
			memo[++topo]=x;
			return x;
		}
                else {
			return null;
		}
    }

    @Override
    public Object pop() {
       if(!isEmpty())
			return memo[topo--];
		else
			return null;
    }

    @Override
    public Object top() {
        if(!isEmpty())
			return memo[topo];
		else
			return null;
    }
    public String toString () {
            if(!isEmpty()) {
                String msg = "";
                for(int i=0; i<=topo; i++) {
                   msg += "\n  " + memo[i].toString();
                }
                return ("P: [ " + msg + "\n]");
            }
            else return "Pilha Vazia!";
        }
    
}
