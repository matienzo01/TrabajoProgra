package habitaciones;

public class HabitacionCompartida extends Habitacion {

	private static double costoHabitacionCompartida = 0;

	public HabitacionCompartida() {
		super(2);
	}

	public static double getCostoHabitacionCompartida() {
		return costoHabitacionCompartida;
	}

	public static void setCostoHabitacionCompartida(double costoHabitacionCompartida) {
		HabitacionCompartida.costoHabitacionCompartida = costoHabitacionCompartida;
	}

	@Override
	protected double getCosto(int cantidadDeDias) {
		double costo = costoHabitacionCompartida;
		return costo + costo * cantidadDeDias;
	}

	@Override
	protected boolean aceptaTipo(String tipo) {
		if (tipo.equalsIgnoreCase("Habitacion Compartida"))
			return true;
		else
			return false;
	}

}
