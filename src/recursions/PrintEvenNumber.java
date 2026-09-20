package recursions;

public class PrintEvenNumber {
    static void main(String[] args) {

        isEven(10, 1) ;
    }

    public static void isEven(int end, int num) {
        if (num % 2 == 0) {
            System.out.println(num) ;
        }

//        num++ ;
        if (num > end) {
            return ;
        }

        isEven(end, ++num) ;
    }
}
