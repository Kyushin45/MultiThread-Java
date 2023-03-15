/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Asus
 */
public class CurrencyConversionResponse {

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, String> getRate() {
        return rate;
    }

    public void setRate(Map<String, String> rate) {
        this.rate = rate;
    }
    private String base;
    private String date;
    private Map<String,String> rate = new TreeMap<>();
    
    
    
    
}
