
    public class Vector {
        private double[] components;

        // Construtor que inicializa os componentes do vetor com base no array fornecido
        public Vector(int dimension, double[] elements) {
            if (dimension <= 0 || elements == null || elements.length != dimension) {
                throw new IllegalArgumentException("Invalid dimension or elements array");
            }
            this.components = elements.clone(); // Usamos clone para garantir que não estamos referenciando o mesmo array
        }

        // Método para calcular a magnitude do vetor
        public double calculateMagnitude() {
            double sumOfSquares = 0;
            for (double component : components) {
                sumOfSquares += component * component;
            }
            return Math.sqrt(sumOfSquares);
        }

        // Método para imprimir o vetor
        public void printVector() {
            System.out.print("Vetor: [");
            for (int i = 0; i < components.length; i++) {
                System.out.print(components[i]);
                if (i < components.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        // Método para obter o valor armazenado em uma determinada posição do vetor
        public double get(int index) {
            if (index < 0 || index >= components.length) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            return components[index];
        }

        // Método para atribuir um valor em uma determinada posição do vetor
        public void set(int index, double value) {
            if (index < 0 || index >= components.length) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            components[index] = value;
        }
}


