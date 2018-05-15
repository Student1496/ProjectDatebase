package MyDbo.Table;

import java.io.Serializable;

public class Region implements Serializable {
    private String region;

    public Region(String region) {
        this.region = region;
    }

    public String getRegion() { return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region='" + region + '\'' +
                '}';
    }
}
