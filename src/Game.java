import java.util.*;
import java.lang.*;

public class Game {
    public static Scanner input = new Scanner(System.in);

    private static void menu() {

        System.out.println("""
                               
                ███╗░░░███╗░█████╗░███╗░░██╗██╗░░██╗███████╗██╗░░░██╗
                ████╗░████║██╔══██╗████╗░██║██║░██╔╝██╔════╝╚██╗░██╔╝
                ██╔████╔██║██║░░██║██╔██╗██║█████═╝░█████╗░░░╚████╔╝░
                ██║╚██╔╝██║██║░░██║██║╚████║██╔═██╗░██╔══╝░░░░╚██╔╝░░
                ██║░╚═╝░██║╚█████╔╝██║░╚███║██║░╚██╗███████╗░░░██║░░░
                ╚═╝░░░░░╚═╝░╚════╝░╚═╝░░╚══╝╚═╝░░╚═╝╚══════╝░░░╚═╝░░░
                                
                ████████╗██╗░█████╗░  ████████╗░█████╗░░█████╗░  ████████╗░█████╗░███████╗
                ╚══██╔══╝██║██╔══██╗  ╚══██╔══╝██╔══██╗██╔══██╗  ╚══██╔══╝██╔══██╗██╔════╝
                ░░░██║░░░██║██║░░╚═╝  ░░░██║░░░███████║██║░░╚═╝  ░░░██║░░░██║░░██║█████╗░░
                ░░░██║░░░██║██║░░██╗  ░░░██║░░░██╔══██║██║░░██╗  ░░░██║░░░██║░░██║██╔══╝░░
                ░░░██║░░░██║╚█████╔╝  ░░░██║░░░██║░░██║╚█████╔╝  ░░░██║░░░╚█████╔╝███████╗
                ░░░╚═╝░░░╚═╝░╚════╝░  ░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░  ░░░╚═╝░░░░╚════╝░╚══════╝ 
                ┈┈┈┈┈┈┈┈┈┈┈
                ┈┈╱▔▔▔▔▔╲┈┈┈              
                ┈╱┈┈╱▔╲╲╲▏┈┈┈┈           ▄█ █▀█   █▀▀ ▄▀█ █▀▄▀█ █▀▀ 
                ╱┈┈╱━╱▔▔▔▔▔╲━╮┈┈          █ █▀▀   █▄█ █▀█ █░▀░█ ██▄               
                ▏┈▕┃▕╱▔╲╱▔╲▕╮┃┈┈          
                ▏┈▕╰━▏▊▕▕▋▕▕━╯┈┈          ▀█ █▀█   █▀▀ ▄▀█ █▀▄▀█ █▀▀   
                ╲┈┈╲╱▔╭╮▔▔┳╲╲┈┈┈          █▄ █▀▀   █▄█ █▀█ █░▀░█ ██▄
                ┈╲┈┈▏╭━━━━╯▕▕┈┈┈            
                ┈┈╲┈╲▂▂▂▂▂▂╱╱┈┈┈          ▀█▀ █░█ ▀█▀ █▀█ █▀█ █ ▄▀█ █░░
                ┈┈┈┈▏┊┈┈┈┈┊┈┈┈╲┈          ░█░ █▄█ ░█░ █▄█ █▀▄ █ █▀█ █▄▄
                ┈┈┈┈▏┊┈┈┈┈┊▕╲┈┈╲
                ┈╱▔╲▏┊┈┈┈┈┊▕╱▔╲▕
                ┈▏┈┈┈╰┈┈┈┈╯┈┈┈▕▕
                ┈╲┈┈┈╲┈┈┈┈╱┈┈┈╱┈╲
                ┈┈╲┈┈▕▔▔▔▔▏┈┈╱╲╲╲▏
                ┈╱▔┈┈▕┈┈┈┈▏┈┈▔╲▔▔
                ┈╲▂▂▂╱┈┈┈┈╲▂▂▂╱┈
                            
                """);
        try {
            Character option = input.next().charAt(0);

             if (option.toString().equalsIgnoreCase("T")) {
                tutorial();
            }
             switch (option){
                 case '1' -> GameMode.computer();
                 case '2' -> GameMode.pvp();
                 default -> {
                     System.out.println("Entry invalid");
                     Thread.sleep(3500);
                     clearScreen();
                     menu();
                 }
             }
        } catch (Exception e) {
            System.out.print("An error occurs");
        }
    }

    public static void tutorial() {

        clearScreen();
        try {
            System.out.println();
            System.out.println("""
                    \t| 1 | 2 | 3 |
                    \t| 4 | 5 | 6 |
                    \t| 7 | 8 | 9 |
                    """);
            System.out.println();
            String text = "The game is played typing a corresponding number in the board";

            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(100);
            }
            Thread.sleep(200);
            System.out.println();
            System.out.println("Look the game example below");
            System.out.println();
            Thread.sleep(200);

            System.out.println("""
                        \t|   |   |   |
                        \t|   |   |   |
                        \t|   |   |   |
                        """);
            Thread.sleep(2000);
            System.out.println("PLayer1, your turn: 1");
            System.out.println("""
                        \t| x |   |   |
                        \t|   |   |   |
                        \t|   |   |   |
                        """);
            Thread.sleep(2000);
            System.out.println("PLayer2, your turn: 5");
            System.out.println("""
                        \t| x |   |   |
                        \t|   | o |   |
                        \t|   |   |   |
                        """);
            Thread.sleep(2000);
            System.out.println("PLayer1, your turn: 2");
            System.out.println("""
                        \t| x | x |   |
                        \t|   | o |   |
                        \t|   |   |   |
                        """);
            Thread.sleep(2000);
            System.out.println("PLayer2, your turn: 8");
            System.out.println("""
                        \t| x | x |   |
                        \t|   | o |   |
                        \t|   | o |   |
                        """);
            Thread.sleep(2000);
            System.out.println("PLayer1, your turn: 3");
            System.out.println("""
                        \t| x | x | x |
                        \t|   | o |   |
                        \t|   | o |   |
                        """);
            System.out.println("Player1 wins!!");

            System.out.println("Enter q to quit: ");
            Character option = input.next().charAt(0);

            while (!option.toString().equalsIgnoreCase("q")){
                System.out.println("Invalid entry");
                option = input.next().charAt(0);
            }
            clearScreen();
            menu();
        } catch (Exception e) {
            System.out.print("An error occurs");
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();
        menu();
    }
}
