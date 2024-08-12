package queue;

import java.util.Objects;

public class Patient implements Comparable<Patient> {

	private String nombre;
	private Gravity gravity;

	public Patient(String nombre, Gravity gravity) {
		super();
		this.nombre = nombre;
		this.gravity = gravity;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Gravity getGravity() {
		return gravity;
	}

	public void setGravity(Gravity gravity) {
		this.gravity = gravity;
	}
	
	

	@Override
	public String toString() {
		return "Patient [nombre=" + nombre + ", gravity=" + gravity.getDescription() + "]";
	}
	
	

	@Override
	public int hashCode() {
		int hash = Objects.hash(gravity, nombre);
		System.out.println("hash "+hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return gravity == other.gravity && Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Patient patient) {
		int currentLevel = this.gravity.getLevel();
		int compareLevel = patient.getGravity().getLevel();
		return compareLevel - currentLevel;
	}

}
