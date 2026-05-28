package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFond = new JLabel("");
		lblFond.setBounds(0, 0, 400, 275);

		String chemin = "fonds/fondchoix.jpg";
		URL resource = getClass().getClassLoader().getResource(chemin);

		lblFond.setIcon(new ImageIcon(resource));
		
		
		JLabel lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPrecedent_clic();
			}
		});
		
		lblPrecedent.setBounds(57, 160, 46, 14);
		contentPane.add(lblPrecedent);
		
		JLabel lblSuivant = new JLabel("");
		lblSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSuivant_clic();
			}
		});
		
		lblSuivant.setBounds(290, 160, 46, 14);
		contentPane.add(lblSuivant);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblGo_clic();
			}
		});
		lblGo.setBounds(318, 218, 46, 14);
		contentPane.add(lblGo);
		
		contentPane.add(lblFond);

	}
	
	/**
	 * Clic_flèche_précédente
	 */
	private void lblPrecedent_clic() {

		System.out.println("precedent");

	}

	/**
	 * Clic_flèche_suivante
	 */
	private void lblSuivant_clic() {

		System.out.println("suivant");

	}

	/**
	 * Clic_GO
	 */
	private void lblGo_clic() {

		Arene frmArene = new Arene();
		frmArene.setVisible(true);

		this.dispose();

	}
}
