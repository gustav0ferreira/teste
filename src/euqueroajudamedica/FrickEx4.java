package euqueroajudamedica;

import javax.swing.JOptionPane;

public class FrickEx4 {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Sua primeira nota"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Sua segunda nota"));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Sua terceira nota"));
		int D = Integer.parseInt(JOptionPane.showInputDialog("Sua quarta nota"));
		int resul = (A+B+C+D)/4;
		if (resul >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
			else if(resul < 3) {
				JOptionPane.showMessageDialog(null, "Retido");
			}
			else if( resul >= 3 && resul < 6){
				JOptionPane.showMessageDialog(null, "Exame");
			}

			}
		}


