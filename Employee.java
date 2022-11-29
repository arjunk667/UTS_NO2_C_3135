/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NO2;

/**
 *Nama : Muhammad Arjun Kurniawan
 * Nim : 20103235
 * Kelas : SI04D
 * @author user
 */
public abstract class Employee 
{
    final String Nama;
    final int nip;
    
    Employee (String nama, int NIP)
    {
        Nama=nama;
        this.nip=NIP;
    }
    public String NamaPegawai ()
    {
        return Nama;
    }

    public int nipPegawai()
    {
        return nip;
    }
    protected abstract void CetakInfo();
    protected abstract double HitungGaji();  
}
