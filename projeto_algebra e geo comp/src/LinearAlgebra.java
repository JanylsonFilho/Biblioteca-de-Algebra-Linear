public class LinearAlgebra{

    public static double[][] transpose(double[][] matriz) {
        int numRows = matriz.length;
        int numCols = matriz[0].length;

        double[][] transposedMatrix = new double[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedMatrix[j][i] = matriz[i][j];
            }
        }

        return transposedMatrix;
    }

    public static double[][] sum(double[][] matriz1, double[][] matriz2) {
        int numRows = matriz1.length;
        int numCols = matriz1[0].length;

        double[][] result = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return result;
    }

    public static double[] sum(double[] vetor1, double[] vetor2) {
        int length = vetor1.length;
        double[] result = new double[length];

        for (int i = 0; i < length; i++) {
            result[i] = vetor1[i] + vetor2[i];
        }

        return result;
    }

    public static double[][] times(double[][] matriz1, double[][] matriz2) {
        int numRows1 = matriz1.length;
        int numCols1 = matriz1[0].length;
        int numRows2 = matriz2.length;
        int numCols2 = matriz2[0].length;

        if (numCols1 != numRows2) {
            throw new IllegalArgumentException("O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        }

        double[][] result = new double[numRows1][numCols2];

        for (int i = 0; i < numRows1; i++) {
            for (int j = 0; j < numCols2; j++) {
                for (int k = 0; k < numCols1; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return result;
    }

    public static double[][] gauss(double[][] matriz) {
        int numRows = matriz.length;
        int numCols = matriz[0].length;

        for (int i = 0; i < numRows; i++) {
            if (matriz[i][i] == 0) {
                throw new IllegalArgumentException("A matriz não pode ter zeros na diagonal principal para a eliminação gaussiana.");
            }

            for (int j = i + 1; j < numRows; j++) {
                double ratio = matriz[j][i] / matriz[i][i];
                for (int k = i; k < numCols; k++) {
                    matriz[j][k] -= ratio * matriz[i][k];
                }
            }
        }

        return matriz;
    }

    public static double[] solve(double[][] coeficientes, double[] constantes) {
        int numRows = coeficientes.length;
        int numCols = coeficientes[0].length;

        if (numRows != numCols) {
            throw new IllegalArgumentException("A matriz de coeficientes deve ser quadrada.");
        }

        double[][] extendedMatrix = new double[numRows][numCols + 1];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                extendedMatrix[i][j] = coeficientes[i][j];
            }
            extendedMatrix[i][numCols] = constantes[i];
        }

        double[][] triangularMatrix = gauss(extendedMatrix);

        double[] solution = new double[numCols];

        for (int i = numRows - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < numCols; j++) {
                sum += triangularMatrix[i][j] * solution[j];
            }
            solution[i] = (triangularMatrix[i][numCols] - sum) / triangularMatrix[i][i];
        }

        return solution;

}}