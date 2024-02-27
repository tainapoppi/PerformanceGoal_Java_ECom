package conta.repository;

import conta.model.Conta;

public interface ProdutoRepository {
	
	public void cadastrarProdutos (Conta produto);
	public void listarProdutos ();
	public void atualizarQty( Conta conta);
	public void buscarPorID (int id);
	public void sair (int id);

}
