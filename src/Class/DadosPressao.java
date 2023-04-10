package Class;


public class DadosPressao {

	private String data;
	private String hora;
	private int pressaoSistolica;
	private int pressaoDiastolica;
	private String emEstresse;

	public DadosPressao() {

	}

	public DadosPressao(String data, String hora, int pressaoSistolica, int pressaoDiastolica, String emEstresse) {
		this.data = data;
		this.hora = hora;
		this.pressaoSistolica = pressaoSistolica;
		this.pressaoDiastolica = pressaoDiastolica;
		this.emEstresse = emEstresse;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getPressaoSistolica() {
		return pressaoSistolica;
	}

	public void setPressaoSistolica(int pressaoSistolica) {
		this.pressaoSistolica = pressaoSistolica;
	}

	public int getPressaoDiastolica() {
		return pressaoDiastolica;
	}

	public void setPressaoDiastolica(int pressaoDiastolica) {
		this.pressaoDiastolica = pressaoDiastolica;
	}

	public String getEmEstresse() {
		return emEstresse;
	}

	public void setEmEstresse(String emEstresse) {
		this.emEstresse = emEstresse;
	}
}
	

	