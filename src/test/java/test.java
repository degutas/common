import com.degutas.common.Thumbnail;

/**
 * Created by Administrator on 2016/7/5.
 */
public class test {
    public static void main (String args []) throws Exception{
        String filename = "F:\\setwerwet.jpg";
        Thumbnail thum = new Thumbnail(filename);
        thum.resizeFix(500, 300);
    }
}
