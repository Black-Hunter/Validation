package gen.com.HugoBoss.Modules.PersonalDataAndPayment;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This Module is responsible for  Filling Banking data for the Checkout Prozess.
 * It Containes Parameters for the Values of Personal data, which is filled by reserved Variables in the Dataset. 
 * The new Features here are Validations and verifications of the Typed or selected  fields.</p>
 */
public class APayCreditCardValidated extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String account = parameters[0];
        final String expDate = parameters[1];
        final String securityCode = parameters[2];
        final String expYear = parameters[3];
        //
        // ~~~ chooseCredit ~~~
        //
        startAction("chooseCredit");
        waitForVisible("css= .wirecard-seamless-frame");
        assertVisible("css= .form__custom-radio--checked");
        check("css=#is-CREDIT_CARD");
        assertChecked("css=#is-CREDIT_CARD");
        waitForVisible("css= .wirecard-seamless-frame");
        assertVisible("css= .wirecard-seamless-frame ");
        selectFrame("css= .wirecard-seamless-frame");
        assertVisible("css= #account_number");
        assertVisible("css= div.col-xs-6:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
        assertVisible("css= #card_security_code");
        assertVisible("css= div.col-xs-6:nth-child(2) > div:nth-child(2)");
        type("id=account_number", account);
        select("css= #expiration_month_list", expDate);
        type("css= #card_security_code", securityCode);
        select("css= #expiration_year_list", expYear);
        selectFrame("relative=top");
        assertVisible("css= .checkout-top [name=dwfrm_billing_save]");

    }
}