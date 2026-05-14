package edu.iesam.renfe.domain;

public class Train {

    private String id;
    private String weight;
    private String age;
    private String height;
    private String maxSpeed;

    public Train(String id, String weight, String age, String height, String maxSpeed) {
        this.id = id;
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.maxSpeed = maxSpeed;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
