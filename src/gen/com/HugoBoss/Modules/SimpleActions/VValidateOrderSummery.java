package gen.com.HugoBoss.Modules.SimpleActions;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>Module to validate the items in the order summery.</p>
 */
public class VValidateOrderSummery extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        assertVisible("css= button.button:nth-child(2)");
        assertVisible("css= a.button");
        waitForVisible("css= .item1");
        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute(".item1");

        assertVisible("css= .item1");
        assertVisible("css= .item2");
        assertVisible("css= .item3");
        assertVisible("css= .item4");
        assertVisible("css= button.button:nth-child(1)");
        assertText("css= h3.font__label", "IHRE BESTELLUNG");
        assertText("css= td.order-totals--black--table:nth-child(1)", "Gesamtsumme der Ware");
        assertText("css= tr.order-totals__row--table:nth-child(2) > td:nth-child(1) > span:nth-child(1)", " DHL Paket Versand - Home ");
        assertText("css= .order-totals__description", "glob:Zustellung: Ca. 2-3 Werktage ab Bestellung");
        assertText("css= tr.order-totals__row:nth-child(3) > td:nth-child(1)", "inkl. 19% MwSt.");
        assertText("css=td.order-totals__col--result:nth-child(1)", "Gesamtpreis\n");
        assertText("css= .item1 > p:nth-child(1)", "\n\nStandardversand kostenfrei\n");
        assertText("css= .item2 > p:nth-child(1)", "Kostenlose\nRücksendung");
        assertText("css=  .item3 > p:nth-child(1)", "30 Tage\nWiderrufsrecht");
        assertText("css= .item4 > p:nth-child(1)", "DHL Express\nVersand\n9,95 €");

    }
}