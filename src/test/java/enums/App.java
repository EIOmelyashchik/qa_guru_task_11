package enums;

public enum App {
    RUNNING("Weight Loss Running by Verv", "Weight Loss Running by Verv"),
    WALKING("Weight Loss Walking by Verv ", ""),
    FITNESS("Home Fitness for Weight Loss", "Weight Loss Fitness at Home by Verv")
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
