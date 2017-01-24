/*
 * Matrice: una classe wrapper
 * per una matrice bidimensionale di interi.
 */

package matrici;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alessandro Bottiglieri
 */
public class Matrice {
    
    int[][] theMatrix;
    
    // costruttore uno
    public Matrice(int x, int y) {
        theMatrix = new int[x][y];
    }
    
    // costruttore due
    public Matrice(int[][] m) {
        theMatrix = m;
    }
    
    public void fillRandom() {
      for (int i = 0; i < theMatrix.length; i++) {
        for (int j = 0; j < theMatrix[i].length; j++) {
          theMatrix[i][j] = (int) (Math.random()*10);
        }
      }
    }

    @Override
    public String toString() {
        
        String s = "";
        
         for (int i = 0; i < theMatrix.length; i++) {
             for (int j = 0; j < theMatrix[i].length; j++) {
                 s += theMatrix[i][j]+ "\t";
             }
            s += "\n"; 
            
        }
         return s;
    }

    public void toFile( String filename ) {
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(this.toString());
            bw.close();
        } catch(IOException e) {
            System.out.println("Errore"+e);
        }
        
    }

    public void fromFile( String filename ) {
        // da completare
    }
    
}

