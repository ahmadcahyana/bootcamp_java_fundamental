public class JavaAccessModifiers {
    public String namaDepan;
    private String namaBelakang;
    final String namaTengah = "Budi";

    //getter
    public String getNamaBelakang() {
        return namaBelakang;
    }

    //setter
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public static void main(String[] args) {
        JavaAccessModifiers javaAccessModifiers = new JavaAccessModifiers();
        // System.out.println(javaAccessModifiers.namaBelakang);
        // javaAccessModifiers.setNamaBelakang("Susanto");
        // System.out.println(javaAccessModifiers.getNamaBelakang());

        // Final
        System.out.println(javaAccessModifiers.namaTengah);
        // javaAccessModifiers.namaTengah = "Joko";

        // InstanceOf
        System.out.println(javaAccessModifiers instanceof JavaAccessModifiers);

    }
}
