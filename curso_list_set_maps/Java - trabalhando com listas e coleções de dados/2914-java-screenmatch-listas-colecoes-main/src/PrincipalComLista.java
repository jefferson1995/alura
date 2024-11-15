import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        var filmeJefferson = new Filme("Vingadores", 2023);
        filmeJefferson.avalia(6);

        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.addAll(List.of(filmeJefferson, meuFilme, lost));

        listaDeAssistidos.forEach(titulo -> {
            if(titulo instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            System.out.println(titulo.getNome());
        });

        List<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("teste 1");
        buscaPorArtista.add("aeste 2");
        buscaPorArtista.add("meste 3");

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        System.out.println("Lista de assistidos sem ordenar");
        System.out.println(listaDeAssistidos);

        System.out.println("Lista de assistidos ordenados: ");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        System.out.println("Outra opção para comparar: ");
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);
    }
}