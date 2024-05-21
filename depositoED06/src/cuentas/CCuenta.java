package cuentas; //1-Click derecho-Refractor-Move-Create Package-"cuentas"
public class CCuenta {

    /**
     * 
     */
	//4-Encapsular atributos de la clase "cuenta": Source-Genetate Getters and Setters
    private String nombre;
    private String cuenta;
    private double saldo;
    public String getNombre() {
		return nombre;
	}
    //Atributos encapsulados
	public String getCuenta() {
		return cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	//Atributos encapsulados
	
	private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
