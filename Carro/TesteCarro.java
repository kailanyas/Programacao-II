public class TesteCarro{
	
	public static void main(String[] args){
		Carro[] c = new Carro[2];

		c[0] = new Carro();
        c[1] = new Carro();

		c[0].setModelo("Sedan");
		c[1].setModelo("SUV");

		c[0].setCor("Vermelho");
		c[1].setCor("Preto");

		for(int i = 0; i < c.length; i++){
			System.out.println("Modelo: " + c[i].getModelo() + " Cor: " + c[i].getCor());
		}
	}
}
