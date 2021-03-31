import jdk.nashorn.internal.objects.annotations.Getter;

public  class ElementoNo<T> {
    private T valor;
    private ElementoNo<T> proximo;
    

    public ElementoNo(T valor){
        this.valor = valor;
    }
    public void setValor (T valor) {
        this.valor = valor;
    } 

    public T getValor() {
        return valor;
    }


    public void setProximo (ElementoNo<T> no) {
        this.proximo = no;
    } 

    public ElementoNo<T> getProximo() {
        return proximo;
    }

}
