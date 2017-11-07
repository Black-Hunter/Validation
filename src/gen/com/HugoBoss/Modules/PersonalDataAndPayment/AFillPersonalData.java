package gen.com.HugoBoss.Modules.PersonalDataAndPayment;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>This Module is responsible for  Filling Personal data for the Checkout Prozess.
 * It Containes Parameters for the Values of Personal data, which is filled by reserved Variables in the Dataset. </p>
 */
public class AFillPersonalData extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String salutation = parameters[0];
        final String firstName = parameters[1];
        final String lastName = parameters[2];
        final String street = parameters[3];
        final String streetNumber = parameters[4];
        final String ZipCode = parameters[5];
        final String City = parameters[6];
        final String AddToAdress = parameters[7];
        final String Email = parameters[8];
        // Filling Personal Data and Validating the Input Fields
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        waitForVisible("css= .font__h2");
        select("css=#dwfrm_singleshipping_billingAddress_addressFields_salutation", salutation);
        type("css= #dwfrm_singleshipping_billingAddress_addressFields_firstName", firstName);
        type("css= #dwfrm_singleshipping_billingAddress_addressFields_lastName", lastName);
        type("css=#dwfrm_singleshipping_billingAddress_addressFields_address1", street);
        type("css= #dwfrm_singleshipping_billingAddress_addressFields_streetNo", streetNumber);
        type("css= #dwfrm_singleshipping_billingAddress_addressFields_address2", AddToAdress);
        type("css= #dwfrm_singleshipping_billingAddress_addressFields_zip", ZipCode);
        type("css= #dwfrm_singleshipping_billingAddress_addressFields_city", City);
        type("css= #dwfrm_singleshipping_billingAddress_email_emailAddress", Email);
        check("css= #dwfrm_singleshipping_shippingAddress_checkoutConfirmProfileTracking");
        assertChecked("css= #shipping-method-standard");
        waitForVisible("css=#checkout-form");

    }
}