public class Main {
    public static void main(String[] args) throws Exception {
        Tendik karyawan1 = new Tendik(101,"Dimas", "Kapling","09-April-2003","Laki-Laki", 2021);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(103, "Sena", "Kebumen","30-sept-2003" , "Laki-Laki", 2002);
        dosen1.setNomorIndukDosen(987123);
        dosen1.setJurusan("Informatika");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}