  /**
   * Clase que implementa matices 
   */
  public class Matrix{
    double[][] arre;
    /**
     * Construye una matriz vacía(llenada con 0) de n por m
     * @param int n indica cuál será el número de filas 
     * @param int m indica cuál será el número de columnas
     * los for se usan para llenar la matriz con 0
     */
    public Matrix(int n, int m){
        this.arre = new double[n][m];
        for(int i=0;i<n;i++){
          for(int j=0; j<m;j++){
              this.arre[i][j]=0;
          }
        }
    }
  
    /**
     * Construye una matriz dado un arreglo
     * @param double [][] array es un arreglo de dos dimensiones
     */
    public Matrix(double[][] array){
      arre= new double [array.length][array[0].length];
      for(int i=0;i<this.arre.length;i++){
          for(int j=0;j<arre[0].length;j++){
              this.arre[i][j] = array[i][j];
          }
      } 
    }
  
    /**
     * Función que calcula producto escalar
     * @param double scalar es un numero real por el cuál se multiplicara cada número de la matriz
     */
    public void scalarProduct(double scalar){
        for(int i=0;i<arre.length;i++){
              for(int j=0;j<arre[0].length;j++){
                arre[i][j]=arre[i][j]*scalar;
              }
          }
    }
  
    /**
     * Función que calcula suma de matrices
     * @param Matrix m es otro arreglo de dos dimensiones el cuál se sumará con otro arreglo de dos dimenciones si tienen el mismo número de columnas y filas 
     */
    public void add(Matrix m){
      if(this.arre.length==m.arre.length && this.arre[0].length==m.arre[0].length){
          for(int i=0; i<this.arre.length;i++){
              for(int j=0; j<this.arre[0].length;j++){
                  this.arre[i][j]=this.arre[i][j]+m.arre[i][j];	
              }	       
          }
      }
    }    
    /**
     *Función que calcula producto de matrices
     *@param Matrix m es otro arreglo de dos dimensiones el cuál se multiplicará con otro arreglo de dos dimenciones si el número de columnas de Matrix m es igual al número de filas del otro arreglo
     * 
     */
    public void matrixProduct(Matrix m){
      double[][] mul= new double[this.arre.length][m.arre[0].length];
      double suma=0;
      int aux=0;
      int aux2=0;
      if(this.arre[0].length==m.arre.length){
          for(int i=0;i<this.arre.length;i++){
              for(int j=0; j<this.arre[i].length;j++){
                  mul[i][j]+=this.arre[i][j]*m.arre[j][i];
                  for(int k=0;k<this.arre[0].length;k++){
                      mul[i][j]+=this.arre[i][k]*m.arre[k][j];
                  }
              }
          }
          this.arre=mul; 	
      } 
      else{
          System.out.println("El número de columnas de Matrix m no coincide con el número de filas de la otra matriz");
      }
    }
    /**
     *Función que obtiene el elemento i j 
     *@param int i indica la fila
     *@param int j indica la columna
     */
    public double getElement(int i, int j){
        return this.arre[i][j];
    }
    
    /**
     * function set element
     * @param int i indica la fila
     * @param int j indica la columna
     * @param double e valor que pondremos en la posicion i,j
     */
    public void setElement(int i, int j,double e){
      for(int k=0;k<this.arre.length;k++){
          for(int l=0;l<this.arre[0].length;l++){
              if(k==i && l==j){
                  this.arre[i][j]=e;
              }
          }
      }      
    }  
  
    /**
     *Función que calcula el determinante si es nxn
     * https://www.matesfacil.com/matrices/resueltos-matrices-determinantes.html
     */
    public double determinant(){
        for(int l=0;l<this.arre.length-1;l++){
            for(int i=l+1; i<this.arre.length; i++){
                for(int j=l+1; j<this.arre.length; j++){
                    this.arre[i][j]-=this.arre[i][l]*this.arre[l][l]/this.arre[l][l];
                  }
              }
          }
      double det=1.0;
      for(int i=0; i<this.arre.length; i++){
          det*=this.arre[i][i];
      }
      return det;
  }
  
    /**
     * Te dice si 2 matrices son iguales
     * @param Object e un arreglo de dos dimensiones
     
    public boolean equals(Object e){
        if(this.arre.length==e.arre.length && this.arre[0].length==e.arre[0].length){
          for(int i=0; i<this.arre.length;i++){
              for(int j=0; j<this.arre[0].length;j++){
                  if(this.arre[i][j]!=e.arre[i][j]){
                      return false;
                  }
              }
          }
          return true;
      }
      else{
          return false;
      }
      
      }
      */
  }