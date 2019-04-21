package DoubleDispatch;

public class Artesano extends Trabajador{
    @Override
    public void trabajar(Cuero cuero) {
        System.out.println("Llavero");
    }

    @Override
    public void trabajar(Goma goma) {
        System.out.println("Juguete");
    }
    public void trabajar(Material material) {
        material.trabajarMaterial(this);
    }

}
