package trabalhoaldomain;
import java.util.ArrayList;
public class ArraySalvarCadastro {
        private final ArrayList<Pessoa> usuario=new ArrayList();//CRIANDO UM ARRAYLIST DO TIPO PESSOA
    public void adicionarUsario(Pessoa p1){//METODO PARA ADICIONAR UM USUÁRIO P1 EM PESSOA
        this.usuario.add(p1);//ADICIONANDO P1 AO ARRAYLIST
    }
    public void removeUsuario(Pessoa p1){//METODO PARA REMOVER O USUARIO P1
        this.usuario.remove(p1);//REMOENDO O USUARIO P1
    }
    public String listaUsuaio(){//MÉTODO PARA EXBIR OS DADOS DE P1
        String lista= "";//CRIA-SE UMA LISTA PARA COLOCAR OS DADOS
        for(int c=0;c<this.usuario.size();c++){//PERCORRE-SE O ARRAYLIST
            Pessoa p1=this.usuario.get(c);//A VARIAVEL C RECEBE P1
            lista="==========DADOS=========="+"\nNome: "+p1.getNome()+"\nEmail: "+p1.getEmail()+"\nSenha: ********"+"\nIdade: "+p1.getIdade()+"\nSexo: "+p1.getSexo()+"\nNumero: "+p1.getNacionalidade();
        }//OS DADOS DO ARAYLIST SÃO COLOCADOS DETRO DA LISTA
        return lista;//RETONA-SE A LISTA COM OS DADOS
    }
    
    
}
