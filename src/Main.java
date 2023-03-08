public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        // Гриффиндор
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Гермиона", "Грейнджер",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Рон", "Уизли",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Грэхэм", "Монтегю",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Грегори", "Гойл",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Hufflepuff("Седрик", "Диггори",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Hufflepuff("Джастин", "Финч-Флетчли",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Ravenclaw("Падма", "Патил",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Ravenclaw("Маркус", "Белби",
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };

        System.out.println("Гриффиндор");
        printFaculty(gryffindors);
        System.out.println("Слизерин");
        printFaculty(slytherins);
        System.out.println("Пуффендуй");
        printFaculty(hufflepuffs);
        System.out.println("Когтевран");
        printFaculty(ravenclaws);

        System.out.println("Сравнения учеников");
        gryffindors[1].compareStudents(gryffindors[2]);
        gryffindors[0].compareStudents(slytherins[0]);
    }
    public static void printFaculty(Hogwarts[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}