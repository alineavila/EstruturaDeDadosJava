import jdk.nashorn.internal.objects.annotations.Getter;

public  class ElementoNo {
    private String valor;
    private ElementoNo proximo;
    

    public ElementoNo(String valor){
        this.valor = valor;
    }
    public void setValor (String valor) {
        this.valor = valor;
    } 

    public String getValor() {
        return valor;
    }


    public void setProximo (ElementoNo no) {
        this.proximo = no;
    } 

    public ElementoNo getProximo() {
        return proximo;
    }

}
