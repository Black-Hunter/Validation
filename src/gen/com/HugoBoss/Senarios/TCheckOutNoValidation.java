package gen.com.HugoBoss.Senarios;

import org.junit.After;
import org.junit.Test;
import com.xceptance.xlt.api.webdriver.XltDriver;
import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverScriptTestCase;
import gen.com.HugoBoss.Modules.Navigation.AOpenHomePage;
import gen.com.HugoBoss.Modules.SimpleActions.ASearch;
import gen.com.HugoBoss.Modules.SimpleActions.ASelectSize;
import gen.com.HugoBoss.Modules.Basket.AAddToCart;
import gen.com.HugoBoss.Modules.Basket.AOpenBascket;
import gen.com.HugoBoss.Modules.Navigation.AGoToRegestration;
import gen.com.HugoBoss.Modules.Navigation.AGoToPersonaldata;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.AFillPersonalData;
import gen.com.HugoBoss.Modules.Navigation.AGoToPaymentOption;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.APayCreditCard;
import gen.com.HugoBoss.Modules.Navigation.AGoToOrderSummary;
import gen.com.HugoBoss.Modules.Navigation.AConfirm;

/**
 * <p>This test case Provides the minimum requierments for a Checkout Prozess,  Validation and Verification are not requierd.</p>
 */
public class TCheckOutNoValidation extends AbstractWebDriverScriptTestCase
{

    /**
     * Constructor.
     */
    public TCheckOutNoValidation()
    {
        super(new XltDriver(true), "http://dev.hugoboss.com/de");
    }


    /**
     * Executes the test.
     *
     * @throws Throwable if anything went wrong
     */
    @Test
    public void test() throws Throwable
    {
        // Opening the Homepage and Cleaing the Cookies. it is necessary to have a frish start.
        final AOpenHomePage _aOpenHomePage = new AOpenHomePage();
        _aOpenHomePage.execute();

        // Start searching for the first product. The search Term is declared as "test data". if the product is not available you need to choose a new number and add it to the test data.
        final ASearch _aSearch = new ASearch();
        //if(evaluatesToTrue("NoCondition")) {
        _aSearch.execute(resolve("${FirstSearchTerm}"));
        // }
        echo("${document.getElementsByClassName(\"js--size-selection-label\").textContent }");
        // select  a number for a size the first avilable one. A condition added to avoid fail trying to choose a number is just avilable in one size.
        final ASelectSize _aSelectSize = new ASelectSize();
        if (evaluatesToTrue("document.body.contains(document.getElementsByClassName(\"js--size-selection-label\")[0]) && document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\""))
        {
            _aSelectSize.execute();
        }

        // After selecting the product it must be added to the cart to continue buying
        final AAddToCart _aAddToCart = new AAddToCart();
        _aAddToCart.execute();

        // Start searching for the second product. The search Term is declared as "test data". if the product is not available you need to choose a new number and add it to the test data.
        final ASearch _aSearch0 = new ASearch();
        _aSearch0.execute(resolve("${SecondSearchTerm}"));

        // select  a number for a size the second avilable one. A condition added to avoid fail trying to choose a number is just avilable in one size.
        final ASelectSize _aSelectSize0 = new ASelectSize();
        if (evaluatesToTrue("document.body.contains(document.getElementsByClassName(\"js--size-selection-label\")[0]) && document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\""))
        {
            _aSelectSize0.execute();
        }

        // Buying the product after selecting the size.
        final AAddToCart _aAddToCart0 = new AAddToCart();
        _aAddToCart0.execute();

        // opining the basket.
        final AOpenBascket _aOpenBascket = new AOpenBascket();
        _aOpenBascket.execute();

        // Direction to the Regestration Page.
        final AGoToRegestration _aGoToRegestration = new AGoToRegestration();
        _aGoToRegestration.execute();

        // Direction to the personalform Page.
        final AGoToPersonaldata _aGoToPersonaldata = new AGoToPersonaldata();
        _aGoToPersonaldata.execute();

        // Filling the personalform.
        final AFillPersonalData _aFillPersonalData = new AFillPersonalData();
        _aFillPersonalData.execute(resolve("${Salutation}"), resolve("${FirstName}"), resolve("${LastName}"), resolve("${Street}"), resolve("${StreetNumber}"), resolve("${ZIPCODE}"), resolve("${CITY}"), resolve("${AddToAdress}"), resolve("${Email}"));

        // Direction to the paymentform Page.
        final AGoToPaymentOption _aGoToPaymentOption = new AGoToPaymentOption();
        _aGoToPaymentOption.execute();

        // Filling the paymentform.
        final APayCreditCard _aPayCreditCard = new APayCreditCard();
        _aPayCreditCard.execute(resolve("${VISACODE}"), resolve("${Month}"), resolve("${YEAR}"), resolve("${secCode}"));

        // Direction to the order summery Page.
        final AGoToOrderSummary _aGoToOrderSummary = new AGoToOrderSummary();
        _aGoToOrderSummary.execute();

        // direct to confermation and submitting.
        final AConfirm _aConfirm = new AConfirm();
        _aConfirm.execute();


    }


    /**
     * Clean up.
     */
    @After
    public void quitDriver()
    {
        // Shutdown WebDriver.
        getWebDriver().quit();
    }

}