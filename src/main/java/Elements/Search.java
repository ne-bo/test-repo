package Elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by natasha on 5/28/16.
 */
public class Search extends HtmlElement {
    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    public TextInput input;

    @FindBy(xpath = "//*[@id=\"sblsbb\"]/button/span")
    public Button searchButton;

    public void searchFor(String request) {
        input.clear();
        input.sendKeys(request);
/*        try {
            sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        searchButton.click();
    }

}
