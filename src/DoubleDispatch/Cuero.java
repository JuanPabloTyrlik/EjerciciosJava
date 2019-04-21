package DoubleDispatch;

public class Cuero extends Material {
    public void trabajarMaterial(Trabajador trabajador) {
        trabajador.trabajar(this);
    }

}
