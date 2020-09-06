package sites.siteClasses;

public class Site {

    protected String name;
    protected boolean advertising;

    public Site() {
        name = "";
        advertising = false;
    }

    public Site(String name, boolean advertising) {
        this.name = name;
        this.advertising = advertising;

    }

    public Site(String name) {
        this.name = name;
        advertising = false;
    }

    public Site(Site site) {
        name = site.name;
        advertising = site.advertising;
    }

    public String getName() {
        return name;
    }

    public boolean getAdvertising() {
        return advertising;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdvertising(boolean advertising) {
        this.advertising = advertising;
    }

    public int calculatePopularity() {
        return 0;
    }
}
