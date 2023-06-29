// Vincente Sequeira, 6/1/2023, 
// The purpose of the application you're working on is to provide a user interface for searching and retrieving information about books based on their reference numbers.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

class Book {

    private int referenceNumber;
    private String title;

    public Book(int referenceNumber, String title) {
        this.referenceNumber = referenceNumber;
        this.title = title;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public String getTitle() {
        return title;
    }
}

public class GUIcomponents extends javax.swing.JFrame {

    private static Map<Integer, String> bookMap;

    public GUIcomponents() {
        initComponents();
        loadBookData();
        // Set the text fields as non-editable
        linsearchoutput.setEditable(false);
        binsearchoutput.setEditable(false);

    }

    private void loadBookData() {
        bookMap = new HashMap<>();
        bookMap.put(1, "The Adventures of Tom Sawyer");
        bookMap.put(2, "Huckleberry Finn");
        bookMap.put(4, "The Sword in the Stone");
        bookMap.put(6, "Stuart Little");
        bookMap.put(10, "Treasure Island");
        bookMap.put(12, "The Secret Garden");
        bookMap.put(14, "Alice's Adventures in Wonderland");
        bookMap.put(20, "Twenty Thousand Leagues Under the Sea");
        bookMap.put(24, "Peter Pan");
        bookMap.put(26, "Charlotte's Web");
        bookMap.put(31, "A Little Princess");
        bookMap.put(32, "Little Women");
        bookMap.put(33, "Black Beauty");
        bookMap.put(35, "The Merry Adventures of Robin Hood");
        bookMap.put(40, "Robinson Crusoe");
        bookMap.put(46, "Anne of Green Gables");
        bookMap.put(50, "Little House in the Big Woods");
        bookMap.put(52, "Swiss Family Robinson");
        bookMap.put(54, "The Lion, the Witch and the Wardrobe");
        bookMap.put(56, "Heidi");
        bookMap.put(66, "A Wrinkle in Time");
        bookMap.put(100, "Mary Poppins");
    }

    private String linearSearch(int referenceNumber) {
        String title = bookMap.get(referenceNumber);
        return title != null ? title : "Book not found";
    }

    private String binarySearch(int referenceNumber) {
        if (bookMap.containsKey(referenceNumber)) {
            return bookMap.get(referenceNumber);
        } else {
            return "Book not found";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelbl = new javax.swing.JLabel();
        linsearchLabel = new javax.swing.JLabel();
        binsearchLabel = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        lostbooklistButton = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        linsearchoutput = new javax.swing.JTextField();
        binsearchoutput = new javax.swing.JTextField();
        refnumInput = new javax.swing.JTextField();
        refnumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelbl.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorTab.attentionBackground"));
        titlelbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 18)); // NOI18N
        titlelbl.setForeground(new java.awt.Color(255, 0, 0));
        titlelbl.setText("Children's Classics");
        titlelbl.setToolTipText("");
        titlelbl.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        titlelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        titlelbl.setFocusTraversalPolicyProvider(true);

        linsearchLabel.setText("Linear Search: ");

        binsearchLabel.setText("Binary Search: ");

        findButton.setText("Find ");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        lostbooklistButton.setText("Reference List");
        lostbooklistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostbooklistButtonActionPerformed(evt);
            }
        });

        exitbtn.setText("End");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        refnumInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refnumInputActionPerformed(evt);
            }
        });

        refnumLabel.setText("ENTER THE REFERENCE #");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titlelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(binsearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(linsearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(binsearchoutput)
                                    .addComponent(linsearchoutput)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(refnumInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lostbooklistButton)))
                                    .addComponent(refnumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 100, Short.MAX_VALUE)))
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(refnumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refnumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lostbooklistButton)
                    .addComponent(clearbtn)
                    .addComponent(findButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linsearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linsearchoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binsearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binsearchoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        try {
            int referenceNumber = Integer.parseInt(refnumInput.getText());

            String bookTitle = linearSearch(referenceNumber);
            if (bookTitle != null) {
                linsearchoutput.setText(bookTitle);
            } else {
                linsearchoutput.setText("Book not found");
            }

            bookTitle = binarySearch(referenceNumber);
            if (bookTitle != null) {
                binsearchoutput.setText(bookTitle);
            } else {
                binsearchoutput.setText("Book not found");
            }
        } catch (NumberFormatException ex) {
            // Handle the exception when parsing the reference number
            linsearchoutput.setText("Invalid reference number");
            binsearchoutput.setText("Invalid reference number");
        } catch (Exception ex) {
            // Handle any other exception that might occur during the search
            linsearchoutput.setText("An error occurred during the search");
            binsearchoutput.setText("An error occurred during the search");
        }

    }//GEN-LAST:event_findButtonActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0); // Exit the application
    }//GEN-LAST:event_exitbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        linsearchoutput.setText(""); // Clear previous output area text
        binsearchoutput.setText(""); // Clear previous output area text
        refnumInput.setText(""); // Clear previous input area text
    }//GEN-LAST:event_clearbtnActionPerformed

    private void refnumInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refnumInputActionPerformed
        JTextField referenceNumber = refnumInput;
    }//GEN-LAST:event_refnumInputActionPerformed

    private void lostbooklistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostbooklistButtonActionPerformed
        StringBuilder bookList = new StringBuilder();
        for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
            bookList.append(entry.getKey()).append("\n");
            bookList.append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, bookList.toString(), "Reference List", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_lostbooklistButtonActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIcomponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel binsearchLabel;
    private javax.swing.JTextField binsearchoutput;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel linsearchLabel;
    private javax.swing.JTextField linsearchoutput;
    private javax.swing.JButton lostbooklistButton;
    private javax.swing.JTextField refnumInput;
    private javax.swing.JLabel refnumLabel;
    private javax.swing.JLabel titlelbl;
    // End of variables declaration//GEN-END:variables
}
