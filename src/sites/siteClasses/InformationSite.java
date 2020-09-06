package sites.siteClasses;

public class InformationSite extends Site {

    private int newsAmount;
    private int updateFrequency;

    public InformationSite() {
        super();
        newsAmount = 0;
        updateFrequency = 0;
    }

    public InformationSite(String name, boolean advertising, int newsAmount, int updateFrequency) {
        super(name, advertising);
        this.newsAmount = newsAmount;
        this.updateFrequency = updateFrequency;
    }

    public InformationSite(String name, boolean advertising, int newsAmount) {
        super(name, advertising);
        this.newsAmount = newsAmount;
        updateFrequency = 1;
    }

    public InformationSite(InformationSite informationSite) {
        super(informationSite);
        newsAmount = informationSite.newsAmount;
        updateFrequency = informationSite.updateFrequency;
    }

    public int getNewsAmount() {
        return newsAmount;
    }

    public int getUpdateFrequency() {
        return updateFrequency;
    }

    public void setNewsAmount(int newsAmount) {
        this.newsAmount = newsAmount;
    }

    public void setUpdateFrequency(int updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    @Override
    public int calculatePopularity() {
        return newsAmount * 2 + updateFrequency * 10;
    }
}
