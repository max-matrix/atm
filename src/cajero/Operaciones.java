package cajero;

import producto.Cuenta;

public abstract class Operaciones {
	
	private Cuenta cuentaOperacion;
	
	public boolean autenticar() {
		// agregado para que no tire errores, no es útil
		if(cuentaOperacion == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public abstract Double procesar();

}
