import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 System.out.println("Por favor insira sua senha:");

    double senha =  sc.nextDouble();
    
  if( senha != 2022 ) {
    System.out.println("Senha incorreta");
       }  
     
  if (senha == 2022) {
      System.out.println("Acesso Permitido");}

    
     sc.close();
  }
}