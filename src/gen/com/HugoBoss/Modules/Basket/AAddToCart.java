package gen.com.HugoBoss.Modules.Basket;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>This Module is responsible for  Buying Items been searched for in a previous Module namely Search-Module</p>
 */
public class AAddToCart extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        waitForVisible("css= #add-to-cart ");
        waitForNotElementPresent("css= [class=\"button button--primary button--full addToCartOverlay button__addToCart--disabled add-to-cart icon-all-brands-basket-icon widget-initialized\"]");
        click("css= #add-to-cart ");
        final MHelper_waitForDOMState _mHelper_waitForDOMState0 = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState0.execute();

        // //*[contains(@class , "js-overlays__button-close sidebar__button-close ")]
        // css=  div.sidebar__wrapper:nth-child(1) > button:nth-child(2)
        waitForVisible("css= div.sidebar__wrapper:nth-child(1) > button:nth-child(2)");
        // div.sidebar__wrapper:nth-child(1) > button:nth-child(2)
        click("css=  div.sidebar__wrapper:nth-child(1) > button:nth-child(2) > svg:nth-child(1)");
        waitForNotElementPresent("css= .overlay-content-wrapper--fixed");

    }
}