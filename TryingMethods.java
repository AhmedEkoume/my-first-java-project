

/*This class has 4 methods , two statics and two dynamic. The first static method display the sum of all number less than 1000
The second static method the sum of even number between 12 and 103
The third method (dymamic) take an integer as parameter and returns the day of week according to the integer
The forth methode compares one integer to Barack Obama age and displays the result */
public class TryingMethods {
    public static void main(String[] args) {
        String day;
        myFirstStatic();
        mySecondStatic();
        TryingMethods trying = new TryingMethods();
        day = trying.dayWeek(5);
        trying.compare(45);
        System.out.println(day);

       

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
       
        return day;

    }

    public void compare (int age) {

        if (age < 61) {

            System.out.println("you are younger than Barack Obama");

        } else if (age == 61) {

            System.out.println("You are the same age as Barack Obama");

        } else {

            System.out.println( "you are older thann Barack Obama");
        }



    }

}
        


