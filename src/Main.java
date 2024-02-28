import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StringBuilder letra = new StringBuilder();

        System.out.println("Escreva caracteres em letra maiúscula ou minúscula ( digite '.' para sair): ");
        String input = scanner.nextLine();

        while (!input.contains(".")){
            letra.append(transformacao(input));
            input = scanner.nextLine();

        }
        transformacao(input);
        System.out.println("OUTPUT---> "+ letra.append(transformacao(input)) );
        scanner.close();
    }

    public static  StringBuilder transformacao(String input){ //método para transformar MAIUSCULAS e minusculas
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Converter maiúscula para minúscula
                currentChar = (char) (currentChar + 32);
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                // Converter minúscula para maiúscula
                currentChar = (char) (currentChar - 32);
            }
            output.append(currentChar);
        }
        return output;
    }
}