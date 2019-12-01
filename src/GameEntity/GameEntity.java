package GameEntity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class GameEntity {
    public Point coordinate = new Point();
    public Image image;
    public abstract void draw(GraphicsContext g2);

}
