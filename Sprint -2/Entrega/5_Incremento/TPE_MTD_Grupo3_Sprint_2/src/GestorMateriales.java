import java.util.ArrayList;
import java.util.HashMap;

public class GestorMateriales {
    private HashMap<Integer, ArrayList<Material>> listaMateriales;

    public GestorMateriales() {
        listaMateriales= new HashMap<Integer, ArrayList<Material>>();
    }

    public boolean agregarMaterial(int dni, Material material) {
        if(!listaMateriales.get(dni).contains(material)){
            listaMateriales.get(dni).add(material);
            return true;
        }
        else {
            int indice = listaMateriales.get(dni).indexOf(material);
            Material contenido = listaMateriales.get(dni).get(indice);
            contenido.agregarKilos(material.getKilos());
            return true;
        }
    }

    public void kilosMaterialesCartonero(int dni){
        for (Material pMaterial: listaMateriales.get(dni))
            pMaterial.toString();
    }
}
