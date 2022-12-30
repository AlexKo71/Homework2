public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var boxersWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес двух бойцов " + boxersWeight + " кг");
        var differenceWeight = oneBoxerWeight - twoBoxerWeight;
        System.out.println("Разница между весами двух бойцов равна " + differenceWeight + " кг");
        var modulusDifferenceWeight = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Разница между весами двух спортсменов равна " + modulusDifferenceWeight + " кг");
        modulusDifferenceWeight = twoBoxerWeight % oneBoxerWeight;
        System.out.println("Разница между весами двух боксеров равна " + modulusDifferenceWeight + " кг");
        System.out.println();

        var allTime = 640;
        var personTime = 8;
        var numberCoworker = allTime / personTime;
        System.out.println("Всего работников в компании — " + numberCoworker + " человек");
        var newNumberCoworker = numberCoworker + 94;
        var newPersonTime = allTime / newNumberCoworker;
        System.out.println("Если в компании работает " + newNumberCoworker + " человека, то всего " + newPersonTime + " часа работы может быть поделено между сотрудниками");






    }
}
