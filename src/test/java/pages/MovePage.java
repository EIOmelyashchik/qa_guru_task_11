package pages;

import enums.App;
import enums.Page;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MovePage {

    private final String appStoreLinkFigureItemPattern = "figure.%s a.figure-app-store";
    private final String googlePlayFigureItemPattern = "figure.%s a.figure-google-play";

    @Step("Click on app store link for '{app}' application")
    public void clickAppSoreLink(App app) {
        $(String.format(appStoreLinkFigureItemPattern, app.name().toLowerCase())).click();
    }

    @Step("Click on google play link for '{app}' application")
    public void clickGooglePlayLink(App app) {
        $(String.format(googlePlayFigureItemPattern, app.name().toLowerCase())).click();
    }
}