package Banco;

import java.util.List;

public class TestandoCatalogos {

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogo.adicionar("Dom Casmurro", "Machado de Assis", 1899);
        catalogo.adicionar("O Cortiço", "Aluísio Azevedo", 1890);
        catalogo.adicionar("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        catalogo.adicionar("Grande Sertão: Veredas", "Guimarães Rosa", 1956);
        catalogo.adicionar("O Alienista", "Machado de Assis", 1882);

        // Pesquisar livros por autor
        System.out.println("Livros de Machado de Assis:");
        List<Livro> livrosMachado = catalogo.pesquisarPorAutor("Machado de Assis");
        for (Livro livro : livrosMachado) {
            System.out.println(livro);
        }

        // Pesquisar livros por intervalo de anos
        System.out.println("\nLivros publicados entre 1880 e 1900:");
        List<Livro> livrosPeriodo = catalogo.pesquisarPorIntervaloAnos(1880, 1900);
        for (Livro livro : livrosPeriodo) {
            System.out.println(livro);
        }

        // Pesquisar livro por título
        System.out.println("\nPesquisando por título 'O Alienista':");
        Livro livroTitulo = catalogo.pesquisarPorTitulo("O Alienista");
        if (livroTitulo != null) {
            System.out.println(livroTitulo);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

}

