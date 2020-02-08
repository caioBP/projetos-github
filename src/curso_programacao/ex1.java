package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double pi =  3.14159;
	double a;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número:");
	a = sc.nextDouble();
	
	while (a < 20) {
	System.out.println("A área do círculo é: "+pi*Math.pow(a, 2.0));	
	a++;
	}
	sc.close();
	}

}
