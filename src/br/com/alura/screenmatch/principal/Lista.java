package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        filme1.avalia(10);
        Serie serie1 = new Serie("Breaking Bad", 2008);
        serie1.avalia(10);
        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(7.5);
        Filme filme3 = new Filme("Senhor Dos Anéis O Retorno Do Rei", 2003);
        filme3.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme3);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            }
        }
    }
}
