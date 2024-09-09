package EX02;

public class Verificador {
    public String texto;
    private int cont = 0;
    private int cont1 = 0;
    private int cont2 = 1;
    private int contadorA = 0;

    public Verificador(String texto){
        this.texto = texto;

    }

    public void contador(){
        while(cont != texto.length()){
            if (texto.substring(cont1, cont2).equalsIgnoreCase("A")){
                contadorA = contadorA + 1;
            }
            cont1 = cont1 + 1;
            cont2 = cont2 + 1;
            cont++;
        }
        System.out.println("Esse texto tem " + contadorA + " Letras A");
    }
}
