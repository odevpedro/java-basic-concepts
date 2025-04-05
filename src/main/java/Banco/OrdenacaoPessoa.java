package Banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private  List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

        public void adicionarPessoa(String nome, int idade, double altura) {
            this.pessoasList.add(new Pessoa(nome, idade, altura));
        }

        public List<Pessoa> ordenarPorIdade() {
            List<Pessoa> pessoasporIdade = new ArrayList<>(pessoasList);
            Collections.sort(pessoasporIdade);
            return pessoasporIdade;
        }

        public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        }


        //Testando métodos
        public static void main(String[] args) {
            OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
            pessoa.adicionarPessoa("Nome 1", 29, 1.86);
            pessoa.adicionarPessoa("Nome 2", 49, 1.58);
            pessoa.adicionarPessoa("Nome 3", 19, 1.96);
            pessoa.adicionarPessoa("Nome 1", 39, 1.76);


            System.out.println(pessoa.ordenarPorAltura());
            System.out.println(pessoa.ordenarPorIdade());

        }

}
