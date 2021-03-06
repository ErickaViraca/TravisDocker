package org.fundacionjala.sfdc.pages.lookup;

import org.fundacionjala.sfdc.pages.base.AbstractBasePage;

/**
 * Class to manage the current windows.
 */
public abstract class SectionFrame extends AbstractBasePage {

    /**
     * Returns to the current window.
     */
    protected void returnRoot() {
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }

    /**
     * Returns the content by default window.
     */
    protected void returnDefault() {
        driver.switchTo().defaultContent();
    }
}
