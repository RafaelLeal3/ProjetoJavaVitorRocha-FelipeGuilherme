
package trabalhoaldomain;

public class Pessoa {
        private String nome;
    private int idade;
    private String email;
    private String sexo;
    private String telefone;
    private String senha;
    
    //Métodos especiais
    
    public void VisualizarCadastro(){
        System.out.println("==========DADOS==========");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Email: "+this.getEmail());
        System.out.println("Senha: "+this.getSenha());
        
    }
    


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return telefone;
    }

    public void setNacionalidade(String nacionalidade) {
        this.telefone = nacionalidade;
    }
    
}
