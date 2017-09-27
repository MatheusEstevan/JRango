import java.util.ArrayList;


public class Cartao {

	private int nrCartao;
	private String nomeUsuario;
	private float saldo;
	private ArrayList<Transacao> transacoes;
	
	public Cartao(int nrCartao, String nomeUsuario){
		this.nrCartao = nrCartao;
		this.nomeUsuario = nomeUsuario;
		this.saldo = 0;
		transacoes = new ArrayList<Transacao>();
	}
	
	
	public void extrato(){
		int contador;
		for(contador=0;contador<transacoes.size();contador++){
			Transacao temp = transacoes.get(contador);
			Restaurante restaurante = temp.getRestaurante();
			System.out.println("Restaurante: " + restaurante.getNomeRestaurante());
			System.out.println("Valor: " + temp.getValor());
			System.out.println("\n");
		}
	}
	
	public void restaurantesMaisVisitados(){
		int contador;
		for(contador=0;contador<transacoes.size();contador++){
			Transacao temp = transacoes.get(contador);
			Restaurante restaurante = temp.getRestaurante();
			
		}
	}
	
	
	public void carregarCartao(float valor){
		this.saldo += valor; 
	}
	
	public void consumoCartao(float valor){
		this.saldo -= valor; 
	}
	
	public int getNrCartao() {
		return nrCartao;
	}
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public float getSaldo() {
		return saldo;
	}	
}
