/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import cache.Cacheable;
import java.io.Serializable;

/**
 *
 * @author David Cocom
 */
public class Candidato implements Serializable,Cacheable{

    private String nombre;
    private int numVotos;
    private int idCandidato;


    public Candidato(String nombre) {
        this.nombre = nombre;
        this.numVotos = 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void agregarVoto() {
        ++numVotos;
    }

    @Override
    public int getId() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    

}