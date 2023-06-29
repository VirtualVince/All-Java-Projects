// Vincente Sequeira, 6/11/2023, 
// an Employee Records program that incorporates idNumber  the following properties: idNumber; firstName; lastName; annualSalary; startDate.
package u2a6.employee.records;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Employee {

    private int idNumber;
    private String firstName;
    private String lastName;
    private double annualSalary;
    private LocalDate startDate;

    public Employee(int idNumber, String firstName, String lastName, double annualSalary, LocalDate startDate) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.startDate = startDate;
    }

    // Getters and setters
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // toString method for displaying employee data
    @Override
    public String toString() {
        return "ID: " + idNumber
                + ", Name: " + firstName + " " + lastName
                + ", Salary: $" + annualSalary
                + ", Start Date: " + startDate;
    }
}

class GUIcomponents extends javax.swing.JFrame {

    private List<Employee> employeeList = new ArrayList<>(); // ArrayList to store employee data

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
        exitButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        idnumLabel = new javax.swing.JLabel();
        idnumInput = new javax.swing.JTextField();
        annsalInput = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        annsalLabel = new javax.swing.JLabel();
        startdateLabel = new javax.swing.JLabel();
        startdateInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Impact", 2, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(51, 0, 0));
        titleLabel.setText("Employee Records");
        titleLabel.setToolTipText("");

        firstnameLabel.setText("First Name: ");

        lastnameLabel.setText("Last Name: ");

        firstnameInput.setToolTipText("");

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
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

        idnumLabel.setText("ID #");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        annsalLabel.setText("Annual Salary:");

        startdateLabel.setText("Start Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idnumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idnumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(startdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(startdateInput))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lastnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(annsalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(annsalInput)
                                                    .addComponent(lastnameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(listButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameLabel)
                            .addComponent(firstnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastnameLabel)
                            .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(annsalInput)
                            .addComponent(annsalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdateLabel)
                    .addComponent(startdateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnumLabel)
                    .addComponent(idnumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        firstnameInput.setText(""); // Clear previous text
        lastnameInput.setText(""); // Clear previous text
        idnumInput.setText(""); // Clear previous text
        startdateInput.setText(""); // Clear previous text
        annsalInput.setText(""); // Clear previous text
        outputArea.setText(""); // Clear previous text
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); // Exit the application        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        outputArea.setText(""); // Clear previous text

        if (employeeList.isEmpty()) {
            outputArea.append("No employee records found.\n");
        } else {
            for (Employee employee : employeeList) {
                outputArea.append(employee.toString() + "\n");
            }
        }
    }//GEN-LAST:event_listButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String firstName = firstnameInput.getText().trim();
        String lastName = lastnameInput.getText().trim();
        String idNumberStr = idnumInput.getText().trim();
        String salaryStr = annsalInput.getText().trim();
        String startDateStr = startdateInput.getText().trim();

        // Check if all fields are filled
        if (firstName.isEmpty() || lastName.isEmpty() || idNumberStr.isEmpty()
                || salaryStr.isEmpty() || startDateStr.isEmpty()) {
            outputArea.setText("Please fill all fields.\n");
            return;
        }

        // Validate firstName input values
        if (firstName.matches(".*\\d.*")) {
            outputArea.setText("Invalid input format: First name cannot contain numbers.\n");
            return;
        }

        // Validate lastName input values
        if (lastName.matches(".*\\d.*")) {
            outputArea.setText("Invalid input format: Last name cannot contain numbers.\n");
            return;
        }

        int idNumber;
        double salary;
        LocalDate startDate;
        try {
            idNumber = Integer.parseInt(idNumberStr);
            salary = Double.parseDouble(salaryStr);
            startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid input format.\n");
            return;
        } catch (DateTimeParseException e) {
            outputArea.setText("Invalid date format. Please enter a date in the format yyyy-MM-dd.\n");
            return;
        }

        Employee employee = new Employee(idNumber, firstName, lastName, salary, startDate);
        employeeList.add(employee);
        outputArea.setText("Employee added successfully.\n");

        // Clear input fields
        firstnameInput.setText("");
        lastnameInput.setText("");
        idnumInput.setText("");
        annsalInput.setText("");
        startdateInput.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String idNumberStr = idnumInput.getText().trim();

        // Check if ID field is filled
        if (idNumberStr.isEmpty()) {
            outputArea.setText("Please enter an ID number.\n");
            return;
        }

        int idNumber;
        try {
            idNumber = Integer.parseInt(idNumberStr);
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid ID format.\n");
            return;
        }

        boolean removed = false;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.getIdNumber() == idNumber) {
                employeeList.remove(i);
                outputArea.setText("Employee removed successfully.\n");
                removed = true;
                break;
            }
        }

        if (!removed) {
            outputArea.setText("Employee not found.\n");
        }

        // Clear ID field
        idnumInput.setText("");

    }//GEN-LAST:event_removeButtonActionPerformed

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
    private javax.swing.JTextField annsalInput;
    private javax.swing.JLabel annsalLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstnameInput;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField idnumInput;
    private javax.swing.JLabel idnumLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JButton listButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField startdateInput;
    private javax.swing.JLabel startdateLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
