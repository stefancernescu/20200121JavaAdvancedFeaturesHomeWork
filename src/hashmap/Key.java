package hashmap;

public class Key {
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public boolean equals(Object obj) {
        return this.key.equals((String) obj);
    }

    @Override
    public int hashCode() {
        return (int) this.key.charAt(0);
    }
}
