import java.util.Arrays;

public class TravelingSalesmanProblem {

    public static int tsp(int visited, int curr, int n, int result[][], int dist[][], int inf) {
        // If all cities have been visited, return to the starting city
        if (visited == (1 << n) - 1) {
            return dist[curr][0]; // retruns the distance from the current city to the origin city
        }

        // lookup case : If the result for the current state is memoized, return it
        if (result[visited][curr] != -1) {
            return result[visited][curr];
        }

        // Initialize the minimum cost to a high value
        int ans=inf;

        // Try to go through all cities
        for (int city = 0; city < n; city++) {
            // Check if the city has not been visited
            if ((visited & (1 << city)) == 0) {
                // Calculate the cost of visiting the city and recursively
                // explore the path
                int newAns=tsp(visited | (1 << city), city, n,result,dist,ans)
                        + dist[curr][city];
                ans = Math.min(ans,newAns );
            }
        }

        // Store and return the minimum cost for the current state
        return result[visited][curr] = ans;
    }

    public static void main(String[] args) {
        //inf representing infinity, typically used for unreachable
        // or extremely high cost.
        final int inf = 9999999;
        // The dist array represents the distances between cities in a 4x4 matrix.
        int[][] dist = {
                {0, 20, 42, 25},
                {20, 0, 30, 34},
                {42, 30, 0, 10},
                {25, 34, 10, 0}
        };

        // 2D array to store previously computed results for subproblems
        int[][] result;

        int n = dist.length;

        // Initialize the memoization array with -1
        result = new int[1 << n][n];
        for (int i = 0; i < (1 << n); i++) {
            Arrays.fill(result[i], -1);
        }

        int visited = 1;
        int startCity = 0;

        // Calculate and print the minimum cost for the Traveling Salesman
        // Problem
        int minCost = tsp(visited, startCity, n, result, dist, inf);
        System.out.println("Minimum cost for TSP: " + minCost);
    }
}