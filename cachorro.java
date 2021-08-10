package Turma29;

public class cachorro extends animal{
	
	public cachorro()
	{
		
	}
	
	private String latido;

	public String getLatido() {
		return latido;
	}

	public void setLatido(String latido) {
		this.latido = latido;
	}
	
	public String getNome()
	{
		return "cachorro: "+super.getNome()+"latido :  "+this.getLatido();
	}

}
