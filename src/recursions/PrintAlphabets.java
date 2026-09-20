package recursions;

public class PrintAlphabets {
    static  char ch = 'a' ;

    static void main(String[] args) {

        printAlpha() ;

        printUpperCaseAlpha('A');
    }

    public static void printAlpha() {

        System.out.println(ch++ + " : ");
        if (ch> 'z') {
            return;
        }
//        ch++ ;
        printAlpha() ;
    }

    public static void printUpperCaseAlpha(char c ) {
        System.out.println(c) ;
        if (c > 'Z') {
            return ;
        }
        c++;
        printUpperCaseAlpha(c) ;
    }
}
