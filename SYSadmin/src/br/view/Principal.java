package br.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import br.control.NavegadorCardCtr;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.CardLayout;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel conteimport java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 390);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAssociado = new JMenu("Associado");
		menuBar.add(mnAssociado);
		
		JMenu mnVenda = new JMenu("Venda");
		menuBar.add(mnVenda);
		
		JMenu mnMensalidade = new JMenu("Mensalidade");
		menuBar.add(mnMensalidade);
		
		JMenu mnFinanceiro = new JMenu("Financeiro");
		menuBar.add(mnFinanceiro);
		
		JMenu mnEstoque = new JMenu("Estoque");
		menuBar.add(mnEstoque);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		
		JPanel pToolBox = new JPanel();
		pToolBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel pRoot = new JPanel();
		pRoot.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel pFooter = new JPanel();
		pFooter.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(pToolBox, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
						.addComponent(pRoot, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
						.addComponent(pFooter, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(pToolBox, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pRoot, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pFooter, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pRoot.setLayout(new CardLayout(0, 0));
		
		JPanel cardAssociado = new JPanel();
		cardAssociado.setBackground(Color.GREENel());
		pRoot.add(cardAssociado, "cardAssociado");
		
		JPanel cardVendas = new JPanel();cardVendas.setBackground(Color.RED);
		
		pRoot.add(cardVendas, "cardVendas");
		
		JButton btnNewButton = new JButton("Associado");
		btnAssociado.addActionListener(navegador);
		
		JButton btnVenda = new JButton("Venda");
		btnVenda.addActionListener(navegador);
		
		GroupLayout gl_pToolBox = new GroupLayout(pToolBox);
		gl_pToolBox.setHorizontalGroup(
			gl_pToolBox.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pToolBox.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVenda)
					.addContainerGap(352, Short.MAX_VALUE))
		);
		gl_pToolBox.setVerticalGroup(
			gl_pToolBox.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pToolBox.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pToolBox.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnVenda))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		pToolBox.setLayout(gl_pToolBox);
		contentPane.setLayout(gl_contentPane);
	}
}
}
