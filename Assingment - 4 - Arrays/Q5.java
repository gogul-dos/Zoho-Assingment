import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    public static void addWeight(int[][] persons, int n) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the person number: ");
        int num = scan.nextInt();
        num--;

        if (num < 0 || num >= n) {
            System.out.println("Person Not Exists!!!");
            return;
        }

        System.out.print("Enter The Person Weight: ");
        int newWeight = scan.nextInt();

        // Initialize the person's weight array if it's null
        if (persons[num] == null) {
            persons[num] = new int[1];
            persons[num][0] = newWeight;
        } else {
            // Resize the array and add new weight
            int[] updatedWeights = Arrays.copyOf(persons[num], persons[num].length + 1);
            updatedWeights[updatedWeights.length - 1] = newWeight;
            persons[num] = updatedWeights;
        }
    }

    public static void checkMinimum(int[][] persons, int n) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Person Number: ");
        int per = scan.nextInt();
        per--;

        if (per < 0 || per >= n || persons[per] == null) {
            System.out.println("Person Not Exists or No Weights Recorded Yet!!!");
            return;
        }

        int[] weights = persons[per];
        int min = Arrays.stream(weights).min().getAsInt();
        System.out.println("The minimum weight of the person so far is: " + min);
    }

    public static void displayWeights(int[][] persons, int n) {
        for (int i = 0; i < n; i++) {
            if (persons[i] == null) {
                System.out.println("Person " + (i + 1) + ": No weights recorded.");
            } else {
                System.out.println("Person " + (i + 1) + ": " + Arrays.toString(persons[i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = scan.nextInt();
        int[][] persons = new int[n][]; // Jagged array to store weights

        while (true) {
            System.out.print("\n1. Enter Your Weight \n2. Get Your Minimum Weight \n3. Display All Weights \n4. Exit\nChoose an option: ");
            int option = scan.nextInt();
            
            switch (option) {
                case 1:
                    addWeight(persons, n);
                    break;
                case 2:
                    checkMinimum(persons, n);
                    break;
                case 3:
                    displayWeights(persons, n);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
