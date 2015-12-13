import java.util.*;
public class Main {
  public void cuadradoUno(int n) {

        for(int i = n; i >= 0; i--){
            for(int asterisco = 1; asterisco <= n - i; asterisco++) {   
                System.out.print("*");
            }
            System.out.print("#");
        
            System.out.println();
            
        }
    
        for(int i = 1; i <= n; i++){
            for(int asterisco = 1; asterisco <= n - i; asterisco++) {   
                System.out.print("*");
            }
            System.out.print("#");
        
            System.out.println();
            
        }
    }

  public void run() {
    int numero;
    Scanner in = new Scanner(System.in);
    System.out.print("Dame un número: ");
    numero = Integer.parseInt(in.nextLine());
    cuadradoUno(numero);
    
  }
  
  public static void main(String[] args) {
     new Main().run();
  }
}
