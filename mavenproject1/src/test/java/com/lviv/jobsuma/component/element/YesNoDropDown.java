package com.lviv.jobsuma.component.element;

/**
 * Describes {@link DropDown} behaviour with only "Yes", "No" and empty options
 * @author vlavrynovych
 */
public interface YesNoDropDown extends DropDown {
    
    public String YES = "Yes";
    public String NO = "No";
    
    /**
     * Selects Yes value
     */
    public void selectYes();
    
    /**
     * Selects No value
     */
    public void selectNo();
    
    /**
     * Sets the specified value<br/>
     * Sets empty value if specified value is null
     * @param value defines new value for {@link YesNoDropDown}
     */
    public void selectValue(Boolean value);
    
}
