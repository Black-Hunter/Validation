package gen.com.HugoBoss.Senarios;

import org.junit.After;
import org.junit.Test;
import com.xceptance.xlt.api.webdriver.XltDriver;
import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverScriptTestCase;
import gen.com.HugoBoss.Modules.Navigation.AOpenHomePage;
import gen.com.HugoBoss.Modules.Validations.VGeneralValidationHomepage;
import gen.com.HugoBoss.Modules.Basket.SFirstProduct;
import gen.com.HugoBoss.Modules.Validations.ASearchValidated;
import gen.com.HugoBoss.Modules.SimpleActions.ASelectSize;
import gen.com.HugoBoss.Modules.Basket.SSecondProduct;
import gen.com.HugoBoss.Modules.Helpers.MHelper_scrollElementIntoView;
import gen.com.HugoBoss.Modules.Basket.AAddToCart;
import gen.com.HugoBoss.Modules.Validations.VGeneralValidationSearch;
import gen.com.HugoBoss.Modules.Basket.AOpenMiniBasket;
import gen.com.HugoBoss.Modules.Validations.VMiniBascketValdated;
import gen.com.HugoBoss.Modules.Basket.AOpenBascket;
import gen.com.HugoBoss.Modules.Basket.VValidateItemsInBasket;
import gen.com.HugoBoss.Modules.Validations.VGeneralValidationCart;
import gen.com.HugoBoss.Modules.Navigation.AGoToRegestration;
import gen.com.HugoBoss.Modules.Validations.VGeneralValidationRegestration;
import gen.com.HugoBoss.Modules.Navigation.AGoToPersonaldata;
import gen.com.HugoBoss.Modules.Validations.VValidateAddresForm;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.VAddressform;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.AFillPersonalData;
import gen.com.HugoBoss.Modules.Navigation.AGoToPaymentOption;
import gen.com.HugoBoss.Modules.Validations.VValidatePaymentForm;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.APayCreditCardValidated;
import gen.com.HugoBoss.Modules.Navigation.AGoToOrderSummary;
import gen.com.HugoBoss.Modules.SimpleActions.VValidateOrderSummery;
import gen.com.HugoBoss.Modules.Navigation.VPage;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.VValidateShippingAdress;
import gen.com.HugoBoss.Modules.Basket.VValidateBoughtIhtems;
import gen.com.HugoBoss.Modules.PersonalDataAndPayment.VGesamtBestellung;
import gen.com.HugoBoss.Modules.Validations.VConfirmation;

/**
 * <p>This test case Provides the maximum requierments for a Checkout Prozess,  Validation and Verification are  requierd.</p>
 */
public class TCheckOutFullyValidated extends AbstractWebDriverScriptTestCase
{

    /**
     * Constructor.
     */
    public TCheckOutFullyValidated()
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
        // VPage is a direction validation insure that this is the right page. General Validation are validations to elements in the page.
        // Starting Home Page and Deleting the Coockies
        final AOpenHomePage _aOpenHomePage = new AOpenHomePage();
        _aOpenHomePage.execute();

        // Validate the site's Menu, other Elements and so on. the page is changable so this module may fail many times. if it fails marke it and press ctrl+shift+c and keep testing.
        final VGeneralValidationHomepage _vGeneralValidationHomepage = new VGeneralValidationHomepage();
        _vGeneralValidationHomepage.execute();

        // Start searching for the first product. The search Term is declared as "test data". if the product is not available you need to choose a new number and add it to the test data.
        final ASearchValidated _aSearchValidated = new ASearchValidated();
        _aSearchValidated.execute(resolve("${FirstSearchTerm}"));

        // select  a number for a size the first avilable one. A condition added to avoid fail trying to choose a number is just avilable in one size.
        final ASelectSize _aSelectSize = new ASelectSize();
        if (evaluatesToTrue("document.body.contains(document.getElementsByClassName(\"js--size-selection-label\")[0]) && document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\""))
        {
            _aSelectSize.execute();
        }

        // Storing the data of the first product. Data are Name, size, color.
        final SFirstProduct _sFirstProduct = new SFirstProduct();
        _sFirstProduct.execute();

        // After selecting the product it must be added to the cart to continue buying
        final AAddToCart _aAddToCart = new AAddToCart();
        _aAddToCart.execute();

        // After Searching for product the page changes. and the elements in the page must be validated.
        // Validate the site's Menu, other Elements and so on. the page is changable so this module may fail many times. if it fails marke it and press ctrl+shift+c and keep testing.
        final VGeneralValidationSearch _vGeneralValidationSearch = new VGeneralValidationSearch();
        _vGeneralValidationSearch.execute();

        // Start searching for the second product. The search Term is declared as "test data". if the product is not available you need to choose a new number and add it to the test data.
        final ASearchValidated _aSearchValidated0 = new ASearchValidated();
        _aSearchValidated0.execute(resolve("${SecondSearchTerm}"));

        // select  a number for a size the second avilable one. A condition added to avoid fail trying to choose a number is just avilable in one size.
        final ASelectSize _aSelectSize0 = new ASelectSize();
        if (evaluatesToTrue("document.body.contains(document.getElementsByClassName(\"js--size-selection-label\")[0]) && document.getElementsByClassName(\"js--size-selection-label\")[0].textContent  ==  \"Bitte Größe wählen\""))
        {
            _aSelectSize0.execute();
        }

        // Storing the data of the second product. Data are Name, size, color.
        final SSecondProduct _sSecondProduct = new SSecondProduct();
        _sSecondProduct.execute();

        // Validate the site's Menu, other Elements and so on. the page is changable so this module may fail many times. if it fails marke it and press ctrl+shift+c and keep testing.
        final MHelper_scrollElementIntoView _mHelper_scrollElementIntoView = new MHelper_scrollElementIntoView();
        _mHelper_scrollElementIntoView.execute("#add-to-cart ");

        // Buying the product after selecting.
        final AAddToCart _aAddToCart0 = new AAddToCart();
        _aAddToCart0.execute();

        // After Searching for product the page changes. and the elements in the page must be validated.
        // Validate the site's Menu, other Elements and so on. the page is changable so this module may fail many times. if it fails marke it and press ctrl+shift+c and keep testing.
        final VGeneralValidationSearch _vGeneralValidationSearch0 = new VGeneralValidationSearch();
        _vGeneralValidationSearch0.execute();

        // First validation for the bought items in the mini basket, and opining it.
        final AOpenMiniBasket _aOpenMiniBasket = new AOpenMiniBasket();
        _aOpenMiniBasket.execute();

        final VMiniBascketValdated _vMiniBascketValdated = new VMiniBascketValdated();
        _vMiniBascketValdated.execute();

        // Second validation for the bought items in the basket, and opining it.
        final AOpenBascket _aOpenBascket = new AOpenBascket();
        _aOpenBascket.execute();

        final VPage _vPage = new VPage();
        _vPage.execute("document.getElementsByClassName(\"page-title--text-title\")[0].innerHTML ", "Warenkorb");

        final VValidateItemsInBasket _vValidateItemsInBasket = new VValidateItemsInBasket();
        _vValidateItemsInBasket.execute();

        final VGeneralValidationCart _vGeneralValidationCart = new VGeneralValidationCart();
        _vGeneralValidationCart.execute();

        // Direction to the Regestration Page after validating the Basket. and validate all the element in it.
        final AGoToRegestration _aGoToRegestration = new AGoToRegestration();
        _aGoToRegestration.execute();

        final VPage _vPage0 = new VPage();
        _vPage0.execute("document.getElementsByClassName(\"page-content__header page-content__header--border page-content__header--text-title page-content__header--text-title--login\")[0].innerHTML", "Anmelden");

        final VGeneralValidationRegestration _vGeneralValidationRegestration = new VGeneralValidationRegestration();
        _vGeneralValidationRegestration.execute();

        // Save Data of Product
        // VPage is a direction validation. Insure the correct page by identifying the it using the some identical element in the page.
        final AGoToPersonaldata _aGoToPersonaldata = new AGoToPersonaldata();
        _aGoToPersonaldata.execute();

        final VPage _vPage1 = new VPage();
        _vPage1.execute("document.getElementsByClassName(\"font__h2\")[0].innerHTML", "Rechnungsanschrift eingeben");

        final VValidateAddresForm _vValidateAddresForm = new VValidateAddresForm();
        _vValidateAddresForm.execute();

        final VAddressform _vAddressform = new VAddressform();
        _vAddressform.execute();

        final AFillPersonalData _aFillPersonalData = new AFillPersonalData();
        _aFillPersonalData.execute(resolve("${Salutation}"), resolve("${FirstName}"), resolve("${LastName}"), resolve("${Street}"), resolve("${StreetNumber}"), resolve("${ZIPCODE}"), resolve("${CITY}"), resolve("${AddToAdress}"), resolve("${Email}"));

        // Diricting to Billingform. Adding Billing Data and Validating the Input Fields and other elements in the site.
        final AGoToPaymentOption _aGoToPaymentOption = new AGoToPaymentOption();
        _aGoToPaymentOption.execute();

        final VPage _vPage2 = new VPage();
        _vPage2.execute("document.getElementsByClassName(\"form__legend\")[0].innerHTML", "Wählen Sie eine Zahlungsart");

        final VValidatePaymentForm _vValidatePaymentForm = new VValidatePaymentForm();
        _vValidatePaymentForm.execute();

        final APayCreditCardValidated _aPayCreditCardValidated = new APayCreditCardValidated();
        _aPayCreditCardValidated.execute(resolve("${VISACODE}"), resolve("${Month}"), resolve("${secCode}"), resolve("${YEAR}"));

        // directing to the Summery. Validation for Shipping Adress, orderd items and page elements.
        final AGoToOrderSummary _aGoToOrderSummary = new AGoToOrderSummary();
        _aGoToOrderSummary.execute();

        final VValidateOrderSummery _vValidateOrderSummery = new VValidateOrderSummery();
        _vValidateOrderSummery.execute();

        final VPage _vPage3 = new VPage();
        _vPage3.execute("document.getElementsByClassName(\"page-content__header\")[0].innerHTML", "Bestellung abschließen");

        final VValidateShippingAdress _vValidateShippingAdress = new VValidateShippingAdress();
        _vValidateShippingAdress.execute();

        final VValidateBoughtIhtems _vValidateBoughtIhtems = new VValidateBoughtIhtems();
        _vValidateBoughtIhtems.execute();

        // final VGesamtBestellung _vGesamtBestellung = new VGesamtBestellung();
        // _vGesamtBestellung.execute();
        // Direct to the confirmation page and validate the confirmation massage.
        final VConfirmation _vConfirmation = new VConfirmation();
        _vConfirmation.execute();


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