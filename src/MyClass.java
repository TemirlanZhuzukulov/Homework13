public class MyClass {
    String name;
    String surname;
    byte age;
    String[] lessons;
    String favoritecook;

    public MyClass(String name, String surname, byte age, String favoriteDish) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoritecook = favoriteDish;
    }

    public MyClass(String... lessons) {
        this.lessons = lessons;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;

    }

    public void setLessons(String... lessons) {
        this.lessons = lessons;


    }

    public String[] getLessons(String... lessons) {

        return lessons;


    }

    public void setFavoritecook(String favoriteDish) {
        this.favoritecook = favoriteDish;
    }

    public String getFavoritecook() {
        return favoritecook;
    }
}
