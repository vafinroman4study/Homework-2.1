public class Hogwarts {
    private String firstName;
    private String lastName;
    private int sorcery;
    private int transgression;

    public Hogwarts(String firstName, String lastName, int sorcery, int transgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }

    public String toString() {
        return firstName 
		+ " " + lastName
		+ ", сила магии: " + sorcery
		+ ", расстояние трансгресии: " + transgression;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public int getSorcery() {
        return sorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void compareStudents( Hogwarts other) {
        int firstSum = this.sorcery + this.transgression;
        int secondSum = other.sorcery + other.transgression;
        if (firstSum == secondSum) {
            System.out.println(
                    this.getFullName()
                            + " и " + other.getFullName()
                            + " одинаково хороши!"
            );
        } else if (firstSum > secondSum) {
            System.out.println(
                    this.getFullName()
                            + " лучший ученик, чем "
                            + other.getFullName()
            );
        } else {
            System.out.println(
                    other.getFullName()
                            + " лучший ученик, чем "
                            + this.getFullName()
            );
        }

    }

    public boolean equals(Hogwarts other) {
        return firstName.equals(other.getFirstName())
                & lastName.equals((other.getLastName()));
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName + lastName);
    }
}
