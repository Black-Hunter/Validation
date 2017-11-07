package gen.com.HugoBoss.Modules.PersonalDataAndPayment;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>Validation Module for adress form validation</p>
 */
public class VAddressform extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        assertVisible("css=#selectdwfrm_singleshipping_billingAddress_addressFields_salutation");
        assertVisible("css= #dwfrm_singleshipping_billingAddress_addressFields_firstName");
        assertVisible("css= #dwfrm_singleshipping_billingAddress_addressFields_lastName");
        assertVisible("css=#dwfrm_singleshipping_billingAddress_addressFields_address1");
        assertVisible("css= #dwfrm_singleshipping_billingAddress_addressFields_streetNo");
        assertVisible("css=#dwfrm_singleshipping_billingAddress_addressFields_address2");
        assertVisible("css=#dwfrm_singleshipping_billingAddress_addressFields_zip");
        assertVisible("css=#dwfrm_singleshipping_billingAddress_addressFields_city");
        assertVisible("css=#dwfrm_singleshipping_billingAddress_email_emailAddress");
        // assertVisible("css=div.form__item--w33:nth-child(2) > span:nth-child(3) > span:nth-child(1) > svg:nth-child(2)");
        // assertVisible("css=div.form__item--w33:nth-child(3) > span:nth-child(3) > span:nth-child(1) > svg:nth-child(2)");
        // assertVisible("css=div.form__item--w33:nth-child(4) > span:nth-child(3) > span:nth-child(1) > svg:nth-child(2)");
        assertVisible("css=.form__item--label-inline > span:nth-child(2) > span:nth-child(1)");

    }
}