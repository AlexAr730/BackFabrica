package com.InnoSistemasDocumentos.GestionDocumentos.Documento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocumento;
    private String nombreArchivo;
    private String tipoDocumento;
    private String urlUbicacion;
    private String fechaSubida;
    private String ultimaModificacion;


    public Documento(Long idDocumento, String nombreArchivo, String tipoDocumento, String urlUbicacion, String fechaSubida, String ultimaModificacion) {
        this.idDocumento = idDocumento;
        this.nombreArchivo = nombreArchivo;
        this.tipoDocumento = tipoDocumento;
        this.urlUbicacion = urlUbicacion;
        this.fechaSubida = fechaSubida;
        this.ultimaModificacion = ultimaModificacion;
    }

    public Long getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUrlUbicacion() {
        return urlUbicacion;
    }

    public void setUrlUbicacion(String urlUbicacion) {
        this.urlUbicacion = urlUbicacion;
    }

    public String getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(String fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }


}