package examenes.examen3IgnacioDelRio.adapter;

public class Cliente {
    public static void main(String[] args) {
        MotoGasolina motoGasolina = new MotoGasolina();
        MotoDiesel motoDiesel = new MotoDiesel();
        MotoGasolinaEspecial motoGasolinaEspecial = new MotoGasolinaEspecial();
        MotoElectrica motoElectrica = new MotoElectrica();
        MotoElectricaAdapter motoElectricaAdapter = new MotoElectricaAdapter(motoElectrica);

        motoGasolina.llenarTanque(50);
        motoGasolina.estadoTanque();
        motoDiesel.llenarTanque(20);
        motoDiesel.estadoTanque();
        motoGasolinaEspecial.llenarTanque(10);
        motoGasolinaEspecial.estadoTanque();
        motoElectricaAdapter.llenarTanque(40);
        motoElectricaAdapter.estadoTanque();
    }
}
