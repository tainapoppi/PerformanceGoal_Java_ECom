package conta.model;

public class Conta{
	
	private String nomeDoProduto;
	private int tipoDeProduto;
	private int idProduto;
	private float precoProduto;
	
	public Conta(String nomeDoProduto, int tipoDeProduto, int iD, float preco, float precoProduto) {
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

		String tipo = (this.tipoDeProduto == 1) ? "Feminino" : "Masculino";
		

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("**************************************************************");
		System.out.println("Produto: " + this.nomeDoProduto);
		System.out.println("Tipo de Produto: " + tipo);
		System.out.println("ID do Produto: " + this.idProduto);
		System.out.println("Preço do Produto: " + this.precoProduto);
		System.out.println("*************************************************************\n");
	}
		
	}	

	
