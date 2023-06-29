package com.mycompany.sumelements;

/**
 *
 * @author c0d3x
 */
public class ArrayManipulation {
    // Initialize an empty array to store the integers
    int[] array = new int[0];
    
    // Rest of the code goes here
    // ...
}
// Initialize an empty array to store the integers
int[] array = new int[0];

// Display a menu with options
while (true) {
    displayMenu();
    int choice = readChoice();

    if (choice == 1) {
        // Add an element to the array
        int value = readValue();
        addElement(array, value);
    } else if (choice == 2) {
        // Remove an element from the array
        int value = readValue();
        if (removeElement(array, value)) {
            displayMessage("Element removed successfully.");
        } else {
            displayMessage("Element not found in the array.");
        }
    } else if (choice == 3) {
        // List all elements in the array and compute their sum
        displayArray(array);
        int sum = sumArray(array);
        displayMessage("Sum of all elements: " + sum);
    } else if (choice == 4) {
        // List even elements in the array and compute their sum
        int[] evenElements = getEvenElements(array);
        displayArray(evenElements);
        int sum = sumArray(evenElements);
        displayMessage("Sum of even elements: " + sum);
    } else if (choice == 5) {
        // List odd elements in the array and compute their sum
        int[] oddElements = getOddElements(array);
        displayArray(oddElements);
        int sum = sumArray(oddElements);
        displayMessage("Sum of odd elements: " + sum);
    } else if (choice == 6) {
        // Exit the program
        break;
    } else {
        // Invalid choice
        displayMessage("Invalid choice. Please try again.");
    }
}

// Function to add an element to the array
void addElement(int[] array, int value) {
    // Create a new array with one additional element
    int[] newArray = new int[array.length + 1];

    // Copy the elements from the old array to the new array
    for (int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
    }

    // Add the new element to the end of the new array
    newArray[newArray.length - 1] = value;

    // Replace the old array