package teste;

import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;
import org.junit.Assert;
import org.junit.Test;
import servico.Avaliador;

public class TesteDoAvaliador {

    @Test
    public void lancesOrdemCrescente() {
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorEsperado = 400;
        double menorEsperado = 250;

        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.00001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
    }
}
