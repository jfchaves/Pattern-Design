package net.avantica.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.avantica.classes.Caretaker;
import net.avantica.classes.Originator;

public class Test extends JFrame {
	public static void main(String[] args) {

		new Test();

	}

	private JButton guardarBut, deshacerBut, rehacerBut;

	private JTextArea theArticle = new JTextArea(40, 60);

	Caretaker caretaker = new Caretaker();
	Originator originator = new Originator();
	int saveFiles = 0, currentArticle = 0;

	public Test() {
		this.setSize(750, 780);
		this.setTitle("Memento");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();

		panel1.add(new JLabel("Article"));
		panel1.add(theArticle);
		guardarBut = new JButton("Guardar");

		deshacerBut = new JButton("Deshacer");

		rehacerBut = new JButton("Rehacer");
		cargarEventos();
		panel1.add(guardarBut);
		panel1.add(deshacerBut);
		panel1.add(rehacerBut);
		this.add(panel1);
		this.setVisible(true);

	}

	public void cargarEventos() {
		guardarBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String textInTextArea = theArticle.getText();
				originator.setArticulo(textInTextArea);
				caretaker.addMemento(originator.storeInMemento());
				saveFiles++;
				currentArticle++;
				System.out.println("Save Files " + saveFiles);
				deshacerBut.setEnabled(true);
			}
		});
		deshacerBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentArticle >= 1) {
					currentArticle--;
					String textBoxString = originator.restoreFromMemento(caretaker.recuperarMemento(currentArticle));
					theArticle.setText(textBoxString);
					rehacerBut.setEnabled(true);
				} else {
					deshacerBut.setEnabled(false);
				}
			}
		});
		rehacerBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((saveFiles - 1) > currentArticle) {
					currentArticle++;
					String textBoxString = originator.restoreFromMemento(caretaker.recuperarMemento(currentArticle));
					theArticle.setText(textBoxString);
					deshacerBut.setEnabled(true);
				} else {
					rehacerBut.setEnabled(false);
				}
			}
		});
	}
}