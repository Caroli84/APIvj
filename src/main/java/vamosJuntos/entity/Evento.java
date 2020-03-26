package vamosJuntos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String user;
    private String fecha;
    private String lugar;
    private String info;

    public Evento() {
    }

    public Evento(String user, String fecha, String lugar, String info) {
        this.user=user;
        this.fecha=fecha;
        this.lugar=lugar;
        this.info=info;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
