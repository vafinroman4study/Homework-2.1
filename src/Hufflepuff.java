public class Hufflepuff extends Hogwarts {
    int patience;   // трудолюбие
    int justice;    // честность
    int loyalty;    // верность

    public Hufflepuff(String firstName, String lastName, int sorcery, int transgression, int patience, int justice, int loyalty) {
        super(firstName, lastName, sorcery, transgression);
        this.patience = patience;
        this.justice = justice;
        this.loyalty = loyalty;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие: " + patience +
                ", честность: " + justice +
                ", верность: " + loyalty;
    }

    public void compareStudents( Hufflepuff other) {
        int firstSum = this.loyalty + this.patience + this.justice;
        int secondSum = other.loyalty + other.patience + other.justice;
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
