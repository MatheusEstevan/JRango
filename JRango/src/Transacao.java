
public class Transacao {
	private Restaurante restaurante;
	private float valor;
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public float getValor() {
		return valor;
	}
	public Transacao(Restaurante restaurante, float valor) {
	
		this.restaurante = restaurante;
		this.valor = valor;
	}
}
