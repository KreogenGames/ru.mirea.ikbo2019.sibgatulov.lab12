public class Person {
    private String secondName, Name, surName;

    Person(String sName){
        this.surName = sName;
    }

    Person(String surname, String name, String secondName){
        this.surName = surname;
        this.Name = name;
        this.secondName = secondName;
    }

    public String toString(){
        if (Name == null || secondName == null) {
            return (surName);
        } else {
            return (surName + " " + ((Name.toUpperCase()).toCharArray())[0] + ". " + ((secondName.toUpperCase()).toCharArray())[0] + ".");
        }
    }

    public static void main(String[] args) {
        Person pers = new Person("Сыромятников", "Владислав", "Петрович");
        System.out.println(pers.toString());
        Person pers1 = new Person("Сыроямятников");
        System.out.println(pers1.toString());
    }
}
