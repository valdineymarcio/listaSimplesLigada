public class No<T> {

    private T informacaoPrincipal;
    private No<T> proximoDaLista;

    public No(T novaInformacao, No<T> proximo){
        this.informacaoPrincipal = novaInformacao;
        this.proximoDaLista = proximo;
    }

    public No(T novaInformacao){
        this(novaInformacao, null);
    }

    public T getInformacaoPrincipal() {

        return informacaoPrincipal;
    }

    public void setInformacaoPrincipal(T informacaoPrincipal) {

        this.informacaoPrincipal = informacaoPrincipal;
    }

    public No<T> getProximoDaLista() {

        return proximoDaLista;
    }

    public void setProximoDaLista(No<T> proximoDaLista) {

        this.proximoDaLista = proximoDaLista;
    }
}
