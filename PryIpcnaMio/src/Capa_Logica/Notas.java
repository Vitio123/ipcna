package Capa_Logica;

public class Notas {
    private String codigoEstudiante;
        private String codMatricula;
	private int nota1;
        private int nota2;
        private String estado;

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoMarticula() {
        return codMatricula;
    }

    public void setCodigoMatricula(String codigoMat) {
        this.codMatricula = codigoMat;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}