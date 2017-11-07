package gen.com.HugoBoss.Modules.PersonalDataAndPayment;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This Module is responsible for  Filling Banking data for the Checkout Prozess.
 * It Containes Parameters for the Values of Personal data, which is filled by reserved Variables in the Dataset. </p>
 */
public class APayCreditCard extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String account = parameters[0];
        final String expDate = parameters[1];
        final String expYear = parameters[2];
        final String securityCode = parameters[3];
        check("css= #is-CREDIT_CARD");
        waitForVisible("css= .wirecard-seamless-frame ");
        selectFrame("css= .wirecard-seamless-frame");
        type("id=account_number", account);
        select("css= #expiration_month_list", expDate);
        type("css= #card_security_code", securityCode);
        select("css= #expiration_year_list", expYear);
        selectFrame("relative=top");

    }
}