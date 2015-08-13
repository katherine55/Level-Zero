import java.io.IOException;


public class BABY {
	static int y = 0;
	static String say = ("oh");
public static void main(String[] args) throws IOException, InterruptedException {
	for (int i = 0; i < 4; i++) {
		sayBaby();
	}
}



private static void sayBaby() throws InterruptedException, IOException {
	for (int i = 0; i < 3; i++) {
		Thread.sleep(1000);
		Runtime.getRuntime().exec("say Baby,");
		Thread.sleep(1000);
	}
	if(y == 0){
		Thread.sleep(1000);
		Runtime.getRuntime().exec("say " + say);
	Thread.sleep(1000);
	y++;
	}
	else if(y == 1){
		Thread.sleep(1000);
		Runtime.getRuntime().exec("say No");
		Thread.sleep(1000);
	    y++;
	}
	else if(y == 2){
		Thread.sleep(1000);
		Runtime.getRuntime().exec("say Oh");
		Thread.sleep(1000);
	    y++;
	}
	else if(y == 3){
		Runtime.getRuntime().exec("say I thought you'd always be mine");
		Thread.sleep(1000);
	}
}
}