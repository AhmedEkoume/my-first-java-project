

//This class has 4 methods , two static and two dynamic
public class TryingMethods {
    public static void main(String[] args) {

        myFirstStatic();
        mySecondStatic();
        TryingMethods trying = new TryingMethods();
        trying.dayWeek(5);

       

    }
    public static void myFirstStatic(){
            
            int number = 1;
            int result = 0;
            
            
            while (number < 1000){

                
                 result += number;
                 number++ ;
               
               
            }
            System.out.println(result); 
        }

    public static void mySecondStatic(){
        int result = 0;

        for(int i = 12; i<103; i++ ){

            if(i%2 ==0){

                result = result + i;
            }
            
        }

        System.out.println(result);
    }


    public String dayWeek(int a ){
        String day;

        switch (a) {
            case 1: day = "Monday";
                break;

            case 2 : day = "Tuesday";
                break;

            case 3 : day = "Wednesday";
                break;

            case 4 : day = "Thursday";
                break;

            case 5 : day = "Friday";
                 break;

            case 6 : day = "Saturday";
                break;

            case 7 :  day ="Sunday";
                break;

            default: day = "ERROR";

        }
        System.out.println(day);
        return day;

    }

}
        


