package io.github.vitormozer9.utils;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateConversion {
    public Date converterStringOnDate(String dateString){
        SimpleDateFormat simpleDataFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            return simpleDataFormat.parse(dateString);  
        } catch (Exception e) {

            System.out.println("Format date error! Please corret format date");
            return null;
        }
    }   
}
