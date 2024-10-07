package main;

import modell.AutoModel;
import nezet.FelugroNezet;
import vezerlo.FelugroVezerlo;

public class AutoBemutato {


    public static void main(String[] args) {
        FelugroNezet nezet = new FelugroNezet();
        AutoModel AutoModel = new AutoModel(nezet.SzinBekeres(), nezet.ExtraBekeres(), nezet.RendszamBekeres());
    }
    
}
