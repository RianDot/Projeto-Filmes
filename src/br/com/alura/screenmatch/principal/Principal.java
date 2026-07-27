package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());


        Serie serie1 = new Serie("Breaking Bad", 2008);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(5);
        serie1.setEpisodiosPorTemporada(12);
        serie1.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Breaking Bad: " + serie1.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(8.5);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filme3 = new Filme("Senhor Dos Anéis O Retorno Do Rei", 2003);
        filme3.setDuracaoEmMinutos(210);
        filme3.setDiretor("Peter Jackson");
        System.out.println("Duração do filme: " + filme3.getDuracaoEmMinutos());
        calculadora.inclui(filme3);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}