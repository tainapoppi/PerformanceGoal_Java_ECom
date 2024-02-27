package conta.model;

public class Pulseira extends Conta {
	
	private String cor;
	

	public Pulseira(String nomeDoProduto, int tipoDeProduto, int iD, float preco, float precoProduto) {
		super(nomeDoProduto, tipoDeProduto, iD, preco, precoProduto);
		
		this.cor = cor;
		
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}

}
