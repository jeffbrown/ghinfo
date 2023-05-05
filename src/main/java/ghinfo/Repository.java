package ghinfo;

import io.micronaut.core.annotation.Introspected;

import java.util.Map;

@Introspected
public class Repository {
    private String name;
    private License license;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public String toString() {
        return String.format("%-40s License: %s", name, license);
    }
}
