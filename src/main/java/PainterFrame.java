/**
 * Created by zd on 2017/3/14.
 * 测试多态
 */
public class PainterFrame {

    public void drawFrame(IFrame iFrame){

        System.out.println("开始绘画...");
        iFrame.paint();

    }

    public static void main(String[] args) {
        new PainterFrame().drawFrame(new Frame02());
    }

}

class Frame01 implements IFrame{

    public void paint() {
        System.out.println("Frame01被调用！");

    }
}
class Frame02 implements IFrame{

    public void paint() {
        System.out.println("Frame02被调用！");

    }
}