import java.util.Scanner;

public class OlaMundo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nOla, qual é o seu nome ?");
        String nome = scanner.nextLine();
        
        bemVindo(nome);
        // System.out.println("Ola Mundo");

    }



    public static void bemVindo(String nome){
        System.out.println("Seja bem vindo(a) " + nome);
        System.out.println(":)");
    }
}