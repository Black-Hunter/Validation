package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>Module directs to Order Summery</p>
 */
public class AGoToOrderSummary extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute(".checkout-top > div:nth-child(1) > button:nth-child(2)");

        clickAndWait("css=.checkout-top > div:nth-child(1) > button:nth-child(2)");

    }
}