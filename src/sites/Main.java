package sites;

import sites.siteClasses.*;
import sites.siteClasses.educationalSites.ChemistryEducationalSite;
import sites.siteClasses.educationalSites.MathEducationalSite;

public class Main {

    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork("Telegram", false, 50_000_000, false);
        InformationSite informationSite = new InformationSite("NYTimes", true, 10_000, 10);
        MathEducationalSite mathEducationalSite = new MathEducationalSite("School Yourself", false, "Math", 5000);
        ChemistryEducationalSite chemistryEducationalSite = new ChemistryEducationalSite("Learnchem", false, "Chemistry", true);

        socialNetwork.print();
        System.out.println();
        informationSite.print();
        System.out.println();
        mathEducationalSite.print();
        System.out.println();
        chemistryEducationalSite.print();
    }
}
