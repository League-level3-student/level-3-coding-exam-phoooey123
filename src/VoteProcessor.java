import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
String calculateElectionWinner(ArrayList<String> votes) {
	
	for (int i = 0; i < votes.size(); i++) {
		votes.set(i, votes.get(i).toLowerCase());
		HashMap<String, Integer>  hm = new HashMap<String, Integer>();
		String can = votes.get(i);
		if(hm.containsKey(can)) {
			hm.put(can, hm.get(can)+1);
		}
		else {
			hm.put(can, 1);
		}
		
	}
	return "";
}
}
