/* PROBLEM ------------------------------------------------------
 * Disjoint Set Union(DSU)  |  Core
 * Topics: DSU
 * Disjoint Set Union (union-find) with path compression and union by rank.
 */

// Disjoint Set Union with path compression + union by rank (shared type).
class DSU {
    private int[] parent, rank;

    DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]); // path compression
    }

    void join(int a, int b) {
        int pa = find(a), pb = find(b);
        if (pa == pb) return;

        if (rank[pa] < rank[pb]) {
            parent[pa] = pb;
        } else if (rank[pb] < rank[pa]) {
            parent[pb] = pa;
        } else {
            parent[pb] = pa;
            rank[pa]++;
        }
    }
}
