package produccion.frutal;

public class
PeriodoCosecha {
        private String nombrePeriodo;
        private float estimadoTonPorHectarea;

        public PeriodoCosecha(String nombrePeriodo, float estimadoTonPorHectarea) {
            this.nombrePeriodo = nombrePeriodo;
            this.estimadoTonPorHectarea = estimadoTonPorHectarea;
        }

    @Override
    public String toString() {
        return "PeriodoCosecha{" +
                "nombrePeriodo='" + nombrePeriodo + '\'' +
                ", estimadoTonPorHectarea=" + estimadoTonPorHectarea +
                '}';
    }

    public String getNombrePeriodo() {
            return nombrePeriodo;
        }

    public void setNombrePeriodo(String nombrePeriodo) {
        this.nombrePeriodo = nombrePeriodo;
    }

    public float getEstimadoTonPorHectarea() {
            return estimadoTonPorHectarea;
        }

    public void setEstimadoTonPorHectarea(float estimadoTonPorHectarea) {
        this.estimadoTonPorHectarea = estimadoTonPorHectarea;
    }
}

