package produccion.frutal;

import java.util.ArrayList;

public class Fruta {

    private String nombre;
    private float hectareas;
    private float costoPorTonelada;
    private float precioPorTonelada;
    private ArrayList<PeriodoCosecha> periodos;

    public Fruta(String nombre, float hectareas, float costoPorTonelada, float precioPorTonelada) {
        this.nombre = nombre;
        this.hectareas = hectareas;
        this.costoPorTonelada = costoPorTonelada;
        this.precioPorTonelada = precioPorTonelada;
        this.periodos = new ArrayList<PeriodoCosecha>();
    }

    public void agregarPeriodo(PeriodoCosecha p) {
        if (p != null) periodos.add(p);
    }

    public void quitarPeriodo(int indice) {
        if (indice >= 0 && indice < periodos.size()) periodos.remove(indice);
    }

    public void quitarPeriodoPorNombre(String nombre) {
        if (nombre == null) return;
        for (int i = 0; i < periodos.size(); i++) {
            if (nombre.equals(periodos.get(i).getNombrePeriodo())) {
                periodos.remove(i);
                return;
            }
        }
    }

    public float produccionTotal(int periodoIndex) {
        if (periodoIndex < 0 || periodoIndex >= periodos.size()) return 0f;
        PeriodoCosecha p = periodos.get(periodoIndex);
        return hectareas * p.getEstimadoTonPorHectarea();
    }

    public float costoPeriodo(int periodoIndex) {
        return produccionTotal(periodoIndex) * costoPorTonelada;
    }

    public float ingresoPeriodo(int periodoIndex) {
        return produccionTotal(periodoIndex) * precioPorTonelada;
    }

    public float gananciaPeriodo(int periodoIndex) {
        return ingresoPeriodo(periodoIndex) - costoPeriodo(periodoIndex);
    }

    public PeriodoCosecha getPeriodo(int indice) {
        if (indice < 0 || indice >= periodos.size()) return null;
        return periodos.get(indice);
    }

    public int cantidadPeriodos() {
        return periodos.size();
    }

    // getters mínimos
    public String getNombre() { return nombre; }
    public float getHectareas() { return hectareas; }

}
