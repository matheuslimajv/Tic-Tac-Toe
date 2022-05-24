import java.util.*;
import java.lang.*;


public class Game{
    public static Scanner input = new Scanner(System.in);
    private static void menu() {

        System.out.println("""
                Welcome to the Tic-Tac-Toe
                --------------------------
                (1) PLAYER MODE
                (2) PLAYER MODE
                (T) TUTORIAL
                """);
        try {
            char option = input.next().charAt(0);

            switch (option) {
                case '1' -> GameMode.computer();
                case '2' -> GameMode.pvp();
                case 'T' -> tutorial();
                default -> {
                    System.out.println("Entry invalid");
                    Thread.sleep(3500);
                    clearScreen();
                    menu();
                }
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
        public static void tutorial(){
            System.out.println("Tutorial");
        }

        public static void clearScreen(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        public static void main(String[] args){
            menu();
        }

    }