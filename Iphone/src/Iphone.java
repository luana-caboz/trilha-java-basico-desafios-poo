import java.util.ArrayList;
import java.util.List;

public class Iphone {

//implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
 
    private String musicaAtual;
    private boolean tocando;
    private boolean chamadaAtiva;
    private List<String> abas;
    private String paginaAtual;

    public Iphone(){
        this.abas = new ArrayList<>();
        this.tocando = false;
        this.chamadaAtiva = false;
    }

    public void tocar(){
        if(musicaAtual != null){
            tocando = true;
            System.out.println("Reproduzindo musica: "+musicaAtual);
        } else {
            System.out.println("Nenhuma musica selecionada.");
        }
    }

    public void pausar(){
        if(tocando){
            tocando = false;
            System.out.println("Musica pausada.");
        } else {
            System.out.println("Nenhuma musica tocando");
        }
    }

    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        System.out.println("Musica selecionada: "+musica);
    }

    public void ligar(String numero){
        if(!chamadaAtiva){
            chamadaAtiva = true;
            System.out.println("Ligando para "+numero);
        } else {
            System.out.println("Já existe uma chamada ativa");
        }
    }

    public void atender(){
        if(!chamadaAtiva) {
            chamadaAtiva = true;
            System.out.println("Atendendo chamada.");
        } else {
            System.out.println("Já está em uma chamada.");
        }
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url){
        this.paginaAtual = url;
        System.out.println("Exibindo página: "+url);
    }

    public void adicionarNovaAba(){
        abas.add("Nova aba");
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina(){
        if(paginaAtual != null){
            System.out.println("Página atualizada: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página está sendo exibida.");
        }
    }

    public boolean isTocando() {
        return tocando;
    }

    public boolean isChamadaAtiva() {
        return chamadaAtiva;
    }

    public List<String> getAbas() {
        return abas;
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }
}

