package Pages;

import Elements.SearchResults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/**
 * Created by natasha on 5/28/16.
 */
public class ResultsPage {

    private WebDriver driver;

    @FindBy(id = "ires")
    private SearchResults searchResults;

    public ResultsPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
        System.out.println("natasha in constructor of ResultsPage");
        System.out.println("natasha searchResiults =  " + searchResults);
    }


    public SearchResults getSearchResults() {
        return this.searchResults;
    }
}
