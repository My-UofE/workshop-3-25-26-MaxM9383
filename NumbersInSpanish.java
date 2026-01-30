public class NumbersInSpanish {
    public static void main(String[] args) {
        // read the first argument passed to the program
        int number = Integer.parseInt(args[0]); 
        switch(number){
            case 1: System.out.println("uno"); break;
            case 2: System.out.println("duo"); break;
            case 3: System.out.println("tres"); break;
            case 4: System.out.println("4"); break;
            case 5: System.out.println("5"); break;
            default: System.out.println("idk");
        }
    }
 }