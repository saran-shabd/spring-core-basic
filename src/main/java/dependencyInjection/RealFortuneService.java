package dependencyInjection;

import java.util.Random;

public class RealFortuneService implements FortuneService {

	public String getFortune() {
		Random rand = new Random();
		String[] fortunes = {
				"Happy Day",
				"Sad Day",
				"Lucky Day",
				"Unlucky Day",
				"Entirely Normal Day"
		};
		return fortunes[rand.nextInt(fortunes.length)];
	}
}
