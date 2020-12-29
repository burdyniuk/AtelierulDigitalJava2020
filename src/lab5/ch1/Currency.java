package lab5.ch1;

public class Currency {
    private String name;
    private float value;

    public Currency() { }

    protected Currency(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
