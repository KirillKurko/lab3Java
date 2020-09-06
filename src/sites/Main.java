package sites;

import sites.helperClasses.WriterInfo;
import sites.siteClasses.EducationalSite;
import sites.siteClasses.InformationSite;
import sites.siteClasses.SocialNetwork;

public class Main {

    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork("Telegram", false, 50_000_000, false);
        InformationSite informationSite = new InformationSite("NYTimes", true, 10_000, 10);
        EducationalSite educationalSite = new EducationalSite("Udemy", false, "Programming");

        WriterInfo.printSocialNetworkInformation(socialNetwork);
        System.out.println();
        WriterInfo.printInformationSiteInformation(informationSite);
        System.out.println();
        WriterInfo.printEducationalSiteInformation(educationalSite);
    }
}
