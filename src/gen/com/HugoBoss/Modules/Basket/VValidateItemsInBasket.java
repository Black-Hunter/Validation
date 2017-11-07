package gen.com.HugoBoss.Modules.Basket;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>The new Features here are Validations and verifications of Items in the Website, which is directly related to the Checkout Prozess. These Items are the bought Items.</p>
 */
public class VValidateItemsInBasket extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        assertText("css=div.cart-product__wrapper:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${FirstProductColor}"));
        assertText("css=div.cart-product__wrapper:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)", resolve("${FirstProductName}"));
        assertText("css=[name=\"dwfrm_cart_shipments_i0_items_i0_quantity\"] > [selected=\"selected\"]", "1");
        assertText("css= [name=\"dwfrm_cart_shipments_i0_items_i0_size\"] > [selected=\"selected\"]", resolve("${FirstProductSize}"));
        assertText("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > span:nth-child(1)", resolve("${FirstProductPrice}"));
        assertText("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)", resolve("${SecondProductColor}"));
        assertText("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)", resolve("${SecondProductName}"));
        assertText("css=[name=\"dwfrm_cart_shipments_i0_items_i1_quantity\"] > [selected=\"selected\"]", "1");
        assertText("css= [name=\"dwfrm_cart_shipments_i0_items_i1_size\"] > [selected=\"selected\"]", resolve("${SecondProductSize}"));
        assertText("css=div.cart-product__wrapper:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > span:nth-child(1)", resolve("${SecondProductPrice}"));

    }
}