public class Arrays {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        String[] names = {"John", "Doe", "Jane", "Doe"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(String name : names){
            System.out.println(name);
        }

        // Enhanced for-each loop!
        int[] numbers2 = new int[10];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
        numbers2[5] = 6;
        numbers2[6] = 7;
        numbers2[7] = 8;
        numbers2[8] = 9;
        numbers2[9] = 10;

        for(int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
    
}
