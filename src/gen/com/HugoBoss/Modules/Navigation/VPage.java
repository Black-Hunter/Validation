package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This Module Validate the appearance of the right page. The Module failes if the the next page is not visible or the it  characteristics doesnt appear.</p>
 */
public class VPage extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String pageCharacteristics = parameters[0];
        final String value = parameters[1];
        assertEval(pageCharacteristics, value);

    }
}