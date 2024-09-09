package EX03;

public class Soma {
    private int indice = 12;
    private int soma = 0;
    private int k = 1;

    public void Resultado(){
        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}
