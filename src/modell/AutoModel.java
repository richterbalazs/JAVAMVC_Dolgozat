package modell;


public class AutoModel {
    private String szin;
    private String extrak;
    private String rendszam;
    private String szinAtfestes;

    public String getSzinAtfestes() {
        return szinAtfestes;
    }
    
    
   public AutoModel(String szin, String extrak){
       this(szin, extrak, "abc-123");
   }
    
    
    public AutoModel(String szin, String extrak,String rendszam){
        this.szin = szin;
        this.extrak = extrak;
        this.rendszam = rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getExtrak() {
        return extrak;
    }

    public String getRendszam() {
        return rendszam;
    }
    
    public void extraHozzaad(){
        
    }
    
    
}
