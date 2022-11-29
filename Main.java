/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NO2;

/**
 *
 * @author user
 */
public class Main 
{
    public static void main(String[] args) 
    {
        SalariedEmployee se = new SalariedEmployee("Bambang",201293,1200000.00);
        se.CetakInfo();
        System.out.println("Gaji : " + se.HitungGaji());
        System.out.println("\n");
        CommisionEmployee ce = new CommisionEmployee("Towo",222222,750000.00,50000.00,12);
        ce.CetakInfo();
        System.out.println("Gaji : " + ce.HitungGaji());
        System.out.println("\n");
        var pp = new ProjectPlanner("Azmi",2132133,1230000.00,40000.00,3,0.05f);
        pp.CetakInfo();
        System.out.println("Gaji : " + pp.HitungGaji());
    }
}
