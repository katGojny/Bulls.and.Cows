class Army {

    public static void createArmy() {
        Unit firstUnit = new Unit("glory");
        Unit secondUnit = new Unit("greens");
        Unit thirdUnit = new Unit("blues");
        Unit thirUnit = new Unit("greys");
        Unit fourthUnit = new Unit("pinks");
        Knight knight = new Knight("Zbyszko");
        Knight knight1 = new Knight("Geralt");
        Knight knight2 = new Knight("Onomatopeja");
        General general = new General("Kasia");
        Doctor doctor = new Doctor("Clair");

        // Create all objects here
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}