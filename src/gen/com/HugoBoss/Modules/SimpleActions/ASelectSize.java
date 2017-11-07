package gen.com.HugoBoss.Modules.SimpleActions;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>Action Module to select the size</p>
 */
public class ASelectSize extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        // css= .product-stage__control-item__unselcted-size
        waitForVisible("//*[contains(@class,\"js--size-selection-label product-stage__control-item__unselcted-size\")]");
        // .product-stage__control-item__unselcted-size
        click("//*[contains(@class,\"js--size-selection-label product-stage__control-item__unselcted-size\")]");
        waitForVisible("css= .product-stage__choose-size");
        // Select Size
        waitForNotElementPresent(" css= .product-stage__choose-size product-stage__choose-size--is-hide");
        click("css= [class=\"product-stage__choose-size__select-size product-stage__choose-size__select-size--emptyswatch\"]");

    }
}