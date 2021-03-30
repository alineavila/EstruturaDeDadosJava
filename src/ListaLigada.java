import java.util.PrimitiveIterator;

public class ListaLigada {
    private ElementoNo primeiro;
    private ElementoNo ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public ElementoNo getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(ElementoNo primeiro) {
        this.primeiro = primeiro;
    }

    public ElementoNo getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(ElementoNo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        ElementoNo novoElemento = new ElementoNo(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
        
    }

    public void remover(String valorProcurado) {
        ElementoNo atual = this.primeiro;
        ElementoNo anterior = this.primeiro;
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

    public ElementoNo get(int posicao) {
        ElementoNo atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            } else {
                return new ElementoNo(null);
            }
        }
        return atual;
    }
    
}
