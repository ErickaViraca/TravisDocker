package org.fundacionjala.sfdc.pages.opportunities;

import org.openqa.selenium.By;

import org.fundacionjala.sfdc.framework.utils.CommonActions;
import org.fundacionjala.sfdc.pages.base.AbstractBasePage;
import org.fundacionjala.sfdc.pages.base.HomeBase;

/**
 * This class represents to opportunity pages.
 */
public class OpportunityHome extends HomeBase {

    /**
     * This method makes click on new button.
     *
     * @return {@link OpportunityForm}
     */
    public OpportunityForm clickNewButton() {
        CommonActions.clickElement(newButton);
        return new OpportunityForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractBasePage clickCreateNewViewLink() {
        CommonActions.clickElement(createNewViewLink);
        return new OpportunityForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractBasePage clickEditViewLink() {
        CommonActions.clickElement(editViewLink);
        return new OpportunityForm();
    }

    /**
     * This method goes a opportunity detail.
     *
     * @param url a string with url of the page.
     * @return ContractDetail page object.
     */
    public OpportunityDetail goOpportunityDetail(final String url) {
        driver.navigate().to(url);
        return new OpportunityDetail();
    }

    /**
     * This method makes click on account link.
     *
     * @param accountName a string with name account.
     * @return ContractDetail page object.
     */
    public OpportunityDetail clickOnAccount(final String accountName) {
        driver.findElement(By.linkText(accountName)).click();
        return new OpportunityDetail();
    }

}
