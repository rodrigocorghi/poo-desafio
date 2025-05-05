public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String numeroAtual;
    private String urlAtual;

    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação de: " + numeroAtual);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz...");
    }

    // NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + urlAtual);
    }
}
