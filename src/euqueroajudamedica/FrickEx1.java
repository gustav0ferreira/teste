package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx1 {
	public static void main( String[] args ) {
		int D = Integer.parseInt(JOptionPane.showInputDialog("Coloque um n�mero"));
		if(D < 15) {
			JOptionPane.showMessageDialog(null, "Seu n�mero � menor que 15");
		}
		else if(D > 100) {
			JOptionPane.showMessageDialog(null, "Seu n�mero � maior que 100");
		}
		else {
			JOptionPane.showMessageDialog(null, "nao");
		}
		
	}

}
