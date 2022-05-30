import java.util.*;
import java.lang.*;


public class Game{
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
	} catch (Exception e) {                                     System.out.print("An error occurs");                }
    }

        public static void tutorial(){
	clearScreen();	
	try{
            System.out.println("""
			    \t| 1 | 2 | 3 |                                         \t| 4 | 5 | 6 |                                         \t| 7 | 8 | 9 |
			    """);
	    System.out.println();
	    String text = "The game is played typing a corresponding number in the board";
	    for(int i = 0; i < text.length(); i++){
		    System.out.print(text.charAt(i));
		    Thread.sleep(150);
        }
	    System.out.println();
	    System.out.println("Look a example below");
	    System.out.println();
	    
	} catch (Exception e) {                                     System.out.print("An error occurs");                }
	}
        public static void clearScreen(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        public static void main(String[] args){
        clearScreen();
        menu();
    	    }
    }
