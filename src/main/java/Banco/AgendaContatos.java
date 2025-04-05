package Banco;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public  AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void  adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);

            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }


    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 1111);
        agenda.adicionarContato("Bruno", 2222);
        agenda.adicionarContato("Ana", 3333);

        // Exibindo todos os contatos
        System.out.println("Todos os contatos:");
        agenda.exibirContato();

        // Pesquisando contatos pelo nome que começa com "A"
        System.out.println("\nContatos que começam com 'A':");
        Set<Contato> encontrados = agenda.pesquisarPorNome("A");
        for (Contato c : encontrados) {
            System.out.println(c);
        }

        // Atualizando número de contato
        System.out.println("\nAtualizando número de 'Bruno' para 9999:");
        Contato atualizado = agenda.atualizarNumeroContato("Bruno", 9999);
        System.out.println("Contato atualizado: " + atualizado);

        // Exibindo contatos após atualização
        System.out.println("\nContatos após atualização:");
        agenda.exibirContato();

    }
}
