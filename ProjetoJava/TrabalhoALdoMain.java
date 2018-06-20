package trabalhoaldomain;

import java.util.Scanner;

public class TrabalhoALdoMain {
    public static void main(String[] args) {
        System.out.println("========================================================");//NOME DO PROJETO
        System.out.println("===== CIÊNCIA FÁCIL, PESQUISA DE ARTIGO CIENTÍFICO =====");//NOME DO PROJETO
        System.out.println("========================================================");//NOME DO PROJETO
        int opc=0;//VARIAVELPARA SER UTILIZADA NO ENQUANTO
        Scanner escreva=new Scanner(System.in);//INSTANCIANDO UM OBJTO PAAR ENTRADA DE DADOS
        while(opc!=6){//ENQUANTO A OPÇÃO FOR DIFERENTE DE 6 FACA O QUE ESTÁ A BAIXO
            System.out.println("================MENU================");
            System.out.println("DIGITE (1) PARA EFETUAR O CADASTRO E VISUALIZA-LO.");
            System.out.println("DIGITE (2) PARA REMOVER SEU CADASTRO.");
            System.out.println("DIGITE (3) PARA INCERIR UM ARTIGO OU VISUALIZAR SEUS ARTIGOS.");
            System.out.println("DIGITE (4) PARA MODIFICAR SEUS ARTIGOS.");
            System.out.println("DIGITE (5) PARA VISUALIZAR OS DADOS DO SISTEMA");
            System.out.print("OPCÃO: ");
            opc=escreva.nextInt();//LÊ A OPÇÃO
            Pessoa p=new Pessoa();//CRIANDO UM OBJETO P DO TIPO PESSOA
            ArraySalvarCadastro ad=new ArraySalvarCadastro();//CRIANDO UM OBJETO AD DO TIPO ARRAYSALVARCADASTRO
            switch(opc){//ESCOLHA OPÇÃO
                case 1://SE OPÇÃO FOR IGAUAL A 1 ELE VAI INCERIR OS DADOS E SE CADASTRAR
                    
                    System.out.print("Nome: ");
                    p.setNome(escreva.next());
                    System.out.print("Emai: ");
                    p.setEmail(escreva.next());
                    System.out.print("Senha: ");
                    p.setNome(escreva.next());
                    System.out.print("Idade: ");
                    p.setIdade(escreva.nextInt());
                    System.out.print("Sexo M/F: ");
                    p.setSexo(escreva.next());
                    System.out.print("Telefone:  ");
                    p.setNacionalidade(escreva.next());
                    ad.adicionarUsario(p);
                    System.out.println(ad.listaUsuaio());
                    System.out.println("==============================");
                    System.out.println("CADASTRO REALIZADO COM SUCESSO");
                    System.out.println("==============================");
                    break;
                case 2://SE OPÇÃO FOR GUAL A 2 ELE VAI REMOVER OCADASTRO
                    ad.removeUsuario(p);
                    System.out.println("==============================");
                    System.out.println("CADASTRO REMOVIDO COM SUCESSO");
                    System.out.println("==============================");
                    p.VisualizarCadastro();
                    break;
                case 3:
                    int op=0;
                    while(op!= 3){
                        System.out.println("Digite 1 para incerir seus 3 Artigos");
                        System.out.println("Didite 2 para visualizar os seus Artigos");
                        System.out.println("Digite 3 para voltar ao MENU");
                        System.out.print("OPÇÂO: ");
                        op=escreva.nextInt();
                        Artigos at=new Artigos();
                        Artigos at2=new Artigos();
                        Artigos at3=new Artigos();
                        if(op==1){
                            System.out.println("----------------------------------");
                            System.out.println("Incira seus 3 Artigos");
                            System.out.println("----------------------------------");
                            
                            System.out.print("DIGITE O TEMA DO 1° ARTIGO: ");
                            at.setNomeArtigo(escreva.next());
                            System.out.print("INFORME O NOME DO AUTOR: ");
                            at.setNomeAutor(escreva.next());
                            System.out.print("INFORME A DATA DE PUBLICAÇÂO: ");
                            at.setDataPublicacao(escreva.next());
                            System.out.print("INORME O NUMERO DE PÁGINAS: ");
                            at.setNumeroDePaginas(escreva.nextInt());
                            System.out.print("COLE O ARQUIVO AQUI-> ");
                            at.setArtigo(escreva.next());
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


                            System.out.print("DIGITE O TEMA DO 2° ARTIGO: ");
                            at2.setNomeArtigo(escreva.next());
                            System.out.print("INFORME O NOME DO AUTOR: ");
                            at2.setNomeAutor(escreva.next());
                            System.out.print("INFORME A DATA DE PUBLICAÇÂO: ");
                            at2.setDataPublicacao(escreva.next());
                            System.out.print("INORME O NUMERO DE PÁGINAS: ");
                            at2.setNumeroDePaginas(escreva.nextInt());
                            System.out.print("COLE O ARQUIVO AQUI-> ");
                            at2.setArtigo(escreva.next());
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                            System.out.print("DIGITE O TEMA DO 3° ARTIGO: ");
                            at3.setNomeArtigo(escreva.next());
                            System.out.print("INFORME O NOME DO AUTOR: ");
                            at3.setNomeAutor(escreva.next());
                            System.out.print("INFORME A DATA DE PUBLICAÇÂO:  ");
                            at3.setDataPublicacao(escreva.next());
                            System.out.print("INORME O NUMERO DE PÁGINAS: ");
                            at3.setNumeroDePaginas(escreva.nextInt());
                            System.out.print("COLE O ARQUIVO AQUI-> ");
                            at3.setArtigo(escreva.next());

                            at.CadastrarArtigos();
                            at2.CadastrarArtigos();
                            at3.CadastrarArtigos(); 
                           
                        }else if(op==2){
                            
                            System.out.print("1° Artigo: ");
                            System.out.println("ARTIGO NAO DISPONÍVEL");
                            System.out.print("2° Artigo: ");
                            System.out.println("ARTIGO NAO DISPONÍVEL");
                            System.out.print("3° Artigo: ");
                            System.out.println("ARTIGO NAO DISPONÍVEL");
                        }
                    }
                    break;
                case 4:
                    System.out.println("==== TELA DE MODIFICAÇÂO ====");
                    Artigos at=new Artigos();
                    Artigos at2=new Artigos();
                    Artigos at3=new Artigos();
                    System.out.println("----------------------------------");
                    System.out.println("Incira seus 3 Artigos: ");
                    System.out.println("----------------------------------");
                    
                    System.out.print("DIGITE O TEMA DO 1° ARTIGO: ");
                    at.setNomeArtigo(escreva.next());
                    System.out.print("INFORME O NOME DO AUTOR: ");
                    at.setNomeAutor(escreva.next());
                    System.out.print("INFORME A DATA DE PUBLICAÇÂO: ");
                    at.setDataPublicacao(escreva.next());
                    System.out.print("INORME O NUMERO DE PÁGINAS: ");
                    at.setNumeroDePaginas(escreva.nextInt());
                            System.out.print("COLE O ARQUIVO AQUI-> ");
                            at.setArtigo(escreva.next());
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


                            System.out.print("DIGITE O TEMA DO 2° ARTIGO: ");
                            at2.setNomeArtigo(escreva.next());
                            System.out.print("INFORME O NOME DO AUTOR: ");
                            at2.setNomeAutor(escreva.next());
                            System.out.print("INFORME A DATA DE PUBLICAÇÂO: ");
                            at2.setDataPublicacao(escreva.next());
                            System.out.print("INORME O NUMERO DE PÁGINAS: ");
                            at2.setNumeroDePaginas(escreva.nextInt());
                            System.out.print("COLE O ARQUIVO AQUI-> ");
                            at2.setArtigo(escreva.next());
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                            System.out.print("DIGITE O TEMA DO 3° ARTIGO: ");
                            at3.setNomeArtigo(escreva.next());
                            System.out.print("INFORME O NOME DO AUTOR: ");
                            at3.setNomeAutor(escreva.next());
                            System.out.print("INFORME A DATA DE PUBLICAÇÂO:  ");
                            at3.setDataPublicacao(escreva.next());
                            System.out.print("INORME O NUMERO DE PÁGINAS: ");
                            at3.setNumeroDePaginas(escreva.nextInt());
                            System.out.print("COLE O ARQUIVO AQUI-> ");
                            at3.setArtigo(escreva.next());

                            at.CadastrarArtigos();
                            at2.CadastrarArtigos();
                            at3.CadastrarArtigos();    
                case 5:
                    DadosDoApp app=new DadosDoApp();
                    app.NomeApp();
                    app.Objetivo();
                    app.Fncionaidade();
                    app.AnoLan();
                    app.Desenvolvedores();
                    
                   
            
        }
    }
    
}
}
