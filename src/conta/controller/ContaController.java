package conta.controller;

import conta.model.Conta;
import conta.repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ContaController implements ProdutoRepository {

    private ArrayList<Conta> listaProdutos = new ArrayList<Conta>();

    @Override
    public void cadastrarProdutos(Conta produto) {
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Conta produto : listaProdutos) {
                produto.visualizar();
            }
        }
    }

    @Override
    public void atualizarQty(Conta conta) {
        for (Conta produto : listaProdutos) {
            if (produto.getNomeDoProduto().equals(conta.getNomeDoProduto())) {
               
                System.out.println("Quantidade do produto atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado para atualização de quantidade.");
    }

    @Override
    public void buscarPorID(int id) {
        for (Conta produto : listaProdutos) {
            if (produto.getTipoDeProduto() == id) {
                produto.visualizar();
                return;
            }
        }
        System.out.println("Produto não encontrado com o ID especificado.");
    }

    @Override
    public void sair(int id) {
     
        System.out.println("Saindo...");
    }
}