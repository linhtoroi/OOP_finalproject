package GameEntity.Tower;

import Bullet.Bullet;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import GameEntity.Config;

public class NormalTower extends Tower{

    public NormalTower(double x, double y){
        super(x,y);
        radius = Config.NORMAL_TOWER_RANGE;
        speed = Config.NORMAL_TOWER_SPEED;
        image = new Image("/AssetsKit_2/PNG/Retina/towerDefense_tile249.png");
        imageView = new ImageView(image);
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setY(y*50);
        imageView.setX(x*50);
        imageBullet = new Image("/AssetsKit_2/PNG/Retina/towerDefense_tile272.png");
        bullet = new Bullet(x*50, y*50, imageBullet);
        price = Config.NORMAL_TOWER_PRICE;
    }

    @Override
    public void shoot(GraphicsContext gc, Group root) {
        if (countSpeed < speed){
            super.shoot(gc, root);
            countSpeed++;
        }
        else {
            countSpeed = 0;
        }
    }

    @Override
    public void upgrade(int newGrade, Group root){
        speed += 5;
        radius += 50;
        System.out.println("day");
        if (newGrade == 1){
            image = new Image("/AssetsKit_2/PNG/Retina/towerDefense_tile250.png");
            root.getChildren().remove(imageView);
            imageView = new ImageView(image);
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            imageView.setY(coordinate.y);
            imageView.setX(coordinate.x);
            root.getChildren().add(imageView);
            this.grade = newGrade;
            System.out.println("day");
        }
        else if (newGrade == 2){
            image = new Image("/AssetsKit_2/PNG/Retina/towerDefense_tile229.png");
            root.getChildren().remove(imageView);
            imageView = new ImageView(image);
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            imageView.setY(coordinate.y);
            imageView.setX(coordinate.x);
            root.getChildren().add(imageView);
            this.grade = newGrade;
            System.out.println("day");
        }
    }
}
