/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukls2;

/**
 *
 * @author Member
 */
public class Buku {
    private int idBuku;
    private int stok;
    private String judulBuku;
    private String Penerbit;

    public Buku(int idBuku, String judulBuku, int stok, String Penerbit) {
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
        this.Penerbit = Penerbit;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku"
    public int getIdBuku() {
        return idBuku;
    }
//getter = asesor
    // setter/ setIdbuku = mutator
    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public int getStok() {
        return stok;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" 
    public String getJudulBuku() {
        return judulBuku;
    }
    
    
    // method untuk mengurangi stok sejumlah 1
    public void kurangiStok(){
        this.stok--;
    }
    public void tambahStock(){
        this.stok++;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
    
}
