/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mix4;

/**
 *
 * @author 15009199
 */
public class Mix4 {

    int counter = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        Mix4 [] m4a = new Mix4[20];
        int x = 0;
        while (x < 19) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count++;
            count = count + m4a[x].maybeNew(x);
            x++;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
    public int maybeNew(int index) {
        if (index < 1) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
    
    // 14 1
    // 25 1
    // 14 1
    // 20 1
    
}
