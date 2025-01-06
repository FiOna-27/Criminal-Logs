/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.controller.Algorithm;

import com.criminals.model.MostWantedmodel;
import com.criminals.model.criminalmodel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class SelectionSort {
    public List<criminalmodel> sortByCriminalId(List<criminalmodel> unsortedData, boolean isDesc) {
        
        List<criminalmodel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getId() > dataToSort.get(minIndex).getId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getId() < dataToSort.get(minIndex).getId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            criminalmodel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }
    public List<MostWantedmodel> sortByWantedId(List<MostWantedmodel> unsortedData, boolean isDesc) {
        
        List<MostWantedmodel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getId() > dataToSort.get(minIndex).getId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getId() < dataToSort.get(minIndex).getId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            MostWantedmodel tempCriminal = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempCriminal);
        }
        return dataToSort;
    }
    
    public List<MostWantedmodel> sortByBounty(List<MostWantedmodel> unsortedData, boolean isAsc) {
        
        List<MostWantedmodel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isAsc) {
                    if (dataToSort.get(j).getBounty() < dataToSort.get(minIndex).getBounty()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getBounty() > dataToSort.get(minIndex).getBounty()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            MostWantedmodel tempCriminal = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempCriminal);
        }
        return dataToSort;
    }
}
