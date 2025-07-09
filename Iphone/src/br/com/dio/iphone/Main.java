package br.com.dio.iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando funcionalidades do reprodutor musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar("Imagine - John Lennon");
        iphone.pausar();

        // Testando funcionalidades do navegador
        iphone.exibirPagina("https://www.apple.com/br/iphone/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Testando funcionalidades telefônicas
        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
