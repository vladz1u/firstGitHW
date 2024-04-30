public class hw {
    public static void main(String[] args) {
//        firstTask(1);
//        secondTask(-1);
//        thirdTask(1);
//        fourthTask(1);
//        fifthTask(0);
//        sixthTask(1);

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

}