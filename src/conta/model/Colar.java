package conta.model;

public class Colar extends Conta{
	
	private String cor;
	
	public Colar(String nomeDoProduto, int tipoDeProduto, int iD, float preco, float precoProduto) {
		super(nomeDoProduto, tipoDeProduto, iD, preco, precoProduto);
		this.cor = cor;
	
				// TODO Auto-generated constructor stub
	}
		
		// TODO Auto-generated constructor stub
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	

}
