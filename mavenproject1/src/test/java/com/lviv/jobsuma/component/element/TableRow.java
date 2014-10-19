package com.lviv.jobsuma.component.element;

import java.util.List;
import org.openqa.selenium.By;

/**
 * Describes table row behaviour
 * @author oshumilov
 */
public interface TableRow extends Element {
    public static final String ACTIVE_ROW_CLASS = "rowItemActive";
    
    /**
     * Performs a click on current row
     */
    public void click();

    /**
     * Returns list of {@link TableColumn} by specific selector
     * @param findBy defines selector {@link By}
     * @return list of {@link TableColumn}
     */
    public List<TableColumn> getColumns(By findBy);

    /**
     * Returns {@link TableColumn} by specific selector and columnt index
     * @param findBy defines selector {@link By}
     * @param columnIndex defines column index
     * @return column
     */
    public TableColumn getColumn(By findBy, int columnIndex);
    
    /**
     * Returns css class of current row
     * @return css class of current row
     */
    public String getRowCSSClass();
    
    /**
     * Returns true if current row is active (selected).
     */
    public boolean isActive();
    
    /**
     * Performs double click current row
     */
    public void doubleClick();
}
