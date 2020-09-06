package sites.helperClasses;

import sites.siteClasses.Site;

public class WriterInfo {

    public static void printSiteName(Site site) {
        System.out.println("Name: " + site.getName());
    }

    public static void printSiteAdvertising(Site site) {
        System.out.println("Advertising: " + site.getAdvertising());
    }

    public static void printSiteInformation(Site site) {
        printSiteName(site);
        printSiteAdvertising(site);
    }
}
