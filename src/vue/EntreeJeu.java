package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import vue.Arene;
import vue.ChoixJoueur;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIp;

	

	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 159);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Connect an existing server :");
		lblNewLabel.setBounds(10, 36, 145, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("IP server :");
		lblNewLabel_2.setBounds(10, 61, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Start a server :");
		lblNewLabel_3.setBounds(10, 11, 87, 14);
		contentPane.add(lblNewLabel_3);
		
		/* the btnStart*/
		
		JButton btnStart = new JButton("Start");

		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});

		btnStart.setBounds(187, 7, 89, 23);
		contentPane.add(btnStart);
		
		
		
		/*the btnConnect*/
		JButton btnConnect = new JButton("Connect");

		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});

		btnConnect.setBounds(187, 57, 89, 23);
		contentPane.add(btnConnect);
		
		
		/*
		 * the exit 
		 */
		
		JButton btnExit = new JButton("Exit");

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});

		btnExit.setBounds(187, 86, 89, 23);
		contentPane.add(btnExit);
		
		
		
		textIp = new JTextField();
		textIp.setText("127.0.0.1");
		textIp.setBounds(66, 61, 86, 20);
		contentPane.add(textIp);
		textIp.setColumns(10);

	}
	
	/**
	 * Clic_sur_Start
	 */
	private void btnStart_clic() {
		Arene frmArene = new Arene();
		frmArene.setVisible(true);
		
		this.dispose();
	}

	/**
	 * Clic_sur_Connect
	 */
	private void btnConnect_clic() {
		ChoixJoueur frmChoix = new ChoixJoueur();
		frmChoix.setVisible(true);
		
		this.dispose();
	}

	/**
	 * Clic_sur_Exit
	 */
	private void btnExit_clic() {
		System.exit(0);
	}
}
