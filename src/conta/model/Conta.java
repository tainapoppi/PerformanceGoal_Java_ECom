package conta.model;

public class Conta {
	
	private String nomeDoProduto;
	private int tipoDeProduto;
	private int idProduto;
	private float precoProduto;
	public Conta(String nomeDoProduto, int tipoDeProduto, int iD, float preco) {
		this.nomeDoProduto = nomeDoProduto;
		this.tipoDeProduto = tipoDeProduto;
		this.idProduto = iD;
		this.precoProduto = precoProduto;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public int getTipoDeProduto() {
		return tipoDeProduto;
	}
	public void setTipoDeProduto(int tipoDeProduto) {
		this.tipoDeProduto = tipoDeProduto;
	}
	public int getiD() {
		return idProduto;
	}
	public void setiD(int iD) {
		this.idProduto = iD;
	}
	public float getPreco() {
		return precoProduto;
	}
	public void setPreco(float preco) {
		this.precoProduto = preco;
	}
	

	public void visualizar() {

		String tipo = "";
		
		switch(this.tipoDeProduto) {
		case 1:
			tipo = "Feminino";
		break;
		case 2:
			tipo = "Masculino";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados dos Produto:");
		System.out.println("**************************************************************");
		System.out.println("Produto " + this.nomeDoProduto);
		System.out.println(" Tipo de Produto " + tipo);
		System.out.println("ID Produto: " + this.idProduto);
		System.out.println("Titular: " + this.precoProduto);
		System.out.println("                                                             " );
		System.out.println("*************************************************************" );
		
	
	}	

}
	
