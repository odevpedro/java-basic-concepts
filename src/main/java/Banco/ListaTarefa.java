package Banco;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    private List<Tarefa> tarefaList;

    public ListaTarefa(){

        this.tarefaList = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao) {

        Tarefa tarefa = new Tarefa(descricao);
        tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList){
            if (tarefa != null & tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        //pego a lista original chamo o remove all com tudo aquilo que precisa ser removido
    }

    public int obterNumeroTotalTarefas() {

        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {

        System.out.println(tarefaList.get(1));

    }

    //Testando os métodos
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é " +
                listaTarefa.obterNumeroTotalTarefas());

        //descricao das tarefas
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());


        //obtendo descrição de uma tarefa especifica
       listaTarefa.obterDescricoesTarefas();
    }


}