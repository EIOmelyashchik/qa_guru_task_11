package tests;

import com.codeborne.selenide.Condition;
import enums.Page;
import helpers.DriverHelper;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@DisplayName("Verify titles on pages")
public class PageTitlesTests extends TestBase {

    @ParameterizedTest
    @EnumSource(value = Page.class, mode = EnumSource.Mode.EXCLUDE, names = "BLOG")
    @Owner("omelyashchik")
    @Feature("Title")
    @Tag("web_mob")
    @Tag("web")
    void checkTitles(Page page) {
        Allure.getLifecycle().updateTestCase(tc ->
                tc.setName("Verify title on the page: " + page.name()));

        step("Open the page " + page.name(), () ->
                open(page.getPath()));

        String titleLocator = DriverHelper.isWebMobile() ? "//h1[not(@class='title g_desktop-only ')]" : "//h1";
        step("Verify title text", () ->
                $x(titleLocator).shouldHave(Condition.text(page.getTitle())));
    }

    @Test
    @Owner("omelyashchik")
    @Feature("Title")
    @Tag("web_mob")
    @Tag("web")
    @DisplayName("Verify title on the page: BLOG")
    void checkTitleBlogPage() {
        Page page = Page.BLOG;

        step("Open the page " + page.name(), () ->
                open(page.getPath()));

        step("Verify title text", () ->
                $("h3").shouldHave(Condition.text(page.getTitle())));
    }
}
