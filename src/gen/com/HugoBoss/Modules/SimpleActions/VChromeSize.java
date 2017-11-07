package gen.com.HugoBoss.Modules.SimpleActions;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This module is For solving the Write Problem in the Browser. In German Language &quot;ß&quot; could be written as &quot;ss&quot;, which is in Chrome &quot;ss&quot; and in Firefox &quot;ß&quot; .</p>
 */
public class VChromeSize extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String Text = parameters[0];
        final String Pattern = parameters[1];
        final String Text_2 = parameters[2];
        final String Target = parameters[3];
        waitForVisible(Target);
        assertText(Target, Text + " " + Pattern);

    }
}