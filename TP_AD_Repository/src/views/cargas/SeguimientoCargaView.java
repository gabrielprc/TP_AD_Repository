package views.cargas;


public class SeguimientoCargaView {

	private CargaView carga;
	private String estadoCarga;
	private int idEstadoCarga;

	public SeguimientoCargaView() {

	}

	public SeguimientoCargaView(CargaView carga, String estadoCarga,
			int idEstadoCarga) {
		this.carga = carga;
		this.estadoCarga = estadoCarga;
		this.idEstadoCarga = idEstadoCarga;
	}

	public CargaView getCarga() {
		return carga;
	}

	public void setCarga(CargaView carga) {
		this.carga = carga;
	}

	public String getEstadoCarga() {
		return estadoCarga;
	}

	public void setEstadoCarga(String estadoCarga) {
		this.estadoCarga = estadoCarga;
	}

	public int getIdEstadoCarga() {
		return idEstadoCarga;
	}

	public void setIdEstadoCarga(int idEstadoCarga) {
		this.idEstadoCarga = idEstadoCarga;
	}
	
	
}
