import java.util.ArrayList;

public class VoteProcessor {
String calculateElectionWinner(ArrayList<String> votes) {
	int cand1 = 0;
	int cand2 = 0;
	for (int i = 0; i < votes.size(); i++) {
		
		if(votes.get(i).equals("Pope francis") || votes.get(i).equals("pope francis") || votes.get(i).equals("Pope Francis") || votes.get(i).equals("pope Francis") || votes.get(i).equals("POPE FRANCIS")) {
			cand1++;
		}
		if(votes.get(i).equals("Edward snowden") || votes.get(i).equals("edward snowden") || votes.get(i).equals("Edward Snowden") || votes.get(i).equals("edward Snowden") || votes.get(i).equals("EDWARD SNOWDEN")) {
			cand2++;
		}
		
	}
	if(cand1>cand2) {
		return "pope francis";
	}
	if(cand2>cand1) {
		return "edward snowden";
	}
	else {
		return "TIE";
	}
	
}
}
