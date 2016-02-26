package com.blogspot.e_kanivets.moneytracker.report.base;

import android.support.annotation.NonNull;

import com.blogspot.e_kanivets.moneytracker.model.Period;
import com.blogspot.e_kanivets.moneytracker.report.model.CategoryRecord;

import java.util.List;

/**
 * Interface that represents a contract of access to report data.
 * Created on 2/25/16.
 *
 * @author Evgenii Kanivets
 */
public interface IReport {
    /**
     * @return code of report currency
     */
    @NonNull String getCurrency();

    /**
     * @return period of report
     */
    @NonNull Period getPeriod();

    /**
     * @return total sum in given currency for given period
     */
    double getTotal();

    /**
     * @return total of all incomes for given period
     */
    double getTotalIncome();

    /**
     * @return total of all expenses for given period
     */
    double getTotalExpense();

    /**
     * @return summary list
     */
    @NonNull List<CategoryRecord> getSummary();
}