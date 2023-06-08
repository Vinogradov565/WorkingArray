public class DoubleArray {
    private double[] array;

    public DoubleArray(int length) {
        array = new double[length];
        // Инициализация массива случайными значениями
        for (int i = 0; i < length; i++) {
            array[i] = Math.random() * 10; // Генерируем случайное число от 0 до 10
        }
    }

    public int[] getIntegerArray() {
        int[] integerArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            integerArray[i] = (int) array[i];
        }
        return integerArray;
    }

    public void printOriginalArray() {
        System.out.println("Original array:");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printIntegerArray(int[] integerArray) {
        System.out.println("Integer array (without rounding):");
        for (int num : integerArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printRoundedIntegerArray(int[] integerArray) {
        System.out.println("Integer array (with rounding):");
        for (int num : integerArray) {
            System.out.print(Math.round(num) + " ");
        }
        System.out.println();
    }

    public void sortOriginalArray() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Перестановка элементов массива
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printSumOfPositiveNumbers() {
        double sum = 0;
        for (double num : array) {
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}
