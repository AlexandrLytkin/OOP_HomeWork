package zoo;

public  class Main {
    public static void main(String[] args) {
        Mamals mamals = new Mamals("jif",12,"africa",23);
        System.out.println("mamals = " + mamals);
        mamals.walk();
        PlanEating gazelle = new PlanEating("Гоша",5,"Африка",55,"растения");
        PlanEating giraffe = new PlanEating("Жора",4,"Азия",77,"растения");
        PlanEating horse = new PlanEating("Леша",6,"Россия",60,"растения");
        System.out.println("gazelle = " + gazelle);
        System.out.println("giraffe = " + giraffe);
        System.out.println("horse = " + horse);

        Predator hyena = new Predator("Мета",3,"Африка",64,"мясо");
        Predator tiger = new Predator("Акела",5,"Азия",55,"мясо");
        Predator bear = new Predator("Миша",2,"Россия",56,"рыба, мясо");
        Predator bear2 = new Predator("Миша",2,"Россия",56,"рыба, мясо");
        System.out.println("hyena = " + hyena);
        System.out.println("tiger = " + tiger);
        System.out.println("bear = " + bear);
        System.out.println(bear.equals(tiger));
        if (bear.equals(tiger)) {
            tiger = bear;
        }
        System.out.println("tiger = " + tiger);
        System.out.println("bear = " + bear);

        Amphibians frog = new Amphibians("Гринч", 1, "Азия");
        Amphibians snakeFreshWater = new Amphibians("Ужик", 1, "Азия");
        System.out.println("frog = " + frog);
        System.out.println("snakeFreshWater = " + snakeFreshWater);

        NoFlyAnimals peacock = new NoFlyAnimals("Петька", 2, "Бангладеш","не летает");
        NoFlyAnimals penguin = new NoFlyAnimals("Нордик", 1, "Антарктида","не летает");
        NoFlyAnimals birdDodo = new NoFlyAnimals("Додик", 2, "Индия","не летает");
        System.out.println("peacock = " + peacock);
        System.out.println("penguin = " + penguin);
        System.out.println("birdDodo = " + birdDodo);

        FlyAnimals gull = new FlyAnimals("Гуля", 2, "водоемы","летает");
        FlyAnimals albatross = new FlyAnimals("Али", 1, "Южный океан","летает");
        FlyAnimals falcon = new FlyAnimals("Соколов", 2, "тайга","летает");
        System.out.println("gull = " + gull);
        System.out.println("albatross = " + albatross);
        System.out.println("falcon = " + falcon);
    }

}
