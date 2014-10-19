package com.malkos.masterview.cms.component;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

/**
 * Models a SELECT tag, providing helper methods to select and deselect options.
 * Note: It uses css selector to find options
 * 
 * @author vlavrynovych
 */
public class Select {

    private final WebElement element;
    private boolean isMulti;

    /**
    * Constructor. A check is made that the given element is, indeed, a SELECT tag. If it is not,
    * then an UnexpectedTagNameException is thrown.
    * 
    * @param element SELECT element to wrap
    * @throws UnexpectedTagNameException when element is not a SELECT
    */
    public Select(WebElement element) {
        String tagName = element.getTagName();

        if (null == tagName || !"select".equals(tagName.toLowerCase())) {
            throw new UnexpectedTagNameException("select", tagName);
        }

        this.element = element;

        String value = element.getAttribute("multiple");

        // The atoms normalize the returned value, but check for "false"
        isMulti = (value != null && !"false".equals(value));
    }

    /**
    * @return Whether this select element support selecting multiple options at the same time? This
    *         is done by checking the value of the "multiple" attribute.
    */
    public boolean isMultiple() {
        return isMulti;
    }

    /**
    * @return All options belonging to this select tag
    */
    public List<WebElement> getOptions() {
        return element.findElements(By.cssSelector("option"));
    }

    /**
    * @return All selected options belonging to this select tag
    */
    public List<WebElement> getAllSelectedOptions() {
        List<WebElement> toReturn = new ArrayList<WebElement>();

        for (WebElement option : getOptions()) {
            if (option.isSelected()) {
                toReturn.add(option);
            }
        }

        return toReturn;
    }

    /**
    * @return The first selected option in this select tag (or the currently selected option in a
    *         normal select)
    */
    public WebElement getFirstSelectedOption() {
        for (WebElement option : getOptions()) {
            if (option.isSelected()) {
                return option;
            }
        }

        throw new NoSuchElementException("No options are selected");
    }

    /**
    * Select all options that display text matching the argument. That is, when given "Bar" this
    * would select an option like:
    * 
    * &lt;option value="foo"&gt;Bar&lt;/option&gt;
    * 
    * @param text The visible text to match against
    */
    public void selectByVisibleText(String text) {
        text = text.trim();
        // try to find the option via css ...
        List<WebElement> options = element.findElements(By.cssSelector("option:contains('" + text + "')"));

        boolean matched = false;
        for (WebElement option : options) {
            setSelected(option);
            if (!isMultiple()) {
                return;
            }
            matched = true;
        }
        
        if (!matched) {
            throw new NoSuchElementException("Cannot locate element with text: " + text);
        }
    }

    /**
    * Select the option at the given index. This is done by examing the "index" attribute of an
    * element, and not merely by counting.
    * 
    * @param index The option at this index will be selected
    */
    public void selectByIndex(int index) {
        String match = String.valueOf(index);

        boolean matched = false;
        for (WebElement option : getOptions()) {
            if (match.equals(option.getAttribute("index"))) {
                setSelected(option);
                if (!isMultiple()) {
                    return;
                }
                matched = true;
            }
        }
        if (!matched) {
            throw new NoSuchElementException("Cannot locate option with index: " + index);
        }
    }

    /**
    * Select all options that have a value matching the argument. That is, when given "foo" this
    * would select an option like:
    * 
    * &lt;option value="foo"&gt;Bar&lt;/option&gt;
    * 
    * @param value The value to match against
    */
    public void selectByValue(String value) {
        List<WebElement> options = element.findElements(By.cssSelector("option[value = '"+value+"']"));

        boolean matched = false;
        for (WebElement option : options) {
            setSelected(option);
            if (!isMultiple()) {
                return;
            }
            matched = true;
        }

        if (!matched) {
            throw new NoSuchElementException("Cannot locate option with value: " + value);
        }
    }

    /**
    * Clear all selected entries. This is only valid when the SELECT supports multiple selections.
    * 
    * @throws UnsupportedOperationException If the SELECT does not support multiple selections
    */
    public void deselectAll() {
        if (!isMultiple()) {
            throw new UnsupportedOperationException(
                "You may only deselect all options of a multi-select");
        }

        for (WebElement option : getOptions()) {
            if (option.isSelected()) {
                option.click();
            }
        }
    }

    /**
    * Deselect all options that have a value matching the argument. That is, when given "foo" this
    * would deselect an option like:
    * 
    * &lt;option value="foo"&gt;Bar&lt;/option&gt;
    * 
    * @param value The value to match against
    */
    public void deselectByValue(String value) {
        List<WebElement> options = element.findElements(By.cssSelector("option[value = '" + value + "']"));
        for (WebElement option : options) {
            if (option.isSelected()) {
                option.click();
            }
        }
    }

    /**
    * Deselect the option at the given index. This is done by examing the "index" attribute of an
    * element, and not merely by counting.
    * 
    * @param index The option at this index will be deselected
    */
    public void deselectByIndex(int index) {
        String match = String.valueOf(index);

        for (WebElement option : getOptions()) {
            if (match.equals(option.getAttribute("index")) && option.isSelected()) {
                option.click();
            }
        }
    }

    /**
    * Deselect all options that display text matching the argument. That is, when given "Bar" this
    * would deselect an option like:
    * 
    * &lt;option value="foo"&gt;Bar&lt;/option&gt;
    * 
    * @param text The visible text to match against
    */
    public void deselectByVisibleText(String text) {
        List<WebElement> options = element.findElements(By.cssSelector("option:contains('" + text.trim() + "')"));
        for (WebElement option : options) {
            if (option.isSelected()) {
            option.click();
            }
        }
    }

    private void setSelected(WebElement option) {
        if (!option.isSelected()) {
            option.click();
        }
    }
    
}
