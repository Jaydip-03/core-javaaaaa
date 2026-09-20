package Arrays.basicPrograms;

public class ProductOfArrayElements {
    static void main(String[] args) {

        int arr [] = {2,3,7,4,8,4,9,5} ;

        int produc = 1 ;
        for (int ele : arr) {
            produc *= ele ;
        }

        System.out.println("Product of elemets is : " + produc);
    }
}
