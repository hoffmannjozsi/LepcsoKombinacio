/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lepcsokombinacio;

/**
 *
 * @author Hoffmann József
 */
public class LepcsoKombinacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lepesek = {1, 2};
        int lepcsok = 4;

        System.out.println(kombinacioSzamitas(lepesek, lepcsok));
    }

    public static int kombinacioSzamitas(int[] lepesek, int lepcso) {

        if (lepcso == 0) {
            return 1;
        }

        if (lepcso < 0) {
            return 0;
        }

        int kombinaciok = 0;
        for (int i = 0; i < lepesek.length; i++) {
            kombinaciok += kombinacioSzamitas(lepesek, lepcso - lepesek[i]);            
        }
    return kombinaciok;
    }

}
