//package gen.com.HugoBoss.Senarios;
//
//import org.junit.After;
//import org.junit.Test;
//import com.xceptance.xlt.api.webdriver.XltDriver;
//import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverScriptTestCase;
//import gen.com.HugoBoss.Modules.Navigation.AOpenHomePage;
//import gen.com.HugoBoss.Modules.SimpleActions.ASearch;
//import gen.com.HugoBoss.Modules.SimpleActions.ASelectSize;
//import gen.com.HugoBoss.Modules.Basket.AAddToCart;
//import gen.com.HugoBoss.Modules.Basket.AOpenBascket;
//import gen.com.HugoBoss.Modules.Navigation.AGoToRegestration;
//import gen.com.HugoBoss.Modules.Navigation.AGoToPersonaldata;
//import gen.com.HugoBoss.Modules.PersonalDataAndPayment.AFillPersonalData;
//import gen.com.HugoBoss.Modules.Navigation.AGoToPaymentOption;
//import gen.com.HugoBoss.Modules.PersonalDataAndPayment.APayCreditCard;
//import gen.com.HugoBoss.Modules.Navigation.AGoToOrderSummary;
//import com.xceptance.xlt.ai.AI;
//import gen.com.HugoBoss.Modules.Navigation.AConfirm;
//
///**
// * <p>This test case Provides the GUI requierments for a Checkout Prozess,  Validation using Machien Learning.
// * I didnt use this scenario. AI module doesnt work.</p>
// */
//public class TCheckOutVisualValidationUsingMachineLearning extends AbstractWebDriverScriptTestCase
//{
//
//    /**
//     * Constructor.
//     */
//    public TCheckOutVisualValidationUsingMachineLearning()
//    {
//        super(new XltDriver(true), "http://dev.hugoboss.com/de");
//    }
//
//
//    /**
//     * Executes the test.
//     *
//     * @throws Throwable if anything went wrong
//     */
//    @Test
//    public void test() throws Throwable
//    {
//        // Opening the Homepage and Cleaing the Cookies
//        final AOpenHomePage _aOpenHomePage = new AOpenHomePage();
//        _aOpenHomePage.execute();
//
//        final AI _aI = new AI();
//        _aI.execute(getWebDriver());
//
//        // Search for a spicific Product
//        final ASearch _aSearch = new ASearch();
//        //if(evaluatesToTrue("NoCondition")) {
//        _aSearch.execute(resolve("${FirstSearchTerm}"));
//        // }
//        final AI _aI0 = new AI();
//        _aI0.execute(getWebDriver());
//
//        // Buy the Product you searched for
//        echo("document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\"");
//        final ASelectSize _aSelectSize = new ASelectSize();
//        if (evaluatesToTrue("document.body.contains(document.getElementsByClassName(\"js--size-selection-label\")[0]) && document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\""))
//        {
//            _aSelectSize.execute();
//        }
//
//        final AAddToCart _aAddToCart = new AAddToCart();
//        _aAddToCart.execute();
//
//        // Search for a spicific Product
//        final ASearch _aSearch0 = new ASearch();
//        _aSearch0.execute(resolve("${SecondSearchTerm}"));
//
//        final AI _aI1 = new AI();
//        _aI1.execute(getWebDriver());
//
//        // Buy the Product you searched for
//        final ASelectSize _aSelectSize0 = new ASelectSize();
//        if (evaluatesToTrue("document.body.contains(document.getElementsByClassName(\"js--size-selection-label\")[0]) && document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\""))
//        {
//            _aSelectSize0.execute();
//        }
//
//        final AAddToCart _aAddToCart0 = new AAddToCart();
//        _aAddToCart0.execute();
//
//        final AOpenBascket _aOpenBascket = new AOpenBascket();
//        _aOpenBascket.execute();
//
//        final AI _aI2 = new AI();
//        _aI2.execute(getWebDriver());
//
//        final AGoToRegestration _aGoToRegestration = new AGoToRegestration();
//        _aGoToRegestration.execute();
//
//        final AGoToPersonaldata _aGoToPersonaldata = new AGoToPersonaldata();
//        _aGoToPersonaldata.execute();
//
//        final AI _aI3 = new AI();
//        _aI3.execute(getWebDriver());
//
//        // Normal Filling Poersonal Data
//        final AFillPersonalData _aFillPersonalData = new AFillPersonalData();
//        _aFillPersonalData.execute(resolve("${Salutation}"), resolve("${FirstName}"), resolve("${LastName}"), resolve("${Street}"), resolve("${StreetNumber}"), resolve("${ZIPCODE}"), resolve("${CITY}"), resolve("${AddToAdress}"), resolve("${Email}"));
//
//        final AGoToPaymentOption _aGoToPaymentOption = new AGoToPaymentOption();
//        _aGoToPaymentOption.execute();
//
//        final AI _aI4 = new AI();
//        _aI4.execute(getWebDriver());
//
//        // Normal Filling Billing Data
//        final APayCreditCard _aPayCreditCard = new APayCreditCard();
//        _aPayCreditCard.execute(resolve("${VISACODE}"), resolve("${Month}"), resolve("${YEAR}"), resolve("${secCode}"));
//
//        final AGoToOrderSummary _aGoToOrderSummary = new AGoToOrderSummary();
//        _aGoToOrderSummary.execute();
//
//        final AI _aI5 = new AI();
//        _aI5.execute(getWebDriver());
//
//        // Send an Confirmation Email and Confirm the Billing and Shipping
//        final AConfirm _aConfirm = new AConfirm();
//        _aConfirm.execute();
//
//
//    }
//
//
//    /**
//     * Clean up.
//     */
//    @After
//    public void quitDriver()
//    {
//        // Shutdown WebDriver.
//        getWebDriver().quit();
//    }
//
//}