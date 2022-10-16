//This class has 4 methods , two static and two dynamic
public class TryingMethods {
    public static void main(String[] args) {

        myFirstStatic();
        mySecondStatic();

    }
    public static void myFirstStatic(){
            
            int number = 1;
            int result = 0;
            
            
            while (number < 1000){

                
                result += number;
                number = number+1;
               
               
            }
            System.out.println(result); 
        }

    public static void mySecondStatic(){
        int result2 = 0;

        for(int i = 12; i<103; i++ ){

            if(i%2 ==0){
                
                result2 = result2 + i;
            }
            
        }

        System.out.println(result2);
    }
}
        


