enum Material {
	JEAN {
		public int getTemperaturaMaxima() {
			return 40;
		}
	},
	ALGODON{
		public int getTemperaturaMaxima() {
			return 40;
		}
	},	
	LANA{
		public int getTemperaturaMaxima() {
			return 15;
		}
	}
	
	public abstract int getTemperaturaMaxima();
	//especifico la temperatura maxima de cada material

class class Atuendo
	Prenda prendaSuperior
	Prenda prendaInferior
	Prenda calzado
	Prenda accesorio
	
	List<Atuendo> generarAtuendos(Prenda prendaSuperior,Prenda prendaInferior,
                                  Prenda calzado,Prenda accesorio)
    //genera una lista de atuendos con una prenda por cada categoria							
	

class Usuario
	String ciudad
	int temperaturaActual
	List<Atuendo> atuendos
	List<Prenda> prendasAptas
	
	method int obtenerTemperatura(String ciudad)
	//obtiene de la interfaz Clima la temperatura actual para una determinada ciudad
	method List<Prenda> generarPrendasValidas(atuendos,int temperaturaActual)
	//retorna lista de prendas excluyendo las que tengan una temperatura máxima menor a la actual
	//..
	prenda.getMaterial().getTemperaturaMaxima() >= this.temperaturaActual
	//..
	
	method List<Sugerencia> generarSugerenciaDesde(List<Prenda> prendasAptas)
	//implementa la interfaz que devuelve una lista con las sugerencias de prendas aptas
	
/*
La clase AccuWeather actua como adapter de la interfaz Clima permitiendo obtener la temperatura actual en base a una determinada ciudad
desde la Api de AccuWeather. De esta forma puedo configurar facilmente diferentes servicios de obtencion del clima.

Para no incurrir en costos innecesarios conviene usar mocks para evitar hacer la consulta directamente en la Api en los tests
*/