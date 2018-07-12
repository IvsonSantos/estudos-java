package deitel.swing;

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		// cria um painel que contém nosso desenho
		DrawPanel panel = new DrawPanel();

		// cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();

		// configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // adiciona o painel ao frame ÿ
		application.setSize(250, 250); // configura o tamanho do frameÿ
		application.setVisible(true); // torna o frame visível ÿ
	}
}
