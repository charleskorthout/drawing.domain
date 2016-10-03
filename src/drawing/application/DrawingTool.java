/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.application;

import drawing.domain.Drawing;
import drawing.domain.DrawingItem;
import drawing.domain.RandomShapeFactory;
import drawing.javafx.JavaFXPaintable;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author charl
 */
public class DrawingTool extends Application {
    
    @Override
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Drawing drawing = new Drawing();
        Canvas canvas = new Canvas(1200,1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
	JavaFXPaintable paintable = new JavaFXPaintable(gc);
        for (int i = 0; i < 10; i++) {
            DrawingItem di = RandomShapeFactory.createShape();
            drawing.append(di);
        }
        drawing.paint(paintable);
        root.getChildren().addAll(canvas);

        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
