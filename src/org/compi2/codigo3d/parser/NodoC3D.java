package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etqV,etqF;
    public NodoC3D(){
    
    }
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    public NodoC3D(String etqV,String etqF){
        this.etqV=etqV;
        this.etqF=etqF;
    }

    public String getCad(){
        return cad;
    }
    public String getEtqV(){
        return etqV;
    }
    public String getEtqF(){
        return this.etqF;
    }
    public void setEtqV(String etqV){
        this.etqV=etqV;
    }
    public void setEtqF(String etqF){
        this.etqF=etqF;
    }
}
