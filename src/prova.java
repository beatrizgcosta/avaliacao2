import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, nomeganhoumais;
		int horastrabalhadas, menu, totalhoras;
		double valorhoras, custo, custototal, ultimocusto;
		char novo;
		
		novo = 's';
		horastrabalhadas = -1;
		valorhoras = -1;
		menu = 1;
		totalhoras = 0;
		custototal = 0;
		ultimocusto = 0;
		nomeganhoumais = "nome";
		
		
		while(novo == 'S' || novo == 's') {
			horastrabalhadas = -1;
			valorhoras = -1;
			System.out.printf("Nome: ");
			nome = sc.next();
			while(horastrabalhadas < 0) {
				System.out.printf("Horas trabalhadas: ");
				horastrabalhadas = sc.nextInt();
			}
			totalhoras = totalhoras + horastrabalhadas;
			while(valorhoras < 0) {
				System.out.printf("Valor por hora: ");
				valorhoras = sc.nextDouble();
			}
			custo = horastrabalhadas * valorhoras;
			custototal = custototal + custo;
			if(custo > ultimocusto) {
				nomeganhoumais = nome;
			}
			ultimocusto = custo;
			System.out.printf("Digitar outro (S/N)? ");
			novo = sc.next().charAt(0);
			
		}
		
		while(menu != 4) {
			System.out.println();
			System.out.printf("MENU%n");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais ");
			System.out.println("4 - Sair ");
			System.out.printf("Digite uma opção: ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println();
				System.out.printf("Total de horas = %d%n", totalhoras);
			} else {
				if(menu == 2) {
					System.out.println();
					System.out.printf("Custo total = R$ %.2f%n", custototal);
				}else {
					if(menu == 3) {
						System.out.println();
						System.out.printf("Pessoa que ganhou mais: %s%n", nomeganhoumais);
					}else {
						if(menu == 4) {
							System.out.println();
							System.out.printf("FIM DO PROGRAMA!");
						}
					}
				}
			}
		}
	}

}
