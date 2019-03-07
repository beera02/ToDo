package com.example.todo.control;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DateManager {
    private List<Calendar> dates = new ArrayList<Calendar>();
    private Calendar minimalDate;
    private Calendar maximalDate;

    public void defineDates() {
        Calendar maximalDateOne = new GregorianCalendar(Calendar.YEAR + 1, Calendar.MONTH, 1);
        maximalDate = new GregorianCalendar(Calendar.YEAR + 1, Calendar.MONTH, maximalDateOne.getActualMaximum(Calendar.DAY_OF_MONTH));
        minimalDate = new GregorianCalendar(Calendar.YEAR - 1, Calendar.MONTH, 1);
        Calendar iterateDate = minimalDate;
        while (minimalDate.compareTo(maximalDate) <= 0) {
            dates.add(iterateDate);
            iterateDate.add(Calendar.DATE, 1);
        }
    }

    public void deleteDates(){
        dates.clear();
    }

    public List<Calendar> getDates(){
        return dates;
    }

    public Calendar getMinimalDate(){
        return minimalDate;
    }

    public Calendar getMaximalDate(){
        return maximalDate;
    }
}
