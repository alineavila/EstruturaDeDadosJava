public class Programa {
    
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        lista.adicionar("DF");
        lista.adicionar("CE");
        lista.adicionar("BA");
        System.out.println("Primeiro Elemento " + lista.getPrimeiro());
        System.out.println("Ultimo Elemento " + lista.getUltimo());
        System.out.println("Elemento na posicao 0 " + lista.get(0).getValor());
        System.out.println("Elemento na posicao 1 " + lista.get(1).getValor());
        System.out.println("Elemento na posicao 4 " + lista.get(4).getValor());
        

    }
    
}
