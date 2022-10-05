import java.util.Scanner;

/**
 * Task 3
 * Write a program that prompts the user to select an animal
 * from the list (1 – cat, 2 – dog, etc.), and responds with sounds
 * the selected animal produces. The list should contain at least 10
 * animals.
 */
public class AnimalSounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an animal number from the list: \n" +
                "1 - Cat, 2 - Cow, 3 - Dog, 4 - Bee, 5 - Pigs \n" +
                "6 - Rooster, 7 - Owl, 8 - Donkey, 9 - Mouse, 10 - Duck.");
        int animal = sc.nextInt();
        switch (animal) {
            case 1 -> System.out.println("Cat say - 'Meow-Meow' ");
            case 2 -> System.out.println("Cow say - 'Moo-Moo' ");
            case 3 -> System.out.println("Dog say - 'Woof-Woof' ");
            case 4 -> System.out.println("Bee say - 'BzZz-BzZz' ");
            case 5 -> System.out.println("Pig say - 'Oink-Oink' ");
            case 6 -> System.out.println("Rooster say - 'Cock-a-doodle-doo' ");
            case 7 -> System.out.println("Owl say - 'Hoo-Hoo' ");
            case 8 -> System.out.println("Donkey say - 'Hee-haw' ");
            case 9 -> System.out.println("Mouse say - 'Squeak-Squeak' ");
            case 10 -> System.out.println("Duck say - 'Quack-Quack' ");
            default -> System.out.println("Animal number entered incorrectly!\nPlease try again.");
        }
    }
}