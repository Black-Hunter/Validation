package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>Module directs to personaldata opitions</p>
 */
public class AGoToPersonaldata extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        // css=.button--loginbox
        clickAndWait("//*[contains(@class,\"button button--primary button--right button--ia-cta--primary button--loginbox\")]");

    }
}