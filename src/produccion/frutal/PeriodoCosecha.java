package produccion.frutal;

public class PeriodoCosecha {
        private String nombrePeriodo;
        private float estimadoTonPorHectarea;

        public PeriodoCosecha(String nombrePeriodo, float estimadoTonPorHectarea) {
            this.nombrePeriodo = nombrePeriodo;
            this.estimadoTonPorHectarea = estimadoTonPorHectarea;
        }

        public String getNombrePeriodo() {
            return nombrePeriodo;
        }

        public float getEstimadoTonPorHectarea() {
            return estimadoTonPorHectarea;
        }
    }

