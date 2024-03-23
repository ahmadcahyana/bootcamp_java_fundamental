
public class Motor {
    // State atau Fields
    private int gigi = 0;
    private String warna = "Hitam";

    // Behaviour atau Methods
    public void Rem() {
        System.out.println("Motor di rem");
    }

    public void GantiGigi(int gigiBaru) {
        gigi = gigiBaru;
        System.out.println("Gigi motor diganti menjadi " + gigi);
    }

    public void GantiWarna(String warnaBaru) {
        warna = warnaBaru;
        System.out.println("Warna motor diganti menjadi " + warna);
    }

    public static void main(String[] args) throws Exception {
        // Instansiate
        Motor motor = new Motor();
        Motor motor2 = new Motor();

        // accessing fields
        System.out.println(motor.gigi);

        // accessing method
        motor.Rem();
        motor.GantiGigi(3);
        
        System.out.println(motor2.gigi);
        System.out.println(motor.gigi);
    }


   
}
