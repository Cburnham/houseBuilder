package solvd.materials;

import java.util.Objects;

public class Roof {
    private int height;
    private int width;
    private int length;
    private Material material;

    public Roof (int height, int width, int length, Material material){
        this.height = height;
        this.width = width;
        this.length = length;
        this.material = material;
    }

    public String getInfo(){
        String info = "Roof - height: " + height + " width: " + width + " length: " + length + " material: " + material + "\n";
        return info;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", material=" + material +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roof)) return false;
        Roof roof = (Roof) o;
        return height == roof.height && width == roof.width && length == roof.length && material == roof.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length, material);
    }
}
