package withAnnotationsDIQualifiers;

import org.springframework.stereotype.Component;

@Component
public class RealFortuneService implements FortuneService {

	public String getFortune() {
		return "Real Fortune Service";
	}
}
