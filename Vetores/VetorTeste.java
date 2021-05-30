package Vetores;
import java.util.Scanner;
public class VetorTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = 10;
        Vetor vetor = new Vetor(tamanho);

        int numero;
        do {
            System.out.println("\n1 - Inserir valores no vetor");
            System.out.println("2 - Apagar valores do vetor");
            System.out.println("3 - Consultar um valor do vetor");
            System.out.println("4 - Informar maior valor dentro do vetor");
            System.out.println("5 - Informar menor valor dentro do vetor");
            System.out.println("6 - Mostrar vetor");
            System.out.println("7 - Consultar número de elementos:");
            System.out.println("0 - Encerrar programa");
            System.out.println("\nEscolha o que você deseja consultar:");
            numero = sc.nextInt();


            switch (numero) {

                case 1 -> {
                    if (vetor.verificarNumeros() == tamanho) {

                        System.out.println("Vetor já está completamente preenchido");

                    } else {
                        System.out.println("Insira um número no vetor:");
                        int adicionar = sc.nextInt();
                        vetor.addElemento(adicionar);
                        vetor.mostrarVetor();
                    }
                }

                case 2 -> {

                    if (vetor.ocupados == 0) {

                        System.out.println("Não existem elementos no vetor ainda.");

                    } else {
                        vetor.mostrarVetor();
                        System.out.println("\nInforme a posição do número que você deseja apagar");
                        int numeroApagado = sc.nextInt();
                        if (vetor.apagarValor(numeroApagado)) {

                            System.out.println("Índice excedido.");
                            System.out.println(vetor.apagarValor(numeroApagado));
                        } else {
                            while (numeroApagado <= 0 || numeroApagado > tamanho) {

                                System.out.println("Informe um número válido:");
                                numeroApagado = sc.nextInt();
                            }

                            System.out.println("Vetor antes:");
                            vetor.mostrarVetor();
                            vetor.apagarValor(numeroApagado);
                            System.out.println("Vetor depois:");
                            vetor.mostrarVetor();
                        }
                    }
                }
                case 3 -> {

                    System.out.println("Qual valor você deseja consultar se se encontra no vetor?");
                    int consulta = sc.nextInt();
                    vetor.consultarValor(consulta);
                    vetor.mostrarVetor();
                }

                case 4 -> {

                        vetor.mostrarVetor();
                        System.out.println("\n Maior Número - > " + vetor.maiorNumero());
                    }

                case 5 -> {

                        vetor.mostrarVetor();
                        System.out.println("\nMenor número - > " + vetor.menorNumero());
                }
                case 6 -> vetor.mostrarVetor();

                case 7 -> System.out.println("Existem " + vetor.verificarNumeros() + " valores no vetor.");

                case 0 -> System.out.println("Programa encerrado!!!");
            }
        } while(numero <= 7 && numero > 0);
    }
}
