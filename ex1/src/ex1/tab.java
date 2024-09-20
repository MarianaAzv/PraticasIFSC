package ex1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
int tab;
System.out.println("um numero de 1 a 10");

int lernur = leitura.nextInt();

File novoarq = new File("tabuada"+ lernur +".txt");

FileWriter le = new FileWriter(novoarq);

for (int i = 1; i <= 10; i++) {
	le.write(lernur +"X"+ i +"= "+(lernur*i));
}
le.close();
	}

	

}
