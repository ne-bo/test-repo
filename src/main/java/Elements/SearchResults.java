package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

/**
 * Created by natasha on 5/28/16.
 */
public class SearchResults extends HtmlElement {


    @SuppressWarnings("unused")
    @FindBy(className = "g")
    private List<WebElement> searchItems;

    public List<WebElement> getSearchItems() {
        for (int i = 0; i < searchItems.size(); i++) {
            System.out.println("natasha items number " + i + "\n" + searchItems.get(i).getText());
        }
        return searchItems;
    }


}
