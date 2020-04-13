import java.util.Arrays;

class main {


    static class HW_2 {

//   // task 1 create arr with changing numbers
//
//    public static void main(String[] args) {
//        int[] arr1 = {1,0,1,0,1,0,0,1,1,1,0};
//
//        for(int i=0; i < arr1.length; i++) {
//            arr1[i] = arr1[i] == 1 ? 0 : 1;
//            System.out.print(arr1[i] + ", ");
//        }
//    }
//
//    // task 2 arr with 8 values
//
//    public static void mainSecond (String[] args) {
//        int[] arr2 = new int[8];
//        for (int i = 0; i <= 21; i+=3) {
//            System.out.print(i + " ,");
//        }
//    }
//
////    //task 2 arr with 8 values - alternative
//
//    public static void mainThird (String[] args) {
//        int[] arr2 = new int[8];
//
//        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j +=3;
//        for(int k : arr2) {
//            System.out.print(k + " ,");
//        }
//    }
//
//    //task 3 values with less numbers
//
//    public static void mainFifth (String[] args) {
//
//        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        for (int i = 0; i < arr3.length; i++) {
//            if (arr3[i] < 6) arr3[i] *= 2;
//            System.out.print(arr3[i] + " ,");
//        }
//    }
//
//    //task 4 - quad arr with same quantity of tabs and lines
//
//    public static void mainSixth (String[] args) {
//        int[][] arr4 = new int[10][10];
//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0, k = arr4[i].length; j < arr4.length; j++, k--) {
//                if (i == j || i == (k - 1)) arr4[i][j] = 1;
//                System.out.print(arr4[i][j] + " ");
//            }
//            System.out.println("\r\n");
//        }
//    }

        //task 5 min and max value from array

//    public static void main (String[] args) {
//
//        int[] arr5 = {5, 10 , -15, 2, 4, 8, 35, 16, 45};
//        int min = 0; int max = 0;
//        for (int i = 0; i < arr5.length; i++) {
//
//            if(arr5[i] > max){
//                max = arr5[i];
//            }
//            if (arr5[i] <= min){
//                min = arr5[i];
//            }
//        }
//        System.out.println("Min value = " + min + " " + "Max value = " + max );
//    }

        // task 6 - two the same values

        public static boolean checkBalance(int[] arr6) {

            int leftSum;
            int rightSum;

            for (int i = 0; i < arr6.length; i++) {
                leftSum = 0;
                rightSum = 0;

                for (int j = 0; j < i; j++) {
                    leftSum += arr6[j];
                }

                for (int j = i; j < arr6.length; j++){
                    rightSum += arr6[j];
                }

                if (leftSum == rightSum) return true;
            }
            return false;
        }

    }

}
