package ifpr.pgua.eic.despesas.model.entities;

import java.time.LocalDate;

public class Despesa {
    
    private Integer id;
    private String titulo;
    private String tipo;
    private Double valor;
    private LocalDate data;
    
    public Despesa(Integer id, String titulo, String tipo, Double valor, LocalDate data) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public Despesa(String titulo, String tipo, Double valor, LocalDate data) {
        this(-1, titulo, tipo, valor, data);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
    
}
