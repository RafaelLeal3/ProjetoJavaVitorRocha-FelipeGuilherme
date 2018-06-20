
package trabalhoaldomain;
public class DadosDoApp {
    private String nomeApp;
    private String anoDeLancamento;
    private String objetivo;
    private String funcionalidade;
    private String desenvolvedores;

    public DadosDoApp(String nomeApp, String anoDeLancamento, String objetivo, String funcionalidade) {
        this.nomeApp = nomeApp;
        this.anoDeLancamento = anoDeLancamento;
        this.objetivo = objetivo;
        this.funcionalidade = funcionalidade;
    }
    
    public void NomeApp(){
        this.setNomeApp("Ciência Fácil");
        System.out.println("====NOME====");
        System.out.println(this.getNomeApp());
        
        
    }public void AnoLan(){
        this.setAnoDeLancamento("15/06/2018");
            System.out.println("=== ANO DE LANÇAMENTO ===");
            System.out.println(this.getAnoDeLancamento());
    }
    public void Objetivo(){
        System.out.println("==== OBJETIVO ====");
        this.setObjetivo("O objetivo inical do projeto é Criar um sistema que");
        System.out.println(" possibilita ao usuário se cadastrar e armazenar  seus ");
        System.out.println ("Artigos científicos. Futuramente o programa ficionará como ");
        System.out.println("uma comunidade de compartilhamento de conteúdo Científico ");
        System.out.println(this.getObjetivo());
    }
    public void Fncionaidade(){
        System.out.println("==== FUNCIONALIDADES ===");
        this.setFuncionalidade("Armazenamento e exibição de Artigos");
        System.out.println(this.getFuncionalidade());
    }
    public void Desenvolvedores(){
        System.out.println("=== DESENVOLVEDORES ===");
        this.setDesenvolvedores("FELIPE GUILHERME\nVITOR ROCHA");
        System.out.println(this.getDesenvolvedores());
    }

    public DadosDoApp() {
    }
    
    
    

    public String getNomeApp() {
        return nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public String getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(String desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
    
    
    
    
    
}
