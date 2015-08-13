import java.io.IOException;


public class GroundControl {
public static void main(String[] args) throws IOException, InterruptedException {
	Runtime.getRuntime().exec("say Ground Control to Major Tom,    Commencing countdown,    engines on");
	Thread.sleep(1000);
	Runtime.getRuntime().exec("say 10,            9,             8,             7,             6,             5,             4,              3,              2,              1,             BLASTOFF!!!!!");
	Thread.sleep(1000);
	}
}
