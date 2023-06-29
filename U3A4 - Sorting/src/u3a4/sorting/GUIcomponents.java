// Vincente Sequeira
// 6/12/2023
// A program that will display a list of random numbers and sort them
package u3a4.sorting;

import java.awt.Color;
import java.util.Arrays;
import java.util.Random;

public class GUIcomponents extends javax.swing.JFrame {

    private int[] numbers;
    private int[] originNumbers;
    private int[] sortedNumbers;

    public GUIcomponents() {
        initComponents();
        setBackground(Color.red);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelbl = new javax.swing.JLabel();
        listnumLabel = new javax.swing.JLabel();
        sortordLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        tenRadioButton = new javax.swing.JRadioButton();
        hundredRadioButton = new javax.swing.JRadioButton();
        thousandRadioButton = new javax.swing.JRadioButton();
        fivethouRadioButton = new javax.swing.JRadioButton();
        asendRadioButton = new javax.swing.JRadioButton();
        desendRadioButton = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortmethodArea = new javax.swing.JTextArea();
        unsortLabel = new javax.swing.JLabel();
        sortedorderLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        originnumArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        sortednumArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelbl.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorTab.attentionBackground"));
        titlelbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 18)); // NOI18N
        titlelbl.setText("Sorting Algorithm ");
        titlelbl.setToolTipText("");
        titlelbl.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        titlelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        titlelbl.setFocusTraversalPolicyProvider(true);

        listnumLabel.setText("Amount of Numbers in the list");

        sortordLabel.setText("Sort Order");

        startButton.setText("Sort");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        tenRadioButton.setText("10");

        hundredRadioButton.setText("100");

        thousandRadioButton.setText("1000");

        fivethouRadioButton.setText("5000");

        asendRadioButton.setText("Ascending");

        desendRadioButton.setText("Descending");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        sortmethodArea.setEditable(false);
        sortmethodArea.setColumns(20);
        sortmethodArea.setRows(5);
        jScrollPane1.setViewportView(sortmethodArea);

        unsortLabel.setText("Unsorted Order");

        sortedorderLabel.setText("Sorted Order");

        outputLabel.setText("Output");

        originnumArea.setEditable(false);
        originnumArea.setColumns(20);
        originnumArea.setRows(5);
        jScrollPane2.setViewportView(originnumArea);

        sortednumArea.setEditable(false);
        sortednumArea.setColumns(20);
        sortednumArea.setRows(5);
        jScrollPane3.setViewportView(sortednumArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titlelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(349, 349, 349))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listnumLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tenRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hundredRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sortordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(asendRadioButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(thousandRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fivethouRadioButton)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desendRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sortedorderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(unsortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outputLabel)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listnumLabel)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hundredRadioButton)
                                .addComponent(tenRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(thousandRadioButton)
                                    .addComponent(fivethouRadioButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortordLabel)
                            .addComponent(asendRadioButton)
                            .addComponent(desendRadioButton))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unsortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortedorderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton)
                                .addGap(70, 70, 70))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        originNumbers = null;
        sortedNumbers = null;
        originnumArea.setText("");
        sortednumArea.setText("");
        sortmethodArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private int[] generateRandomNumbers(int count) {
        int[] randomNumbers = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(20001) - 10000;
        }

        return randomNumbers;
    }

    private int[] selectionSort(int[] array) {
        int n = array.length;
        int loopCount = 0;
        int comparisonCount = 0;
        int shiftCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                loopCount++;
                comparisonCount++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                shiftCount++;
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        return array;
    }

    private int[] bubbleSort(int[] array) {
        int n = array.length;
        int loopCount = 0;
        int comparisonCount = 0;
        int shiftCount = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                loopCount++;
                comparisonCount++;
                if (array[j] > array[j + 1]) {
                    shiftCount++;

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        return array;
    }

    private int[] insertionSort(int[] array) {
        int n = array.length;
        int loopCount = 0;
        int comparisonCount = 0;
        int shiftCount = 0;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            loopCount++;
            comparisonCount++;
            while (j >= 0 && array[j] > key) {
                comparisonCount++;
                shiftCount++;
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        return array;
    }

    private int getLoopExecutionCount(String sortMethodName, int numCount) {
        if (sortMethodName.equals("Selection Sort")) {
            return numCount - 1;
        } else if (sortMethodName.equals("Bubble Sort")) {
            return (numCount - 1) * (numCount - 1);
        }
        return 0;
    }

    private int getComparisonCount(String sortMethodName, int numCount) {
        if (sortMethodName.equals("Selection Sort")) {
            return (numCount - 1) * (numCount / 2);
        } else if (sortMethodName.equals("Bubble Sort")) {
            return (numCount - 1) * (numCount / 2);
        }
        return 0;
    }

    private int getValueShiftCount(String sortMethodName, int numCount) {
        if (sortMethodName.equals("Selection Sort")) {
            return numCount - 1;
        } else if (sortMethodName.equals("Bubble Sort")) {
            return (numCount - 1) * (numCount / 2);
        }
        return 0;
    }

    private String getSortMethodSummary(String sortMethodName, int numCount, int[] sortedArray, long executionTime) {
        StringBuilder summary = new StringBuilder();
        summary.append("Sort Method: ").append(sortMethodName).append("\n");
        summary.append("Number Count: ").append(numCount).append("\n");
        summary.append("Loop Executions: ").append(getLoopExecutionCount(sortMethodName, numCount)).append("\n");
        summary.append("Comparisons: ").append(getComparisonCount(sortMethodName, numCount)).append("\n");
        summary.append("Value Shifts: ").append(getValueShiftCount(sortMethodName, numCount)).append("\n");
        summary.append("Execution Time: ").append(executionTime).append(" milliseconds").append("\n");
        return summary.toString();
    }

    public String getFormattedArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append("\n"); // Add a newline character after each number
        }
        return sb.toString();
    }

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        int count = 10; // Number of random numbers to generate (change as needed)
        numbers = generateRandomNumbers(count);

        if (numbers != null) {
            int numCount = numbers.length;

            if (numCount > 0) {
                originNumbers = numbers.clone();
                originnumArea.setText(getFormattedArray(originNumbers));

                StringBuilder summary = new StringBuilder();

                if (asendRadioButton.isSelected()) {
                    long startTime = System.currentTimeMillis();
                    sortedNumbers = selectionSort(numbers.clone());
                    long endTime = System.currentTimeMillis();

                    summary.append(getSortMethodSummary("Selection Sort", numCount, sortedNumbers, endTime - startTime));
                }

                if (desendRadioButton.isSelected()) {
                    long startTime = System.currentTimeMillis();
                    sortedNumbers = bubbleSort(numbers.clone());
                    long endTime = System.currentTimeMillis();

                    summary.append(getSortMethodSummary("Bubble Sort", numCount, sortedNumbers, endTime - startTime));
                }

                long startTime = System.currentTimeMillis();
                sortedNumbers = insertionSort(numbers.clone());
                long endTime = System.currentTimeMillis();

                summary.append(getSortMethodSummary("Insertion Sort", numCount, sortedNumbers, endTime - startTime));

                sortmethodArea.setText(summary.toString());
                sortednumArea.setText(getFormattedArray(sortedNumbers));
            }
        }
    }//GEN-LAST:event_startButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIcomponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton asendRadioButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JRadioButton desendRadioButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton fivethouRadioButton;
    private javax.swing.JRadioButton hundredRadioButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel listnumLabel;
    private javax.swing.JTextArea originnumArea;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextArea sortednumArea;
    private javax.swing.JLabel sortedorderLabel;
    private javax.swing.JTextArea sortmethodArea;
    private javax.swing.JLabel sortordLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton tenRadioButton;
    private javax.swing.JRadioButton thousandRadioButton;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel unsortLabel;
    // End of variables declaration//GEN-END:variables
}
