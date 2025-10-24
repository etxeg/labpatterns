package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {
	public static void main(String args[]) {
		Observable pacient = new Covid19Pacient("aitor", 35);
		Observable pacient2 = new Covid19Pacient("mikel", 35);
		Observable pacient3 = new Covid19Pacient("jon", 35);
		new PacientObserverGUI(pacient);
		new PacientObserverGUI(pacient2);
		new PacientObserverGUI(pacient3);
		new PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientSymptomGUI((Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient);
		new PacientThermometerGUI(pacient2);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient);
		new SemaphorGUI(pacient2);
		new SemaphorGUI(pacient3);
	}
}