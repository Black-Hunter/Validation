package gen.com.HugoBoss.Modules.Basket;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>Module opens the small basket wich is simulkating clicking on the baskets icon. </p>
 */
public class AOpenMiniBasket extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        waitForElementPresent("css= [class=\"context-nav__list-item__counter context-nav__list-item__counter--show js-cart-counter js-cart-counter-ref\"]");
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute(" .js--current-cart ");

        waitForVisible("css= .js--current-cart ");
        mouseMove("css= li.context-nav__list-item:nth-child(6)");
        click("css=.js--current-cart");

    }
}