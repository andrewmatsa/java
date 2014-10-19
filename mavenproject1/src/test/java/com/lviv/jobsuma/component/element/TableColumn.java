package com.lviv.jobsuma.component.element;

import org.openqa.selenium.By;

/**
 * Describes table column behaviour 
 * @author oshumilov
 */
public interface TableColumn extends Element {
    
    /**
     * Returns column text by specific selector
     * @param findBy defines selector {@link By}
     * @return column text
     */
    public String getColumnText(By findBy);
    
    /**
     * Returns column text
     * @return column text
     */
    public String getColumnText();
}
