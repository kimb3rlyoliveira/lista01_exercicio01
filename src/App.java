import java.util.Scanner;

class App {
  
  public static void main(String[] args) {
    double numero;

    System.out.print("Insira um número: ");
    try (
    Scanner teclado = new Scanner(System.in)) {
      numero = teclado.nextDouble();
    teclado.close();
    }

    System.out.println("O número informado foi: " + numero);
  }
}
}
