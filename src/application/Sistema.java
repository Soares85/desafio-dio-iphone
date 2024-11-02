package application;

import aparelho.Iphone;

public class Sistema {

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        iphone1.ligar();
        iphone1.atender();
        iphone1.correioVoz();

        System.out.println("-------------");

        iphone1.escolherMusica();
        iphone1.tocar();
        iphone1.parar();

        System.out.println("-------------");

        iphone1.exibirPagina();
        iphone1.atualizarPagina();
        iphone1.adicionarAbaNova();

    }

}
