# Diagrama UML do iPhone

```mermaid

classDiagram
    Iphone..|>ReprodutorMusical 
    Iphone..|>AparelhoTelefonico 
    Iphone..|>NavegadorInternet

class ReprodutorMusical {
    <<interface>>
    +tocar()
    +pausar()
    +selecionarMusica(musica: String)
}

class AparelhoTelefonico {
    <<interface>>
    +ligar(numero: String)
    +atender()
    +iniciarCorreioVoz()
}

class NavegadorInternet {
    <<interface>>
    +exibirPagina(url: String)
    +adicionarNovaAba()
    +atualizarPagina()
}

class Iphone {
    - String musicaAtual
    - boolean tocando
    - boolean chamadaAtiva
    -  List<String> abas
    - String paginaAtual

    +iphone()
    + void tocar()
    + void pausar()
    + void selecionarMusica(String musica)
    + void ligar(String numero)
    + void atender()
    + void iniciarCorreioVoz()
    + void exibirPagina(String url)
    + void adicionarNovaAba()
    + void atualizarPagina()
    + boolean isTocando()
    + boolean isChamadaAtiva()
    + List<String> getAbas()
    + String getPaginaAtual()
}
