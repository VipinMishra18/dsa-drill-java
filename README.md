# DSA 7-Minute Drill — Java

Java DSA drill: **105** solution snippets ported from the [DSA 7-Minute Drill](https://g00d-kid-10.github.io/dsa-7-minute-drill/), plus **26** added problems that fill the interview gaps (heaps/top-K, monotonic stack, sliding-window strings, backtracking, tree BFS/LCA/serialize, trie, strings, math) — **131 total**. Every solution is idiomatic Java.

- **One file per problem**, bare snippets (a class + the solution method(s)), single flat package.
- Each file opens with a **problem-statement header** (what it asks, an example, difficulty, and a LeetCode link where it maps) so the source is self-documenting.
- Solution methods are `static` (`ClassName.method(...)`); stateful ones (`LRUCache`, `DSU`, `MinStack`, `MedianFinder`, `Trie`) are instances.
- Interactive drill (search, topic filters, syntax highlighting, per-problem statement, timed recall/reveal): open `index.html`.

## Compile

```bash
cd ~/dsa-prep/7-min-drill-java
javac -d out *.java
```

## Made fully Java-native

- **Removed** `Comparator` and `Ostream` — C++ language-mechanic demos (`operator()` / `operator<<`) with no Java DSA relevance.
- **NextPermutation** — pivot check corrected to `>=` (was subtly wrong for duplicates).
- **MaxProfitCooldown / MaxProfitTransactionFee** — added memoization (were exponential).
- **TreeTraversals** — now real `preorder`/`inorder`/`postorder` methods (was an empty scaffold).
- Earlier fixes: RotatedSearch stub filled, EqualPartitionSubsetSum rewritten, MergeSortedArray, CombinationSum prune, MajorityElementII typo, missing returns.

## Index

| # | Problem | Topics | Java file | |
|---|---------|--------|-----------|---|
| 1 | Divisors | — | [`Divisors.java`](Divisors.java) |  |
| 2 | Prefix Sum | Array, Prefix Sum | [`PrefixSum.java`](PrefixSum.java) |  |
| 3 | Merge Sort | Sorting | [`MergeSort.java`](MergeSort.java) |  |
| 4 | Upper Bound | Binary search | [`UpperBound.java`](UpperBound.java) |  |
| 5 | Lower Bound | Binary search | [`LowerBound.java`](LowerBound.java) |  |
| 6 | Pivot | Binary search | [`Pivot.java`](Pivot.java) |  |
| 7 | Rotated search | Binary search | [`RotatedSearch.java`](RotatedSearch.java) |  |
| 8 | Find Peak Element | Binary search | [`FindPeakElement.java`](FindPeakElement.java) |  |
| 9 | Single Element In Sorted Array | Binary search | [`SingleElementInSortedArray.java`](SingleElementInSortedArray.java) |  |
| 10 | Square Root Floor | Math, Binary search | [`SquareRootFloor.java`](SquareRootFloor.java) |  |
| 11 | List Node | Linked List | [`ListNode.java`](ListNode.java) |  |
| 12 | List length | Linked List | [`ListLength.java`](ListLength.java) |  |
| 13 | Copy list | Linked List | [`CopyList.java`](CopyList.java) |  |
| 14 | Reverse list(Iterative) | Linked List | [`ReverseListIterative.java`](ReverseListIterative.java) |  |
| 15 | Reverse list(Recursive) | Linked List | [`ReverseListRecursive.java`](ReverseListRecursive.java) |  |
| 16 | Remove Nth from end | Linked List | [`RemoveNthFromEnd.java`](RemoveNthFromEnd.java) |  |
| 17 | Doubly Linked Node | Linked List | [`Node.java`](Node.java) |  |
| 18 | Doubly linked list | Doubly Linked List | [`DLL.java`](DLL.java) |  |
| 19 | LRU cache | Doubly Linked List, Implementation | [`LRUCache.java`](LRUCache.java) |  |
| 20 | Interval overlap | Interval | [`IntervalOverlap.java`](IntervalOverlap.java) |  |
| 21 | Interval overlap or touch | Interval | [`IntervalOverlapOrTouch.java`](IntervalOverlapOrTouch.java) |  |
| 22 | Interval non-overlapping | Interval | [`IntervalNonOverlapping.java`](IntervalNonOverlapping.java) |  |
| 23 | Merge Intervals | Interval | [`MergeIntervals.java`](MergeIntervals.java) |  |
| 24 | TreeNode | Tree | [`TreeNode.java`](TreeNode.java) |  |
| 25 | Tree Traversals | Tree | [`TreeTraversals.java`](TreeTraversals.java) |  |
| 26 | Depth of tree | Tree | [`TreeDepth.java`](TreeDepth.java) |  |
| 27 | Tree Diameter | Tree | [`TreeDiameter.java`](TreeDiameter.java) |  |
| 28 | Same Tree \| Symmetric Tree | Tree | [`SameTree.java`](SameTree.java) |  |
| 29 | Sub Tree | Tree | [`SubTree.java`](SubTree.java) |  |
| 30 | Tree Node Path | Tree | [`TreeNodePath.java`](TreeNodePath.java) |  |
| 31 | Tree To Graph | Tree | [`TreeToGraph.java`](TreeToGraph.java) |  |
| 32 | Valid BST | Tree | [`ValidBST.java`](ValidBST.java) |  |
| 33 | Subarray Minimum | Array, DP | [`SubarrayMinimum.java`](SubarrayMinimum.java) |  |
| 34 | Subarray Maximum | Array, DP | [`SubarrayMaximum.java`](SubarrayMaximum.java) |  |
| 35 | Two Sum | Array, Hash Map | [`TwoSum.java`](TwoSum.java) |  |
| 36 | Longest subarray of K sum | Array, Hash Map, Sliding Window | [`LongestSubarrayOfKSum.java`](LongestSubarrayOfKSum.java) |  |
| 37 | Longest subarray of balanced | Subarray, Hash Map | [`LongestSubarrayBalanced.java`](LongestSubarrayBalanced.java) |  |
| 38 | Count subarray of K sum | Array, Hash Map, Prefix Sum | [`CountSubarrayOfKSum.java`](CountSubarrayOfKSum.java) |  |
| 39 | Point inside rectangle | Geometry | [`PointInsideRectangle.java`](PointInsideRectangle.java) |  |
| 40 | Reverse Bits | Bitwise | [`ReverseBits.java`](ReverseBits.java) |  |
| 41 | Hamming Weight | Bitwise | [`HammingWeight.java`](HammingWeight.java) |  |
| 42 | Second Maximum Element | Array | [`SecondMaximumElement.java`](SecondMaximumElement.java) |  |
| 43 | Remove Duplicate from sorted | Array | [`RemoveDuplicateFromSorted.java`](RemoveDuplicateFromSorted.java) |  |
| 44 | Move zeros to end | Array | [`MoveZerosToEnd.java`](MoveZerosToEnd.java) |  |
| 45 | Rotate array by K | Array | [`RotateArrayByK.java`](RotateArrayByK.java) |  |
| 46 | Missing number | Array | [`MissingNumber.java`](MissingNumber.java) |  |
| 47 | Maximum consecutive ones | Array | [`MaximumConsecutiveOnes.java`](MaximumConsecutiveOnes.java) |  |
| 48 | Single Appearence | Array | [`SingleAppearance.java`](SingleAppearance.java) |  |
| 49 | Sort Array 012 | Array | [`SortArray012.java`](SortArray012.java) |  |
| 50 | Majority element | Array | [`MajorityElement.java`](MajorityElement.java) |  |
| 51 | Upper Bound(Reverse) | Binary search | [`UpperBoundReverse.java`](UpperBoundReverse.java) |  |
| 52 | Next Permutation | Array | [`NextPermutation.java`](NextPermutation.java) |  |
| 53 | Longest Consecutive | Array | [`LongestConsecutive.java`](LongestConsecutive.java) |  |
| 54 | Set zeros in matrix | Array | [`SetZerosInMatrix.java`](SetZerosInMatrix.java) |  |
| 55 | Rotate matrix | Array | [`RotateMatrix.java`](RotateMatrix.java) |  |
| 56 | Merge sorted array | Array | [`MergeSortedArray.java`](MergeSortedArray.java) |  |
| 57 | Spiral matrix | Array | [`SpiralMatrix.java`](SpiralMatrix.java) |  |
| 58 | Pascal triangle | Array | [`PascalTriangle.java`](PascalTriangle.java) |  |
| 59 | Majority element II | Array | [`MajorityElementII.java`](MajorityElementII.java) |  |
| 60 | Threesome | Array | [`Threesome.java`](Threesome.java) |  |
| 61 | Valid parenthesis | Stack | [`ValidParenthesis.java`](ValidParenthesis.java) |  |
| 62 | Maximum matrix sum | Grid | [`MaxMatrixSum.java`](MaxMatrixSum.java) |  |
| 63 | Climbing Stairs | DP, DFS | [`ClimbingStairs.java`](ClimbingStairs.java) |  |
| 64 | Assign Cookies | Greedy | [`AssignCookies.java`](AssignCookies.java) |  |
| 65 | Jump Game I/II | DP, DFS, Greedy | [`JumpGame.java`](JumpGame.java) |  |
| 66 | Disjoint Set Union(DSU) | DSU | [`DSU.java`](DSU.java) |  |
| 67 | Number of Islands | Graph, DFS, BFS | [`NumberOfIslands.java`](NumberOfIslands.java) |  |
| 68 | House Robber | DP, DFS | [`HouseRobber.java`](HouseRobber.java) |  |
| 69 | House Robber II | DP, DFS | [`HouseRobberII.java`](HouseRobberII.java) |  |
| 70 | Unique Paths | DP, Grid | [`UniquePaths.java`](UniquePaths.java) |  |
| 71 | Minimum Path Sum | DP, Grid | [`MinimumPathSum.java`](MinimumPathSum.java) |  |
| 72 | Minimum Falling Path Sum | DP, Grid | [`MinimumFallingPathSum.java`](MinimumFallingPathSum.java) |  |
| 73 | Minimum Path Sum in Triangle | DP, Triangle | [`MinimumPathSumTriangle.java`](MinimumPathSumTriangle.java) |  |
| 74 | Combination Sum I/II | DP, Knapsack, Backtracking | [`CombinationSum.java`](CombinationSum.java) |  |
| 75 | Equal Partition Subset Sum | DP, Knapsack | [`EqualPartitionSubsetSum.java`](EqualPartitionSubsetSum.java) |  |
| 76 | Coin Change | DP | [`CoinChange.java`](CoinChange.java) |  |
| 77 | Coin Change II | DP | [`CoinChangeII.java`](CoinChangeII.java) |  |
| 78 | Target Sum | DP | [`TargetSum.java`](TargetSum.java) |  |
| 79 | Longest Common Subsequence | DP, String | [`LongestCommonSubsequence.java`](LongestCommonSubsequence.java) |  |
| 80 | Longest Increasing Subsequence | DP | [`LongestIncreasingSubsequence.java`](LongestIncreasingSubsequence.java) |  |
| 81 | Longest Palindromic Substring | Two pointer, String | [`LongestPalindromicSubstring.java`](LongestPalindromicSubstring.java) |  |
| 82 | Longest Palindromic Subsequence | DP, String | [`LongestPalindromicSubsequence.java`](LongestPalindromicSubsequence.java) |  |
| 83 | Edit Distance | DP, String | [`EditDistance.java`](EditDistance.java) |  |
| 84 | Max Profit Single Transaction | DP | [`MaxProfitSingleTransaction.java`](MaxProfitSingleTransaction.java) |  |
| 85 | Max Profit Multiple Transactions | DP | [`MaxProfitMultipleTransactions.java`](MaxProfitMultipleTransactions.java) |  |
| 86 | Max Profit with Cooldown | DP | [`MaxProfitCooldown.java`](MaxProfitCooldown.java) |  |
| 87 | Max Profit with Transaction Fee | DP | [`MaxProfitTransactionFee.java`](MaxProfitTransactionFee.java) |  |
| 88 | Number of Connected Components | Graph | [`NumberOfConnectedComponents.java`](NumberOfConnectedComponents.java) |  |
| 89 | Rotten Oranges | Graph, BFS | [`RottenOranges.java`](RottenOranges.java) |  |
| 90 | Flood Fill | Graph, DFS | [`FloodFill.java`](FloodFill.java) |  |
| 91 | Nearest Zero in 01 Matrix | Graph, BFS | [`NearestZero01Matrix.java`](NearestZero01Matrix.java) |  |
| 92 | Capture Surrounded Regions | Graph, DFS | [`CaptureSurroundedRegions.java`](CaptureSurroundedRegions.java) |  |
| 93 | Number of Enclaves | Graph, DFS | [`NumberOfEnclaves.java`](NumberOfEnclaves.java) |  |
| 94 | Is Bipartite Graph | Graph | [`IsBipartite.java`](IsBipartite.java) |  |
| 95 | Cycle in Undirected Graph | Graph | [`CycleUndirectedGraph.java`](CycleUndirectedGraph.java) |  |
| 96 | Cycle in Directed Graph | Graph | [`CycleDirectedGraph.java`](CycleDirectedGraph.java) |  |
| 97 | Topological Sort | Graph | [`TopoSort.java`](TopoSort.java) |  |
| 98 | Eventual Safe Nodes | Graph | [`EventualSafeNodes.java`](EventualSafeNodes.java) |  |
| 99 | Shortest Path Unweighted Graph | Graph, BFS | [`ShortestPathUnweighted.java`](ShortestPathUnweighted.java) |  |
| 100 | Shortest Path Weighted Graph | Graph, Dijkstra | [`ShortestPathWeighted.java`](ShortestPathWeighted.java) |  |
| 101 | Shortest Path Directed Acyclic Graph | Graph | [`ShortestPathDag.java`](ShortestPathDag.java) |  |
| 102 | Shortest Path in Binary Matrix | Graph, BFS | [`ShortestPathBinaryMatrix.java`](ShortestPathBinaryMatrix.java) |  |
| 103 | Minimum Effort Path | Graph, Dijkstra | [`MinimumEffortPath.java`](MinimumEffortPath.java) |  |
| 104 | Cheapest Flight with K Stops | Graph | [`CheapestFlightKStops.java`](CheapestFlightKStops.java) |  |
| 105 | Number of Shortest Paths | Graph | [`NumberOfShortestPaths.java`](NumberOfShortestPaths.java) |  |
| 106 | Kth Largest Element | Heap | [`KthLargest.java`](KthLargest.java) | 🆕 |
| 107 | Top K Frequent Elements | Heap, Hash Map | [`TopKFrequent.java`](TopKFrequent.java) | 🆕 |
| 108 | Merge K Sorted Lists | Heap, Linked List | [`MergeKSortedLists.java`](MergeKSortedLists.java) | 🆕 |
| 109 | Median from Data Stream | Heap, Design | [`MedianFinder.java`](MedianFinder.java) | 🆕 |
| 110 | Next Greater Element | Stack, Monotonic Stack | [`NextGreaterElement.java`](NextGreaterElement.java) | 🆕 |
| 111 | Daily Temperatures | Stack, Monotonic Stack | [`DailyTemperatures.java`](DailyTemperatures.java) | 🆕 |
| 112 | Largest Rectangle in Histogram | Stack, Monotonic Stack | [`LargestRectangleHistogram.java`](LargestRectangleHistogram.java) | 🆕 |
| 113 | Min Stack | Stack, Design | [`MinStack.java`](MinStack.java) | 🆕 |
| 114 | Longest Substring Without Repeating | Sliding Window, String | [`LongestSubstringWithoutRepeat.java`](LongestSubstringWithoutRepeat.java) | 🆕 |
| 115 | Minimum Window Substring | Sliding Window, String | [`MinimumWindowSubstring.java`](MinimumWindowSubstring.java) | 🆕 |
| 116 | Sliding Window Maximum | Sliding Window, Deque | [`SlidingWindowMaximum.java`](SlidingWindowMaximum.java) | 🆕 |
| 117 | Subsets (Power Set) | Backtracking | [`Subsets.java`](Subsets.java) | 🆕 |
| 118 | Permutations | Backtracking | [`Permutations.java`](Permutations.java) | 🆕 |
| 119 | Generate Parentheses | Backtracking, String | [`GenerateParentheses.java`](GenerateParentheses.java) | 🆕 |
| 120 | Word Search | Backtracking, Grid | [`WordSearch.java`](WordSearch.java) | 🆕 |
| 121 | N-Queens (count) | Backtracking | [`NQueens.java`](NQueens.java) | 🆕 |
| 122 | Level Order Traversal (BFS) | Tree, BFS | [`LevelOrderTraversal.java`](LevelOrderTraversal.java) | 🆕 |
| 123 | Invert Binary Tree | Tree | [`InvertBinaryTree.java`](InvertBinaryTree.java) | 🆕 |
| 124 | Lowest Common Ancestor | Tree | [`LowestCommonAncestor.java`](LowestCommonAncestor.java) | 🆕 |
| 125 | Serialize/Deserialize Tree | Tree, Design | [`SerializeDeserializeTree.java`](SerializeDeserializeTree.java) | 🆕 |
| 126 | Trie (Prefix Tree) | Trie, Design | [`Trie.java`](Trie.java) | 🆕 |
| 127 | Group Anagrams | String, Hash Map | [`GroupAnagrams.java`](GroupAnagrams.java) | 🆕 |
| 128 | Valid Anagram | String, Hash Map | [`ValidAnagram.java`](ValidAnagram.java) | 🆕 |
| 129 | GCD and LCM | Math | [`Gcd.java`](Gcd.java) | 🆕 |
| 130 | Sieve of Eratosthenes | Math | [`SieveOfEratosthenes.java`](SieveOfEratosthenes.java) | 🆕 |
| 131 | Fast Power (Binary Exponentiation) | Math | [`FastPower.java`](FastPower.java) | 🆕 |
