package solvd.materials;

import java.util.Objects;

public class Walls {
    private int height;
    private int width;
    private int length;
    private Material material;

    public Walls (int height, int width, int length, Material material){
        this.height = height;
        this.width = width;
        this.length = length;
        this.material = material;
    }

    public String getInfo(){
        String info = "Walls - height: " + height + " width: " + width + " length: " + length + " material: " + material + "\n";
        return info;
    }

    @Override
    public String toString() {
        return "Walls{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", material=" + material +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Walls)) return false;
        Walls walls = (Walls) o;
        return height == walls.height && width == walls.width && length == walls.length && material == walls.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length, material);
    }
}