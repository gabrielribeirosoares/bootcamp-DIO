package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

public ConjuntoConvidados(){
    this.convidadoSet = new HashSet<>();
}

public void adicionarConvidado(String nome, int codigoConvite){
    convidadoSet.add(new Convidado(nome, codigoConvite));
}

public void removerConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for(Convidado c: convidadoSet){
        if(c.getCodigoConvite() == codigoConvite){
            convidadoParaRemover = c;
            break;
        }
    }

    convidadoSet.remove(convidadoParaRemover);
}

public int contarConvidados(){
    return convidadoSet.size();
}

public void exibirConvidados(){
    System.out.println(convidadoSet);
}

public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    // System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

    conjuntoConvidados.adicionarConvidado("Convidado 1", 0001);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 0001);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 0003);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 0004);
    conjuntoConvidados.adicionarConvidado("Convidado 5", 0005);
    conjuntoConvidados.adicionarConvidado("Convidado 6", 0006);

    conjuntoConvidados.exibirConvidados();

    System.out.println("Existe(m) "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(0003);

    System.out.println("Existe(m) "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.exibirConvidados();
}

}
