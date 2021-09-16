package com.moky.infogram.model;

public class Image {
    private String urlImagen;
    private String username;
    private String cantidadDias;
    private String cantidadMegustas;

    public Image(String urlImagen, String username, String cantidadDias, String cantidadMegustas) {
        this.setUrlImagen(urlImagen);
        this.setUsername(username);
        this.setCantidadDias(cantidadDias);
        this.setCantidadMegustas(cantidadMegustas);
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getCantidadMegustas() {
        return cantidadMegustas;
    }

    public void setCantidadMegustas(String cantidadMegustas) {
        this.cantidadMegustas = cantidadMegustas;
    }
}
