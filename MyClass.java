import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}

public class MyClass {

    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int minRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (Player p : players) {
            if (p.getPlayerType().equalsIgnoreCase(playerType)) {
                found = true;
                if (p.getRuns() < minRuns) {
                    minRuns = p.getRuns();
                }
            }
        }

        return found ? minRuns : 0;
    }

    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        ArrayList<Player> list = new ArrayList<>();

        for (Player p : players) {
            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                list.add(p);
            }
        }

        if (list.isEmpty()) {
            return null;
        }

        Collections.sort(list, (p1, p2) -> p2.getPlayerId() - p1.getPlayerId());

        return list.toArray(new Player[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int playerId = Integer.parseInt(sc.nextLine());
            String playerName = sc.nextLine();
            int runs = Integer.parseInt(sc.nextLine());
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int lowestRuns = findPlayerWithLowestRuns(players, playerType);

        if (lowestRuns > 0) {
            System.out.println(lowestRuns);
        } else {
            System.out.println("No such player");
        }

        Player[] result = findPlayerByMatchType(players, matchType);

        if (result != null) {
            for (Player p : result) {
                System.out.println(p.getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();
    }
}