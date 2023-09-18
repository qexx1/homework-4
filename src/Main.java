public class Main {
    public static void main(String[] args) {
        //1 задание
        var age = 17;
        if (age >= 18) {
            System.out.println("если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("если возраст человека равен " + age + " он не совершеннолетний, нужно немного подождать");
        }

        //2 задание
        var temperature = 4;
        if (temperature >= 5) {
            System.out.println("на улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("на улице " + temperature + " градусов, нужно надеть шапку!!!");
        }

        //3 задание
        var speed = 61;
        if (speed <= 60) {
            System.out.println("если скорость " + speed + " , то можно ехать спокойно");
        } else {
            System.out.println("если скорость " + speed + " , то нужно заплатить штраф");
        }

        //4 задание
        var PersonAge = 18;
        if (2 > PersonAge || PersonAge <= 6){
            System.out.println("Если возраст человека равен " + PersonAge + " , то ему нужно ходить в детский сад");
        }else {
            if (7 > PersonAge || PersonAge <= 17) {
                System.out.println("Если возраст человека равен " + PersonAge + " , то ему нужно ходить в школу");
            } else if (18 > PersonAge || PersonAge <= 24) {
                System.out.println("Если возраст человека равен " + PersonAge + " , то ему нужно ходить в университет");
            } else if (PersonAge >= 24)
                System.out.println("Если возраст человека равен " + PersonAge + " , то ему нужно ходить на работу");
        }

        //5 задание
        var childAge = 13;
        if (childAge < 5){
            System.out.println("если возраст ребёнка равен " + childAge + " , то ему нельзя");
        } else {
            if (5 >= childAge || childAge < 14){
                System.out.println("если возраст ребёнка равен " + childAge + " , то ему можно кататься в сопровождении");
            } else if (childAge >= 14) {
                System.out.println("если возраст ребёнка равен " + childAge + " , то ему можно кататься без сопровождения");
            }
        }

        //6 задание
        var seats = 102;
        var sittingSeats = 60;
        var standingSeats = seats - sittingSeats;
        var people = 100;
        var peopleSitting = 60;
        var peopleStanding = people - peopleSitting;
        if (people >= seats){
            System.out.println("в вагоне нет мест");
        } else {
            System.out.println("В вагоне есть места");
        } if (peopleSitting >= sittingSeats){
            System.out.println("в вагоне нет сидячих мест");
        } else {
            System.out.println("в вагоне есть сидячие места");
        } if (peopleStanding >= standingSeats){
            System.out.println("в вагоне нет стоячих мест ");
        } else {
            System.out.println("в вагоне есть стоячие места");
        }

        //7 задание
        int one = -127;
        int two = 81;
        int three = 114;
        if (one > two && one > three){
            System.out.println(one);
        }else{
            if (two > one && two > three){
                System.out.println(two);
            }else{
                System.out.println(three);
            }
        }
    }
}