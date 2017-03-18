package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0,gotoL=0;
    private static String c3d = "";
    private static String etqV,etqF="";
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        gotoL = 0;
        c3d = "";
        etqV = "";
        etqF = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    public static String generaGoto(){
        return "l"+gotoL++;
    }
    public static String generaIf(String tempIzq,String operadorRelacional,String tempDer){
        
        return "if ("+tempIzq+operadorRelacional+tempDer+")";
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    public static void agregarEtqV(String etiquetaV){
        etqV+=","+etiquetaV;
    }
    public static void agregarEtqF(String etiquetaF){
        etqF+=","+etiquetaF;
    }
    public static String getEtiquetasV(){
        return etqV;
    }
    public static String getEtiquetasF(){
        return etqF;
    }
    
    /**
     * Devuelve el código 3D generado hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
}
