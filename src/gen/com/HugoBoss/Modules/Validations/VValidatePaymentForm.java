package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * TODO: Add class description
 */
public class VValidatePaymentForm extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        assertText("css=span.checkout__progress--text:nth-child(3)", "Bestellangaben");
        assertText("css= li.step-2:nth-child(3) > span:nth-child(2)", "Zahlungsarten");
        assertText("css= li.step-3:nth-child(5) > span:nth-child(2)", "Bestellung abschließen ");
        assertText("css= .checkout-top > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)", "Sichere Zahlung mit SSL Verschlüsselung ");
        assertText("css=#checkout-form > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)", "Sichere Zahlung mit SSL Verschlüsselung ");
        assertText("css= div.form__item:nth-child(1) > label:nth-child(3)", "Kreditkarte ");
        assertText("css= div.form__item:nth-child(2) > label:nth-child(3)", "PayPal ");
        assertText("css= div.form__item:nth-child(3) > label:nth-child(3)", "Kauf auf Rechnung ");
        assertText("css= div.form__item:nth-child(4) > label:nth-child(3)", "Sofortüberweisung ");
        assertChecked("css= #is-CREDIT_CARD");
        assertNotChecked("css=#is-INVOICE");
        assertNotChecked("css= #is-PAYPAL  ");
        assertNotChecked("css= #is-ONLINE_TRANSFER");
        assertVisible("css=  .form__wrapper--start > button:nth-child(2)");
        assertVisible("css=  .form__wrapper--start > a:nth-child(1)");
        assertVisible("css=  .checkout-top > div:nth-child(1) > button:nth-child(2)");
        assertVisible("css=  .checkout-top > div:nth-child(1) > a:nth-child(1)");

    }
}