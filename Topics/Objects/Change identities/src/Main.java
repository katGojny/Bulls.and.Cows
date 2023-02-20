class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String p1Tempname = p1.name;
 int p1TempAge = p1.age;

// redirect
        p1.name = p2.name;
        p1.age = p2.age;
                p2.name =p1Tempname;
        p2.age= p1TempAge;


    }
}
