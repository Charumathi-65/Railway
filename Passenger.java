public class Passenger {
    static int id = 1;
    int PassengerId;
    String name;
    int age;
    String birthPreference;
    String alloted;
    int number;

    public Passenger(String name,int age,String birthPreference){
        this.name = name;
        this.age = age;
        this.birthPreference = birthPreference;
        this.passengerId = id++;
        alloted = "";
        number = -1;
    }
}
