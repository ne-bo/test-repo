package Pages;

import Elements.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;


/**
 * Created by natasha on 5/28/16.
 */
public class MainPage {

    private WebDriver driver;

    @FindBy(className = "sbib_b")
    private Search search;

    public MainPage(final WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public ResultsPage searchFor(String request) {
        this.search.searchFor(request);
        return new ResultsPage(driver);
    }
}
