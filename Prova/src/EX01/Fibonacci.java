package EX01;

public class Fibonacci{
    private int menor = 0;
    private int maior = 1;
    private int soma = 0;
    private String result;
    public int valor;

    public Fibonacci(int valor){
        this.valor = valor;
        result = "Seu valor " + this.valor + " não pertence a sequência";
    }

    public void pegaValor(){
        if (this.valor == 0){
            System.out.println("Seu valor faz parte da fibonacci");
        }
        while (this.valor > soma){
            soma = menor + maior;
            menor = maior;
            maior = soma;
            if (this.valor == soma){
                result = "Seu valor " + this.valor + " pertence a sequência";
            }
            System.out.println(maior);
        }
        System.out.println(result);
    }
}