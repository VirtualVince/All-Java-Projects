// Vincente Sequeira, 6/5/2023, 
// an Airline Points application that allows an airline to record airline points data for its passengers 
// and to determine if a passenger qualifies for bonus points.
package u2a7.airline.points;

import java.util.ArrayList;
import java.util.List;

class GUIcomponents extends javax.swing.JFrame {

    class Passenger {

        private String firstName;
        private String lastName;
        private int week1Points;
        private int week2Points;
        private int week3Points;
        private int week4Points;

        public Passenger(String firstName, String lastName, int week1Points, int week2Points, int week3Points, int week4Points) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.week1Points = week1Points;
            this.week2Points = week2Points;
            this.week3Points = week3Points;
            this.week4Points = week4Points;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getWeek1Points() {
            return week1Points;
        }

        public int getWeek2Points() {
            return week2Points;
        }

        public int getWeek3Points() {
            return week3Points;
        }

        public int getWeek4Points() {
            return week4Points;
        }

        public int getTotalPoints() {
            return week1Points + week2Points + week3Points + week4Points;
        }

        public boolean qualifiesForBonusPoints() {
            return getTotalPoints() > 5000;
        }

        @Override
        public String toString() {
            return "Name: " + firstName + " " + lastName + ", Total Points: " + getTotalPoints();
        }

    }

    private List<Passenger> passengers;

    public GUIcomponents() {
        initComponents();
        passengers = new ArrayList<>();
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
        RemoveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        week1Label = new javax.swing.JLabel();
        week2Label = new javax.swing.JLabel();
        week3Label = new javax.swing.JLabel();
        week2Input = new javax.swing.JTextField();
        week1Input = new javax.swing.JTextField();
        week3Input = new javax.swing.JTextField();
        week4Input = new javax.swing.JTextField();
        test4Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Impact", 2, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 255));
        titleLabel.setText("Point Tracker");
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

        RemoveButton.setText("Remove");
        RemoveButton.setActionCommand("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
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

        week1Label.setText("Week 1");

        week2Label.setText("Week 2");

        week3Label.setText("Week 3");

        test4Label.setText("Week 4");

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
                                .addComponent(week4Input))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(week3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(week3Input))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(week1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(week1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(week2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(week2Input)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                    .addComponent(week1Label)
                    .addComponent(week1Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(week2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(week2Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(week3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(week3Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(test4Label, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(week4Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(RemoveButton)
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
        week1Input.setText(""); // Clear previous text
        week2Input.setText(""); // Clear previous text
        week3Input.setText(""); // Clear previous text
        week4Input.setText(""); // Clear previous text
        outputArea.setText(""); // Clear previous text
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); // Exit the application        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        if (passengers.isEmpty()) {
            outputArea.setText("Passenger list is empty!");
        } else {
            StringBuilder output = new StringBuilder();
            for (Passenger passenger : passengers) {
                output.append(passenger.toString()).append("\n");
            }
            outputArea.setText(output.toString());
        }
    }//GEN-LAST:event_listButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        String firstName = firstnameInput.getText();
        String lastName = lastnameInput.getText();
        Passenger passengerToRemove = null;
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        for (Passenger passenger : passengers) {
            if (passenger.getFirstName().equals(firstName) && passenger.getLastName().equals(lastName)) {
                passengerToRemove = passenger;
                break;
            }
        }

        if (passengerToRemove != null) {
            passengers.remove(passengerToRemove);
            outputArea.setText("Passenger removed successfully!");
        } else {
            outputArea.setText("Passenger not found in the list!");
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String firstName = firstnameInput.getText();
        String lastName = lastnameInput.getText();
        int week1Points = 0;
        int week2Points = 0;
        int week3Points = 0;
        int week4Points = 0;
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        try {
            week1Points = Integer.parseInt(week1Input.getText());
            week2Points = Integer.parseInt(week2Input.getText());
            week3Points = Integer.parseInt(week3Input.getText());
            week4Points = Integer.parseInt(week4Input.getText());
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid input. Please enter letters and numbers in the correct field and that all fields have an input");
            return; // Exit the method to prevent adding invalid data
        }

        Passenger passenger = new Passenger(firstName, lastName, week1Points, week2Points, week3Points, week4Points);
        passengers.add(passenger);

        outputArea.setText("Passenger added successfully!");
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
            java.util.logging.Logger.getLogger(GUIcomponents.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel test4Label;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField week1Input;
    private javax.swing.JLabel week1Label;
    private javax.swing.JTextField week2Input;
    private javax.swing.JLabel week2Label;
    private javax.swing.JTextField week3Input;
    private javax.swing.JLabel week3Label;
    private javax.swing.JTextField week4Input;
    // End of variables declaration//GEN-END:variables
}
