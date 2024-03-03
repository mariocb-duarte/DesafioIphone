public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correrio voz");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}