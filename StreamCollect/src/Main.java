import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<CPU> streamCPU = Stream.of(new CPU("Intel", "i5 551","1151", 34.90, 4),
											new CPU("Intel", "i3 221","1150", 32.80, 2),
											new CPU("Intel", "i5 578","1151", 32.90, 4),
											new CPU("Intel", "i7 757","1151", 40.90, 4),
											new CPU("AMD", "FM2 2589","FM2+", 32.80, 4),
											new CPU("AMD", "FM2 8952","FM2+", 28.10, 2),
											new CPU("AMD", "FM2 5126","FM2+", 34.90, 4));
		
		Map<String, Long> cpuMap = streamCPU.collect(Collectors.groupingBy(CPU::getBrand, Collectors.counting()));
		
		for (Map.Entry<String, Long> item: cpuMap.entrySet()) {
			System.out.println(item.getKey() + " - " + item.getValue());
		}
		
		

	}

}
