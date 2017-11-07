package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>Module directs to the Regestration Page, Where used to direct to personaldata opitions</p>
 */
public class AGoToRegestration extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute(".cart-actions > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(2) > button:nth-child(1)");

        clickAndWait("css= .cart-actions > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(2) > button:nth-child(1)");

    }
}