package enums;

public enum App {
    RUNNING("Weight Loss Running by Verv", "Бег для похудения by Verv"),
    WALKING("Weight Loss Walking by Verv ", ""),
    FITNESS("Home Fitness for Weight Loss", "Фитнес для похудения by Verv")
    ;

    String titleAppStore;
    String titleGooglePlay;

    App(String titleAppStore, String titleGooglePlay) {
        this.titleAppStore = titleAppStore;
        this.titleGooglePlay = titleGooglePlay;
    }

    public String getTitleAppStore() {
        return titleAppStore;
    }

    public String getTitleGooglePlay() {
        return titleGooglePlay;
    }
}
