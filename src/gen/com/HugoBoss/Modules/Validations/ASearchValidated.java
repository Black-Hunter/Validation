package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;
import gen.com.HugoBoss.Modules.Navigation.VPage;

/**
 * <p>This Module is responsible for searching for a Product By taking its number as argument in the Parameter.</p>
 */
public class ASearchValidated extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final String searchTerm = parameters[0];
        // Save Data of Product
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        waitForVisible("css= .context-nav__list-item--search > a:nth-child(1) ");
        assertVisible("css= .context-nav__list-item--search > a:nth-child(1) > svg");
        waitForVisible("//*[contains ( @class, 'context-nav__list-item context-nav__list-item--search js-simple-search')]");
        // css= .context-nav__list-item--search > a:nth-child(1) > svg:nth-child(1)
        // .context-nav__list-item--search > a:nth-child(1)
        click("//*[contains ( @class, 'context-nav__list-item context-nav__list-item--search js-simple-search')]");
        waitForVisible("id=simpleSearch-search-sidebar");
        final VPage _vPage = new VPage();
        _vPage.execute("document.getElementsByClassName(\"font__label font__label--large search-sidebar__title\")[0].innerHTML", "Suchen");

        final VPage _vPage0 = new VPage();
        _vPage0.execute("document.querySelectorAll(\".js--search-suggestion-wrapper__static-suggestions > h1:nth-child(1)\")[0].innerHTML", "VORSCHLÄGE");

        assertVisible("css= li.search-sidebar__suggestions:nth-child(1) > a:nth-child(1)");
        assertVisible("css= li.search-sidebar__suggestions:nth-child(2) > a:nth-child(1)");
        assertVisible("css= li.search-sidebar__suggestions:nth-child(3) > a:nth-child(1)");
        assertVisible("css= li.search-sidebar__suggestions:nth-child(4) > a:nth-child(1)");
        assertVisible("css= li.search-sidebar__suggestions:nth-child(5) > a:nth-child(1)");
        waitForVisible("css= .search-sidebar__title");
        typeAndWait("id=simpleSearch-search-sidebar", searchTerm);

    }
}