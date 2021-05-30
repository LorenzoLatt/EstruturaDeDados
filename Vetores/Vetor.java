package Vetores;

public class Vetor {


    final private int[] elementosVetor;
    int ocupados = 0;

    public Vetor(int tamanho) {


        elementosVetor = new int[tamanho];

    }

    public boolean addElemento(int valor) {

        if(valor == 0) {

            return false;
        }

        for (int i = 0; i < elementosVetor.length; i++) {

            if (elementosVetor[i] == 0) {

                elementosVetor[i] = valor;
                ocupados++;
                return true;

            }
        }
        return true;
    }


    public void mostrarVetor() {

        for(int array: elementosVetor) {

            System.out.print(array + " - ");
        }

    }

    public boolean apagarValor(int valorApagado) {

        for (int i = 0; i < ocupados; i++) {

            if(valorApagado > ocupados) {

                return true;

            } else {

                elementosVetor[valorApagado - 1] = 0;
                ocupados--;
            }
        }
        return false;
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

    public int maiorNumero() {

        int maiorNumero = elementosVetor[0];

        for(int numero: elementosVetor) {

            if(maiorNumero < numero)

            maiorNumero = numero;
        }

        return maiorNumero;

    }


    public int menorNumero() {

        int menorNumero = elementosVetor[0];

        for(int i = 0; i < ocupados; i++) {

            if(elementosVetor[i] != 0 && menorNumero > elementosVetor[i]) {

                menorNumero = elementosVetor[i];
            }
        }
        return menorNumero;
    }

    public int verificarNumeros() {

        return ocupados;
    }


}

