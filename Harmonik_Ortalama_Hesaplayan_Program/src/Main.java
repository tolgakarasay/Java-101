public class Main {
    public static void main(String[] args) {
        int[] numbers = {100, 120, 50, 36};
        double harmonicSum = 0.0;

        for (int number : numbers) {
            harmonicSum += 1.0 / number;
        }

        System.out.println("Harmonik Ortalama: " + (numbers.length / harmonicSum));
    }
}
