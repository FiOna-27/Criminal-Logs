/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.controller.Algorithm;

import com.criminals.model.CriminalModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shuva Nath Shrestha 23048621
 */
public class MergeSort {

    public List<CriminalModel> sortByName(List<CriminalModel> unsortedData, boolean isDesc) {
        // Create a new list to avoid modifying the original
        List<CriminalModel> dataToSort = new ArrayList<>(unsortedData);

        // Base case: if list size is 1 or less, it's already sorted
        if (dataToSort.size() <= 1) {
            return dataToSort;
        }

        // Find the middle point
        int middle = dataToSort.size() / 2;

        // Create left and right sublists
        List<CriminalModel> left = new ArrayList<>(dataToSort.subList(0, middle));
        List<CriminalModel> right = new ArrayList<>(dataToSort.subList(middle, dataToSort.size()));

        // Recursively sort the left and right halves
        left = sortByName(left, isDesc);
        right = sortByName(right, isDesc);

        // Merge the sorted halves
        return merge(left, right, isDesc);
    }

    private List<CriminalModel> merge(List<CriminalModel> left, List<CriminalModel> right, boolean isDesc) {
        List<CriminalModel> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        // Compare and merge the two lists
        while (leftIndex < left.size() && rightIndex < right.size()) {
            int comparison = left.get(leftIndex).getName()
                    .compareToIgnoreCase(right.get(rightIndex).getName());

            if (isDesc) {
                // For descending order, reverse the comparison
                if (comparison > 0) {
                    result.add(left.get(leftIndex));
                    leftIndex++;
                } else {
                    result.add(right.get(rightIndex));
                    rightIndex++;
                }
            } else {
                // For ascending order
                if (comparison < 0) {
                    result.add(left.get(leftIndex));
                    leftIndex++;
                } else {
                    result.add(right.get(rightIndex));
                    rightIndex++;
                }
            }
        }

        // Add remaining elements from left list, if any
        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex));
            leftIndex++;
        }

        // Add remaining elements from right list, if any
        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex));
            rightIndex++;
        }

        return result;
    }

}
