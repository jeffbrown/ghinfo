package ghinfo;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class License {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
