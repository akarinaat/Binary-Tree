//DP viene de dynamic programming
//Se crean y asignan los valores de los nodos.
public class NodoDP
{
    // Atributos
    private int dato;
    private NodoDP leftNode;
    private NodoDP rightNode;
    
    
    // Construtores
    public NodoDP()
    {
        dato = 0;
        
        leftNode  = null;
        rightNode = null;
    }
    
    public NodoDP(int numero)
    {
        dato = numero;
        
        leftNode  = null;
        rightNode = null;
    }
    
    // Metodo insert
    public void insert(int valor)
    {
        //valor root
        if(valor < dato)
        {
            if(leftNode == null)
                leftNode = new NodoDP(valor);
            else
            //aqui es sobre 70
                leftNode.insert(valor);
        }
        else
        {
            if(rightNode == null)
                rightNode = new NodoDP(valor);
            else
                rightNode.insert(valor);
        }
    }
    
    // Accesors
    public int getDato()
    {
        return this.dato;
        //this dato se refiere al dato dentro del nodito
        //el valor que hay ahí. Es de tipo int porque 
        //devuelve el  #
    }
    
    public NodoDP getLeftNode()
    {
        return this.leftNode;
    }
    
    public NodoDP getRightNode()
    {
        return this.rightNode;
    }
    
    // Mutators
    public void setDato(int valor)
    {
        this.dato = valor;
    }
    
    public void setLeftNode(NodoDP nodo)
    {
        this.leftNode = nodo;
    }
    
    public void setRightNode(NodoDP nodo)
    {
        this.rightNode = nodo;
    }
    
}