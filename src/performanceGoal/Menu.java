package performanceGoal;

import java.util.Scanner;

import conta.controller.ContaController;
import cores.util.Cores;
import conta.model.Colar;
import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		ContaController produtos = new ContaController();
	
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                OLGA POPPI ACESSÓRIOS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produtos                   ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Atualizar Qty                        ");
			System.out.println("            4 - Consulta ID                          ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nCores.TEXT_WHITE_BOLD + Olga Poppi Acessórios - As melhores peças você encontra aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
			

				case 1:
					System.out.println(Cores.TEXT_WHITE + "Produto\n\n");
					System.out.println("Digite o ID do Produto: ");
					iD = leia.nextInt();
					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?");
					nomeDoProduto = leia.nextLine();

					do {
						System.out.println("Digite o Tipo do Produto (1-Colar ou 2-Pulseira): ");
						tipo = leia.nextInt();
					} while (tipo < 1 && tipo > 2);

					System.out.println("Digite o Preço do Produto R$");
					precoProduto = leia.nextFloat();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite a cor: ");
						leia.skip("\\R?");
						cor = leia.nextLine();
						produtos.cadastrarProduto(new Acessorio(id, nome, tipo, preco, cor));
		           
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE +"Listar Produtos\n\n");
					produtos.listarProdutos();
		          
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Atualizar Qty\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

					break;
				case 5:
					System.out.println("Sair\n\n");

					break;
				default:
					System.out.println("\nCores.TEXT_RED_BOLD + Opção Inválida! + Cores.TEXT_RESET\n");
					break;
			}
		}
	}
    
	 public static void cadastrarProdutos(ContaController produtos, Scanner leia) {
	        System.out.println("Escolha o tipo de produto:");
	        System.out.println("1 - Colar");
	        System.out.println("2 - Pulseira");
	        int tipoProduto = leia.nextInt();

	        switch (tipoProduto) {
	            
	            default:
	                System.out.println("Opção inválida!");
	                break;
	        }
	 }
	                
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Tainá Poppi - tainapoppi@hotmail.com");
		System.out.println("https://github.com/tainapoppi/PerformanceGoal_Java_ECom");
		System.out.println("*********************************************************");
	}

	}

