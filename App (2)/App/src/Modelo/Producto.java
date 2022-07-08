package Modelo;
public class Producto 
{
    private String NombreProd;
    private String ClaveProd;
    private int PrecioProd;
    
    public void setNombreProducto(String NombreProd)
    {
    this.NombreProd=NombreProd;
    }
    
    public String getNombreProd() 
    {
        return NombreProd;
    }

    public String getClaveProd() 
    {
        return ClaveProd;
    }

    public void setClaveProd(String ClaveProd) 
    {
        this.ClaveProd = ClaveProd;
    }

    public int getPrecioProd() 
    {
        return PrecioProd;
    }

    public void setPrecioProd(int PrecioProd) 
    {
        this.PrecioProd = PrecioProd;
    }

    public String getInfoProdTot()
    {
    String Info;
    Info=this.ClaveProd+"\n"+this.NombreProd+"\n"+"$"+this.PrecioProd;
    return Info;
    }
}