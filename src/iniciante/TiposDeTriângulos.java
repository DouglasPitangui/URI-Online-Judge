package iniciante;
import java.util.Scanner;


public class TiposDeTriângulos {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      float a,b,c, aux;
      
      a = scan.nextFloat();
      b = scan.nextFloat();
      c = scan.nextFloat();
      
      if(b>a){
    	  aux = a;
    	  a = b;
    	  b= aux;
      };
      
      if(c>a){
    	  aux = a;
    	  a=c;
    	  c=aux;
      }
      
      if(c>b){
    	  aux= b;
    	  b =c;
    	  c= aux;
      }
      
      
      if (a>=(b+c)){
         System.out.printf("NAO FORMA TRIANGULO\n");
      }else{
      if (a*a == (b*b + c*c))
         System.out.printf("TRIANGULO RETANGULO\n");
      if (a*a > (b*b + c*c))
         System.out.printf("TRIANGULO OBTUSANGULO\n");
      if (a*a < (b*b + c*c))
         System.out.printf("TRIANGULO ACUTANGULO\n");
      if (a == b && b == c)
         System.out.printf("TRIANGULO EQUILATERO\n");
      if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a))
         System.out.printf("TRIANGULO ISOSCELES\n");
      }
      scan.close();
   }
}
