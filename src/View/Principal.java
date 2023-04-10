package View;

import Class.DadosPressao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Principal extends javax.swing.JFrame {

	private final String[] tableColumns = {"DATA", "HORA", "PRESSÃO SISTÓLICA", "PRESSÃO DIASTÓLICA", "STRESS"};

	DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

	private List<DadosPressao> DadosPressaoList = new ArrayList<>();

	private String caminho = "C://ArquivoAferimento.txt";

	public Principal() {

		initComponents();
		setLocationRelativeTo(null);
		atualizalistTXT();
		geraAcessbilidade();
		bntSalvar.setToolTipText("Salvar o registro de Aferimento de Pressão\n ou Alt + S");

		txtPressaoSistolica.setToolTipText("Informe a Pressão Diastólica no format.:\n"
				  + "Ex: Se a Pressão é 12 digite (120)");

		txtPressaoSistolica.setToolTipText("Informe a Pressão Diastólica no format.:\n"
				  + "Ex: Se a Pressão é 8 digite (80)");

	}

	public void geraAcessbilidade() {

		bntSalvar.setMnemonic(KeyEvent.VK_S);

	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable_Pressao = new javax.swing.JTable();
      lbTitulo = new javax.swing.JLabel();
      lbHora = new javax.swing.JLabel();
      lbData = new javax.swing.JLabel();
      lbPressaoSistolica = new javax.swing.JLabel();
      lbPressaoDiastolica = new javax.swing.JLabel();
      txtPressaoDiastolica = new javax.swing.JTextField();
      txtPressaoSistolica = new javax.swing.JTextField();
      txtData = new javax.swing.JFormattedTextField();
      txtHora = new javax.swing.JFormattedTextField();
      jcbEstresse = new javax.swing.JCheckBox();
      bntSalvar = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("NUTRISOFT - Sindicato de Nutricionistas");

      jTable_Pressao.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "DATA", "HORA", "PRESSÃO SISTÓLICA", "PRESSAO DIASTÓLICA", "STRESS"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jTable_Pressao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jTable_Pressao.setGridColor(new java.awt.Color(0, 0, 0));
      jScrollPane1.setViewportView(jTable_Pressao);

      lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
      lbTitulo.setText("NutriSoft - Aferimento de Pressão");

      lbHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      lbHora.setText("Hora:");

      lbData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      lbData.setText("Data:");

      lbPressaoSistolica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      lbPressaoSistolica.setText("Pressao Sistólica:");

      lbPressaoDiastolica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      lbPressaoDiastolica.setText("Pressão Diastólica");

      txtPressaoDiastolica.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
      txtPressaoDiastolica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtPressaoDiastolica.setNextFocusableComponent(jcbEstresse);

      txtPressaoSistolica.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
      txtPressaoSistolica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtPressaoSistolica.setNextFocusableComponent(txtPressaoDiastolica);

      try {
         txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtData.setToolTipText("Digite a DATA de Aferimento (DD/MM/AAAA)");
      txtData.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
      txtData.setNextFocusableComponent(txtHora);
      txtData.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtDataActionPerformed(evt);
         }
      });

      try {
         txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtHora.setToolTipText("Digite a HORA de Aferimento (HH:MM)");
      txtHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtHora.setNextFocusableComponent(txtPressaoSistolica);

      jcbEstresse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jcbEstresse.setText("Está em situação de estresse?");
      jcbEstresse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
      jcbEstresse.setNextFocusableComponent(bntSalvar);

      bntSalvar.setBackground(new java.awt.Color(0, 0, 255));
      bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      bntSalvar.setForeground(new java.awt.Color(255, 255, 255));
      bntSalvar.setText("SALVAR");
      bntSalvar.setNextFocusableComponent(txtData);
      bntSalvar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntSalvarActionPerformed(evt);
         }
      });
      bntSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            bntSalvarKeyPressed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(203, 203, 203))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(107, 107, 107)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jcbEstresse, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lbPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lbPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(26, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(lbPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lbPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(43, 43, 43)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jcbEstresse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(32, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(18, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_txtDataActionPerformed

   private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed

		if (!empty()) {

			getDadosPressao();
			inserirDados(getDadosPressao());

			limparCampos();

		}

   }//GEN-LAST:event_bntSalvarActionPerformed

   private void bntSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntSalvarKeyPressed

   }//GEN-LAST:event_bntSalvarKeyPressed

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Principal().setVisible(true);

			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntSalvar;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable_Pressao;
   private javax.swing.JCheckBox jcbEstresse;
   private javax.swing.JLabel lbData;
   private javax.swing.JLabel lbHora;
   private javax.swing.JLabel lbPressaoDiastolica;
   private javax.swing.JLabel lbPressaoSistolica;
   private javax.swing.JLabel lbTitulo;
   private javax.swing.JFormattedTextField txtData;
   private javax.swing.JFormattedTextField txtHora;
   private javax.swing.JTextField txtPressaoDiastolica;
   private javax.swing.JTextField txtPressaoSistolica;
   // End of variables declaration//GEN-END:variables

	private boolean empty() {

		boolean empty = true;

		String validacao = txtPressaoSistolica.getText();
		boolean sistolicaValida = validacao.matches("[0-9]{2,3}");

		String validacao2 = txtPressaoDiastolica.getText();
		boolean diastolicaValida = validacao2.matches("[0-9]{2,3}");

		if (!validaempty()) {

			if (txtPressaoSistolica.getText().trim().isEmpty()) {

				JOptionPane.showMessageDialog(null, "O Campo PRESSÃO SISTÓLICA deve ser preenchido");

			} else if (txtPressaoDiastolica.getText().trim().isEmpty()) {

				JOptionPane.showMessageDialog(null, "O Campo PRESSÃO DIASTÓLICA deve ser preenchido");

			} else if (sistolicaValida == false) {

				JOptionPane.showMessageDialog(null, "Informe a Pressão Sistólica no format.:\n"
						  + "Ex: Se a Pressão é 12x8 digite (120x80)");

			} else if (diastolicaValida == false) {

				JOptionPane.showMessageDialog(null, "Informe a Pressão Diastólica no format.:\n"
						  + "Ex: Se a Pressão é 12x8 digite (120x80)");

			} else {

				empty = false;

			}

		}

		return empty;

	}

	private boolean validaempty() {

		boolean validacao = true;

		String valid = txtData.getText();
		boolean dataValida = valid.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");

		String valid2 = txtHora.getText();
		boolean horaValida = valid2.matches("[0-9]{2}[:][0-9]{2}");

		if (dataValida == false) {

			JOptionPane.showMessageDialog(null, "Necessário Preencher a DATA\n No formato correto ex (DD/MM/AAAA)");

		} else if (horaValida == false) {

			JOptionPane.showMessageDialog(null, "Necessário Preencher a HORA\n No formato correto ex (HH:MM)");

		} else {

			validacao = false;

		}

		return validacao;

	}

	public DadosPressao getDadosPressao() {

		DadosPressao dadosPressao = new DadosPressao();

		dadosPressao.setData(txtData.getText());
		dadosPressao.setHora(txtHora.getText());
		dadosPressao.setPressaoSistolica(Integer.parseInt(txtPressaoSistolica.getText()));
		dadosPressao.setPressaoDiastolica(Integer.parseInt(txtPressaoDiastolica.getText()));

		if (jcbEstresse.isSelected()) {

			dadosPressao.setEmEstresse("SIM");

		} else {

			dadosPressao.setEmEstresse("NÃO");

		}

		return dadosPressao;
	}

	private void inserirDados(DadosPressao dadosPressao) {

		DadosPressaoList.add(dadosPressao);
		atualizaTabela();

	}

	public void atualizalistTXT() {

		try {

			File obj = new File(this.caminho);
			Scanner Reader = new Scanner(obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();

				List<String> lineData = Arrays.asList(data.split(";"));

				DadosPressao dadosPressao = new DadosPressao();
				dadosPressao.setData(lineData.get(0));
				dadosPressao.setHora(lineData.get(1));
				dadosPressao.setPressaoSistolica(Integer.parseInt(lineData.get(2)));
				dadosPressao.setPressaoDiastolica(Integer.parseInt(lineData.get(3)));
				dadosPressao.setEmEstresse(lineData.get(4));

				DadosPressaoList.add(dadosPressao);

			}
			atualizaTabela();
			Reader.close();

		} catch (FileNotFoundException e) {

			System.out.println("Ocorreu algum erro." + e.getMessage());
		}

	}

	private void atualizaTabela() {

		String DadosTXT = "";

		if (!DadosPressaoList.isEmpty()) {

			DadosPressao dadosPressao;

			tableModel = new DefaultTableModel(tableColumns, 0);

			for (int i = 0; i < DadosPressaoList.size(); i++) {

				dadosPressao = DadosPressaoList.get(i);

				String[] rowData = {dadosPressao.getData(), dadosPressao.getHora(), String.valueOf(dadosPressao.getPressaoSistolica()),
					String.valueOf(dadosPressao.getPressaoDiastolica()), dadosPressao.getEmEstresse()};

				tableModel.addRow(rowData);
				DadosTXT += dadosPressao.getData() + ";" + dadosPressao.getHora() + ";"
						  + String.valueOf(dadosPressao.getPressaoSistolica()) + ";"
						  + String.valueOf(dadosPressao.getPressaoDiastolica()) + ";" + dadosPressao.getEmEstresse() + "\n";
			}

			jTable_Pressao.setModel(tableModel);

		} else {

			tableModel = new DefaultTableModel(tableColumns, 0);
			jTable_Pressao.setModel(tableModel);

		}
		try {
			FileWriter Writer = new FileWriter(this.caminho);
			Writer.write(DadosTXT);
			Writer.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu algum erro.");
		}

	}

	private void limparCampos() {

		txtData.setText("");
		txtHora.setText("");
		txtPressaoSistolica.setText("");
		txtPressaoDiastolica.setText("");

		if (jcbEstresse.isSelected()) {

			jcbEstresse.setSelected(false);

		}

	}

}
