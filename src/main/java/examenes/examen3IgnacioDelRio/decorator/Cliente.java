package examenes.examen3IgnacioDelRio.decorator;

public class Cliente {
    public static void main(String[] args) {
        IMarca sony = new Sony("Z",2,32,"Snapdragon", 2000);
        sony = new Carcasa(sony,100);
        sony = new Vidrio(sony, 100);
        sony.showData();

        IMarca samsung = new Samsung("S10",4,64,"Snapdragon",4000);
        samsung = new Almacenamiento(samsung,64);
        samsung.showData();

        IMarca xiaomi = new Xiaomi("Mi 10",8,256,"Qualcomm",6000);
        xiaomi = new Carcasa(xiaomi,200);
        xiaomi = new Vidrio(xiaomi, 150);
        xiaomi = new Almacenamiento(xiaomi, 256);
        xiaomi.showData();
    }
}
