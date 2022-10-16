public class TryingMethods {
    public static void main(String[] args) {

        myFirstStatic();

    }
    public static void myFirstStatic() {
            
            int number = 1;
            int result = 0;
            
            
            while (number < 1000){

                System.out.println(result); 
                result += number;
                number = number+1;
               
               
            }
            
        }
}
        


