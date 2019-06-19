package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx1 {
	public static void main( String[] args ) {
		int D = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número"));
		if(D < 15) {
			JOptionPane.showMessageDialog(null, "Seu número é menor que 15");
		}
		else if(D > 100) {
			JOptionPane.showMessageDialog(null, "Seu número é maior que 100");
		}
		else {
			JOptionPane.showMessageDialog(null, "nao");
		}
		
	}

}
