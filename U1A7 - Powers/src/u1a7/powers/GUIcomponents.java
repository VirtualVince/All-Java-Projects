package u1a7.powers;

import javax.swing.JOptionPane;

public class GUIcomponents extends javax.swing.JFrame {

    /**
     * Creates new form GUIcomponents
     */
    public GUIcomponents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TItleLbl = new javax.swing.JLabel();
        EnterBaseLbl = new javax.swing.JLabel();
        EnterAnExpLbl = new javax.swing.JLabel();
        BaseNumTF = new javax.swing.JTextField();
        ExpNumTF = new javax.swing.JTextField();
        CalculatePowersBtn = new javax.swing.JButton();
        scrollpanel = new javax.swing.JScrollPane();
        outputtextarea = new javax.swing.JTextArea();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TItleLbl.setText("POWERS");
        TItleLbl.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TItleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        EnterBaseLbl.setText("Enter a Base:");

        EnterAnExpLbl.setText("Enter An Exponent: ");

        CalculatePowersBtn.setText("Calculate");
        CalculatePowersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculatePowersBtnActionPerformed(evt);
            }
        });

        outputtextarea.setColumns(20);
        outputtextarea.setRows(5);
        scrollpanel.setViewportView(outputtextarea);
        outputtextarea.setEditable(false);

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnterBaseLbl)
                            .addComponent(EnterAnExpLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BaseNumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(ExpNumTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CalculatePowersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(scrollpanel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TItleLbl)
                        .addGap(134, 134, 134)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TItleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterBaseLbl)
                    .addComponent(BaseNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalculatePowersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnterAnExpLbl)
                        .addComponent(ExpNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculatePowersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculatePowersBtnActionPerformed

        try {
            int base = Integer.parseInt(BaseNumTF.getText());
            int exponent = Integer.parseInt(ExpNumTF.getText());
            outputtextarea.setText(""); // Clear previous text

            // Calculate and display powers
            for (int i = 1; i <= exponent; i++) {
                int power = (int) Math.pow(base, i);
                outputtextarea.append(base + " to the power of " + i + " = " + power + "\n");
            }
            outputtextarea.setEditable(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CalculatePowersBtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0); // Exit the application
    }//GEN-LAST:event_exitbtnActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIcomponents().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BaseNumTF;
    private javax.swing.JButton CalculatePowersBtn;
    private javax.swing.JLabel EnterAnExpLbl;
    private javax.swing.JLabel EnterBaseLbl;
    private javax.swing.JTextField ExpNumTF;
    private javax.swing.JLabel TItleLbl;
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextArea outputtextarea;
    private javax.swing.JScrollPane scrollpanel;
    // End of variables declaration//GEN-END:variables
}
