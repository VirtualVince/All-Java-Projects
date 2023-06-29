// Vincente Sequeira, 6/5/2023, 
// a student grades application that simulates a grade book for a class with 15 students who each have four test scores.
package u2a4.student.grades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class GUIcomponents extends javax.swing.JFrame {

    // Define a two-dimensional array to store student data
    private String[][] studentData = new String[15][6]; // Assuming each student has 6 attributes: First Name, Last Name, Test1, Test2, Test3, Test4
    private int currentStudentIndex = 0; // Keep track of the current student index

    public GUIcomponents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        firstnameInput = new javax.swing.JTextField();
        lastnameInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        clearButton = new javax.swing.JButton();
        stdavgButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        couravgButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        test1Label = new javax.swing.JLabel();
        test2Label = new javax.swing.JLabel();
        test3Label = new javax.swing.JLabel();
        test2Input = new javax.swing.JTextField();
        test1Input = new javax.swing.JTextField();
        test3Input = new javax.swing.JTextField();
        test4Input = new javax.swing.JTextField();
        test4Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Impact", 2, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 255));
        titleLabel.setText("Student Grades");
        titleLabel.setToolTipText("");

        firstnameLabel.setText("First Name: ");

        lastnameLabel.setText("Last Name: ");

        firstnameInput.setToolTipText("");

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        stdavgButton.setText("Student Average");
        stdavgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdavgButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        couravgButton.setText("Course Average");
        couravgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couravgButtonActionPerformed(evt);
            }
        });

        listButton.setText("List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        test1Label.setText("Test 1");

        test2Label.setText("Test 2");

        test3Label.setText("Test 3");

        test4Label.setText("Test 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(test4Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(test4Input))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(test3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(test3Input))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(test1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(test1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(test2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(test2Input)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stdavgButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(couravgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel)
                    .addComponent(lastnameLabel)
                    .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(test1Label)
                    .addComponent(test1Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(test2Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(test3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(test3Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(test4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(test4Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(stdavgButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(couravgButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        firstnameInput.setText(""); // Clear previous text
        lastnameInput.setText(""); // Clear previous text
        test1Input.setText(""); // Clear previous text
        test2Input.setText(""); // Clear previous text
        test3Input.setText(""); // Clear previous text
        test4Input.setText(""); // Clear previous text
        outputArea.setText(""); // Clear previous text
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); // Exit the application        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        // Display all the student data stored in the array
        for (int i = 0; i < currentStudentIndex; i++) {
            outputArea.append("Student " + (i + 1) + ":\n");
            outputArea.append("First Name: " + studentData[i][0] + "\n");
            outputArea.append("Last Name: " + studentData[i][1] + "\n");
            outputArea.append("Test 1: " + studentData[i][2] + "\n");
            outputArea.append("Test 2: " + studentData[i][3] + "\n");
            outputArea.append("Test 3: " + studentData[i][4] + "\n");
            outputArea.append("Test 4: " + studentData[i][5] + "\n\n");
        }
    }//GEN-LAST:event_listButtonActionPerformed

    private void couravgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couravgButtonActionPerformed
        double total = 0.0;
        int count = 0;

        // Calculate the course average by summing up all the test scores
        for (int i = 0; i < currentStudentIndex; i++) {
            total += Double.parseDouble(studentData[i][2]);
            total += Double.parseDouble(studentData[i][3]);
            total += Double.parseDouble(studentData[i][4]);
            total += Double.parseDouble(studentData[i][5]);
            count += 4;
        }

        // Calculate and display the course average
        double average = total / count;
        outputArea.append("Course Average: " + average + "\n");
    }//GEN-LAST:event_couravgButtonActionPerformed

    private void stdavgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdavgButtonActionPerformed
        String firstName = firstnameInput.getText();
        String lastName = lastnameInput.getText();
        double total = 0.0;
        int count = 0;

        try {
            // Find the student in the array using first name and last name
            for (int i = 0; i < currentStudentIndex; i++) {
                if (studentData[i][0].equalsIgnoreCase(firstName) && studentData[i][1].equalsIgnoreCase(lastName)) {
                    // Calculate the average of the student's test scores
                    total = Double.parseDouble(studentData[i][2]) + Double.parseDouble(studentData[i][3])
                            + Double.parseDouble(studentData[i][4]) + Double.parseDouble(studentData[i][5]);
                    count = 4;
                    double average = total / count;

                    // Display the student's average
                    outputArea.append("Average for " + firstName + " " + lastName + ": " + average + "\n");
                    return; // Exit the method once the student is found and average is displayed
                }
            }

            // If the student is not found, display an error message
            outputArea.append("Student not found: " + firstName + " " + lastName + "\n");
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException if the test scores cannot be parsed as doubles
            outputArea.append("Invalid test scores for " + firstName + " " + lastName + "\n");
        }
    }//GEN-LAST:event_stdavgButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // Get input values
        String firstName = firstnameInput.getText();
        String lastName = lastnameInput.getText();
        String test1 = test1Input.getText();
        String test2 = test2Input.getText();
        String test3 = test3Input.getText();
        String test4 = test4Input.getText();

        // Add the student data to the array
        studentData[currentStudentIndex][0] = firstName;
        studentData[currentStudentIndex][1] = lastName;
        studentData[currentStudentIndex][2] = test1;
        studentData[currentStudentIndex][3] = test2;
        studentData[currentStudentIndex][4] = test3;
        studentData[currentStudentIndex][5] = test4;

        // Increment the current student index
        currentStudentIndex++;

        // Clear the input fields
        firstnameInput.setText("");
        lastnameInput.setText("");
        test1Input.setText("");
        test2Input.setText("");
        test3Input.setText("");
        test4Input.setText("");

        outputArea.append("Student added: " + firstName + " " + lastName + "\n");
    }//GEN-LAST:event_addButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton couravgButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton stdavgButton;
    private javax.swing.JTextField test1Input;
    private javax.swing.JLabel test1Label;
    private javax.swing.JTextField test2Input;
    private javax.swing.JLabel test2Label;
    private javax.swing.JTextField test3Input;
    private javax.swing.JLabel test3Label;
    private javax.swing.JTextField test4Input;
    private javax.swing.JLabel test4Label;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
