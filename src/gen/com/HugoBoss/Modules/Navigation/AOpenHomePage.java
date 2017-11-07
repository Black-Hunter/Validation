package gen.com.HugoBoss.Modules.Navigation;

import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverModule;

/**
 * <p>This Module is responsible for  Opening a new Fresh Homepage whithout Cookies.</p>
 */
public class AOpenHomePage extends AbstractWebDriverModule
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doCommands(final String...parameters) throws Exception
    {
        open(resolve("${BaseURL}"));
        deleteAllVisibleCookies();
        // Frish start without cookies
        open(resolve("${BaseURL}"));

    }
}