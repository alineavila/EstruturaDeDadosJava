import java.util.PrimitiveIterator;

public class ListaLigada<T> {
    private ElementoNo<T> primeiro;
    private ElementoNo<T> ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public ElementoNo<T> getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(ElementoNo<T> primeiro) {
        this.primeiro = primeiro;
    }

    public ElementoNo<T> getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(ElementoNo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(T novoValor) {
        ElementoNo<T> novoElemento = new ElementoNo<T>(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
        
    }

    public void remover(T valorProcurado) {
        ElementoNo<T> atual = this.primeiro;
        ElementoNo<T> anterior = this.primeiro;
        for (int i=0; i < this.tamanho; i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (this.tamanho == 1) { 
                    this.ultimo = null;
                    this.primeiro = null;
                } else if (atual.equals(this.primeiro)) {
                    this.primeiro  = atual.getProximo();
                } else if (atual.equals(this.ultimo)) {
                    this.ultimo =  anterior;
                    this.ultimo.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public ElementoNo<T> get(int posicao) {
        ElementoNo<T> atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            } else {
                return new ElementoNo<T>(null);
            }
        }
        return atual;
    }
    
}
