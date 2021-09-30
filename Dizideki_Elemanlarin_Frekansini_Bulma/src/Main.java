import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dup = new int[arr.length];
        int dupIndex = 0;

        System.out.println("Dizi : " + Arrays.toString(arr));

        System.out.println("Tekrar sayıları");
        for (int i = 0; i < arr.length - 1; i++) {
            int times = 1;
            if (!isFound(dup, arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        times++;
                        dup[dupIndex] = arr[i];
                        dupIndex++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + times + " kere tekrar edildi.");
            }
        }
    }

    public static boolean isFound(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
