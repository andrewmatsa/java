package com.lviv.jobsuma.component.elements.impl;
 
import com.lviv.jobsuma.component.element.TableColumn;
import com.lviv.jobsuma.component.element.TableRow;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Represents table with basic behaviour
 *
 * @author 
 */
public abstract class AbstractTable extends CompositeElement {
    private List<TableColumn> columns;
    private TableColumn column;
    
    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    public AbstractTable(WebElement wrappedElement) {
        super(wrappedElement);
    }
    
    /**
     * Returns count of table rows
     * @return count of table rows
     */
    public int getTableRowCount() {
        return getRows().size();
    }
    
    /**
     * Returns list of rows
     * @return list of rows
     */
    public List<TableRow> getRows() {
        List<TableRow> rows = getElementList(TableRow.class, wrappedElement.findElements(getRowFindBy()));
        return rows;
    }
    
    /**
     * Clicks and returns row by index
     * @param index defines index of row
     * @return row by index
     */
    public TableRow clickRowByIndex(int index) {
        TableRow element = getRowByIndex(index);
        element.click();
        return element;
    }
    
    public TableRow doubleClickRowByIndex(int index) {
        TableRow element = getRowByIndex(index);
        element.doubleClick();
        return element;
    }

    /**
     * Returns row by index
     * @param index defines index of row
     * @return row by index
     */
    public TableRow getRowByIndex(int index) {
        TableRow element = getRows().get(index);
        return element;
    }
    
    /**
     * Returns list of columns of row
     * @param row defines row from which get columns
     * @return list of columns
     */
    public List<TableColumn> getColumns(TableRow row) {
//        List<TableColumn> columns = row.getColumns(getColumnsFindBy());
        return columns;
    }
    
    /**
     * Returns column by row and column indexes
     * @param rowIndex defines row index
     * @param columnIndex defines column index
     * @return column
     */
    public TableColumn getColumnByIndexes(int rowIndex, int columnIndex) {
        TableRow row = getRows().get(rowIndex);
        return getColumnByIndex(columnIndex, row);
    }
    
    /**
     * Returns column of row by column index
     * @param index defines column index
     * @param row defines row in which column will be matched
     * @return column
     */
    public TableColumn getColumnByIndex(int index, TableRow row) {
//        TableColumn column = row.getColumn(getColumnsFindBy(), index);
        return column;
    }
    
    public TableRow getRowBy(By by) {
        return getElement(TableRow.class, wrappedElement.findElement(by));
    }
    
    /**
     * Returns on which way table row should be found.<br/>
     * This abstract method should be implemented differently depending on the particular table
     * 
     * @return on which way table row should be found
     */
    protected abstract By getRowFindBy();
    
    /**
     * Returns on which way table column should be found.<br/>
     * This abstract method should be implemented differently depending on the particular table
     * 
     * @return on which way table column should be found
     */
    protected abstract By getColumnsFindBy();

}
