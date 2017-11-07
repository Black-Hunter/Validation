package gen.com.HugoBoss.Modules.PersonalDataAndPayment;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>The new Features here are Validations and verifications of the Shipping Adress. </p>
 */
public class VValidateShippingAdress extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        waitForVisible("css= .mini-shipment > h3:nth-child(1)");
        assertText("css= .mini-shipment > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)", resolve("${Salutation}"));
        assertText("css= .mini-shipment > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)", resolve("${FirstName}  ${LastName}"));
        assertText("css= .mini-shipment > div:nth-child(2) > div:nth-child(3) > div:nth-child(1)", resolve("${Street} ${StreetNumber}"));
        assertText("css= .mini-shipment > div:nth-child(2) > div:nth-child(4) > div:nth-child(1)", resolve("${AddToAdress}"));
        assertText("css= .mini-shipment > div:nth-child(2) > div:nth-child(5) > div:nth-child(1)", resolve("${ZIPCODE} ${CITY}"));
        assertText("css= .mini-shipment > div:nth-child(2) > div:nth-child(6) > div:nth-child(1)", resolve("${Country}"));
        waitForVisible("css=.mini-billing-address > h3:nth-child(1)");
        assertText("css= .mini-billing-address > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)", resolve("${NewSalutation}"));
        assertText("css= .mini-billing-address > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)", resolve("${NewFirstName} ${NewLastName}"));
        assertText("css=.mini-billing-address > div:nth-child(2) > div:nth-child(3) > div:nth-child(1)", resolve("${NewStreet} ${NewStreetNumber}"));
        assertText("css= .mini-billing-address > div:nth-child(2) > div:nth-child(4) > div:nth-child(1)", resolve("${AddToAdress}"));
        assertText("css= .mini-billing-address > div:nth-child(2) > div:nth-child(5) > div:nth-child(1)", resolve("${NewZIPCODE} ${NewCITY}"));
        assertText("css= .mini-billing-address > div:nth-child(2) > div:nth-child(6) > div:nth-child(1)", resolve("${Country}"));

    }
}