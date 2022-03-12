public class LowestManhattanDist {
   public int nearestValidPoint(int x, int y, int[][] points) {
	var nearest = -1;

	for (int i = 0, minDistance = Integer.MAX_VALUE; i < points.length; i++)
		if (x == points[i][0] || y == points[i][1]) { // check valid point
			var distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]); // find Manhattan distance
			
			if (minDistance > distance) { 
				minDistance = distance; // maintain the nearest valid point
				nearest = i;
			}
		}
	return nearest;
}
}
