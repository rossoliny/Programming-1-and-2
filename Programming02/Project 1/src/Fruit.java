class Fruit {
    private int x, y;
    static final int COLOR = 0xffb71010;
    static final int STROKE = 0xffb71010;
    static final int LEAF_COLOR = 0xff14ff00;
    private int size;
    private int leafSize;

    Fruit(Field field, Snake snake) {
        leafSize = (int) (Math.random() * 4) + 1;
        size = field.getCellSize();

        do {
            x = (int) (Math.random() * field.getWidth());
            y = (int) (Math.random() * field.getHeight());
        }while(snake.collides(x, y));
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    int getSize(){
       return size;
    }
    int getLeafSize() {
        return leafSize;
    }
}
