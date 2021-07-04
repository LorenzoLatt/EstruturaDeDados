package ExercicioFinalVetor;

import java.util.Random;

public class Vetor {

    final private int[] array;
    private int ocupados;
    private boolean metodoUsado = false;
    private boolean estaOrdenado = false;
    private int posicao;

    public Vetor() {

        this.array = new int[100];
    }

    public int[] retornaArray() {

        return array;
    }
    public boolean retornaOrdenado() {

        return estaOrdenado;
    }
    public int retornaPosicao() {

        return posicao;
    }

    public int retornaOcupados() {
        ocupados = 0;

        for(int numero: array) {

            if(numero != 0) {

                ocupados++;
            }
        }

        return ocupados;
    }


    public int maiorValor() {

        int maiorValor = array[0];

        for (int numero : array) {

            if (numero > maiorValor) {

                maiorValor = numero;
            }

        }

        return maiorValor;
    }

    public int menorValor() {

        int menorValor = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[0] == 0 && array[i + 1] != 0) {

                menorValor = array[i + 1];
                break;
            }
            if (menorValor > array[i] && array[i] != 0) {

                menorValor = array[i];
            }

        }

        return menorValor;

    }
    public boolean apagarValor(int  valor) {

        for(int i = 0; i < array.length; i++) {

            if(array[i] == valor) {

                array[i] = 0;
                estaOrdenado = false;
                return true;
            }

        }
        return false;
    }

    public void apagarValorPosicao(int valor) {

        for(int i = 0; i < array.length; i++) {

            if(i == valor) {

                array[valor] = 0;
                estaOrdenado = false;
                break;
            }

        }

    }

    public void inserirValor(int numero) {
        posicao = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {

                array[i] = numero;
                ocupados++;
                break;
            }
            posicao++;
        }
        metodoUsado = true;
        estaOrdenado = false;

    }

    public void mostrarVetor() {

        for(int numero: array) {

            System.out.println("Número: " + numero);

        }

    }

    public void populaOrdenado(int numero) {
        int contador = 0;
        Random random = new Random();
        if(!metodoUsado) {
            array[0] = 100;
            ocupados = 1;
            for(int i = 1; i < array.length; i++) {
                if(contador == numero) {

                    break;
                }
                if(array[i] != 0) {

                    continue;
                }
                array[i] = array[i - 1] + ((random.nextInt(100)) + 1);
                ocupados++;
                contador++;
            }
            estaOrdenado = false;
        } else {

            for(int i = ocupados; i < array.length; i++) {
                if(contador == numero) {

                    break;
                }
                if(array[i] != 0) {

                    continue;
                }
                    array[i] = array[i - 1] + ((random.nextInt(100)) + 1);
                    ocupados++;
                    contador++;
            }
        }
        metodoUsado = true;
        estaOrdenado = false;
    }

    public void populaVetorAleatorio(int numero) {
        int contador = 0;
        Random random = new Random();
        for(int i = ocupados; i < array.length; i++) {
            if(contador == numero) {

                break;
            }
            if(array[i] != 0) {

                continue;
            }
                array[i] = (random.nextInt(1000) + 1);
                ocupados++;
                contador++;
        }
        estaOrdenado = false;
    }

    public boolean buscaBinaria(int numero) {

        int meio;
        int inicio = 0;
        int fim;
        fim = array.length - 1;

        while (inicio <= fim) {

            meio = (inicio + fim) / 2;

            if (array[meio] == numero)

                return true;

            else if (array[meio] < numero) inicio = meio + 1;
            else if (array[meio] > numero) fim = meio - 1;
        }


        return false;
    }

    public int buscaBinariaRecursiva(int busca) {


        return buscaRecursiva(busca,0,array.length - 1);

    }

    public int buscaRecursiva(int busca, int menor, int maior) {

        int media = ((menor + maior)/2);

        if(menor > maior) {

            return -1;
        }
        if(array[media] == busca) {

            return media;
        }
        if(array[media] < busca) {

            return buscaRecursiva(busca,media+1, maior);
        } else {

            return buscaRecursiva(busca,menor, media - 1);
        }
    }

    public void bubbleSort() {
        int aux;

        for(int i = array.length - 1; i > 0; i--) {

            for(int j = 0; j < i; j++) {

                if(array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

            }

        }

        estaOrdenado = true;

    }

    public void insertionSort() {

        int a, b;

        for(int i = 1; i < array.length; i++) {

            a = array[i];
            b = i - 1;

            while(b >= 0 && array[b] > a) {

                array[b + 1] = array[b];
                b = b - 1;
            }

            array[b + 1] = a;
        }
        estaOrdenado = true;
    }

    public void selectionSort() {
        int aux;
        int menor;
        for(int i = 0; i < array.length; i++) {
             menor = i;

            for(int j = i + 1; j < array.length; j++) {

                if(array[j] < array[menor]) {

                    menor = j;
                }

            }
            aux = array[i];
            array[i] = array[menor];
            array[menor] = aux;

        }
        estaOrdenado = true;
    }

}
