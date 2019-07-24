package withAnnotationsDIQualifiers;

import org.springframework.stereotype.Component;

@Component
public class BarcaFortuneService implements FortuneService {

	public String getFortune() {
		return "Fake Fortune Service";
	}
}
