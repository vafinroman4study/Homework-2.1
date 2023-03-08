public class Gryffindor extends Hogwarts {
    int courage;    // храбрость
    int honor;      // честь
    int chivalry;   // благородство

    public Gryffindor(String firstName, String lastName, int sorcery, int transgression, int courage, int honor, int chivalry) {
        super(firstName, lastName, sorcery, transgression);
        this.courage = courage;
        this.honor = honor;
        this.chivalry = chivalry;
    }

    public int getCourage() {
        return courage;
    }

    public int getHonor() {
        return honor;
    }

    public int getChivalry() {
        return chivalry;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", храбрость: " + courage +
                ", честь: " + honor +
                ", благородство: " + chivalry;
    }

    public void compareStudents( Gryffindor other) {
        int firstSum = this.chivalry + this.courage + this.honor;
        int secondSum = other.chivalry + other.courage + other.honor;
        if (firstSum == secondSum) {
            System.out.println(
                    this.getFullName()
                    + " и " + other.getFullName()
                    + " одинаково хороши!"
            );
        } else if (firstSum > secondSum) {
            System.out.println(
                    this.getFullName()
                    + " лучший Гриффиндорец, чем "
                    + other.getFullName()
            );
        } else {
            System.out.println(
                    other.getFullName()
                    + " лучший Гриффиндорец, чем "
                    + this.getFullName()
            );
        }

    }
}
