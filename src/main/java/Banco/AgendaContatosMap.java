package Banco;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }


    //quando trabalhamos com o map não precisamos percorrer, chave única
    public void removerUmcontato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarContato(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatosMap agenda = new AgendaContatosMap();

        // Teste: Adicionar contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Carlos", 456123789);

        System.out.println("\n📒 Contatos após adicionar:");
        agenda.exibirContato();

        AgendaContatosMap agendaContatosMap = new AgendaContatosMap();
        agendaContatosMap.exibirContato();

        // Teste: Pesquisar contato existente
        System.out.println("\n🔍 Pesquisar telefone de Bob:");
        Integer telefoneBob = agenda.pesquisarContato("Bob");
        if (telefoneBob != null) {
            System.out.println("Telefone do Bob: " + telefoneBob);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Teste: Pesquisar contato inexistente
        System.out.println("\n🔍 Pesquisar telefone de Daniela:");
        Integer telefoneDaniela = agenda.pesquisarContato("Daniela");
        if (telefoneDaniela != null) {
            System.out.println("Telefone da Daniela: " + telefoneDaniela);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Teste: Remover contato
        System.out.println("\n❌ Remover contato 'Carlos'");
        agenda.removerUmcontato("Carlos");

        System.out.println("\n📒 Contatos após remoção:");
        agenda.exibirContato();


    }

}
