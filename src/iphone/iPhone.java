package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    // Métodos Aparelho telefônico
    @Override
    public void ligar(){
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atender(){
        System.out.println("Atendeu a ligação");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }


    // Método Navegador na internet
    @Override
    public void exibirPagina(){
        System.out.println("Página sendo exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }

    // Métodos Reprodutor musical
    @Override
    public void tocar(){
        System.out.println("Tocando música");
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Musica selecionada");
    }
}