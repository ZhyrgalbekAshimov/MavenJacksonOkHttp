import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dataseries {

    private int timepoint, cloudcover, seeing, transparency, lifted_index, rh2m, temp2m, speed;
    private String prec_type, direction;

    public Dataseries() {
    }

    public Dataseries(int timepoint, int cloudcover, int seeing, int transparency, int lifted_index, int rh2m, int temp2m, String prec_type, String direction, int speed) {
        this.timepoint = timepoint;
        this.cloudcover = cloudcover;
        this.seeing = seeing;
        this.transparency = transparency;
        this.lifted_index = lifted_index;
        this.rh2m = rh2m;
        this.temp2m = temp2m;
        this.prec_type = prec_type;
        this.direction = direction;
        this.speed = speed;
    }

    @JsonProperty("wind10m")
    private void setWind10m(Map<String, String> wind10m) {
        this.direction = wind10m.get("direction");
        this.speed = (Integer.parseInt(wind10m.get("speed")));
    }

    public int getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(int timepoint) {
        this.timepoint = timepoint;
    }

    public int getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }

    public int getSeeing() {
        return seeing;
    }

    public void setSeeing(int seeing) {
        this.seeing = seeing;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getLifted_index() {
        return lifted_index;
    }

    public void setLifted_index(int lifted_index) {
        this.lifted_index = lifted_index;
    }

    public int getRh2m() {
        return rh2m;
    }

    public void setRh2m(int rh2m) {
        this.rh2m = rh2m;
    }

    public int getTemp2m() {
        return temp2m;
    }

    public void setTemp2m(int temp2m) {
        this.temp2m = temp2m;
    }

    public String getPrec_type() {
        return prec_type;
    }

    public void setPrec_type(String prec_type) {
        this.prec_type = prec_type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return  "\n\n[timepoint: " + timepoint +
                "\ncloudcover: " + cloudcover +
                "\nseeing: " + seeing +
                "\ntransparency: " + transparency +
                "\nlifted_index: " + lifted_index +
                "\nrh2m: " + rh2m +
                "\ndirection: " + direction +
                "\nspeed: " + speed +
                "\ntemp2m: " + temp2m +
                "\nprec_type: " + prec_type +
                ']';
    }
}
