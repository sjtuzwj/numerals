/*
 * Copyright (C) 2011 Vit <vitalker@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sample;

import com.programmisty.numerals.Numerals;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * Author: Vitaly Ligay <vitaly.ligay@gmail.com>
 */
public class GUISample extends javax.swing.JFrame {

    /** Creates new form Demo */
    public GUISample() {
        initComponents();
        numberField.setDocument(createDigitNumberDocument());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordNumber = new javax.swing.JTextArea();
        langComboBox = new javax.swing.JComboBox();
        digitTypeComboBox = new javax.swing.JComboBox();
        showButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number into words");

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        wordNumber.setColumns(20);
        wordNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        wordNumber.setLineWrap(true);
        wordNumber.setRows(5);
        wordNumber.setWrapStyleWord(true);
        jScrollPane1.setViewportView(wordNumber);

        langComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Russian" }));

        digitTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amount", "Integer" }));
        digitTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitTypeComboBoxActionPerformed(evt);
            }
        });

        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("<html>Simple convert number into words.</html>");

        jLabel2.setText("Number:");

        jLabel3.setText("Result:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(langComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(digitTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(langComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        convert();
    }//GEN-LAST:event_showButtonActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        convert();
    }//GEN-LAST:event_numberFieldActionPerformed

    private void digitTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitTypeComboBoxActionPerformed
    }//GEN-LAST:event_digitTypeComboBoxActionPerformed

    private void check() {
        String type = this.digitTypeComboBox.getSelectedItem().toString();
        if (type.equalsIgnoreCase("Integer")) {
            String text = numberField.getText();
            if (text.contains(".")) {
                String correctedText = text.substring(0, text.indexOf('.'));
                JOptionPane.showMessageDialog(this, "Only integer numbers. <br/>"
                        + "Conver '" + text + "' to '"
                        + correctedText + "'");
                numberField.setText(correctedText);
            }
        }
    }

    private void convert() {
        check();
        
        String text = numberField.getText();

        String lang = this.langComboBox.getSelectedItem().toString();
        String type = this.digitTypeComboBox.getSelectedItem().toString();
        String result = "";
        if (lang.equalsIgnoreCase("english")) {
            if (type.equalsIgnoreCase("Amount")) {
                BigDecimal bd = new BigDecimal(text);
                result = Numerals.amount(bd);
            } else if (type.equalsIgnoreCase("Integer")) {
                BigInteger bd = new BigInteger(text);
                result = Numerals.english(bd);
            } else {
                System.err.println("unsupported type:" + type);
            }
        } else if (lang.equalsIgnoreCase("russian")) {
            if (type.equalsIgnoreCase("Amount")) {
                BigDecimal bd = new BigDecimal(text);
                result = Numerals.russianRubles(bd);
            } else if (type.equalsIgnoreCase("Integer")) {
                BigInteger bd = new BigInteger(text);
                result = Numerals.russian(bd);
            } else {
                System.err.println("unsupported type:" + type);
            }
        } else {
            System.err.println("unsupported language:" + lang);
        }

        this.wordNumber.setText(result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISample().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox digitTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox langComboBox;
    private javax.swing.JTextField numberField;
    private javax.swing.JButton showButton;
    private javax.swing.JTextArea wordNumber;
    // End of variables declaration//GEN-END:variables

    private PlainDocument createDigitNumberDocument() {
        return new DigitNumberDocument();
    }
}

class DigitNumberDocument extends PlainDocument {

    public static final String CHARS = "01234569789.";

    public DigitNumberDocument() {
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!CHARS.contains(String.valueOf(str.charAt(i)))) {
                return;
            }
        }

        super.insertString(offset, str, attr);
    }
}
