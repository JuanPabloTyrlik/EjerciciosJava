package DoubleDispatch;

public class Goma extends Material {
    public void trabajarMaterial(Trabajador trabajador) {
        trabajador.trabajar(this);
    }

}
