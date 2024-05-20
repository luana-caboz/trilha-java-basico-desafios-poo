public class Main {

    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Final De Tarde - Péricles");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("11-94456-7889");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.petlove.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
