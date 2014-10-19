package com.lviv.jobsuma.component.elements.impl;

import com.lviv.jobsuma.component.element.TableColumn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link TableColumn}
 * @author oshumilov
 */
public class TableColumnImpl extends AbstractElement implements TableColumn {

    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    public TableColumnImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Returns column text
     * @return column text
     */
    public String getColumnText() {
        return wrappedElement.getText();
    }

    /**
     * Returns column text by specific selector
     * @param findBy defines selector {@link By}
     * @return column text
     */
    public String getColumnText(By findBy) {
        return wrappedElement.findElement(findBy).getText();
    }
    
}
