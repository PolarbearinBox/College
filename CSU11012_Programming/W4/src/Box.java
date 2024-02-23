public class Box {
    private int length, width, height;
    Box(){
        length = width = height = 0;
    }

    Box(int cubelength){
        length = width = height = cubelength;
    }

    Box(int newLength, int newWidth, int newHeight){
        length = newLength;
        width = newWidth;
        height = newHeight;
    }

    public int getVolume(){
        return(length * width * height);
    }
}
