package gen.com.HugoBoss.Modules.Helpers;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>Scrolls the element with the given CSS locator into the middle of the viewport.</p>
 */
public class MHelper_scrollElementIntoView extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        // A css element locator.
        final String cssLocator = parameters[0];
        // This function scrolls the given CSS element into the middle of the viewport. This is necessary for clicking or selecting elements that are not inside the viewport, if the test is run with any firefox webdriver.
        storeEval("(function(){\nvar el = document.querySelector(\"" + cssLocator + "\");\nvar r = el.getBoundingClientRect();\nvar y = (r.bottom + r.top - window.innerHeight) / 2;\nwindow.scrollTo(0, y);\n})()", "unusedVariable");

    }
}