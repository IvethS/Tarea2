
public class PentagonoRegular {
	
	int Lado;
	
//Este programa lo logre realizar con ayuda de esta pagina:http://recursostic.educacion.es/descartes/web/materiales_didacticos/Perimetros_y_Areas/Perimetro_3.html
//ya este es un programa mas simple ya que se sabe para sacar el perimetro de un pentagono
	//se debe multiplicar los lados * 5
	
	//aqui se define el lado
	PentagonoRegular (int Lado)
	{
		this.Lado = Lado;
	}
	//como les explique se obtiene el lado y se multiplica por el valor definido que es 5.
	int getPerimetro()
	{
		return Lado*5;
	}
	
	//se obtiene el valor del lado
	int getLado()
	{
		return Lado;
	}
//y se establece ese valor.
	void setLado(int lado)
	{
		Lado = lado;
	}

	
	
	
}
