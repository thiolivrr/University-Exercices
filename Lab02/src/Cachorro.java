
public class Cachorro {
	private String nome;
	private int idade;
	private double peso;
	
	public Cachorro(String aNome, double aPeso) {
		nome = aNome;
		idade = 0;
		peso = aPeso;
	}

	String getNome() {
		return nome;
	}
	
	int getIdade() {
		return idade;
	}
	
	double getPeso() {
		return peso;
	}
	
	void setIdade(int umaIdade) {
		idade = umaIdade;
	}
	
	public void aumentaIdade() {
		idade = idade + 1;
	}
	
	@Override public String toString() {
		String res = "";
		res += "Nome: "+nome+"\n"+"Idade: "+idade+"\n"+"Peso: "+peso;
		return res;
	}
}
