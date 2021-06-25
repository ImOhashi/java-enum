package main;

public class Teste {
    public static void main(String[] args) {
        Prioridade pMax = Prioridade.MAX;

        Thread t = new Thread(() -> System.out.println("Rodando..."));

        t.setPriority(pMax.getValor());
    }
}
