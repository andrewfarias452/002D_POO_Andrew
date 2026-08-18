import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    static void showMenu(){
        System.out.println("**** Welcome to the seven Kingdoms ****");
        boolean flag_menu = true;
        while (flag_menu) {
            System.out.println("1- Create Character");
            System.out.println("2- View Character");
            System.out.println("3- Delete Character");
            System.out.println("4- Exit");
            System.out.print("Select an option: ");

            Scanner scanner = new Scanner(System.in);
            Character playerCharacter = new Character();
            String userOption = scanner.nextLine();

            System.out.println("You selected: " + userOption);

            switch (userOption) {
                case "1":
                    System.out.println("Creating character...");
                    
                    System.out.print("Enter character name: ");
                    playerCharacter.name = scanner.nextLine();
                    System.out.println("Character name created: " + playerCharacter.name);

                    System.out.print("Enter Health Points: ");
                    playerCharacter.health = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Character created with Health Points: " + playerCharacter.health);

                    System.out.print("Enter Character Mana Points: ");
                    playerCharacter.mana = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Character created with Mana Points: " + playerCharacter.mana);

                    System.out.print("Enter Character Hit Points: ");
                    playerCharacter.hit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Character created with Hit Points: " + playerCharacter.hit);

                    break;
                case "2":
                    System.out.println("Viewing character...");
                    System.out.println("Character Name: " + playerCharacter.name);
                    System.out.println("Health Points: " + playerCharacter.health);
                    System.out.println("Mana Points: " + playerCharacter.mana);
                    System.out.println("Hit Points: " + playerCharacter.hit);
                    break;
                case "3":
                    System.out.println("Deleting character...");
                    break;
                case "4":
                    System.out.println("Exiting...");
                    flag_menu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }
}
