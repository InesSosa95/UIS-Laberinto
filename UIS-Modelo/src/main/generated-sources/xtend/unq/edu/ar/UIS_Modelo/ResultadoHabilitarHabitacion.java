package unq.edu.ar.UIS_Modelo;

import com.google.common.base.Objects;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.ResultadoDeAccion;

@SuppressWarnings("all")
public class ResultadoHabilitarHabitacion extends ResultadoDeAccion {
  private Habitacion habitacionADesbloquear;
  
  public void habilitar(final Item item, final Habitacion habitacion) {
    String _nombreItem = item.getNombreItem();
    Item _item = this.getItem();
    String _nombreItem_1 = _item.getNombreItem();
    boolean _equals = Objects.equal(_nombreItem, _nombreItem_1);
    if (_equals) {
      this.habitacionADesbloquear.setEstaDisponible(Boolean.valueOf(true));
    }
  }
}
