package sites.siteClasses.educationalSites;

public class ChemistryEducationalSite extends EducationalSite {

    boolean experimentsTutorials;

    public ChemistryEducationalSite() {
        super();
        experimentsTutorials = false;
    }

    public ChemistryEducationalSite(String name, boolean advertising, String subject, boolean experimentsTutorials) {
        super(name, advertising, subject);
        this.experimentsTutorials = experimentsTutorials;
    }

    public ChemistryEducationalSite(String name, boolean advertising, String subject) {
        super(name, advertising, subject);
        experimentsTutorials = false;
    }

    public ChemistryEducationalSite(ChemistryEducationalSite chemistryEducationalSite) {
        super(chemistryEducationalSite);
        experimentsTutorials = chemistryEducationalSite.experimentsTutorials;
    }

    public boolean getExperimentsTutorials() {
        return experimentsTutorials;
    }

    public void setExperimentsTutorials(boolean experimentsTutorials) {
        this.experimentsTutorials = experimentsTutorials;
    }

    @Override
    public int calculatePopularity() {
        return subject.length() * 2 + (experimentsTutorials ? 1000 : 500);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Experiments tutorials: " + experimentsTutorials);
    }
}
