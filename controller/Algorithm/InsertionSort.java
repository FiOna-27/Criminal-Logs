/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.controller.Algorithm;

import com.criminals.model.MostWantedModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shuva Nath Shrestha 23048621
 */
public class InsertionSort {

    public List<MostWantedModel> sortByName(List<MostWantedModel> unsortedData, boolean isDesc) {
        // Create a copy of the original list to avoid modifying it directly
        List<MostWantedModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        // Start from index 1 since a single element is always sorted
        for (int i = 1; i < dataToSort.size(); i++) {
            // Store the current element to be inserted
            MostWantedModel currentCriminal = dataToSort.get(i);
            // Start comparing with the previous element
            int j = i - 1;

            // For descending order
            if (isDesc) {
                // Keep moving elements forward while they are smaller than current element
                while (j >= 0 && dataToSort.get(j).getName()
                        .compareToIgnoreCase(currentCriminal.getName()) < 0) {
                    // Shift element one position ahead
                    dataToSort.set(j + 1, dataToSort.get(j));
                    j--;
                }
            } // For ascending order
            else {
                // Keep moving elements forward while they are larger than current element
                while (j >= 0 && dataToSort.get(j).getName()
                        .compareToIgnoreCase(currentCriminal.getName()) > 0) {
                    // Shift element one position ahead
                    dataToSort.set(j + 1, dataToSort.get(j));
                    j--;
                }
            }

            // Place the current element in its correct sorted position
            dataToSort.set(j + 1, currentCriminal);
        }

        return dataToSort;
    }

}
