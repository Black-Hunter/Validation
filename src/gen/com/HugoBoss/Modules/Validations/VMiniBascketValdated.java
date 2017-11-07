package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_waitForDOMState;

/**
 * <p>Module To directs  to the Basket</p>
 */
public class VMiniBascketValdated extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        final MHelper_waitForDOMState _mHelper_waitForDOMState = new MHelper_waitForDOMState();
        _mHelper_waitForDOMState.execute();

        // mouseMove("//*[contains(@class,\"context-nav__link js--current-cart widget-initialized\")]");
        // css= .js--current-cart
        // click("//*[contains(@class,\"context-nav__link js--current-cart widget-initialized\")]");
        assertText("css= .js-cart-counter", "2");
        waitForVisible("css= .cart-actions > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(1) > button:nth-child(1)");
        assertEval("document.getElementsByClassName(\"page-title--text-title\")[0].innerHTML", "Warenkorb");
        assertText("css= div.order-totals:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)", "Gesamtsumme der Ware");
        assertVisible("css= .cart-actions > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(1) > button:nth-child(1)");
        assertVisible("css=.cart-actions > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(1) > a:nth-child(2)");
        assertEval("document.getElementsByClassName(\"font__label font__label--large font__label--product-table font__label--product-table--sidebar\")[0].innerHTML", "Ihre Bestellung");
        assertText("css= div.order-totals:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > span:nth-child(1)", "DHL Paket Versand - Home");
        assertText("css=div.order-totals:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1)", "inkl. 19% MwSt.");
        assertVisible("css= .add");
        assertText("css= tr.order-total:nth-child(5) > td:nth-child(1)", "Gesamtpreis");
        assertVisible("css= div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(1) > button:nth-child(1)");
        assertVisible("css= div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > fieldset:nth-child(1) > span:nth-child(1) > a:nth-child(2) > span:nth-child(1)");
        assertVisible("css=div.product-table__cart-actions:nth-child(8) > form:nth-child(1) > a:nth-child(2)");
        assertText("css=li.search-sidebar__suggestions:nth-child(1)", " Kostenloser Standardversand ");
        assertText("css=li.search-sidebar__suggestions:nth-child(2)", " Kostenlose Rücksendung ");
        assertVisible("css=.payment-images");
        assertElementCount("css=.payment-images > .icon", 6);
        assertText("css=div.cart-product__wrapper:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${FirstProductColor}"));
        assertText("css=div.cart-product__wrapper:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)", resolve("${FirstProductName}"));
        assertText("css= [name=\"dwfrm_cart_shipments_i0_items_i0_size\"] > [selected=\"selected\"]", resolve("${FirstProductSize}"));
        assertSelectedValue("css=div.cart-product__wrapper:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1) > select:nth-child(3)", "1");
        assertText("css=div.cart-product__wrapper:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1)", resolve("${FirstProductPrice}"));
        assertText("css= div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${SecondProductColor}"));
        assertText("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)", resolve("${SecondProductName}"));
        assertText("css= [name=\"dwfrm_cart_shipments_i0_items_i1_size\"]  > [selected=\"selected\"]", resolve("${SecondProductSize}"));
        assertSelectedValue("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1) > select:nth-child(3)", "1");
        assertText("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1)", resolve("${SecondProductPrice}"));

    }
}