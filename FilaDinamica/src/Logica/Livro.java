
package Logica;


public class Livro {
    private String titulo, autor, editor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String editor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editor = editor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo= " + titulo + ", autor= " + autor + ", editor= " + editor + ", anoPublicacao= " + anoPublicacao + '}';
    }
    
    
}
