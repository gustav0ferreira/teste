package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx5 {
	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Coloque um n�mero"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Coloque outro n�mero"));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Coloque outro n�mero"));
		if (A > B && A > C && B > C) {
			JOptionPane.showMessageDialog(null, A + " � o maior n�mero");
			JOptionPane.showMessageDialog(null, C + " � o menor n�mero");
		}
		else if (A > B && A > C && B < C) {
			JOptionPane.showMessageDialog(null, A + " � o maior n�mero");
			JOptionPane.showMessageDialog(null, B + " � o menor n�mero");
		}
		else if (B > A && B > C && A > C) {
			JOptionPane.showMessageDialog(null, B + " � o maior n�mero");
			JOptionPane.showMessageDialog(null, C + " � o menor n�mero");
		}
		else if (B > A && B > C && A < C) {
			JOptionPane.showMessageDialog(null, B + " � o maior n�mero");
			JOptionPane.showMessageDialog(null, A + " � o menor n�mero");
		}
		else if (C > A && C > B && A > B) {
				JOptionPane.showMessageDialog(null, C + " � o maior n�mero");
				JOptionPane.showMessageDialog(null, B + " � o menor n�mero");
			}
		else if (C > A && C > B && A < B) {
				JOptionPane.showMessageDialog(null, C + " � o maior n�mero");
				JOptionPane.showMessageDialog(null, A + " � o menor n�mero");
		}
	}

}
