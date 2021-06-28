import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorMateriales {
            private HashMap<Integer, ArrayList<Material>> listaMateriales;

    public GestorMateriales() {
        //ArrayList <Material>  materiales= new ArrayList<Material>() ;
        listaMateriales= new HashMap<>();
    }

    public boolean agregarMaterial(int dni, Material material) {
        if(listaMateriales.size()==0 ||  !listaMateriales.containsKey(dni) || !listaMateriales.get(dni).contains(material)){
            if(!listaMateriales.containsKey(dni)) {
                ArrayList<Material> materialesnew =new ArrayList<Material>();
                materialesnew.add(material);
                listaMateriales.put(dni, materialesnew);
            }
            else
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
            System.out.println(pMaterial.toString());
    }

    public void kilosMaterialesPorCartonero(List<Cartonero> cartoneros){
        for (Cartonero pCartonero: cartoneros) {
            System.out.println(pCartonero.toString());
            kilosMaterialesCartonero(pCartonero.getDNI());
        }
    }

}
