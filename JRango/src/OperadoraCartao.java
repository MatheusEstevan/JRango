import java.util.ArrayList;


public class OperadoraCartao {
	public ArrayList<Cartao> cartoes;
	public ArrayList<Restaurante> restaurantes;
	public OperadoraCartao()
	{
		restaurantes = new ArrayList<Restaurante>();
		cartoes = new ArrayList<Cartao>();
	}
	
	public void cadastrarCartao(int nrCartao, String nomeUsuario){
		Cartao novoCartao = new Cartao(nrCartao,nomeUsuario);
		cartoes.add(novoCartao);
	}
	
	public void cadastrarRestaurante(int codRestaurante, String nomeRestaurante){
		Restaurante novoRestaurante = new Restaurante(codRestaurante,nomeRestaurante);
		restaurantes.add(novoRestaurante);
	}
	
	public void solicitarExtrato(int nrCartao){
		int contador;
		for(contador = 0; contador < cartoes.size(); contador++){
			Cartao temp = cartoes.get(contador);
			if(temp.getNrCartao() == nrCartao){
				temp.extrato();
			}
		}	
	}
	
	public void relatorioRestaurantesMaisVisitados(){
		
	}
	
	public boolean consumirCartao(float valor,int nrCartao,int codRestaurante){
		int contador;
		for(contador = 0; contador < cartoes.size(); contador++){
			Cartao temp = cartoes.get(contador);
			if(temp.getNrCartao() == nrCartao){
				if( temp.getSaldo() >= valor){
					temp.consumoCartao(valor);
					return true;
				}
			}
		}
		return false;
	}
	
	public float consultarSaldo(int nrCartao){
		int contador;
		for(contador = 0; contador < cartoes.size(); contador++){
			if(cartoes.get(contador).getNrCartao() == nrCartao){
				float saldo = cartoes.get(contador).getSaldo();
				return saldo;
			}
		}
		return -1;	
	}
	
	
	
	
}
