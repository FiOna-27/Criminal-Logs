/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.criminals.model;

/**
 *
 * @author Shuva Nath Shrestha 23048621
 */
public class CriminalModel {
    int Id;
    String Name;
    String Crime;
    String Sentence;
    public CriminalModel(int Id,String Name,String Crime,String Sentence){
        this.Id = Id;
        this.Name = Name;
        this.Crime = Crime;
        this.Sentence = Sentence;
        
    }
public int getId(){
    return Id;
}
public void setId(int Id) {
    this.Id = Id;
}

public String getName(){
    return Name;
}
public void setName(String Name){
    this.Name = Name;
}

public String getCrime(){
    return Crime;
}
public void setCrime(String Crime){
    this.Crime = Crime;
}

public String getSentence(){
    return Sentence;
}
public void setSentence(String Sentence){
    this.Sentence = Name;
}
}
