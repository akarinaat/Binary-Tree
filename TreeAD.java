//Active Disrectory

public class TreeAD
{
    // Atributos
    private NodoDP root;
    private NodoDP rootTemp;
    
    // Constructor
    public TreeAD()
    {
        root = null;
    }
    
    // Metodos
    public String insertNode(int valor)
    {
        if(root == null)
            root = new NodoDP(valor);
        else
            root.insert(valor);
        
        return "Nodo insertado en el Arbol...";
    }
    
    public String obtenerDatos()
    {
        String datos="";
        
        if(root == null)
            datos="BTree is Empty ... ";
        else
        {
            datos = "Los datos aparecen en el monitor...";
            obtenerValor(root);
        }
        
        return datos;
    }
    
    private void obtenerValor(NodoDP nodo)
    {
        String datos="";
        
        if(nodo == null)
        {
            System.out.print("null" + "   ");
            return;
        }
        
        System.out.print(""+nodo.getDato() + "   ");
        obtenerValor(nodo.getLeftNode());
        obtenerValor(nodo.getRightNode());
        
        System.out.print("\n");
    }

    public String buscarNumero(int numero){
        String datos="";
        boolean encontrado = false;
        
        if(root == null){
            System.out.print("null" + "   ");
            datos="BTree is Empty ... ";
        }
        
        else
        {
            rootTemp = root;
           //el arbol no está vacío
           while(rootTemp != null && !encontrado){

            int valor = rootTemp.getDato();

                 if(valor == numero){
                     datos="yay lo encontraste " + numero;
                    encontrado = true;
                 }else {
                     //en valor guardo el nodo actual
                     if(numero > valor){
                        rootTemp= rootTemp.getRightNode();
                     }else{
                        rootTemp= rootTemp.getLeftNode();
                     }
                 }
           }
            
        }
          if (encontrado == false){
              datos = "No se encontró el numero... :(";
          }
        
        return datos;
    }
    
}
