public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1\n");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + ";");
        System.out.println("cat = " + cat + ";");
        System.out.println("paper = " + paper + ";\n");

        // Задача 2
        System.out.println("Задача 2\n");
        var member = 4;
        dog += member;
        cat += member;
        paper += member;
        System.out.println("dog + 4 = " + dog + ";");
        System.out.println("cat + 4 = " + cat + ";");
        System.out.println("paper + 4 = " + paper + ";\n");

        // Задача 3
        System.out.println("Задача 3\n");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog - 3.5 = " + dog + ";");
        System.out.println("cat - 1.6 = " + cat + ";");
        System.out.println("paper - 7639 = " + paper + ";\n");

        // Задача 4
        System.out.println("Задача 4\n");
        var friend = 19;
        System.out.println("friend = " + friend + ";");
        friend += 2;
        System.out.println("friend + 2 = " + friend + ";");
        friend /= 7;
        System.out.println("friend / 7 = " + friend + ";\n");

        // Задача 5
        System.out.println("Задача 5\n");
        var frog = 3.5;
        System.out.println("frog = " + frog + ";");
        frog *= 10;
        System.out.println("frog * 10 = " + frog + ";");
        frog /= 3.5;
        System.out.println("frog / 3.5 = " + frog + ";");
        frog += 4;
        System.out.println("frog + 4 = " + frog + ";");

        // Задача 6
        System.out.println("Задача 6\n");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Общая масса двух бойцов равна " + (firstBoxer + secondBoxer) + " кг.");
        System.out.println("Разница между массами бойцов равна  " + (secondBoxer - firstBoxer) + " кг.\n");

        // Задача 7
        System.out.println("Задача 7\n");
        System.out.println("Разница между массами бойцов равна  " + (secondBoxer - firstBoxer) + " кг.");
        System.out.println("Разница между массами бойцов равна  " + (secondBoxer % firstBoxer) + " кг.\n");

        // Задача 8
        System.out.println("Задача 8\n");
        var workDuration = 8;
        var totalWorkingTime = 640;
        var staffNumber = totalWorkingTime / workDuration;
        System.out.println("Всего работников в компании - " + staffNumber + " человек.");
        staffNumber += 94;
        totalWorkingTime = staffNumber * workDuration;
        System.out.println("Если в компании работает " + staffNumber + " человек, то всего " + totalWorkingTime
                + " часов работы может быть поделено между сотрудниками.");
    }
}