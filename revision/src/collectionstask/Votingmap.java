package collectionstask;

import java.util.HashMap;
import java.util.Scanner;

public class Votingmap {
	int admkcount = 0;
	int dmkcount = 0;
	int ntkcount = 0;
	int congresscount = 0;
	int bjpcount = 0;
	int tvkcount = 0;
	int vcount = 0;

	void votecount() {

		HashMap<Integer, String> vote = new HashMap<Integer, String>();

		vote.put(1, "admk-man");
		vote.put(2, "dmk-sabri a");
		vote.put(3, "ntk- seeman");
		vote.put(4, "congress- manikam");
		vote.put(5, "bjp-nayinar");
		vote.put(6, "tvk-sulaiman sa");
		System.out.println(vote);

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VOTE");
		int voting = sc.nextInt();

		String d = vote.get(voting);

		if (d.equalsIgnoreCase("admk-man")) {

			admkcount++;
			vcount++;
		}

		if (d.equalsIgnoreCase("dmk-sabri a")) {

			dmkcount++;
			vcount++;

		}

		if (d.equalsIgnoreCase("ntk- seeman")) {

			ntkcount++;
			vcount++;

		}

		if (d.equalsIgnoreCase("congress- manikam")) {

			congresscount++;
			vcount++;

		}
		if (d.equalsIgnoreCase("bjp-nayinar")) {

			bjpcount++;
			vcount++;

		}
		if (d.equalsIgnoreCase("tvk-sulaiman sa")) {

			tvkcount++;
			vcount++;

		}

		System.out.println("admkcount :" + admkcount);
		System.out.println("dmkcount :" + dmkcount);
		System.out.println("ntkcount : " + ntkcount);
		System.out.println("congresscount :" + congresscount);
		System.out.println("bjpcount : " + bjpcount);
		System.out.println("tvkcount  :" + tvkcount);

		if (vcount == 10) {

			System.out.println("voting time over");
		}

		else {
			votecount();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Votingmap ref = new Votingmap();
		ref.votecount();

	}

}
