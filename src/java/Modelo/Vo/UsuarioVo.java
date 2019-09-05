/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Vo;

/**
 *
 * @author 57313
 */
public class UsuarioVo {
    private int idusuario;
    private String correo;
    private String clave;

    public UsuarioVo() {
    }

    public UsuarioVo(int idusuario, String correo, String clave) {
        this.idusuario = idusuario;
        this.correo = correo;
        this.clave = clave;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
