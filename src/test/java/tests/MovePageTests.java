package tests;

import com.codeborne.selenide.Condition;
import enums.App;
import enums.Page;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MovePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


@DisplayName("Verify 'MOVE' page")
public class MovePageTests extends TestBase {

    private final Page page = Page.MOVE;

    @ParameterizedTest
    @EnumSource(value = App.class)
    @Owner("omelyashchik")
    @Feature("Links")
    @Tag("web")
    void checkAppSoreLinks(App app) {
        Allure.getLifecycle().updateTestCase(tc ->
                tc.setName(String.format("Verify App Store link on the '%s' page for '%s' application",
                        page.name(), app.name())));

        step("Open the page " + page.name(), () ->
                open(page.getPath()));

        new MovePage().clickAppSoreLink(app);

        step("Verify application name on the App Store page", () ->
                $("h1").shouldHave(Condition.text(app.getTitleAppStore())));
    }

    @ParameterizedTest
    @EnumSource(value = App.class, mode = EnumSource.Mode.EXCLUDE, names = "WALKING")
    @Owner("omelyashchik")
    @Feature("Links")
    @Tag("web")
    void checkGooglePlayLinks(App app) {
        Allure.getLifecycle().updateTestCase(tc ->
                tc.setName(String.format("Verify Google Play link on the '%s' page for '%s' application",
                        page.name(), app.name())));

        step("Open the page " + page.name(), () ->
                open(page.getPath()));

        new MovePage().clickGooglePlayLink(app);

        step("Verify application name on the Google Play page", () ->
                $("h1").shouldHave(Condition.text(app.getTitleGooglePlay())));
    }
}
