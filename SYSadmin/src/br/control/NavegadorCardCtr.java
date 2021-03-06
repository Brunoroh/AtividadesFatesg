package br.control;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class NavegadorCardCtr implements ActionListener {
	
	JPanel Root;
	
	public NavegadorCardCtr(JPanel Root){
		this.Root = Root;
	}
	
	@Override
	public void actionPerformed(ActionEvent evento){
		
		CardLayout card = (CardLayout)Root.getLayout();
		if(evento.getActionCommand().equals("Associado"))
			card.show(Root,"cardAssociado");
		if(evento.getActionCommand().equals("Vendas"))
			card.show(Root, "cardVenda");
	}

}
