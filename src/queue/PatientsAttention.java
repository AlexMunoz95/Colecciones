package queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class PatientsAttention {

	public static List<Patient> listOfPatients() {
		return Arrays.asList(new Patient("Juan", Gravity.MINOR), new Patient("Raquel", Gravity.SEVERE),
				new Patient("Ignacio", Gravity.MODERATE), new Patient("Yadira", Gravity.MODERATE),
				new Patient("Simón", Gravity.SEVERE), new Patient("Eugenio", Gravity.MODERATE),
				new Patient("Anastasia", Gravity.MODERATE), new Patient("Omar", Gravity.VERY_SEVERE),
				new Patient("Beatriz", Gravity.SEVERE), new Patient("Xochilt", Gravity.MINOR),
				new Patient("Román", Gravity.MINOR), new Patient("Rodolfo", Gravity.SEVERE),
				new Patient("Eunice", Gravity.MINOR), new Patient("Javier", Gravity.MINOR),
				new Patient("Jacobo", Gravity.MINOR), new Patient("Brenda", Gravity.SEVERE),
				new Patient("Alvaro", Gravity.VERY_SEVERE));
	}
	
	public static void main(String[] args) {
		Queue<Patient> attentionPriority = new PriorityQueue<>(listOfPatients());
		while (!attentionPriority.isEmpty()) {
			System.out.println("Paciente atendido: "+ attentionPriority.remove().toString());
		}
		Set<Patient> patients = new HashSet<Patient>(listOfPatients());
		patients.forEach(patient -> System.out.println("hash asignado: "+patient.hashCode()));
	}

}
