public class Main {
    public static void main(String[] args) {
     import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int temperature = 15;
                int numberOfStudents = 5;
                boolean isSnowy = false;

                if (temperature >= 15) { // условное выражение - true
                    System.out.println("Go to the park");
                }

                if (numberOfStudents == 22) { // условное выражение - false
                    System.out.println("Play Football");
                }

                if (temperature > 25) { // false
                    System.out.println("Go swimming");
                } else {
                    System.out.println("Stay at home");
                }


                // temperature = -5;
                if (temperature > 30) {
                    System.out.println("The weather is hot");
                } else if (temperature > 10) {
                    System.out.println("The weather is warm");
                } else if (temperature > 0) {
                    System.out.println("The weather is cold");
                } else {
                    System.out.println("The weather is freezing");
                }

        /*else {
            System.out.println("Good!");
        }*/

                isSnowy = true;
                if (isSnowy) {
                    System.out.println("Take an umbrella");
                }

                if (temperature > 27) { // false
                    System.out.println("Go to work");
                    if (numberOfStudents > 10) {
                        System.out.println("Make a meeting");
                    } else {
                        System.out.println("Make a job");
                    }
                }

                temperature = 35;
                if (temperature > 27) { // true
                    System.out.println("Go to pool");
                    if (numberOfStudents > 10) { // false
                        System.out.println("Swimming");
                    }
                } else {
                    System.out.println("No swimming");
                }

                Scanner scanner = new Scanner(System.in);
                System.out.println("How old are you? ");
                String age = scanner.nextLine();
                System.out.println("I am " + age + " years old.");

                System.out.println("Enter number 1: ");
                int number1 = scanner.nextInt();
                System.out.println("Enter number 2: ");
                int number2 = scanner.nextInt();
                System.out.println("Enter operation + or -: ");
                char operation = scanner.next().charAt(0); // считываем введенный символ
                if (operation == '+') {
                    System.out.println("Sum of numbers: " + (number1 + number2));
                } else if (operation == '-') {
                    System.out.println("Difference of numbers: " + (number1 - number2));
                } else {
                    System.out.println("Unknown operation");
                }

            }
        }


    }
}