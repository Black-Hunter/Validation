package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>Confirmating the Orderd items to Buy Them and Check Out</p>
 */
public class AConfirm extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        waitForVisible("css= button.button:nth-child(1)");
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        // check("css= #dwfrm_ordersummary_acceptTermsAndConditions");
        clickAndWait("css= button.button:nth-child(1)");

    }
}