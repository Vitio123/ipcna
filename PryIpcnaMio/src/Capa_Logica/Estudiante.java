package Capa_Logica;

import Capa_Datos.Lista_Estudiantes;
import TListas.TLista;

public class Estudiante {

	private String nombre;
	private String tipoDocumento;
	private String DocumentoIdentidad;
	private String correoElectronico;
	private String apellidos;
	private String fechaNacimiento;
	private int telefono;
	private String nacionalidad;
	private String contraseña;
	private String sexo;
        private String codigoEstudiante;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(String DocumentoIdentidad) {
        this.DocumentoIdentidad = DocumentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
	/**
	 * activo
	 * inactivo
	 * egresado
	 */
	
  //PARTE LOGICA
    //Metodo de verificacion documentoIdentidad
    public static int verificacionDocIden(String codigo) {
        TLista lista = Lista_Estudiantes.obtener();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Estudiante obj = (Estudiante) lista.Obtener(i);
            if (obj.getCodigoEstudiante().equalsIgnoreCase(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
}