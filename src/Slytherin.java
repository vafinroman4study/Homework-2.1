public class Slytherin extends Hogwarts {
    private int cunning;            // хитрость
    private int determination;      // решительность
    private int ambition;           // амбициозность
    private int leadership;         // жажда власти
    private int resourcefulness;    // находчивость

    public Slytherin(String firstName, String lastName, int sorcery, int transgression, int cunning, int determination, int ambition, int leadership, int resourcefulness) {
        super(firstName, lastName, sorcery, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.leadership = leadership;
        this.resourcefulness = resourcefulness;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition + 
				", жажда власти: " + leadership +
				", находчивость: " + resourcefulness;
    }

    public void compareStudents( Slytherin other) {
        int firstSum = this.ambition + this.cunning + this.determination + this.leadership + this.resourcefulness;
        int secondSum = other.ambition + other.cunning + other.determination + other.leadership + other.resourcefulness;
        if (firstSum == secondSum) {
            System.out.println(
                    this.getFullName()
                    + " и " + other.getFullName()
                    + " одинаково хороши!"
            );
        } else if (firstSum > secondSum) {
            System.out.println(
                    this.getFullName()
                    + " лучший Пуффендуец, чем "
                    + other.getFullName()
            );
        } else {
            System.out.println(
                    other.getFullName()
                    + " лучший Пуффендуец, чем "
                    + this.getFullName()
            );
        }

    }
}
