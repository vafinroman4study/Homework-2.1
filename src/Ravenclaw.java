public class Ravenclaw extends Hogwarts {
    int learning;           // ум
    int intelligence;       // творчество
    int wisdom;             // мудрость
	int wit;                // остроумие

    public Ravenclaw(String firstName, String lastName, int sorcery, int transgression, int learning, int intelligence, int wisdom, int wit) {
        super(firstName, lastName, sorcery, transgression);
        this.learning = learning;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
		this.wit = wit;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", ум: " + learning +
                ", творчество: " + intelligence +
                ", мудрость: " + wisdom + 
				", остроумие: " + wit;
    }

    public void compareStudents( Ravenclaw other) {
        int firstSum = this.wisdom + this.learning + this.intelligence + this.wit;
        int secondSum = other.wisdom + other.learning + other.intelligence + other.wit;
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
