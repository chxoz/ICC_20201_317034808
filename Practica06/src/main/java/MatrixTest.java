/**
 * clase main que prueba cada problema de la práctica 6
 */
public class MatrixTest{
    /**
     * método scalarProductTest
     * método que realiza un producto escalar e imprime bien si el producto es correcto, mal en otro caso 
     * @param scalar un número real 
     * @param m matriz
     */
    public static void scalarProductTest(double scalar, Matrix m){
	double [][] matriz={{1.0,2.0,3.0,4.0,},{4.0,3.0,2.0,1,0},{0.0,0.5,0.75,1.0}};//matriz resultanre del producto escalar
	Matrix matriz2=new Matrix(matriz);
	m.scalarProduct(scalar);
	if(m.equals(matriz2)){
	    System.out.println("scalarProduct: bien");
	}
	else{
	    System.out.println("ScalarProduct: mal");
	}
	    
	

    }
/**
 * método addTest
 * método que suma dos matrices e iprime bien si la suma es correcta, mal en otro caso
 * 
**/    
    public static void addTest(Matrix m2){
	double [][] array= {{1.5,3.0,4.5,6.0},{6.0,4.5,3.0,1.5},{0.0,0.75,1.125,1.5}};
	Matrix suma= new Matrix(array);
	m2.add(m2);
	if(m2.equals(suma)){
	    System.out.println("método add: bien");
	}
	else{
	    System.out.println("método add: mal");
	}
       
    }
/**
/*método matrixProducTest
/* Metodo que realiza una multiplicación entre dos matrices e imprime bien si es correcta y mal si en otro caso .
/*
**/    
    public static void matrixProductTest(){
	
	double arre[][]={{1.0,2.0,-3.0},{4.0,0.0,-2.0}};
	Matrix m3= new Matrix(arre);
	double arre2[][]={{3.0,1.0},{2.0,4.0},{-1.0,5.0}};
	double mulMat[][]={{10.0,-6.0},{14.0,-6.0}};
	Matrix respuesta=new Matrix(mulMat);
	Matrix d= new Matrix(arre2);
	m3.matrixProduct(d);
	if(m3.equals(respuesta)){
	    System.out.println("método matrixProduct: bien");
	}
	else{
	    System.out.println("metodo natrixProduct: mal");
	}
    }
/**
/*Metodo setElementTest
/* Metodo que pone a prueba el metodo setElement  de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/        
    public static void setElementTest(){

	Matrix m4= new Matrix (4,4);
	int j=1;
	int i=1;
	double s=5.5;
	m4.setElement(i,j,s);
	double set=m4.getElement(i,j);
	
	if(set==s){
	    System.out.println("metodo setElement: bien");
	}
	else{
	    System.out.println("metodo setElement: mal");
	}
	
    }
    /**
/*Metodo getElementTest
/* Metodo que pone a prueba el metodo getElement de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void getElementTest(){

	double arre[][]={{0.0,2.0,3.0},{5.0,4.0,2.0},{7.0,3.0,10.0}};
	Matrix m3= new Matrix(arre);

	if(m3.getElement(2,2)==10){
        System.out.println("método getElement: bien");
	}
	else{
	    System.out.println("método getElement: mal");
	}

    }
/**
/*Metodo determinant__test
/* Metodo que pone a prueba el metodo determinant de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void determinantTest(){

	double[][] det={{1.0,3.0,-2.0},{3.0,9.0,-4.0},{0.0,6.0,1.0}};
	Matrix m5= new Matrix(det);
	double res=16.0;
	double resm5=m5.determinant();
	if(res==resm5){
	    System.out.println("método determinant: bien");
	}
	else{
	    System.out.println("método determinant: mal");
	}
    }
    public static void equalsTest(Matrix m2, Matrix m){
	if(m2.equals(m)==false && m2.equals(m2)==true){
	    System.out.println("método equals: bien");

	}
	else{
	    System.out.println("método equals: mal");
	}
    }
/**
/*Metodo main
/* Metodo que se ejecuta y manda a llamar a cada uno de los metodos test, tambien aqui se crean algunos objetos de la clase Matrix y unos valores que utlice en varios metodos de esta clase.
**/    
    public static void main(String[] args) {
	int x=6;
	int y=6;
	Matrix m2= new Matrix(x,y);
	double [][] array= {{1.5,3,4.5,6},{6,4.5,3,1.5},{0,0.75,1.125,1.5}};
	Matrix m= new Matrix(array);
        scalarProductTest(1.5,m);
        addTest(m);
        matrixProductTest();
        setElementTest();
        getElementTest();
        determinantTest();
        equalsTest(m,m2);
    }
}