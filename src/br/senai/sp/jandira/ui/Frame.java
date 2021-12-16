package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelListener;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogos;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;

public class Frame extends JFrame {
	private JTextField txtNome;
	private JTextField tfvalor;
	private JTextField textField;

	private int posicao;

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBounds(100, 100, 694, 482);

		JTextPane lblNome = new JTextPane();
		lblNome.setEditable(false);
		lblNome.setText("Nome do Jogo:");
		lblNome.setBounds(38, 37, 79, 20);
		getContentPane().add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(142, 37, 99, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JTextPane lblFabricante = new JTextPane();
		lblFabricante.setEditable(false);
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFabricante.setForeground(Color.DARK_GRAY);
		lblFabricante.setText("Nome do Fabricante:");
		lblFabricante.setBounds(10, 67, 107, 20);
		getContentPane().add(lblFabricante);

		JCheckBox checkZerado = new JCheckBox("Zerado");
		checkZerado.setBounds(142, 97, 59, 23);
		getContentPane().add(checkZerado);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(242, 85, -94, -15);
		getContentPane().add(scrollPane);

		JComboBox comboEmpresa = new JComboBox();
		DefaultListModel<String> modelFabricantes = new DefaultListModel<String>();
		FabricanteRepository fabricante = new FabricanteRepository();

		comboEmpresa.setToolTipText("\r\n");
		comboEmpresa.setBounds(143, 68, 98, 22);
		getContentPane().add(comboEmpresa);
		DefaultComboBoxModel<String> modelFabricante = new DefaultComboBoxModel<String>();
		FabricanteRepository fabricantes = new FabricanteRepository();
		for (Fabricante fabricante1 : fabricantes.getFabricante()) {
			modelFabricante.addElement(fabricante1.getNomeEmpresa());
		}

		comboEmpresa.setModel(modelFabricante);
		getContentPane().add(comboEmpresa);

		JTextPane lblConsole = new JTextPane();
		lblConsole.setEditable(false);
		lblConsole.setText("Console:");
		lblConsole.setForeground(Color.DARK_GRAY);
		lblConsole.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblConsole.setBounds(68, 132, 49, 20);
		getContentPane().add(lblConsole);

		JComboBox comboConsole = new JComboBox();
		DefaultComboBoxModel<String> comboBoxJogo = new DefaultComboBoxModel<String>();
		// carregar o combobox descrição
		for (Console descricao : Console.values()) {
			comboBoxJogo.addElement(descricao.getDescricao());
		}
		;
		comboConsole.setModel(comboBoxJogo);
		comboConsole.setToolTipText("\r\n");
		comboConsole.setBounds(142, 132, 94, 20);
		getContentPane().add(comboConsole);

		JTextPane lblValor = new JTextPane();
		lblValor.setEditable(false);
		lblValor.setText("Valor Estimado:");
		lblValor.setForeground(Color.DARK_GRAY);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblValor.setBounds(36, 176, 81, 20);
		getContentPane().add(lblValor);

		tfvalor = new JTextField();
		tfvalor.setColumns(10);
		tfvalor.setBounds(142, 176, 99, 20);
		getContentPane().add(tfvalor);

		JTextPane lblObservacoes = new JTextPane();
		lblObservacoes.setEditable(false);
		lblObservacoes.setText("Obeserv\u00E7\u00F5es:");
		lblObservacoes.setForeground(Color.DARK_GRAY);
		lblObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblObservacoes.setBounds(36, 228, 81, 20);
		getContentPane().add(lblObservacoes);

		JButton btnSubir = new JButton("\u2191");
		btnSubir.setBackground(new Color(0, 191, 255));
		btnSubir.setForeground(new Color(255, 255, 255));
		btnSubir.setBounds(411, 388, 100, 41);
		getContentPane().add(btnSubir);
		btnSubir.setEnabled(false);

		JButton btnDescer = new JButton("\u2193");
		btnDescer.setBackground(new Color(0, 191, 255));
		btnDescer.setForeground(new Color(255, 255, 255));
		btnDescer.setBounds(521, 388, 99, 41);
		getContentPane().add(btnDescer);
		btnDescer.setEnabled(false);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(142, 228, 204, 116);
		getContentPane().add(textField);

		JTextPane lblLista = new JTextPane();
		lblLista.setEditable(false);
		lblLista.setText("Meus Jogos:");
		lblLista.setForeground(Color.DARK_GRAY);
		lblLista.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblLista.setBounds(435, 37, 81, 20);
		getContentPane().add(lblLista);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(163, 385, 125, 46);
		getContentPane().add(btnSalvar);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(435, 67, 170, 277);
		getContentPane().add(scrollPane_1);

		DefaultListModel<String> modelList = new DefaultListModel<String>();
		JList<String> listaJogos = new JList<String>(modelList);
		listaJogos.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(listaJogos);

		// Criar uma turma que é um repositório de alunos
		JogoRepository lista = new JogoRepository();

		// Criar o model que vai exibir os alunos na JList
		DefaultListModel<String> modelJogos = new DefaultListModel<String>();

		// Definir o modelAlunos como sendo o model do nosso JList
		listaJogos.setModel(modelJogos);
		// criar botão

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogos jogo = new Jogos();
				jogo.setNome(txtNome.getText());

				jogo.setConsole(determinarConsole(comboConsole.getSelectedIndex()));
				jogo.setFabricante(fabricantes.listarFabricante(comboEmpresa.getSelectedIndex()));
				jogo.setZerado(checkZerado.isSelected());
				jogo.setValor(tfvalor.getText());
				jogo.setObservacao(textField.getText());

				System.out.println(comboConsole.getSelectedIndex());
				System.out.println(comboConsole.getSelectedItem());
				System.out.println(comboEmpresa.getSelectedIndex());
				System.out.println(comboEmpresa.getSelectedItem());

				lista.gravar(jogo, posicao);
				posicao++;

				modelJogos.addElement(jogo.getNome());

			}
		});

		listaJogos.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				Jogos jogo = lista.listarJogos(listaJogos.getSelectedIndex());

				txtNome.setText(jogo.getNome());
				checkZerado.setSelected(jogo.isZerado());

				comboConsole.setSelectedIndex(jogo.getConsole().ordinal());
				tfvalor.setText(jogo.getValor());

				textField.setText(jogo.getObservacao());
				comboEmpresa.setSelectedIndex(Arrays.asList(fabricantes.getFabricante()).indexOf(jogo.getFabricante()));

			}
		});
		btnSubir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int posicaoList = listaJogos.getSelectedIndex();
				
				if(posicaoList == listaJogos.getFirstVisibleIndex()) {
					listaJogos.setSelectedIndex(listaJogos.getLastVisibleIndex());
				}
				
				else {
					listaJogos.setSelectedIndex(posicaoList-1);
				}
			}
		});
		
		btnDescer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int posicaoList = listaJogos.getSelectedIndex();
				
				if(posicaoList == listaJogos.getLastVisibleIndex()) {
					listaJogos.setSelectedIndex(listaJogos.getFirstVisibleIndex());
				}
				
				else {
					listaJogos.setSelectedIndex(posicaoList+1);
				}
			}
		});
	

	}
	
	

	private Console determinarConsole(int consoleSelecionado) {

		if (consoleSelecionado == 0) {
			return Console.PLAYSTATION;
		} else if (consoleSelecionado == 1) {
			return Console.XBOX;
		} else if (consoleSelecionado == 2) {
			return Console.NINTENDO;
		} else {
			return Console.PC;
		}
		
	}
	
}
