package aparelho;

import entities.AparelhoTelefonico;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando para alguém");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void correioVoz() {
        System.out.println("Ouvindo o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void adicionarAbaNova() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void parar() {
        System.out.println("Parando música");
    }

    @Override
    public void escolherMusica() {
        System.out.println("Escolhendo alguma música");
    }
}
