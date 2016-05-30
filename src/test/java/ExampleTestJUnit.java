import Pages.MainPage;
import Pages.ResultsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.exists;

/**
 * Created by natasha on 5/28/16.
 */
public class ExampleTestJUnit {
    private final int DEFAULT_RESULTS_COUNT;

    public WebDriver driver = new FirefoxDriver();

    public ExampleTestJUnit() {
        DEFAULT_RESULTS_COUNT = 10;
    }


    @Before
    public void loadStartPage() {
        driver.get("http://www.google.com");
    }

    @Test
    public void afterSearchingUserShouldSeSearchResults() {
        MainPage mainPage = new MainPage(driver);
        ResultsPage page = mainPage.searchFor("Test");
        System.out.println("natasha " + page.getSearchResults());
        assertThat(page.getSearchResults(), exists());
        assertThat(page.getSearchResults().getSearchItems(), hasSize(DEFAULT_RESULTS_COUNT));
    }

    @After
    public void killWebDriver() {
        driver.quit();
    }
}
