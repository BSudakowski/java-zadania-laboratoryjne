package pl.edu.agh.qa;

public class Item {
    private String size;
    private String name;

    public Item(String size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (size != null ? !size.equals(item.size) : item.size != null) return false;
        return name != null ? name.equals(item.name) : item.name == null;

    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
