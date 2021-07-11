package ExercicioFinalVetor;
import java.util.Scanner;
import java.util.InputMismatchException;
public class VetorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vetor vetor = new Vetor();

        int numero = 15;

        do {
            try {

                System.out.println("\n1 -> Popular vetor em ordem crescente");
                System.out.println("2 -> Popular vetor aleatoriamente");
                System.out.println("3 -> Inserir valor no vetor");
                System.out.println("4 -> Apagar valor do vetor");
                System.out.println("5 -> Apagar valor do vetor por posição");
                System.out.println("6 -> Mostrar vetor");
                System.out.println("7 -> Consultar maior valor");
                System.out.println("8 -> Consultar menor valor");
                System.out.println("9 -> Mostrar elementos válidos no vetor");
                System.out.println("10 -> Consultar valor existente com busca binária iterativa");
                System.out.println("11 -> Consultar valor existente com busca binária recursiva");
                System.out.println("12 -> Ordenar vetor com método BubbleSort");
                System.out.println("13 -> Ordenar vetor com método InsertionSort");
                System.out.println("14 -> Ordenar vetor com método SelectionSort");
                System.out.println("15 -> Consultar o tamanho do vetor");
                System.out.println("0 -> Encerrar programa\n");
                System.out.println("O que você deseja consultar?");
                numero = sc.nextInt();

                while (numero < 1 && numero != 0 || numero > 15) {

                    System.out.println("Informe um número de consulta válido");
                    numero = sc.nextInt();
                }
                switch (numero) {

                    case 1 -> {
                        if (vetor.retornaArray().length == vetor.retornaOcupados()) {

                            System.out.println("Vetor cheio");
                        } else {

                        System.out.println("Quantos números você gostaria de adicionar?");
                        int adicionar = sc.nextInt();

                            while (adicionar <= 0 || adicionar >
                                    (vetor.retornaArray().length - vetor.retornaOcupados())) {

                                System.out.println("Você só pode inserir " + (vetor.retornaArray().length -
                                        vetor.retornaOcupados()) + " números");
                                System.out.println("Informe um conjunto de  números válidos para adicionar");
                                adicionar = sc.nextInt();
                            }


                            vetor.populaOrdenado(adicionar);

                        }
                    }

                    case 2 -> {
                        if (vetor.retornaArray().length == vetor.retornaOcupados()) {

                            System.out.println("Vetor cheio");
                        } else {
                        System.out.println("Quantos números você gostaria de adicionar?");
                        int adicionar = sc.nextInt();

                            while (adicionar <= 0 || adicionar >
                                    (vetor.retornaArray().length - vetor.retornaOcupados())) {

                                System.out.println("Você só pode inserir " + (vetor.retornaArray().length -
                                        vetor.retornaOcupados()) + " números");
                                System.out.println("Informe um conjunto de  números válidos para adicionar");
                                adicionar = sc.nextInt();
                            }

                            vetor.populaVetorAleatorio(adicionar);
                        }
                    }

                    case 3 -> {
                        if (vetor.retornaOcupados() == vetor.retornaArray().length) {

                            System.out.println("Não é possível inserir mais nenhum valor no vetor");
                        } else {
                            System.out.println("Qual número você gostaria de inserir no vetor?");
                            int valor = sc.nextInt();

                            while (valor <= 0) {

                                System.out.println("Informe um valor válido:");
                                valor = sc.nextInt();
                            }
                            vetor.inserirValor(valor);
                            System.out.println("Número adicionado na posição " + vetor.retornaPosicao());
                        }
                    }

                    case 4 -> {
                        if (vetor.retornaOcupados() == 0) {

                            System.out.println("Não há valores inseridos no vetor ainda");
                        } else {
                            System.out.println("Qual valor você gostaria de apagar do vetor?");
                            int valor = sc.nextInt();
                            while(valor <= 0) {

                                System.out.println("Informe um número válido para apagar");
                                valor = sc.nextInt();
                            }
                            if (!vetor.apagarValor(valor)) {

                                System.out.println("Elemento não encontrado no vetor");
                            } else {

                                System.out.println("Elemento " + valor + " apagado");
                            }

                        }
                    }

                    case 5 -> {

                        if (vetor.retornaOcupados() == 0) {

                            System.out.println("Não há valores inseridos no vetor ainda");
                        } else {
                            System.out.println("Informe o index do número que você quer remover:");
                            int valor = sc.nextInt();
                            while (valor > vetor.retornaArray().length - 1 || valor < 0) {

                                System.out.println("Informe um número válido:");
                                valor = sc.nextInt();
                            }
                            vetor.apagarValorPosicao(valor);
                            System.out.println("Número na posição " + valor + " removido");

                        }
                    }
                    case 6 -> vetor.mostrarVetor();

                    case 7 -> {
                        if(vetor.retornaOcupados() == 0) {

                            System.out.println("Não há elementos inseridos no vetor ainda");
                        } else {
                            System.out.println("O maior valor é:\n");
                            System.out.println(vetor.maiorValor());
                        }
                    }

                    case 8 -> {
                        if(vetor.retornaOcupados() == 0) {

                            System.out.println("Não há elementos inseridos no vetor ainda");
                        } else {
                            System.out.println("O menor valor é:\n");
                            System.out.println(vetor.menorValor());
                        }
                    }

                    case 9 ->  {
                        System.out.println("Tamanho do vetor:\n" + vetor.retornaArray().length);
                        System.out.println("\nElementos válidos no vetor:\n" + vetor.retornaOcupados());
                    }

                    case 10 -> {
                        if(!vetor.retornaOrdenado()) {

                            System.out.println("É necessário ordenar o vetor antes de realizar a busca");
                        } else {
                            vetor.mostrarVetor();
                            System.out.println("\nQual elemento você deseja conferir se existe no vetor?");
                            int valor = sc.nextInt();

                            while (valor <= 0) {

                                System.out.println("Informe um número positivo:");
                                valor = sc.nextInt();
                            }
                            if (!vetor.buscaBinaria(valor)) {

                                System.out.println("O elemento não se encontra no vetor");
                            } else {

                                System.out.println("O elemento existe no vetor");
                            }
                        }
                    }

                    case 11 -> {
                        if(!vetor.retornaOrdenado()) {

                            System.out.println("É necessário ordenar o vetor antes de realizar a busca");
                        } else {
                            vetor.mostrarVetor();
                            System.out.println("Qual elemento você deseja conferir se existe no vetor?");
                            int valor = sc.nextInt();
                            while (valor <= 0) {

                                System.out.println("Informe um valor válido:");
                                valor = sc.nextInt();
                            }

                            int resultado = vetor.buscaBinariaRecursiva(valor);

                            if (resultado < 0) {

                                System.out.println("Elemento não existe no vetor");
                            } else {

                                System.out.println("Elemento encontrado no índice " + resultado);
                            }
                        }

                    }

                    case 12 -> {
                        vetor.bubbleSort();
                        System.out.println("Vetor ordenado");
                    }

                    case 13 -> {
                        vetor.insertionSort();
                        System.out.println("Vetor ordenado");
                    }

                    case 14 ->  {
                        vetor.selectionSort();
                        System.out.println("Vetor ordenado");
                    }

                    case 15 -> System.out.println("Tamanho do vetor:\n" + vetor.retornaArray().length);

                    case 0 -> System.out.println("Programa encerrado!!!");
                }
            } catch(NumberFormatException|InputMismatchException exception) {

                sc.nextLine();
                System.out.println("Digitação inválida");

            }
        } while(numero != 0);
    }
}
