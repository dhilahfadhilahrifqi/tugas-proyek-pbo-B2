//tugas Proyek membuat apk nilai mahasiswa berbasis gui dengan MVC dan database serta ada fungsi CRUD
//MODEL

public class Komponen {
       private String stambuk;
       private String nama;
       public double hadir;
       public double tugas;
       public double proyek;
       public double uts;
       public double uas;
       public double akhir;
       public double grade;
       
    public Komponen(){
    }

    public String getStambuk() {
        return stambuk;
    }

    public String getNama() {
        return nama;
    }

    public double getHadir() {
        return hadir;
    }

    public double getTugas() {
        return tugas;
    }

    public double getProyek() {
        return proyek;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double getAkhir() {
        return akhir;
    }

    public double getGrade() {
        return grade;
    }   
       
    public void setStambuk(String stambuk) {
        this.stambuk = stambuk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHadir(double hadir) {
        this.hadir = hadir;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public void setProyek(double proyek) {
        this.proyek = proyek;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void setAkhir(double akhir) {
        this.akhir = akhir;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
       
}
