package application.model;

public class Livro {
    private Integer id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean diponivel;

    public Livro() {

    }

    public Livro(Integer id, String titulo, String autor, int anoPublicacao, boolean diponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.diponivel = diponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDiponivel() {
        return diponivel;
    }

    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", diponivel=" + diponivel +
                '}';
    }
}
