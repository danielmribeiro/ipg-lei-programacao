/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17mar2017;

/**
 *
 * @author jfig
 */
public class ExAcesso {

    public ExAcesso(){
        iPublic = 0;
        iProtected = 0;
        i = 0;
        iPrivate = 0;
    }

    public ExAcesso(int iPublic,
                    int iProtected,
                    int i,
                    int iPrivate) {
        this.iPublic = iPublic;
        this.iProtected = iProtected;
        this.i = i;
        this.iPrivate = iPrivate;
    }
    
    
    
    public int iPublic;
    protected int iProtected;
    int i;
    private int iPrivate;

    @Override
    public String toString() {
        return "ExAcesso{" + "iPublic=" + iPublic + 
                        ", iProtected=" + iProtected +
                        ", i=" + i +
                        ", iPrivate=" + iPrivate + '}';
    }
    
    
    
}
