package solvd.materials;

import java.util.Objects;

public class Windows {
    private int height;
    private int width;
    private Material material;

    public Windows (int height, int width, Material material){
        this.height = height;
        this.width = width;
        this.material = material;
    }

    public String getInfo(){
        String info = "Windows - height: " + height + " width: " + width + " material: " + material + "\n";
        return info;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "height=" + height +
                ", width=" + width +
                ", material=" + material +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Windows)) return false;
        Windows windows = (Windows) o;
        return height == windows.height && width == windows.width && material == windows.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, material);
    }
}
