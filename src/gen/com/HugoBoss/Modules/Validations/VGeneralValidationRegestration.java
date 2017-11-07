package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Navigation.VPage;

/**
 * <p>The new Features here are Validations and verifications of Items in the Website, which is not directly related to the Checkout Prozess .</p>
 */
public class VGeneralValidationRegestration extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final VPage _vPage = new VPage();
        _vPage.execute("document.getElementsByClassName(\"subline\")[0].innerHTML", "Bestellung ohne Kundenkonto");

        final VPage _vPage0 = new VPage();
        _vPage0.execute("document.querySelectorAll(\".login-box-content > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)\")[0].innerHTML", "Anmelden");

        assertText("css=.text-wrapper > p:nth-child(1)", "Sie können auch ohne ein HUGO BOSS Kundenkonto bestellen. ");
        // assertText("css=","Im Anschluss an Ihre Bestellung haben Sie die Möglichkeit, ein Kundenkonto anzulegen.");
        assertVisible("css= .button--loginbox");
        assertVisible("css= div.form__item:nth-child(6) > button:nth-child(1)");
        assertVisible("css= div.form__item:nth-child(3) > label:nth-child(2)");
        assertVisible("css= div.form__item:nth-child(4) > label:nth-child(2)");
        assertText("css= div.form__item:nth-child(3) > label:nth-child(2)", "E-Mail Adresse");
        assertText("css= div.form__item:nth-child(4) > label:nth-child(2)", "Passwort");
        assertNotChecked("css= #dwfrm_login_rememberme");
        assertText("css= .form__checkbox-label", " E-Mail Adresse speichern ");
        assertVisible("css=#livePersonChatButtonFooter");
        assertVisible("css= div.cms-footer__item:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
        assertVisible("css=div.cms-footer__item:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1)");
        assertVisible("css= div.cms-links-item--readmore--white");
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
        assertVisible("css= [class=\"header-wrapper\"]");
        assertVisible("css= [class=\"context-nav__list-item context-nav__list-item--shopping-bag\"]");

    }
}