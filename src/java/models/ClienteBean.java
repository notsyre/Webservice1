package models;

public class ClienteBean {

    private int idProducto;
    private String img;
    private String nombre;
    private String desc;
    private int valor;

    public ClienteBean() {
    }

    public ClienteBean(int idProducto, String img, String nombre, String desc, int valor) {
        this.idProducto = idProducto;
        this.img = img;
        this.nombre = nombre;
        this.desc = desc;
        this.valor = valor;

    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
