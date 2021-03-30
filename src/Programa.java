public class Programa {
    
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        lista.adicionar("DF");
        lista.adicionar("CE");
        lista.adicionar("BA");
        //GET PRIMEIRO E ULTIMO ELEMENTOS 
        System.out.println("Primeiro Elemento " + lista.getPrimeiro());
        System.out.println("Ultimo Elemento " + lista.getUltimo());
        //PROCURAR ELEMENTOS NA POSIÇÃO EXATA
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Elemento na posicao " + i + " " + lista.get(i).getValor());
        }
        //REMOVER ELEMENTOS
        System.out.println("REMOÇÃO");
        lista.remover("AC");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Elemento na posicao " + i + " " + lista.get(i).getValor());
        }
        System.out.println("Tamanho da lista depois de removido " + lista.getTamanho());
        System.out.println("primeiro elemento  " + lista.getPrimeiro().getValor());
        System.out.println("ultimo elemento  " + lista.getUltimo().getValor());
          
        

    }
    
}
