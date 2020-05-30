package exercicio_7_1_TransformarString;

public class ManipuladorDuplicar extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
