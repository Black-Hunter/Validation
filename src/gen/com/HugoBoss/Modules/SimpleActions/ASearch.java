package gen.com.HugoBoss.Modules.SimpleActions;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>This Module is responsible for searching for a Product By taking its number as argument in the Parameter.</p>
 */
public class ASearch extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String searchTerm = parameters[0];
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        waitForVisible("css= .context-nav__list-item--search > a:nth-child(1) > svg");
        assertVisible("css= .context-nav__list-item--search > a:nth-child(1) > svg");
        // css= .context-nav__list-item--search > a:nth-child(1) > svg:nth-child(1)
        // .context-nav__list-item--search > a:nth-child(1)
        click("//*[contains ( @class, 'context-nav__list-item context-nav__list-item--search js-simple-search')]");
        waitForVisible("id=simpleSearch-search-sidebar");
        typeAndWait("id=simpleSearch-search-sidebar", searchTerm);

    }
}