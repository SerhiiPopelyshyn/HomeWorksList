package JC_Lesson2;

public class MainExсeption {
    public static void main(String[] args) {
        Object[][] arr;
        int sum = 0;
        try {
            arr = initArray(4, 4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("в ячейке [" + i + "],[" + j + "] находится тип отличный от int.");
                }
            }
        System.out.println("Сумма массива = " + sum);
    }

    public static Object[][] initArray(int row, int col) throws MyArraySizeException {
        if (row != 4 || col != 4) {
            throw new MyArraySizeException("Массив может быть только размером 4х4");
        }
        return new Object[][]{{1, 5, 6, 1}, {1, "2", 4, 7}};
    }
}

