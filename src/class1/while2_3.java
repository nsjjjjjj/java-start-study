package class1;

public class while2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNUm = 3;

        while (i <= endNUm) {
            sum = sum + i;
            System.out.println("i="+i+" sum="+ sum);
            i++;
        }
    }
}