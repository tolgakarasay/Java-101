public class Main {
    public static void main(String[] args) {
        int[] list = {4, 7, 4, 3, 2, 9, 10, 2, 10, 33, 9, 10};
        int[] dup = new int[list.length];
        int dupIndex = 0;

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0 && !isFound(list[i], dup)) {
                    System.out.println(list[i]);
                    dup[dupIndex] = list[i];
                    dupIndex++;
                    break;
                }
            }
        }
    }

    public static boolean isFound(int val, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }
}
