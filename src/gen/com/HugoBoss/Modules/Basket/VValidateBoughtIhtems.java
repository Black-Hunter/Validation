package gen.com.HugoBoss.Modules.Basket;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;
import gen.com.HugoBoss.Modules.SimpleActions.VFirefoxSize;
import gen.com.HugoBoss.Modules.SimpleActions.VChromeSize;

/**
 * <p>The new Features here are Validations and verifications of Items in the Website, which is directly related to the Checkout Prozess. These Items are the bought Items.</p>
 */
public class VValidateBoughtIhtems extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        assertText("css=tr.product-table__row--body:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${FirstProductColor}"));
        final VFirefoxSize _vFirefoxSize = new VFirefoxSize();
        if (evaluatesToTrue("typeof InstallTrigger !== 'undefined'"))
        {
            _vFirefoxSize.execute("GRÖSSE", resolve("${FirstProductSize}"), "css=tr.product-table__row--body:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1)", "");
        }

        final VChromeSize _vChromeSize = new VChromeSize();
        if (evaluatesToTrue("!!window.chrome && !!window.chrome.webstore"))
        {
            _vChromeSize.execute("GRÖSSE", resolve("${FirstProductSize}"), "", "css=tr.product-table__row--body:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1)");
        }

        assertText("css= tr.product-table__row--body:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)", resolve("${FirstProductName}"));
        assertText("css=tr.product-table__row--body:nth-child(1) > td:nth-child(3) > span:nth-child(2)", "1");
        assertText("css=tr.product-table__row--body:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${FirstProductPrice}"));
        assertText("css=tr.product-table__row--table:nth-child(2) > td:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${SecondProductColor}"));
        final VFirefoxSize _vFirefoxSize0 = new VFirefoxSize();
        if (evaluatesToTrue("typeof InstallTrigger !== 'undefined'"))
        {
            _vFirefoxSize0.execute("GRÖSSE", resolve("${SecondProductSize}"), "css=tr.product-table__row--table:nth-child(2) > td:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1)", "");
        }

        final VChromeSize _vChromeSize0 = new VChromeSize();
        if (evaluatesToTrue("!!window.chrome && !!window.chrome.webstore"))
        {
            _vChromeSize0.execute("GRÖSSE", resolve("${SecondProductSize}"), "", "css=tr.product-table__row--table:nth-child(2) > td:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1)");
        }

        assertText("css= tr.product-table__row--table:nth-child(2) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)", resolve("${SecondProductName}"));
        assertText("css=tr.product-table__row--table:nth-child(2) > td:nth-child(3) > span:nth-child(2)", "1");
        assertText("css=tr.product-table__row--table:nth-child(2) > td:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${SecondProductPrice}"));

    }
}