package gen.com.HugoBoss.Modules.Basket;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>Storing module, it save the data of the first Product.</p>
 * <h1 id="name-as-uppercase">Name as Uppercase</h1>
 * <h1 id="color-as-uppercase">Color as Uppercase</h1>
 * <h1 id="size">size</h1>
 * <h1 id="quantity">Quantity</h1>
 */
public class SSecondProduct extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        waitForVisible("css= .product-stage__control-item__selcted-size");
        storeText("css= .product-stage__control-item__selcted-size", "SecondProductSize");
        storeText("css= .product-stage__headline", "SecondProductName");
        storeText("css= div.product-stage__control-item:nth-child(1) > p:nth-child(1)", "SecondProductColor");
        storeEval(resolve("\"${SecondProductColor}\".toUpperCase();"), "SecondProductColor");
        storeText("css= .product-price--price-sales", "SecondProductPrice");

    }
}