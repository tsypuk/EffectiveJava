package joshua;

/**
 * Created by rtsypuk on 28.06.15.
 */
public class Item9 {
    String name;
    int age;

    public Item9(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item9 item9 = (Item9) o;

        if (age != item9.age) return false;
        if (!name.equals(item9.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
