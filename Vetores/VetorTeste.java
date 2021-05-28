package Vetores;
import java.util.Scanner;
public class VetorTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vetor vetor = new Vetor();

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
            System.out.println("Escolha o que você deseja consultar:");
            numero = sc.nextInt();


            switch(numero){

                case 1:

                    if(vetor.vetorCheio()) {

                        System.out.println("Vetor já está completamente preenchido");

                        break;
                    }

                    System.out.println("Insira um número no vetor:");
                    int adicionar = sc.nextInt();
                    vetor.addElemento(adicionar);
                    vetor.mostrarVetor();
                    break;

                case 2:

                    System.out.println("Informe qual a posição do número que você deseja apagar(de 1 a 10");
                    int numeroApagado = sc.nextInt();
                    while(numeroApagado <= 0 || numeroApagado > 10 ) {

                        System.out.println("Informe um número válido:");
                        numeroApagado = sc.nextInt();
                    }
                    System.out.println("Vetor antes:");
                    vetor.mostrarVetor();
                    vetor.apagarValor(numeroApagado);
                    System.out.println("Vetor depois:");
                    vetor.mostrarVetor();
                    break;

                case 3:

                    System.out.println("Qual valor você deseja consultar se se encontra no vetor?");
                    int consulta = sc.nextInt();
                    vetor.consultarValor(consulta);
                    vetor.mostrarVetor();

                    break;

                case 4:

                    vetor.maiorNumero();
                    break;

                case 5:

                    vetor.menorNumero();
                    vetor.mostrarVetor();

                    break;

                case 6:

                    vetor.mostrarVetor();

                    break;

                case 7:

                    vetor.verificarNumeros();

                    break;
                case 0:
                    System.out.println("Programa encerrado!!!");
            }
        } while(numero <= 7 && numero > 0);
    }
}
