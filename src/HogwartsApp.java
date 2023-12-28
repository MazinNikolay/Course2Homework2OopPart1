public class HogwartsApp {
    public static void main(String[] args) {
        StudentGryffindor harryPotter = new StudentGryffindor(80, 2, 70, 75, 80, "Гарри", "Поттер");
        StudentGryffindor hermioneGranger = new StudentGryffindor(90, 40, 30, 55, 60, "Гермиона", "Грейнджер");
        StudentGryffindor ronWeasley = new StudentGryffindor(60, 10, 40, 30, 40, "Рон", "Уизли");
        StudentSlytherin dracoMalfoy = new StudentSlytherin(10, 20, 30, 40, 80, 30, 90, "Драко", "Малфой");
        StudentSlytherin grahamMotague = new StudentSlytherin(30, 20, 20, 10, 40, 150, 25, "Грэхэм", "Монтегю");
        StudentSlytherin gregoryGoyle = new StudentSlytherin(40, 40, 40, 10, 30, 20, 30, "Грегори", "Гойл");
        StudentHufflepuff zachariasSmith = new StudentHufflepuff(10, 15, 20, 40, 20, "Захария", "Смит");
        StudentHufflepuff cedricDiggory = new StudentHufflepuff(80, 60, 70, 80, 60, "Седрик", "Диггори");
        StudentHufflepuff justinFinchFletchley = new StudentHufflepuff(30, 22, 40, 50, 30, "Джастин", "Финч-Флетчли");
        StudentRavenclaw choChang = new StudentRavenclaw(10, 3, 10, 30, 20, 50, "Чжоу", "Чанг");
        StudentRavenclaw padmaPatil = new StudentRavenclaw(40, 4, 15, 20, 35, 10, "Падма", "Патил");
        StudentRavenclaw marcusBelby = new StudentRavenclaw(20, 15, 20, 40, 50, 50, "Маркус", "Белби");
        harryPotter.printCharacteristics();
        dracoMalfoy.printCharacteristics();
        padmaPatil.printCharacteristics();
        System.out.println(harryPotter.compareCharacteristic(hermioneGranger));
        System.out.println(cedricDiggory.compareCharacteristic(justinFinchFletchley));
        System.out.println(marcusBelby.compareCharacteristic(choChang));
        System.out.println(compareMagicPower(harryPotter, padmaPatil));
        System.out.println(compareMagicPower(zachariasSmith, grahamMotague));
    }

    public static String compareMagicPower(Hogwarts firstStudent, Hogwarts secondStudent) {
        return firstStudent.getMagicPower() > secondStudent.getMagicPower() ?
                firstStudent + " обладает бОльшей мощностью магии, чем " + secondStudent :
                secondStudent + " обладает бОльшей мощностью магии, чем " + firstStudent;
    }
}
