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

    public void remover(String valor) {

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
