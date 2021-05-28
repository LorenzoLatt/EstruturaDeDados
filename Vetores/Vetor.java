package Vetores;

public class Vetor {


    final private int[] elementosVetor;
    private int indice = 0;
    final private int tamanho = 10;

    public Vetor() {


        elementosVetor = new int[tamanho];

    }

    public void addElemento(int valor) {

        if(elementosVetor[indice] == 0 && valor > 0) {

            elementosVetor[indice] = valor;
            indice++;
        } else if(valor == 0) {

            System.out.println("Número vazio. Não preenche o vetor.");
        }
        if(vetorCheio()) {

            System.out.println("Vetor já preenchido");
        }

    }
    public void mostrarVetor() {

        for(int array: elementosVetor) {

            System.out.print(array + " - ");
        }
    }

    public void apagarValor(int valorApagado) {

        for(int i = 1; i <= elementosVetor.length; i++) {

            if(i == valorApagado) {

                elementosVetor[i - 1] = 0;
            }
        }
    }

    public void consultarValor(int valorConsulta) {
        int elementoConsulta = 0;
        for (int i = 0; i < elementosVetor.length; i++) {

            if (elementosVetor[i] == valorConsulta) {

                System.out.println("Este elemento existe no vetor e está na posição " + (i + 1));
                mostrarVetor();
                break;
            }
            if(elementosVetor[i] != valorConsulta) {
                elementoConsulta++;
            }
            if(elementoConsulta == 10) {

                System.out.println("Este elemento não existe no vetor.");
            }
        }
    }

    public void maiorNumero() {

         int maiorNumero = elementosVetor[0];

         for(int i = 0; i < elementosVetor.length; i++) {

             if(elementosVetor[i] > maiorNumero) {

                 maiorNumero = elementosVetor[i];
         }

     }
        System.out.println(maiorNumero);
    }

    public void menorNumero() {
        int menorNumero = elementosVetor[0];
        for(int i = 0; i < elementosVetor.length; i++) {




            if(elementosVetor[i] < menorNumero) {

                menorNumero = elementosVetor[i];

            }
        }
        System.out.println(menorNumero);
    }

    public void verificarNumeros() {
        int contador = 0;
        for(int i = 0; i < elementosVetor.length; i++) {

            if(elementosVetor[i] == 0) {

                contador++;
            }
        }

        System.out.println("Existem " + contador + " elementos vazios no vetor e " + (elementosVetor.length -
                contador) + " elementos numéricos válidos.");
    }

    public boolean vetorCheio() {
        int contador = 0;
        for(int numero: elementosVetor) {

            if(numero != 0) {

                contador++;
            }
        }

        if(contador == 10) {

            return true;
        }
        return false;
    }
    
}

