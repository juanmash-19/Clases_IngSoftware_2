public class Orden {
    private List<ItemOrden> items = new ArrayList<>();

    public void agregarItem(String producto, cantidad, precio) {
        ItemOrden item = new ItemOrden(producto, cantidad, precio);
        items.add(item);

        //... Otros métodos de la clase Orden
    }
}