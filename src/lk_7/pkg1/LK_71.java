/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lk_7.pkg1;

/**
 *
 * @author Abdul Malik Muzakir
 */
public class LK_71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        spashcreen spn = new spashcreen();
        spn.setVisible(true);
        
        login login = new login();
        
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(20);
                spn.loadingnum.setText(Integer.toString(i) + "%");
                spn.progressbar.setValue(i);
                
                if(i==100){
                    spn.setVisible(false);
                    login.setVisible(true);
                }
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
