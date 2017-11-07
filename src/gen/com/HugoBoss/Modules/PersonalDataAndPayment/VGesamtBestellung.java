package gen.com.HugoBoss.Modules.PersonalDataAndPayment;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>validating the end sum for products price. in this case two products.</p>
 */
public class VGesamtBestellung extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        storeEval(resolve("\n(parseFloat('${FirstProductPrice}'.split(\",\")[0]+\".\"+'${FirstProductPrice}'.split(\",\")[1]) + parseFloat('${SecondProductPrice}'.split(\",\")[0]+\".\"+'${SecondProductPrice}'.split(\",\")[1]) ).toFixed(2);\n"), "SummeryProductPrice");
        assertText("css= td.order-totals--black--table:nth-child(2)", resolve("${SummeryProductPrice} €"));
        assertText("css= .mini-payment-instrument > div:nth-child(2) > div:nth-child(2)", resolve("${SummeryProductPrice} €"));

    }
}