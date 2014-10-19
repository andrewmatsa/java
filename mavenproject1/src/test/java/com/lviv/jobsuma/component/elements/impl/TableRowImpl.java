package com.lviv.jobsuma.component.elements.impl;
 
import com.lviv.jobsuma.component.element.Attributes;
import com.lviv.jobsuma.component.element.TableColumn;
import com.lviv.jobsuma.component.element.TableRow;
import com.lviv.jobsuma.helper.ActionsHelper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/** 
 * Represents implementation of {@link TableRow}
 * @author
 */ 
public class TableRowImpl extends CompositeElement implements TableRow {

    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    public TableRowImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }

     /**
     * Performs a click on current row
     */
    public void click() {
        wrappedElement.click();
    }

    /**
     * Returns list of {@link TableColumn} by specific selector
     * @param findBy defines selector {@link By}
     * @return list of {@link TableColumn}
     */
    public List<TableColumn> getColumns(By findBy) {
        List<TableColumn> elements = getElementList(TableColumn.class, wrappedElement.findElements(findBy));
        return elements;
    }

    /**
     * Returns {@link TableColumn} by specific selector and columnt index
     * @param findBy defines selector {@link By}
     * @param columnIndex defines column index
     * @return column
     */
    public TableColumn getColumn(By findBy, int index) {
        List<TableColumn> columns = getColumns(findBy);
        return columns.get(index);
    }

    /**
     * Returns css class of current row
     * @return css class of current row
     */
    public String getRowCSSClass() {
        return wrappedElement.getAttribute(Attributes.CLASS);
    }
    
    /**
     * Returns true if current row is active (selected).<br/>
     * It is checked by class attribute
     */
    public boolean isActive() {
        return getRowCSSClass().equals(ACTIVE_ROW_CLASS);
    }

    public void doubleClick() {
        ActionsHelper.doubleClick(wrappedElement);
    }

    public boolean isDisplayed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isDisabled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
