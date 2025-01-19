/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.controller.Algorithm;

import com.criminals.model.MostWantedModel;
import com.criminals.model.CriminalModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shuva Nath Shrestha 23048621
 */
public class SelectionSort {

    public List<CriminalModel> sortByCriminalId(List<CriminalModel> unsortedData, boolean isDesc) {

        List<CriminalModel> dataToSort = new ArrayList();
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
            CriminalModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }

    public List<MostWantedModel> sortByWantedId(List<MostWantedModel> unsortedData, boolean isDesc) {

        List<MostWantedModel> dataToSort = new ArrayList();
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
            MostWantedModel tempCriminal = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempCriminal);
        }
        return dataToSort;
    }

    public List<MostWantedModel> sortByBounty(List<MostWantedModel> unsortedData, boolean isAsc) {

        List<MostWantedModel> dataToSort = new ArrayList();
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
            MostWantedModel tempCriminal = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempCriminal);
        }
        return dataToSort;
    }
}
