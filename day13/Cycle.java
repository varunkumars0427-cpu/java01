package day13;

public class Cycle {
	static boolean hasCycle(int[][] graph,int node,
			int parent, boolean[] visited) {
		visited[node]=true;
		for(int neighbour : graph[node]) {
			if(!visited[neighbour]) {
				if(!visited[neighbour]) {
					if(hasCycle(graph,neighbour,node,visited))
						return true;
				}
				else if(neighbour !=parent) {
					return true;
				}
			}
		}
			return false;
		}
	
		public static void main(String[]args) {
			int[][] graph= {
					{1,2},
					{0,2},
					{0,1}
			};
			boolean[]visited= new boolean[3];
			if (hasCycle(graph,0,-1,visited))
				System.out.println("cycle exits");
			else
				System.out.println("no cycle");
		
	}

}