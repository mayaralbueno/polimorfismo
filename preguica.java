package Turma29;

public class preguica extends animal{
	
	private String subirarvore;

	public String getSubirarvore() {
		return subirarvore;
	}

	public void setSubirarvore(String subirarvore) {
		this.subirarvore = subirarvore;
	}
	public String getNome()
	{
		return "preguica"+super.getNome()+"sobe em árvore"+this.getSubirarvore();
	}
	

}
