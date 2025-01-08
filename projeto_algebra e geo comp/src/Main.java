
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] elementos = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                elementos[i][j] = scanner.nextInt();
            }
        }

        Matrix matrix = new Matrix(linhas, colunas, elementos);
        System.out.println("\nMatriz:");
        matrix.imprimir();
        System.out.println("Exemplo de escolha do elemento da linha 0 e coluna 2 utilizando metodo get: 3");
        System.out.println(matrix.getElemento(0, 2));

        // Pedindo ao usuário a dimensão do vetor
        System.out.print("Digite a dimensão do vetor: ");
        int dimension = scanner.nextInt();
        double[] elements = new double[dimension];

        // Pedindo ao usuário os valores dos elementos do vetor
        for (int i = 0; i < dimension; i++) {
            System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
            elements[i] = scanner.nextDouble();
        }

        // Criando o vetor com os valores fornecidos pelo usuário
        Vector v = new Vector(dimension, elements);

        // Calculando e imprimindo a magnitude do vetor
        System.out.println("Magnitude do vetor: " + v.calculateMagnitude());

        // Imprimindo o vetor
        v.printVector();

        // Modificando um valor em uma posição específica do vetor e imprimindo-o
        System.out.print("Digite o índice do elemento que deseja modificar: ");
        int index = scanner.nextInt();
        System.out.print("Digite o novo valor: ");
        double newValue = scanner.nextDouble();
        v.set(index, newValue);
        System.out.println("Novo valor na posição " + index + ": " + v.get(index));

        // Imprimindo o vetor atualizado
        v.printVector();

        // Entrada de dados para a matriz
        System.out.println("Digite o número de linhas e colunas da matriz separados por espaço:");
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        System.out.println("Digite os elementos da matriz separados por espaço, linha por linha:");
        double[][] matriz = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Transpose
        double[][] transposedMatrix = transpose(matriz);
        System.out.println("Matriz transposta:");
        for (double[] row : transposedMatrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Soma
        System.out.println("Digite o número de linhas e colunas de outra matriz para somar com a anterior:");
        int numRows2 = scanner.nextInt();
        int numCols2 = scanner.nextInt();

        System.out.println("Digite os elementos da outra matriz separados por espaço, linha por linha:");
        double[][] matriz2 = new double[numRows2][numCols2];

        for (int i = 0; i < numRows2; i++) {
            for (int j = 0; j < numCols2; j++) {
                matriz2[i][j] = scanner.nextDouble();
            }
        }

        double[][] resultSum = sum(matriz, matriz2);
        System.out.println("Resultado da soma das matrizes:");
        for (double[] row : resultSum) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Multiplicação
        System.out.println("Digite o número de linhas e colunas de outra matriz para multiplicar com a anterior:");
        int numRows3 = scanner.nextInt();
        int numCols3 = scanner.nextInt();

        System.out.println("Digite os elementos da outra matriz separados por espaço, linha por linha:");
        double[][] matriz3 = new double[numRows3][numCols3];

        for (int i = 0; i < numRows3; i++) {
            for (int j = 0; j < numCols3; j++) {
                matriz3[i][j] = scanner.nextDouble();
            }
        }

        double[][] resultTimes = times(matriz, matriz3);
        System.out.println("Resultado da multiplicação das matrizes:");
        for (double[] row : resultTimes) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();



            scanner.close();
    }

}}





