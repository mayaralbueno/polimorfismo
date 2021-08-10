package Turma29;

public class cavalo extends animal {
	private String cavalgar;
	
	public cavalo()
	{
		
	}

	public String getCavalgar() {
		return cavalgar;
	}

	public void setCavalgar(String cavalgar) {
		this.cavalgar = cavalgar;
	}
	public String getNome()
	{
		return "cavalo"+super.getNome()+"cavalgar poc poc poc"+this.getCavalgar();
	}

}
