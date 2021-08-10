package Turma29;

public class testepolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cachorro cachorro1 =new cachorro();
		cachorro1.setNome("amarelão");
		cachorro1.setLatido("auauauaua");
		
		cavalo cavalo1 =new cavalo();
		cavalo1.setNome("WALLE");
		cavalo1.setCavalgar("poc poc poc");
		
		
		preguica preguica1 =new preguica();
		preguica1.setNome("preguisinha");
		preguica1.setSubirarvore("sobe na árvore");
		
   	animal[] animais =new animal[3 ];
		                            
		animais[0]=cachorro1;
	   	animais[1]=cavalo1;
		animais[2]=preguica1;
		
		
		for(animal animal:animais)
		{
			System.out.println(animal.getNome());
		}

	}

}
