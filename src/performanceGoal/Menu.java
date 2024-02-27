package performanceGoal;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                OLGA POPPI ACESSÓRIOS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Casdastrar Cliente                   ");
			System.out.println("            2 - Produtos                             ");
			System.out.println("            3 - Listar Produtos                      ");
			System.out.println("            4 - Atualizar QTY                        ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Comprar                              ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nOlga Poppi Acessórios - As melhores peças você encontra aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Cleinte\n\n");

					break;
				case 2:
					System.out.println("Produto\n\n");

					break;
				case 3:
					System.out.println("Listar Produtos\n\n");

					break;
				case 4:
					System.out.println("Atualizar QTY\n\n");

					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println("Comprar\n\n");

					break;
				case 7:
					System.out.println("Sair\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Tainá Poppi - tainapoppi@hotmail.com");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

	}

