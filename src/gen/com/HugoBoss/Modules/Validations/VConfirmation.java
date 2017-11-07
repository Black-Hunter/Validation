package gen.com.HugoBoss.Modules.Validations;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;

/**
 * <p>Module to validate the confermation page.</p>
 */
public class VConfirmation extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        waitForVisible("css= button.button:nth-child(1)");
        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute("button.button:nth-child(1)");

        clickAndWait("css=button.button:nth-child(1)");
        storeEval("(function() {\nvar text =document.querySelectorAll(\".checkout__confirmation-message > p:nth-child(3)\")[0].innerHTML;\nvar thenum = text.replace( /^\\D+/g, '');\nvar number = parseInt(thenum);\n return number;\n})()", "pattern");
        assertText("css= h1.font__h2", "\nVielen Dank für Ihren Einkauf im HUGO BOSS Online Store!");
        assertText("css= .checkout__confirmation-message > p:nth-child(2)", "Vielen Dank für Ihre Bestellung im HUGO BOSS Online Store!");
        assertText("css= .checkout__confirmation-message > p:nth-child(3)", resolve("Wir werden Ihre Bestellung mit der Nr. ${pattern} schnellstmöglichst bearbeiten.\nEine Mail mit allen Angaben zu Ihrer Bestellung wird in Kürze an Ihre Adresse versendet."));

    }
}