package DoubleDispatch;

public class Zapatero extends Trabajador {
    @Override
    public void trabajar(Cuero cuero) {
        System.out.println("Zapato");
    }

    @Override
    public void trabajar(Goma goma) {
        System.out.println("Sandalia");
    }
    public void trabajar(Material material) {
        material.trabajarMaterial(this);
    }

}
