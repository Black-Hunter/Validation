package gen.com.HugoBoss.Modules.SimpleActions;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This Module is responsible for  Filling Personal data for the Checkout Prozess.
 * It Containes Parameters for the Values of Personal data, which is filled by reserved Variables in the Dataset. </p>
 */
public class AAddCustemAddress extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String newsalutation = parameters[0];
        final String newfirstName = parameters[1];
        final String newlastName = parameters[2];
        final String newstreet = parameters[3];
        final String newstreetNumber = parameters[4];
        final String newZipCode = parameters[5];
        final String newCity = parameters[6];
        final String newAddToAddress = parameters[7];
        waitForVisible("css= #dwfrm_singleshipping_shippingAddress");
        check("css= #dwfrm_singleshipping_useDifferentShippingAddress-YES");
        select("css=#dwfrm_singleshipping_shippingAddress_addressFields_salutation", newsalutation);
        type("css= #dwfrm_singleshipping_shippingAddress_addressFields_firstName", newfirstName);
        type("css= #dwfrm_singleshipping_shippingAddress_addressFields_lastName", newlastName);
        type("css=#dwfrm_singleshipping_shippingAddress_addressFields_address1", newstreet);
        type("css= #dwfrm_singleshipping_shippingAddress_addressFields_streetNo", newstreetNumber);
        type("css=#dwfrm_singleshipping_shippingAddress_addressFields_address2", newAddToAddress);
        type("css= #dwfrm_singleshipping_shippingAddress_addressFields_zip", newZipCode);
        type("css= #dwfrm_singleshipping_shippingAddress_addressFields_city", newCity);

    }
}