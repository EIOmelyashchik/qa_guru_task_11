package enums;

public enum Page {
    MOVE("/move","Move"),
    MIND("/meditate","Meditation & Sounds by Verv"),
    SLEEP("/sleep","Sleep & Sounds by Verv"),
    ALL_IN_ONE("/verv-app","Verv: Body & Mind Health"),
    BLOG("/blog","DAILY EDITOR'S CHOICE")
    ;

    String path;
    String title;

    Page(String path, String title) {
        this.path = path;
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }
}
