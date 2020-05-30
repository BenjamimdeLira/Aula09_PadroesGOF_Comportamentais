package exercicio_7_1_TransformarString;
//BENJAMIM DE LIRA SIQUEIRA MELO
//816112054
public class Main {
	// M�todo principal
	public static void main(String[] args) throws Exception {
		// Manipula de v�rias formas.
		ManipuladorAbstrato manipulador;

		System.out.println("");
		System.out.println("    PRIMEIRA FASE Transformar em mai�sculo    ");
		System.out.println("");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("");
		System.out.println("    SEGUNDA FASE Transformar em min�sculo    ");
		System.out.println("");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("");
		System.out.println("    TERCEIRA FASE Duplicar    ");
		System.out.println("");
		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("");
		System.out.println("    QUARTA FASE Inverter    ");
		System.out.println("");
		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}