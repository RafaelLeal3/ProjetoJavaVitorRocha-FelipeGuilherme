package trabalhoaldomain;
public class Artigos {
    private String nomeArtigo;
    private String artigo;
    private String nomeAutor;
    private String dataPublicacao;
    private int numeroDePaginas;
    
    //Métodos Especiais

    public Artigos() {//UM CONSTRUTOR SIMPLES PARA INICIALIZAR A OPERAÇÃO
    }


    public void CadastrarArtigos(){//MÉTODO PARA CADASTRAR UM ARTIGO
        System.out.println("===== ARTIGO CADASTRADO COM SUCESSO =====");
        System.out.println("TEMA: "+this.getNomeArtigo());
        System.out.println("AUTOR: "+this.getNomeAutor());
        System.out.println("DATA DE PUBLICAÇÂO: "+this.getDataPublicacao());
        System.out.println("N° de PÁGINAS: "+this.getNumeroDePaginas());
        System.out.println("ARTIGO: "+this.getArtigo());
        System.out.println("--------------------------------------------");
    }
    public void VisializarArtigos(){///MÉTODOS PARA VISUALIZAR OS ARTIGOS
        System.out.println("TEMA: "+this.getNomeArtigo());
        System.out.println("AUTOR: "+this.getNomeAutor());
        System.out.println("DATA DE PUBLICAÇÂO: "+this.getDataPublicacao());
        System.out.println("N° de PÁGINAS: "+this.getNumeroDePaginas());
        System.out.println("ARTIGO: "+this.getArtigo());
        System.out.println("--------------------------------------------");
    }

    
    
    
    public String getArtigo() {
        return artigo;
    }

    //SET and GAT
    public void setArtigo(String artigo) {    
        this.artigo = artigo;
    }

    public String getNomeArtigo() {
        return nomeArtigo;
    }

    public void setNomeArtigo(String nomeArtigo) {
        this.nomeArtigo = nomeArtigo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
}
