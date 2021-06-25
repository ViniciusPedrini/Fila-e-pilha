package intro2;

import java.util.Scanner;

public class vet2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int[] altura = new int[10];
		int[] largura = new int[10];
		int[] profundidade = new int[10];
		String[] fragil = new String[10];
		int pilha = 0;
		int qntCaixa = 0;
		int opcao = 5;
		int i = 0;
		int contador = 0;
		int topo;

		do {

			for (i = 0; i < 9; i++) {
				System.out.println("\nCapacidade maxima de Caixas na pilha: 10. Quantidade atual: " + qntCaixa);
				if (qntCaixa == 10) {
					System.out.println(
							"\nCpacidade limite alcançada, impossivel de inserir uma nova caixa:\n\n1 - Empilhar\n2 - desempilhar\n");
					pilha = Integer.parseInt(teclado.next());
				} else {
					System.out.println("Escolha uma das opçoes: \n\n1 - Empilhar\n2 - Desempilhar\n3 - Sair");
					pilha = Integer.parseInt(teclado.next());
				}

				if (pilha == 1) {
					teclado.nextLine();

					System.out.println("Altura da caixa:");

					altura[i] = Integer.parseInt(teclado.next());

					System.out.println("Largura da caixa:");
					largura[i] = Integer.parseInt(teclado.next());

					teclado.nextLine();

					System.out.println("Profundidade da caixa:");
					profundidade[i] = Integer.parseInt(teclado.next());

					System.out.println("Produto é fragil?");
					fragil[i] = teclado.nextLine();

					teclado.nextLine();

					qntCaixa = qntCaixa + 1;

				} else if (pilha == 2) {
					if (qntCaixa == 0) {
						System.out.println("Nenhuma caixa empilhada.");
						break;
					} else {
						
					
						altura[0] = 0;
						largura[0] = 0;
						profundidade[0] = 0;
						fragil[0] = null;
						System.out.println("Pilhas reorganizadas:");

						for (i = 1; i <= altura.length - 1; i++) {
							contador = contador + 1;
							altura[i] = 0;
							largura[i] = 0;
							profundidade[i] = 0;
							fragil[i] = null;

							System.out.println("\nAltura:" + altura[contador]);
							System.out.println("Largura:" + largura[contador]);
							System.out.println("Profundidade\n:" + profundidade[contador]);
							System.out.println("A caixa é fragil?\n:" + fragil[contador]);
						}
						i = i - 1;
						qntCaixa = qntCaixa - 1;
					}

				} else {
					System.out.println("Empilhamento finalizado.");
					System.exit(0);
					break;

				}

				
			}
			teclado.close();
		}
		while (opcao != 0);

	}
}
