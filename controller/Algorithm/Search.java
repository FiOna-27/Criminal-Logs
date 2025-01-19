/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.controller.Algorithm;

import com.criminals.model.CriminalModel;
import java.util.List;

/**
 *
 * @author user
 */
public class Search {
    public CriminalModel searchByName(String searchValue, List<CriminalModel> CriminalList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(CriminalList.get(mid).getName()) == 0) {
            return CriminalList.get(mid);
        } else if (searchValue.compareToIgnoreCase(CriminalList.get(mid).getName()) < 0) {
            return searchByName(searchValue, CriminalList, left, mid - 1);
        } else {
            return searchByName(searchValue, CriminalList, mid + 1, right);
        }

    }

    
}
