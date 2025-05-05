public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando ReprodutorMusical
        System.out.println("=== Testando Reprodutor Musical ===");
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        System.out.println("\n=== Testando Aparelho Telefônico ===");
        meuIphone.ligar("13997004280");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        System.out.println("\n=== Testando Navegador de Internet ===");
        meuIphone.exibirPagina("localhost:8080");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}