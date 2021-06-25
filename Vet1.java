package intro2;

import java.util.Scanner;

public class Vet1 {

	public static void main(String[] args) {
		/*
		 * "O programa deverá armazenar o nome, idade e descrição breve do atendimento
		 * para o usuário e armazenar em um menu aplicando um sistema de fila".
		 */

		Scanner teclado = new Scanner(System.in);

		String[] nome = new String[20];
		int[] idade = new int[20];
		String[] descricao = new String[20];
		int atender;
		String sair;
		int qntPessoa = 0;
		int i;
		int menu;
		int opcao = 1;
		int contador = 0;

		while (opcao != 0) {

			for (i = 0; i < 19; i++) {
				System.out.println("\nCapacidade maxima de pessoas na fila: 20. Quantidade atual: " + qntPessoa);
				if (qntPessoa == 20) {
					System.out.println(
							"\nCpacidade limite alcançada, impossivel de inserir um novo paciente:\n\n1 - Atender Paciente\n2 - Sair\n");
					menu = Integer.parseInt(teclado.next());
				} else {
					System.out.println(
							"Escolha uma das opçoes: \n\n1 - Incluir paciente\n2 - Atender Paciente\n3 - Sair");
					menu = Integer.parseInt(teclado.next());

				}

				if (menu == 1) {
					teclado.nextLine();

					System.out.println("Digite o nome:");
					nome[i] = teclado.nextLine();

					System.out.println("Digite a idade:");
					idade[i] = Integer.parseInt(teclado.next());

					teclado.nextLine();

					System.out.println("descriçao:");
					descricao[i] = teclado.nextLine();
					qntPessoa = qntPessoa + 1;

				} else if (menu == 2) {
					if (qntPessoa == 0) {
						System.out.println("Nenhum paciente na fila.");
						break;
					} else {
						nome[0] = null;
						idade[0] = 0;
						descricao[0] = null;
						System.out.println("Filas reorganizadas:");

						for (i = 1; i <= nome.length - 1; i++) {
							contador = contador + 1;
							nome[contador - 1] = nome[contador];
							idade[contador - 1] = idade[contador];
							descricao[contador - 1] = descricao[contador];

							System.out.println("\nNome:" + nome[contador]);
							System.out.println("idade:" + idade[contador]);
							System.out.println("descriçao\n:" + descricao[contador]);
						}
						i = i - 1;
						qntPessoa = qntPessoa - 1;
					}

				} else {
					System.out.println("Atendimento finalizado.");
					System.exit(0);
					break;
				}

			}
		}

		teclado.close();

	}

}
