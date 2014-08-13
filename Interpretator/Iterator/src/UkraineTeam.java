import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UkraineTeam implements Iterable<String> {

	private List<String> team;

	public UkraineTeam() {
		team = new ArrayList<>();
		team.add("Shevchenko - 7");
		team.add("Yarmolenko - 7");
		team.add("Sasho - 7");
	}

	public List<String> getTeam() {
		return team;
	}

	@Override
	public Iterator<String> iterator() {

		return team.iterator();
	}

}