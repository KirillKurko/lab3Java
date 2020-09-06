package sites.siteClasses;

public class EducationalSite extends Site {

    private String subject;

    public EducationalSite() {
        super();
        subject = "";
    }

    public EducationalSite(String name, boolean advertising, String subject) {
        super(name, advertising);
        this.subject = subject;
    }

    public EducationalSite(String name, boolean advertising) {
        super(name, advertising);
        subject = "";
    }

    public EducationalSite(EducationalSite educationalSite) {
        super(educationalSite);
        subject = educationalSite.subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int calculatePopularity() {
        return super.calculatePopularity() + subject.length() * 2;
    }
}
