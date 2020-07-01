package estructurales.adapter.ejercicio.ej1my;

public class Cliente {
    public static void main(String[] args) {
        AutoGasolina autoGasolina = new AutoGasolina();
        AutoDiesel autoDiesel = new AutoDiesel();
        AutoGasolinaEspecial autoGasolinaEspecial = new AutoGasolinaEspecial();
        AutoElectrico autoElectrico = new AutoElectrico();
        AutoElectricoAdapter autoElectricoAdapter = new AutoElectricoAdapter(autoElectrico);

        autoGasolina.llenar(50);
        autoDiesel.estado();
        autoGasolinaEspecial.llenar(101);
        autoElectricoAdapter.estado();
    }
}
