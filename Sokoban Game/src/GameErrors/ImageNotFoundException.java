package GameErrors;

public class ImageNotFoundException extends RuntimeException {
    public ImageNotFoundException(String s){
        super(s);
    }
}
