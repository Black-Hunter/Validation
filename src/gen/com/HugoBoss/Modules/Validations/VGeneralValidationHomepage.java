package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>The new Features here are Validations and verifications of Items in the Website, which is not directly related to the Checkout Prozess .</p>
 */
public class VGeneralValidationHomepage extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        // Upperside of the page
        assertVisible("css= [class=\"header-wrapper\"]");
        assertVisible("css= .main-nav__list [class ~=main-nav__item]");
        assertVisible("css=  [class=\"context-nav__list-item context-nav__list-item--search js-simple-search\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--livechat\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--store-locator \"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--account\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--wishlist js-wishlist-data\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--shopping-bag\"]");
        // we have to scroll to an elements, this element is visible just if you scroll to it.
        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute(".cms-social-share__headline");

        waitForVisible("css= .cms-social-share__headline");
        assertText("css= .cms-social-share__headline", "\n\t\t\t\tDiese Seite teilen\n\t\t\t");
        assertVisible("css= a.cms-social-share__channels__channel:nth-child(1) > span:nth-child(1) > svg:nth-child(1) > use:nth-child(2)");
        assertVisible("css= a.cms-social-share__channels__channel:nth-child(2) > span:nth-child(1) > svg:nth-child(1) > use:nth-child(2)");
        assertVisible("css= a.cms-social-share__channels__channel:nth-child(3) > span:nth-child(1) > svg:nth-child(1) > use:nth-child(2)");
        assertVisible("css= a.cms-social-share__channels__channel:nth-child(4) > span:nth-child(1) > svg:nth-child(1)");
        assertVisible("css= a.cms-social-share__channels__channel:nth-child(5)");
        assertVisible("css=.cms-social-share__copy-link > span:nth-child(2)");
        assertText("css=.cms-social-share__copy-link > span:nth-child(1)", "LINK KOPIEREN");
        assertVisible("css=.cms-social-share__copy-url");
        assertText("css= .newsletter-signin__headline", "Online Store Newsletter ");
        assertText("css=.newsletter-signin__subtext", "Seien Sie immer up-to-date mit dem Newsletter des HUGO BOSS Online Stores - neue Produkte, exklusive Specials, Lifestyle und Fashion Trends.");
        assertVisible("css= .form__item");
        assertText("css= div.cms-footer__item:nth-child(3) > div:nth-child(1)", "\n                        Das Unternehmen\n                        ");
        assertText("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)", "\n                        Services\n                        \n                        ");
        assertText("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)", "\n                        Kontakt\n                        \n                        ");
        assertText("css=.cms-footer > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)", "\n                        Fashion Guides\n                                       ");
        // The Downside of the Page
        assertText("css= .cms-footer__item--first > div:nth-child(1)", "\n Last Season Sale \n\t\t\n                        ");
        assertElementPresent("css= div.page-width-wrapper__inner--in-navigation:nth-child(5) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)");
        assertElementPresent("css= div.page-width-wrapper__inner--in-navigation:nth-child(5) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)");
        assertElementPresent("css= div.page-width-wrapper__inner--in-navigation:nth-child(5) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3)");
        assertVisible("css=.livechat");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > a:nth-child(2) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item-copy:nth-child(7) > a:nth-child(2) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item-copy:nth-child(9)");
        assertVisible("css= div.cms-footer__item-copy:nth-child(11) > a:nth-child(2) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item-copy:nth-child(12)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3)");
        assertVisible("css=div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4)");
        assertVisible("css= .cms-footer__item--first > div:nth-child(2) > div:nth-child(2) > a:nth-child(1)");
        assertVisible("css= .cms-footer > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
        assertVisible("css= section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
        assertVisible("css=section.cms-freestyle:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
        assertVisible("css= div.cms-footer__item:nth-child(3) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
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