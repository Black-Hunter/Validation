package gen.com.HugoBoss.Modules.Helpers;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This helper waits for the DOM state hence we know of the site is still loading and the ready state is fired. This can be useful for click only commands, where we want to wait till the dust has settled.</p>
 */
public class MHelper_waitForDOMState extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        waitForEval("(document.readyState == \"complete\" || document.readyState == \"loaded\")", "true");
        // Wait until JQuery is finished. This state is not always used. Just an additional measure to make sure we do not run into additional wait problems.
        waitForEval("jQuery.active = 0 ;\n(jQuery.active == 0)", "true");

    }
}