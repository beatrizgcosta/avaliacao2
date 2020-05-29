import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horastrabalhadas;
		double valorhoras;
		char novo;
		
		novo = 's';
		horastrabalhadas = -1;
		valorhoras = -1;
		
		
		while(novo == 'S' || novo == 's') {
			horastrabalhadas = -1;
			valorhoras = -1;
			System.out.printf("Nome: ");
			nome = sc.next();
			while(horastrabalhadas < 0) {
				System.out.printf("Horas trabalhadas: ");
				horastrabalhadas = sc.nextInt();
			}
			while(valorhoras < 0) {
				System.out.printf("Valor por hora: ");
				valorhoras = sc.nextDouble();
			}
			System.out.printf("Digitar outro (S/N)? ");
			novo = sc.next().charAt(0);
		}
		
	}

}
