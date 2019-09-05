/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Vo;

import Modelo.basededatos.Conexion;

/**
 *
 * @author 57313
 */
public class PreguntaVO {
    int idpregunta ;
    String enunciado ;
    int valor;

    public PreguntaVO() {
    }

    public PreguntaVO(int idpregunta, String enunciado, int valor) {
        this.idpregunta = idpregunta;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
