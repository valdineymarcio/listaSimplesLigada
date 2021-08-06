public class ListaSimples<T extends Comparable<T>> {

    private No<T> inicioDaLista;
    private No<T> fimDaLista;
    //private int size;

    public ListaSimples(){
        this.inicioDaLista = null;
        this.fimDaLista= null;
       // this.size = 0;
    }

    public No<T> getInicioDaLista() {
        return inicioDaLista;
    }
    public boolean estaNulo(No<T> objeto) {
        return objeto == null;
    }
    public boolean estaVazia() {
        return estaNulo(this.inicioDaLista);
    }
    private No<T> criaNo(T objeto) {
        return new No<>(objeto);
    }

   // public int getSize() {
//
  //      return size;
    //}

    public void insercaoInicio(T objeto){
        No<T> novoNo = criaNo(objeto);
        if (estaVazia()) {
            this.inicioDaLista = this.fimDaLista= novoNo;
        } else {
            novoNo.setProximoDaLista(this.inicioDaLista);
            this.inicioDaLista = novoNo;
        }


    }

    public void insercaoFim(T objeto){
        No<T> novoNo = criaNo(objeto);
        if (estaVazia()) {
            this.inicioDaLista = this.fimDaLista = novoNo;
        } else {
            this.fimDaLista.setProximoDaLista(novoNo);
            this.fimDaLista = novoNo;
        }

    }

    public void insercaoOrdenada(T objeto){
        No<T> novoNo = criaNo(objeto), anterior = null, ptr = this.inicioDaLista;
        if (estaVazia()) {
            this.inicioDaLista = this.fimDaLista = novoNo;
        } else {
            while (!estaNulo(ptr) && objeto.compareTo(ptr.getInformacaoPrincipal()) > 0) {
                anterior = ptr;
                ptr = ptr.getProximoDaLista();
            }

            if (estaNulo(anterior)) {
                novoNo.setProximoDaLista(this.inicioDaLista);
                this.inicioDaLista = novoNo;
            } else {
                anterior.setProximoDaLista(novoNo);
                novoNo.setProximoDaLista(ptr);
                if (estaNulo(ptr)) {
                    this.fimDaLista = novoNo;
                }
            }
        }

    }

    public T remocao(T valor){

        return null;
    }

    public No<T> busca(T objeto){
        No<T> ponteiro = this.inicioDaLista;
        while (!estaNulo(ponteiro) && (objeto.compareTo(ponteiro.getInformacaoPrincipal()) != 0)) {
            ponteiro = ponteiro.getProximoDaLista();
        }
        if (!estaNulo(ponteiro)) {
            return (No<T>) ponteiro.getInformacaoPrincipal();
        }
        return null;


    }
    public void imprime() {
        No<T> ptr = this.inicioDaLista;
        System.out.println("LISTA LIGADA");
        while (!estaNulo(ptr)) {
            System.out.println(ptr.getInformacaoPrincipal() + " ");
            ptr = ptr.getProximoDaLista();
        }

    }


}
