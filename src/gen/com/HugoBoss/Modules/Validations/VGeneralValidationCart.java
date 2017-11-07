package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>The new Features here are Validations and verifications of Items in the Website, which is not directly related to the Checkout Prozess .</p>
 */
public class VGeneralValidationCart extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        assertVisible("css= [class=\"header-wrapper\"]");
        assertVisible("css= .main-nav__list [class ~=main-nav__item]");
        assertVisible("css=  [class=\"context-nav__list-item context-nav__list-item--search js-simple-search\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--livechat\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--store-locator \"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--account\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--wishlist js-wishlist-data\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--shopping-bag\"]");
        assertEval("document.getElementsByClassName(\"font__label font__label--large font__label--product-table font__label--product-table--table\")[0].innerHTML", "Ihre Bestellung");
        assertText("css=div.order-totals:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)", "Gesamtsumme der Ware");
        assertText("css=div.order-totals:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > span:nth-child(1)", " DHL Paket Versand - Home ");
        assertText("css=div.order-totals:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(2)", "glob:Zustellung: Ca. 2-3 Werktage ab Bestellung");
        assertText("css=div.order-totals:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1)", "inkl. 19% MwSt.");
        assertText("css=tr.order-total:nth-child(5) > td:nth-child(1)", "Gesamtpreis");
        assertVisible("css=div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(2) > a:nth-child(2) > span:nth-child(1)");
        assertVisible("css=div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(2) > button:nth-child(1)");
        assertVisible("css= div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > fieldset:nth-child(1) > button:nth-child(1)");
        assertVisible("css=div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > a:nth-child(2)");
        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute("section.cms-core__fullbleed--gap:nth-child(1) > h3:nth-child(1)");

        assertEval("document.querySelectorAll('section.cms-core__fullbleed--gap:nth-child(1) > h3:nth-child(1)')[0].innerHTML", "Hilfe &amp; Kontakt");
        assertText("css= .cms-related-content-teaser__item-1 > div:nth-child(2) > div:nth-child(1) > a:nth-child(2) > p:nth-child(1) > b:nth-child(1)", "Kontaktformular");
        waitForVisible("css= #livePersonChatButtonService");
        assertText("css= #livePersonChatButtonService", "Live Chat\n                        ");
        assertText("css=.cms-related-content-teaser__item-0 > div:nth-child(2) > div:nth-child(1) > a:nth-child(2) > p:nth-child(1)", "\t\t\t\t\t\t\t\t+49 7123 3788 9911\n                        \n                        ");
        assertText("css= .cms-related-content-teaser__items--column-count-2 > li:nth-child(2) > div:nth-child(1) > div:nth-child(1) > p:nth-child(1)", " Standard Versand kostenfrei \n                        \n                        ");
        assertVisible("css=.cms-related-content-teaser__items--column-count-2 > li:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
        assertElementCount("css=.cms-related-content-teaser__items--column-count-2 > li:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span", 6);
        assertVisible("css=.cms-related-content-teaser__items--column-count-2 > li:nth-child(2) > div:nth-child(1) > div:nth-child(1)");
        assertElementCount("css=.cms-related-content-teaser__items--column-count-2 > li:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span", 2);
        assertElementPresent("css= div.cms-footer__item:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1)");
        assertVisible("css=div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > span:nth-child(1)");
        assertVisible("css=div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
        assertVisible("css=div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3)");
        assertVisible("css=div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4)");
        assertVisible("css= .cms-footer__item--first > div:nth-child(2) > div:nth-child(2) > a:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
        assertVisible("css= .icon-new_instagram");
        assertVisible("css=.icon-new_twitter");
        assertVisible("css= .icon-new_fb");
        assertVisible("css= .icon-new_pinterest");
        assertVisible("css=.icon-new_youtube");
        assertVisible("css=.icon-new_google");
        assertVisible("css= img.icon");
        assertVisible("css= .icon-new_instagram");
        assertText("css= .footer__disclaimer", "Bitte beachten Sie, dass sich Ihre Rechnungs- und Lieferanschrift in der Bundesrepublik Deutschland befinden muss. Eine Lieferung auf die Insel Helgoland und in die Gemeinde Büsingen am Hochrhein ist leider ausgeschlossen.");
        assertText("css= .footer__copyright", "© 2017 HUGO BOSS All rights reserved.");
        assertEval("document.querySelectorAll('.footer__change-country > div:nth-child(1)')[0].innerHTML.indexOf(\"Change country\") != -1", "true");
        assertText("css= .footer__change-country > div:nth-child(1) > a:nth-child(1)", "Deutschland");
        assertVisible("css= .footer__links > li:nth-child(1) > a:nth-child(1)");
        assertVisible("css=.footer__links > li:nth-child(2)");
        assertVisible("css= .footer__links > li:nth-child(3)");
        assertVisible("css=.footer__links > li:nth-child(4)");
        assertVisible("css=.footer__links > li:nth-child(5)");
        assertVisible("css=.footer__links > li:nth-child(6)");
        assertVisible("css= .footer__links > li:nth-child(7)");
        assertVisible("css= .footer__links > li:nth-child(8)");
        assertVisible("css= .main-logo");

    }
}