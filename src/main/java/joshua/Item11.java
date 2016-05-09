package joshua;

/**
 * Created by rtsypuk on 28.06.15.
 */
public class Item11 implements Comparable {
    String name;

    public Item11(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item11 item11 = (Item11) o;

        if (!name.equals(item11.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Item11{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Item11)) {
            throw new ClassCastException();
        }
        Item11 item11 = (Item11) o;
        return String.CASE_INSENSITIVE_ORDER.compare(name, item11.name);
    }
}
