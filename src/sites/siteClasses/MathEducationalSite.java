package sites.siteClasses;

public class MathEducationalSite extends EducationalSite {

    private int tasksAmount;

    public MathEducationalSite() {
        super();
        tasksAmount = 0;
    }

    public MathEducationalSite(String name, boolean advertising, String subject, int tasksAmount) {
        super(name, advertising, subject);
        this.tasksAmount = tasksAmount;
    }

    public MathEducationalSite(String name, boolean advertising, String subject) {
        super(name, advertising, subject);
        tasksAmount = 0;
    }

    public MathEducationalSite(MathEducationalSite mathEducationalSite) {
        super(mathEducationalSite);
        tasksAmount = mathEducationalSite.tasksAmount;
    }

    public int getTasksAmount() {
        return tasksAmount;
    }

    public void setTasksAmount(int tasksAmount) {
        this.tasksAmount = tasksAmount;
    }

    @Override
    public int calculatePopularity() {
        return subject.length() * 2 + tasksAmount * 5;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tasks amount: " + tasksAmount);
    }
}
