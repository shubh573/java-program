	package ass4;

public class CrickTest {
	
		public static void main(String[] args) {
			
			CricketPlayer player[] = new CricketPlayer[3];
		
			player[0] = new CricketPlayer("ABC",125,20,2365);
			player[1] = new CricketPlayer("PQR",162,23,2963);
			player[2] = new CricketPlayer("XYZ",193,26,3187);
			
			CricketPlayer.sortPlayer(player);
			
			System.out.println("Cricket players sorted by Batting Average:");
			for (int i = 0; i < 3; i++) {
				System.out.println(player[i]);
			}
		}
	}
