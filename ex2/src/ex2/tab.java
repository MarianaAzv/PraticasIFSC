package ex2;

import java.io.File;
import java.util.Scanner;

public class tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner leitu = new Scanner(System.in);
 System.out.println("Digite um numero e falo se tem na tabuada anterior");
 int nur = leitu.nextInt();
 
 File tabanterior = new File("C:\\Users\\Mariana\\eclipse-workspace\\ex1");
 
 if(!tabanterior.exists()) {
	 System.out.println("Nao existe");
 } else {
	 System.out.println("Existe");
 }
	}

}
