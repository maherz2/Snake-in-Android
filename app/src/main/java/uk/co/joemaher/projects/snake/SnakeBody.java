package uk.co.joemaher.projects.snake;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class SnakeBody extends GameObject implements Drawabale {

    public SnakeBody(Bitmap image, int x, int y, int width, int height) {
        super(image, x, y, width, height);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
        if (x < 0) {
            canvas.drawBitmap(image, x + GameController.WIDTH, y + GameController.HEIGHT, null);
        }
    }
}