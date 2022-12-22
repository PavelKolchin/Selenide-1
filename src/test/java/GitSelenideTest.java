import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GitSelenideTest {

    @Test
    void shouldConfirmCodeForJunit() {
     //   - Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //open("https://github.com/");
        //$("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        //$$("ul.repo-list li").first().$("div.f4").click();

        //- Перейдите в раздел Wiki проекта
        $("[id=wiki-tab]").click();
        //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $$("[type=button]").findBy(text("Show 2 more pages")).click();
        $$(".Box-row a").findBy(text("SoftAssertions")).shouldHave(text("SoftAssertions")).click();
        //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("div.markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}


