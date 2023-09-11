public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;
        while (num >0){
            if (num%2 != 0){
                int newNum = num - 1;
                num = newNum;
            } else {
                int newNum = num/2;
                num = newNum;
            }
            count++;
        }

        System.out.println(count);
    }
}
