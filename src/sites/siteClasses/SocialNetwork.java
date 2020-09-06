package sites.siteClasses;

public class SocialNetwork extends Site {

    private int usersAmount;
    private boolean applications;

    public SocialNetwork() {
        super();
        usersAmount = 0;
        applications = false;
    }

    public SocialNetwork(String name, boolean advertising, int usersAmount, boolean applications) {
        super(name, advertising);
        this.usersAmount = usersAmount;
        this.applications = applications;
    }

    public SocialNetwork(String name, boolean advertising, int usersAmount) {
        super(name, advertising);
        this.usersAmount = usersAmount;
    }

    public SocialNetwork(SocialNetwork socialNetwork) {
        super(socialNetwork);
        usersAmount = socialNetwork.usersAmount;
        applications = socialNetwork.applications;
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    public boolean getApplications() {
        return applications;
    }

    public void setUsersAmount(int usersAmount) {
        this.usersAmount = usersAmount;
    }

    public void setApplications(boolean applications) {
        this.applications = applications;
    }

    @Override
    public int calculatePopularity() {
        return usersAmount + (applications ? 100 : 0);
    }
}
