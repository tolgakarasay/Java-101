public class Main {
    public static void main(String[] args) {
        int j;

        for (int i = 2; i < 100; i++) {
            j=2;
            while(j<i && i%j!=0){
                j++;
            }
            if(i==j){
                System.out.print(i+" ");
            }
        }
    }
}
