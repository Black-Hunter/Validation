package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>Module directs to the Payment Opitions.</p>
 */
public class AGoToPaymentOption extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        clickAndWait("css= button.button:nth-child(3) > svg:nth-child(1)");

    }
}