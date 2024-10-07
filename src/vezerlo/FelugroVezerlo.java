package vezerlo;

import modell.AutoModel;
import nezet.FelugroNezet;

public class FelugroVezerlo {
    private AutoModel model;
    private FelugroNezet nezet;
    
    public FelugroVezerlo(AutoModel model, FelugroNezet nezet){
        this.model = model;
        this.nezet = nezet;
        
        start();
    }
    
    private void start(){
        nezet.start(model.getRendszam(), model.getSzin(), model.getExtrak());
        nezet.SzinAtfestes();
    }
}
