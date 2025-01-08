
    public class Matrix {
        private int[][] matriz;

        // Construtor da classe Matrix
        public Matrix(int linhas, int colunas, int[][] elementos) {
            if (linhas <= 0 || colunas <= 0) {
                throw new IllegalArgumentException("As dimensões da matriz devem ser positivas");
            }

            if (elementos.length != linhas || elementos[0].length != colunas) {
                throw new IllegalArgumentException("Os elementos fornecidos não correspondem às dimensões da matriz");
            }

            this.matriz = new int[linhas][colunas];
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    this.matriz[i][j] = elementos[i][j];
                }
            }
        }

        // Método para obter a quantidade de linhas da matriz
        public int getLinhas() {
            return matriz.length;
        }

        // Método para obter a quantidade de colunas da matriz
        public int getColunas() {
            return matriz[0].length;
        }

        // Método para obter um elemento da matriz
        public int getElemento(int linha, int coluna) {
            return matriz[linha][coluna];
        }

        // Método para imprimir a matriz
        public void imprimir() {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }}


