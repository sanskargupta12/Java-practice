
public class Array_intro {

    public static void main(String[] args) {
        int a = 19;

       
        String name = "Kunal Kushwaha";

        
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

       
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element : arr) {
//            System.out.println(element);
//        }

    }
}
