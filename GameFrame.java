import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class GameFrame extends JFrame {
   public GameFrame() {
      //super("Game Frame");
      Tiles tiles = new Tiles();
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Monopoly");
      this.getContentPane().add(tiles);
      addTilesH(tiles, 0);
      addTilesH(tiles, 806-124);
      addTilesV(tiles, 0);
      addTilesV(tiles, 806-124);
      addCorners(tiles);

      this.pack();
      this.setLocationRelativeTo(null);
      this.setVisible(true);

   }
   
   void addTilesH(Tiles t, int y){
	for(int i=2; i<11; i++){
	  t.addSquare(i*62, y, 62, 124);
	}
   }
   
   void addTilesV(Tiles t, int x){
	for(int i=2; i<11; i++){
	  t.addSquare(x, i*62, 124, 62);
	}
   }
   
   void addCorners(Tiles t){
	t.addSquare(0,0,124,124);
	t.addSquare(0,11*62,124,124);
	t.addSquare(11*62,0,124,124);
	t.addSquare(11*62,11*62,124,124);
   }
   
}


