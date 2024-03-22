package org.aufgaben.blatt6.a19;

import java.util.ArrayList;

public class FCFSListe implements WarteSchlange{

    private ZPatient pA, pE;

    @Override
    public void anmelden(ZPatient p) {
        if(pA == null && pE == null){
            pA = p;
            pE = p;
        } else {
            if(pA == pE){
                pE = p;
                pA.next = pE;
            } else {
                pE.next = p;
                pE = p;
            }
        }
    }
    @Override
    public ZPatient derNaechsteBitte() {
        ZPatient naechster = pA;
        if (pA == null){
            return null;
        }
        if (pA.next != null){
            pA = pA.next;
        } else {
            pA = null;
        }
        return naechster;
    }
}
