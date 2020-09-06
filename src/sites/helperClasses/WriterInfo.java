package sites.helperClasses;

import sites.siteClasses.InformationSite;
import sites.siteClasses.Site;
import sites.siteClasses.SocialNetwork;

public class WriterInfo {

    public static void printSiteName(Site site) {
        System.out.println("Name: " + site.getName());
    }

    public static void printSiteAdvertising(Site site) {
        System.out.println("Advertising: " + site.getAdvertising());
    }

    public static void printSitePopularity(Site site) {
        System.out.println("Popularity: " + site.calculatePopularity());
    }

    public static void printSiteInformation(Site site) {
        printSiteName(site);
        printSiteAdvertising(site);
        printSitePopularity(site);
    }

    public static void printSocialNetworkUsersAmount(SocialNetwork socialNetwork) {
        System.out.println("Users amount: " + socialNetwork.getUsersAmount());
    }

    public static void printSocialNetworkApplications(SocialNetwork socialNetwork) {
        System.out.println("Applications: " + socialNetwork.getApplications());
    }

    public static void printSocialNetworkInformation(SocialNetwork socialNetwork) {
        printSiteInformation(socialNetwork);
        printSocialNetworkUsersAmount(socialNetwork);
        printSocialNetworkApplications(socialNetwork);
    }

    public static void printInformationSiteNewsAmount(InformationSite informationSite) {
        System.out.println("News amount: " + informationSite.getNewsAmount());
    }

    public static void printInformationSiteUpdateFrequency(InformationSite informationSite) {
        System.out.println("Update frequency: " + informationSite.getUpdateFrequency());
    }

    public static void printInformationSiteInformation(InformationSite informationSite) {
        printSiteInformation(informationSite);
        printInformationSiteNewsAmount(informationSite);
        printInformationSiteUpdateFrequency(informationSite);
    }
}
