public class hw {
    public static void main(String[] args) {
//        firstTask(1);
//        secondTask(-1);
//        thirdTask(1);
//        fourthTask(1);
//        fifthTask(0);
//        sixthTask(1);
//        seventhTask("test");
//        eightsTask("1");
//        ninthTask(true);
//        tenthTask(false);
//        eleventhTask(3);
//        twelvesTask(2);
//        thirteenthTask(4, 4);
//        fourteenthTask(2, 7);
//        fifteenthTask(4);
//        sixteenthTask(22);
//        seventeenthTask(6);
    }

    public static void firstTask(int a) {
        if (a == 0){
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void secondTask(int a) {
        if (a > 0){
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void thirdTask(int a) {
        if (a < 0) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void fourthTask(int a) {
        if (a > 0 || a == 0){
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void fifthTask(int a) {
        if (a < 0 || a == 0){
            System.out.println("Correct");
        } else
            System.out.println("incorrect");
    }

    public static void sixthTask(int a) {
        if (a != 0) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void seventhTask(String str) {
        if (str == "test"){
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");

    }

    public static void eightsTask(int num) {
        if (num == 1) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void ninthTask(boolean test){
//        if (test == true){
//            System.out.println("Correct");
//        } else
//            System.out.println("Incorrect");

        String conditional = test? "Correct":"Incorrect";
        System.out.println(conditional);
    }

    public static void tenthTask(boolean test){
//        if (test != true){
//            System.out.println("Correct");
//        } else
//            System.out.println("Incorrect");

        String conditional = !test? "Correct":"Incorrect";
        System.out.println(conditional);
    }

    public static void eleventhTask(int a) {
        if (a > 0 && a < 5) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void twelvesTask (int a) {
        if (a == 0 || a == 2){
            a += 7;
            System.out.println(a);
        } else{
            a /= 10;
            System.out.println(a);
        }


    }

    public static void thirteenthTask (int a, int b){
        if (a <= 1 && b >= 3) {
            System.out.println(a+b);
        } else
            System.out.println(a-b);
    }

    public static void fourteenthTask (int a, int b){
        if (a > 2 && a < 11 || b >= 6 && b < 14){
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
    }

    public static void fifteenthTask(int num){
        String result = "";
        switch (num){
            case 1:
                result = "Зима";
                System.out.println(result);
                break;
            case 2:
                result = "Весна";
                System.out.println(result);
                break;
            case 3:
                result = "Лето";
                System.out.println(result);
                break;
            case 4:
                result = "Осень";
                System.out.println(result);
                break;
        }
    }

    public static void sixteenthTask (int day){
        if (day >= 1 && day <= 9){
            System.out.println("Перша декада");
        } else if (day >= 10 && day <= 19) {
            System.out.println("Друга декада");
        } else if (day >= 20 && day <= 29) {
            System.out.println("Третя декада");
        } else if (day >= 30 && day <= 39) {
            System.out.println("Четверта декада");
        } else
            System.out.println("error");
    }

    public static void seventeenthTask (int month){
        if (month == 1 || month == 2 || month == 12){
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else
            System.out.println("Error");
    }
}