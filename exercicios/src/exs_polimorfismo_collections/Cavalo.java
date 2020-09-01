package exs_polimorfismo_collections;

public class Cavalo extends Animal {
	private String relincho;

	public Cavalo(String nome, int idade, String relincho) {
		super(nome, idade);
		this.relincho = relincho;
	}

	public String getRelincho() {
		return "RRRRIIIIISHUUUUUUSUAHUSHAUHS";
	}

	public void setRelincho(String relincho) {
		this.relincho = relincho;
	}

	public String emitirSom() {
		return "Nome: " + super.getNome() + " emite o som" + this.getRelincho();
	}

}