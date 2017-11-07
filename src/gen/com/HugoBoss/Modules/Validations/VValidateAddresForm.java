package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * TODO: Add class description
 */
public class VValidateAddresForm extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        assertText("css=li.step-2:nth-child(3) > span:nth-child(2)", "Zahlungsarten");
        assertText("css=.step-1 > span:nth-child(2)", "Bestellangaben");
        assertText("css= li.step-3:nth-child(5) > span:nth-child(2)", "Bestellung abschließen");
        assertText("css=#DeliveryAddress > legend:nth-child(1)", "Möchten Sie eine abweichende Lieferadresse angeben?");
        assertText("css= #DeliveryAddress > div:nth-child(2) > label:nth-child(3)", "Lieferadresse entspricht der Rechnungsadresse ");
        assertText("css= #DeliveryAddress > div:nth-child(3) > label:nth-child(3)", "Abweichende Lieferadresse ");
        assertText("css= div.shiptostore-box:nth-child(5) > label:nth-child(3)", "DHL Packstation, Filiale oder PaketShop ");
        assertText("css= div.shiptostore-box:nth-child(7) > label:nth-child(3)", "Kostenlos in den Store liefern lassen (Click & Collect) ");
        assertText("css= #shipping-method-list > fieldset:nth-child(1) > legend:nth-child(1)", " Versandart auswählen ");
        assertText("css= div.form__item--shipping:nth-child(2) > label:nth-child(2) > div:nth-child(2)", "glob:DHL Paket Versand - Home,  Standardversand kostenfrei\n(Zustellung: Ca. 2-3 Werktage ab Bestellung)");
        assertText("css= div.form__item--shipping:nth-child(3) > label:nth-child(2) > div:nth-child(2)", "glob:DHL Express Versand - Home,  9,95 €\n(Zustellung: Ca. 1-2 Werktage ab Bestellung)");
        assertChecked("css= #dwfrm_singleshipping_useDifferentShippingAddress-NO");
        assertChecked("css= #shipping-method-standard");
        assertNotChecked("css= #dwfrm_singleshipping_useDifferentShippingAddress-YES");
        assertNotChecked("css= #useDifferentShippingAddress-PARCELSHOP_FINDER");
        assertNotChecked("css= #useDifferentShippingAddress-SHIP_TO_STORE");
        assertNotChecked("css= #dwfrm_singleshipping_shippingAddress_checkoutConfirmProfileTracking");
        assertNotChecked("css= #shipping-method-express");
        assertVisible("css= button.button:nth-child(3)");
        assertVisible("css= a.button:nth-child(2)");
        assertVisible("css= button.button:nth-child(2)");
        assertVisible("css= a.button--ia-back:nth-child(1)");

    }
}