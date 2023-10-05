package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }

        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }

        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Gabriel", 991348);
        agendaContatos.adicionarContato("Gabriel",  0);
        agendaContatos.adicionarContato("Gabriel R.", 991348);
        agendaContatos.adicionarContato("Gabriel S.", 991348);
        agendaContatos.adicionarContato("Gabriel Ribeiro", 991348);
        agendaContatos.adicionarContato("Duda", 9913);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Duda"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Gabriel", 1234));
        
        agendaContatos.exibirContatos();

    }

}
