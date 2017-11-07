package gen.com.HugoBoss.Modules.Basket;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>Module To directs  to the Baskets site</p>
 */
public class AOpenBascket extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        open("/de/cart");
        // mouseOver("//*[contains(@class,\"context-nav__link js--current-cart widget-initialized\")]");
        // css= .js--current-cart
        // click("//*[contains(@class,\"context-nav__link js--current-cart widget-initialized\")]");
        // waitForVisible("css= .cart-actions > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(1) > button:nth-child(1)");
    }
}