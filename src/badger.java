import java.io.IOException;

public class badger {
	public static void main(String[] args) throws IOException,
			InterruptedException {
		badger();
	}

	public static void badger() throws IOException, InterruptedException

	{
		Thread.sleep(350);
		for (int i = 0; i <= 7; i++) {
			Runtime.getRuntime().exec("say Badger");
			Thread.sleep(350);
			if (i > 6) {
				for (int m = 0; m <= 7; m++) {
					Runtime.getRuntime().exec("say mooshroom");
					Thread.sleep(400);

					if (m > 6) {
						for (int s = 0; s <= 7; s++) {
							Runtime.getRuntime().exec("say snake");
							Thread.sleep(325);
						}
						for (int b = 0; b <= 7; b++) {
							Runtime.getRuntime().exec("say Badger");
							Thread.sleep(350);
						}
					}
				}
			}
		}
	}
}
