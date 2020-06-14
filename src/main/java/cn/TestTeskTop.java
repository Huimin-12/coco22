package cn;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
public class TestTeskTop {
    /**
     * Java实现在QQ上输入文字并发送
     * @author Wayss
     *
     */
        static Desktop deskapp = Desktop.getDesktop();
        public static void main(String [] args) throws AWTException{
            inputQQ();
        }

        public static void openQQ(){
            //判断当前系统释放支持Desktop提供的接口
            if(Desktop.isDesktopSupported()){
                try {
                    deskapp.open(new File("F:\\常用软件安装包\\Bin\\QQScLauncher.exe"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void inputQQ() throws AWTException{
            Robot robot = new Robot();
            //3等待3秒后开始执行下面的自动键盘事件
            robot.delay(3000);
            //点击鼠标左键(目的是让光标放到QQ上)
            TestInput.mouseLeftHit(robot);

            for(int i = 0 ; i < 1000; i++){
                //输入笑脸
                TestInput.keyPressString(robot, "龙哥，你好帅啊！！爱上你了");
                //按下回车
                TestInput.keyPress(robot, KeyEvent.VK_ENTER);
            }
        }
}
