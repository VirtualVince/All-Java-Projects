//  complete program that has the ability to store and display integer values in an array.
package u2a2.sum.elements;

import java.util.Arrays;

public class GUIcomponents extends javax.swing.JFrame {

int[] array = new int[10];

    public GUIcomponents() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        listvaluesButton = new javax.swing.JButton();
        evenvalueButton = new javax.swing.JButton();
        oddvaluesButton = new javax.swing.JButton();
        enternumLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        inputfield = new javax.swing.JTextField();
        sumallvaluesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        listvaluesButton.setText("List Entered Values");
        listvaluesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listvaluesButtonActionPerformed(evt);
            }
        });

        evenvalueButton.setText("Sum Even Values");
        evenvalueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evenvalueButtonActionPerformed(evt);
            }
        });

        oddvaluesButton.setText("Sum Odd Values");
        oddvaluesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oddvaluesButtonActionPerformed(evt);
            }
        });

        enternumLabel.setText("Enter A Number");

        titleLabel.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        titleLabel.setText("Sum Elements program");
        titleLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        sumallvaluesButton.setText("Sum All Values");
        sumallvaluesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumallvaluesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enternumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputfield))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listvaluesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(evenvalueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oddvaluesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(sumallvaluesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(exitButton)
                    .addComponent(enternumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton)
                            .addComponent(clearButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listvaluesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(evenvalueButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oddvaluesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sumallvaluesButton)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); // Exit the application        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
            Arrays.fill(array, 0);  // Clear previous text
    inputfield.setText("");  // Clear previous text
    outputArea.setText("Array has been cleared.");  // Clear previous text
    }//GEN-LAST:event_clearButtonActionPerformed

    private void listvaluesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listvaluesButtonActionPerformed
        outputArea.setText(Arrays.toString(array));
    }//GEN-LAST:event_listvaluesButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

    try {
        int num = Integer.parseInt(inputfield.getText());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = num;
                break;
            }
        }
        inputfield.setText("");
        outputArea.setText(num + " has been added to the array.");
    } catch (NumberFormatException e) {
        outputArea.setText("Invalid input. Please enter a number.");
    }
 
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
   try {
        int num = Integer.parseInt(inputfield.getText());
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                array[i] = 0;
                found = true;
            }
        }
        if (found) {
            inputfield.setText("");
            outputArea.setText(num + " has been removed from the array.");
        } else {
            outputArea.setText(num + " is not in the array.");
        }
    } catch (NumberFormatException e) {
        outputArea.setText("Invalid input. Please enter a number.");
    }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void evenvalueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evenvalueButtonActionPerformed
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        outputArea.setText("Sum of even values: " + sum);


    }//GEN-LAST:event_evenvalueButtonActionPerformed

    private void oddvaluesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddvaluesButtonActionPerformed
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        outputArea.setText("Sum of odd values: " + sum);
    }//GEN-LAST:event_oddvaluesButtonActionPerformed

    private void sumallvaluesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumallvaluesButtonActionPerformed
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        outputArea.setText("Sum of all values: " + sum);
    }//GEN-LAST:event_sumallvaluesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIcomponents().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel enternumLabel;
    private javax.swing.JButton evenvalueButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField inputfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listvaluesButton;
    private javax.swing.JButton oddvaluesButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton sumallvaluesButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
