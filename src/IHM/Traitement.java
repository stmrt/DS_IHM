
package IHM;

import java.sql.DriverManager;

public class Traitement {
    
 public static void main(String args[]) {            
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IHM_Login L1= new IHM_Login();
                L1.setResizable(false);
                L1.setVisible(true);            
             
                
                
               try {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("//localhost/phpmyadmin/index.php","root", "");
        String url = "jdbc:mysql://phpmyadmin/db_structure.php?server=1&db=bdd_ihm";
    }
    catch(Exception e){
        System.out.println("Erreur lors du chargement "+e.getMessage());}
                
            }
            
        });
    }
}