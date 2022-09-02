package solvd.materials;

import java.util.Objects;

public class Door {
    private int height;
    private int width;
    private Material material;

    public Door (int height, int width, Material material){
        this.height = height;
        this.width = width;
        this.material = material;
    }

    public String getInfo(){
        String info = "Door - height: " + height + " width: " + width + " material: " + material + "\n";
        return info;
    }

    @Override
    public String toString() {
        return "Door{" +
                "height=" + height +
                ", width=" + width +
                ", material=" + material +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Door)) return false;
        Door door = (Door) o;
        return height == door.height && width == door.width && material == door.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, material);
    }

}
