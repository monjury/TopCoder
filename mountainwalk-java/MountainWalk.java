// SRM 394 DIV 2 - 250 points

public class MountainWalk {

	private int[][] map;

	private int maxDiff;

	private Location currentLocation = new Location(0, 0);

	public int cellsVisited(String[] areaMap, int heightDifference) {
		init(areaMap, heightDifference);

		// 1. count moves
		// 2. mark visited
		// 3. move to possible option
		// 4. return count

		int count = 1;
		Location nextLocation = getSelected();
		while (nextLocation != null) {
			count++;
			map[currentLocation.i][currentLocation.j] = -1;
			currentLocation = nextLocation;
			nextLocation = getSelected();
		}
		return count;
	}

	private Location getSelected() {
		// 1. one of neighbors
		// 2. neighbors is valid
		Location selected = null;
		for (int i = 1; i <= 4; i++) {
			selected = getNeighbour(i);
			if (isValidNeighbor(selected)) {
				return selected;
			}
		}
		return null;
	}

	private boolean isValidNeighbor(Location neighbor) {
		try {
			// 1. neighbor exist
			if (neighbor.i >= map.length || neighbor.j >= map[0].length) {
				return false;
			}

			// 2. neighbors not visited
			if (map[neighbor.i][neighbor.j] == -1) {
				return false;
			}

			// 3. within height difference
			if (!isWithinRange(neighbor)) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private boolean isWithinRange(Location validNeighbor) {
		int diff = Math.abs(map[currentLocation.i][currentLocation.j] - map[validNeighbor.i][validNeighbor.j]);
		return (diff <= maxDiff);
	}

	private Location getNeighbour(int option) {
		Location newLocation = null;
		switch (option) {
			case 1: {
				newLocation = new Location(currentLocation.i + 1, currentLocation.j);
				break;
			}
			case 2: {
				newLocation = new Location(currentLocation.i, currentLocation.j - 1);
				break;
			}
			case 3: {
				newLocation = new Location(currentLocation.i - 1, currentLocation.j);
				break;
			}
			case 4: {
				newLocation = new Location(currentLocation.i, currentLocation.j + 1);
				break;
			}
		}
		return newLocation;
	}

	private void init(String[] areaMap, int heightDifference) {
		map = new int[areaMap.length][areaMap[0].length()];
		for (int i = 0; i < areaMap.length; i++) {
			for (int j = 0; j < areaMap[0].length(); j++) {
				map[i][j] = Character.getNumericValue(areaMap[i].charAt(j));
			}
		}
		maxDiff = heightDifference;
	}

	class Location {
		int i;
		int j;

		public Location(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}

}
