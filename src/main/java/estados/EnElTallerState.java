package estados;

import clinica.Ambulancia;

public class EnElTallerState implements IState {

	private Ambulancia a;

	public EnElTallerState(Ambulancia a) {
		this.a = a;
	}

	@Override
	public String reportaEstado() {
		return "En el taller.";
	}

	@Override
	public void solicitaTranslado() {
	}

	@Override
	public void solicitaReparacion() {
	}

	@Override
	public void solicitaAtencion() {
	}

	@Override
	public void vuelveaClinica() {
		this.a.setEstado(new RegresandoDelTallerState(this.a));
	}

}