
package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet {
    
    public String RendszamBekeres(){
        String rendszam = JOptionPane.showInputDialog("Mi a rendszámod?");
        return rendszam;
    }
    
    public String SzinBekeres(){
        String szin = JOptionPane.showInputDialog("Milyen színű az autód?");
        return szin;
    }
    
    public String ExtraBekeres(){
        String extra = JOptionPane.showInputDialog("Milyen extra van a kocsiban?");
        return extra;
    }
    
    public String SzinAtfestes(){
        String szinAtfestes = JOptionPane.showInputDialog("Milyen színűre szeretnéd átfesteni az autód?");
        return szinAtfestes;
    }
    
    public void start(String rendszam, String szin, String extra){
        JOptionPane.showMessageDialog(null, "Az autó rendszáma:" + rendszam + "Az autó színe" + szin + "Extrák: " + extra);
    }
   
   
    
}
