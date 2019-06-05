package br.edu.usj.ads.lpII;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanCalculadoraHistorico {
    
    private int a;
    private int b;
    private List<String> historico = new ArrayList<>();
    private int limpador;
    
    public void somar(){
        int resultado = a + b;
        historico.add(a + "+" + b + "=" + resultado);
    }
    public void subtracao(){
        int resultado = a - b;
        historico.add(a + "-" + b + "=" + resultado);
    }
    
    public void limparHistorico(){
        limpador = limpador - 1;
        historico.remove(limpador);
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public int getLimpador() {
        return limpador;
    }

    public void setLimpador(int limpador) {
        this.limpador = limpador;
    }
}
