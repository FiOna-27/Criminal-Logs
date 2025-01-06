/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.controller.Algorithm;

import com.criminals.model.criminalmodel;
import java.util.List;

/**
 *
 * @author user
 */
public class Search {
    public criminalmodel searchByName(String searchValue, List<criminalmodel> studentList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(studentList.get(mid).getName()) == 0) {
            return studentList.get(mid);
        } else if (searchValue.compareToIgnoreCase(studentList.get(mid).getName()) < 0) {
            return searchByName(searchValue, studentList, left, mid - 1);
        } else {
            return searchByName(searchValue, studentList, mid + 1, right);
        }

    }

    
}
