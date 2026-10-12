
public class ControlFlow{
    public static void main(String[] args) {

        // AGE!
        int age = 18;
        if(age >= 18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }


        // WEATHER CHECK!
        int temperature = 35;
        if(temperature > 30){
            System.out.println("It's a hot day");
        }
        else if(temperature > 20){
            System.out.println("It's a warm day");
        }
        else if(temperature > 10){
            System.out.println("It's a cool day");
        }
        else{
            System.out.println("It's a cold day");
        }

        // SWITCH!
        String day = "Monday";
        switch(day){
            case "Monday":
                System.out.println("It's a Monday");
                break;
            case "Tuesday":
                System.out.println("It's a Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's a Wednesday");
                break;
            case "Thursday":
                System.out.println("It's a Thursday");
                break;
            case "Friday":
                System.out.println("It's a Friday");
                break;
            case "Saturday":
                System.out.println("It's a Saturday");
                break;
            case "Sunday":
                System.out.println("It's a Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // LOGICAL AND OPERATORS!
        int a = 10;
        int b = 20;
        int c = 30;
        if(a > b && a > c){
            System.out.println("a is greater");
        }
        else if(b > a && b > c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }

        // LOGICAL OR OPERATORS!
        int x = 10;
        int y = 20;
        int z = 30;
        if(x > y || x > z){
            System.out.println("x is greater");
        }
        else if(y > x || y > z){
            System.out.println("y is greater");
        }
        else{
            System.out.println("z is greater");
        }


        // Loops!
        // For loop!
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }

        // While loop!
        int i = 0;
        while(i < 100){
            System.out.println(i);
            i++;
        }

        // Do while loop!
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j < 100);
        
        // BREAK AND CONTINUE!
        for(int l = 0; l < 100; l++){
            if(l == 10){
                break;
            }
            System.out.println(l);
        }

        for(int k = 0; k < 100; k++){
            if(k == 10){
                continue;
            }
            System.out.println(k);
        }

        // for-each loop!
        int[] numbers = {1, 2, 3, 4, 5};    
        for(int number : numbers){
            System.out.println(number);
        }

        // enhanced for-each loop!
        String[] names = {"John", "Doe", "Jane", "Doe"};
        for(String name : names){
            System.out.println(name);
        }

        
        

        
    }
}   