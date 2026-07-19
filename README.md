# DSA 7-Minute Drill — Java

Java DSA drill: the **107** solution snippets ported from the [DSA 7-Minute Drill](https://g00d-kid-10.github.io/dsa-7-minute-drill/), plus **26** added problems that fill the interview gaps (heaps/top-K, monotonic stack, sliding-window strings, backtracking, tree BFS/LCA/serialize, trie, strings, math) — **133 total**.

- **One file per problem**, bare snippets (a class + the solution method(s)), single flat package.
- Solution methods are `static` (`ClassName.method(...)`); stateful ones (`LRUCache`, `DSU`, `MinStack`, `MedianFinder`, `Trie`, `MedianFinder`) are instances.
- Interactive drill (search, topic filters, syntax highlighting, timed recall/reveal): open `index.html`.

## Compile

```bash
cd ~/dsa-prep/7-min-drill-java
javac -d out *.java
```

## Fixed from the original C++ port

- **NextPermutation** — pivot check corrected to `>=` (was subtly wrong for duplicates).
- **MaxProfitCooldown / MaxProfitTransactionFee** — added memoization (were exponential).
- **TreeTraversals** — now real `preorder`/`inorder`/`postorder` methods (was an empty scaffold).
- Earlier fixes: RotatedSearch stub filled, EqualPartitionSubsetSum rewritten, MergeSortedArray, CombinationSum prune, MajorityElementII typo, missing returns.

## Index

| # | Problem | Topics | Java file | |
|---|---------|--------|-----------|---|
| 1 | Comparator | — | [`Comparator.java`](Comparator.java) |  |
| 2 | Ostream | — | [`Ostream.java`](Ostream.java) |  |
| 3 | Divisors | — | [`Divisors.java`](Divisors.java) |  |
| 4 | Prefix Sum | Array, Prefix Sum | [`PrefixSum.java`](PrefixSum.java) |  |
| 5 | Merge Sort | Sorting | [`MergeSort.java`](MergeSort.java) |  |
| 6 | Upper Bound | Binary search | [`UpperBound.java`](UpperBound.java) |  |
| 7 | Lower Bound | Binary search | [`LowerBound.java`](LowerBound.java) |  |
| 8 | Pivot | Binary search | [`Pivot.java`](Pivot.java) |  |
| 9 | Rotated search | Binary search | [`RotatedSearch.java`](RotatedSearch.java) |  |
| 10 | Find Peak Element | Binary search | [`FindPeakElement.java`](FindPeakElement.java) |  |
| 11 | Single Element In Sorted Array | Binary search | [`SingleElementInSortedArray.java`](SingleElementInSortedArray.java) |  |
| 12 | Square Root Floor | Math, Binary search | [`SquareRootFloor.java`](SquareRootFloor.java) |  |
| 13 | List Node | Linked List | [`ListNode.java`](ListNode.java) |  |
| 14 | List length | Linked List | [`ListLength.java`](ListLength.java) |  |
| 15 | Copy list | Linked List | [`CopyList.java`](CopyList.java) |  |
| 16 | Reverse list(Iterative) | Linked List | [`ReverseListIterative.java`](ReverseListIterative.java) |  |
| 17 | Reverse list(Recursive) | Linked List | [`ReverseListRecursive.java`](ReverseListRecursive.java) |  |
| 18 | Remove Nth from end | Linked List | [`RemoveNthFromEnd.java`](RemoveNthFromEnd.java) |  |
| 19 | Doubly Linked Node | Linked List | [`Node.java`](Node.java) |  |
| 20 | Doubly linked list | Doubly Linked List | [`DLL.java`](DLL.java) |  |
| 21 | LRU cache | Doubly Linked List, Implementation | [`LRUCache.java`](LRUCache.java) |  |
| 22 | Interval overlap | Interval | [`IntervalOverlap.java`](IntervalOverlap.java) |  |
| 23 | Interval overlap or touch | Interval | [`IntervalOverlapOrTouch.java`](IntervalOverlapOrTouch.java) |  |
| 24 | Interval non-overlapping | Interval | [`IntervalNonOverlapping.java`](IntervalNonOverlapping.java) |  |
| 25 | Merge Intervals | Interval | [`MergeIntervals.java`](MergeIntervals.java) |  |
| 26 | TreeNode | Tree | [`TreeNode.java`](TreeNode.java) |  |
| 27 | Tree Traversals | Tree | [`TreeTraversals.java`](TreeTraversals.java) |  |
| 28 | Depth of tree | Tree | [`TreeDepth.java`](TreeDepth.java) |  |
| 29 | Tree Diameter | Tree | [`TreeDiameter.java`](TreeDiameter.java) |  |
| 30 | Same Tree \| Symmetric Tree | Tree | [`SameTree.java`](SameTree.java) |  |
| 31 | Sub Tree | Tree | [`SubTree.java`](SubTree.java) |  |
| 32 | Tree Node Path | Tree | [`TreeNodePath.java`](TreeNodePath.java) |  |
| 33 | Tree To Graph | Tree | [`TreeToGraph.java`](TreeToGraph.java) |  |
| 34 | Valid BST | Tree | [`ValidBST.java`](ValidBST.java) |  |
| 35 | Subarray Minimum | Array, DP | [`SubarrayMinimum.java`](SubarrayMinimum.java) |  |
| 36 | Subarray Maximum | Array, DP | [`SubarrayMaximum.java`](SubarrayMaximum.java) |  |
| 37 | Two Sum | Array, Hash Map | [`TwoSum.java`](TwoSum.java) |  |
| 38 | Longest subarray of K sum | Array, Hash Map, Sliding Window | [`LongestSubarrayOfKSum.java`](LongestSubarrayOfKSum.java) |  |
| 39 | Longest subarray of balanced | Subarray, Hash Map | [`LongestSubarrayBalanced.java`](LongestSubarrayBalanced.java) |  |
| 40 | Count subarray of K sum | Array, Hash Map, Prefix Sum | [`CountSubarrayOfKSum.java`](CountSubarrayOfKSum.java) |  |
| 41 | Point inside rectangle | Geometry | [`PointInsideRectangle.java`](PointInsideRectangle.java) |  |
| 42 | Reverse Bits | Bitwise | [`ReverseBits.java`](ReverseBits.java) |  |
| 43 | Hamming Weight | Bitwise | [`HammingWeight.java`](HammingWeight.java) |  |
| 44 | Second Maximum Element | Array | [`SecondMaximumElement.java`](SecondMaximumElement.java) |  |
| 45 | Remove Duplicate from sorted | Array | [`RemoveDuplicateFromSorted.java`](RemoveDuplicateFromSorted.java) |  |
| 46 | Move zeros to end | Array | [`MoveZerosToEnd.java`](MoveZerosToEnd.java) |  |
| 47 | Rotate array by K | Array | [`RotateArrayByK.java`](RotateArrayByK.java) |  |
| 48 | Missing number | Array | [`MissingNumber.java`](MissingNumber.java) |  |
| 49 | Maximum consecutive ones | Array | [`MaximumConsecutiveOnes.java`](MaximumConsecutiveOnes.java) |  |
| 50 | Single Appearence | Array | [`SingleAppearance.java`](SingleAppearance.java) |  |
| 51 | Sort Array 012 | Array | [`SortArray012.java`](SortArray012.java) |  |
| 52 | Majority element | Array | [`MajorityElement.java`](MajorityElement.java) |  |
| 53 | Upper Bound(Reverse) | Binary search | [`UpperBoundReverse.java`](UpperBoundReverse.java) |  |
| 54 | Next Permutation | Array | [`NextPermutation.java`](NextPermutation.java) |  |
| 55 | Longest Consecutive | Array | [`LongestConsecutive.java`](LongestConsecutive.java) |  |
| 56 | Set zeros in matrix | Array | [`SetZerosInMatrix.java`](SetZerosInMatrix.java) |  |
| 57 | Rotate matrix | Array | [`RotateMatrix.java`](RotateMatrix.java) |  |
| 58 | Merge sorted array | Array | [`MergeSortedArray.java`](MergeSortedArray.java) |  |
| 59 | Spiral matrix | Array | [`SpiralMatrix.java`](SpiralMatrix.java) |  |
| 60 | Pascal triangle | Array | [`PascalTriangle.java`](PascalTriangle.java) |  |
| 61 | Majority element II | Array | [`MajorityElementII.java`](MajorityElementII.java) |  |
| 62 | Threesome | Array | [`Threesome.java`](Threesome.java) |  |
| 63 | Valid parenthesis | Stack | [`ValidParenthesis.java`](ValidParenthesis.java) |  |
| 64 | Maximum matrix sum | Grid | [`MaxMatrixSum.java`](MaxMatrixSum.java) |  |
| 65 | Climbing Stairs | DP, DFS | [`ClimbingStairs.java`](ClimbingStairs.java) |  |
| 66 | Assign Cookies | Greedy | [`AssignCookies.java`](AssignCookies.java) |  |
| 67 | Jump Game I/II | DP, DFS, Greedy | [`JumpGame.java`](JumpGame.java) |  |
| 68 | Disjoint Set Union(DSU) | DSU | [`DSU.java`](DSU.java) |  |
| 69 | Number of Islands | Graph, DFS, BFS | [`NumberOfIslands.java`](NumberOfIslands.java) |  |
| 70 | House Robber | DP, DFS | [`HouseRobber.java`](HouseRobber.java) |  |
| 71 | House Robber II | DP, DFS | [`HouseRobberII.java`](HouseRobberII.java) |  |
| 72 | Unique Paths | DP, Grid | [`UniquePaths.java`](UniquePaths.java) |  |
| 73 | Minimum Path Sum | DP, Grid | [`MinimumPathSum.java`](MinimumPathSum.java) |  |
| 74 | Minimum Falling Path Sum | DP, Grid | [`MinimumFallingPathSum.java`](MinimumFallingPathSum.java) |  |
| 75 | Minimum Path Sum in Triangle | DP, Triangle | [`MinimumPathSumTriangle.java`](MinimumPathSumTriangle.java) |  |
| 76 | Combination Sum I/II | DP, Knapsack, Backtracking | [`CombinationSum.java`](CombinationSum.java) |  |
| 77 | Equal Partition Subset Sum | DP, Knapsack | [`EqualPartitionSubsetSum.java`](EqualPartitionSubsetSum.java) |  |
| 78 | Coin Change | DP | [`CoinChange.java`](CoinChange.java) |  |
| 79 | Coin Change II | DP | [`CoinChangeII.java`](CoinChangeII.java) |  |
| 80 | Target Sum | DP | [`TargetSum.java`](TargetSum.java) |  |
| 81 | Longest Common Subsequence | DP, String | [`LongestCommonSubsequence.java`](LongestCommonSubsequence.java) |  |
| 82 | Longest Increasing Subsequence | DP | [`LongestIncreasingSubsequence.java`](LongestIncreasingSubsequence.java) |  |
| 83 | Longest Palindromic Substring | Two pointer, String | [`LongestPalindromicSubstring.java`](LongestPalindromicSubstring.java) |  |
| 84 | Longest Palindromic Subsequence | DP, String | [`LongestPalindromicSubsequence.java`](LongestPalindromicSubsequence.java) |  |
| 85 | Edit Distance | DP, String | [`EditDistance.java`](EditDistance.java) |  |
| 86 | Max Profit Single Transaction | DP | [`MaxProfitSingleTransaction.java`](MaxProfitSingleTransaction.java) |  |
| 87 | Max Profit Multiple Transactions | DP | [`MaxProfitMultipleTransactions.java`](MaxProfitMultipleTransactions.java) |  |
| 88 | Max Profit with Cooldown | DP | [`MaxProfitCooldown.java`](MaxProfitCooldown.java) |  |
| 89 | Max Profit with Transaction Fee | DP | [`MaxProfitTransactionFee.java`](MaxProfitTransactionFee.java) |  |
| 90 | Number of Connected Components | Graph | [`NumberOfConnectedComponents.java`](NumberOfConnectedComponents.java) |  |
| 91 | Rotten Oranges | Graph, BFS | [`RottenOranges.java`](RottenOranges.java) |  |
| 92 | Flood Fill | Graph, DFS | [`FloodFill.java`](FloodFill.java) |  |
| 93 | Nearest Zero in 01 Matrix | Graph, BFS | [`NearestZero01Matrix.java`](NearestZero01Matrix.java) |  |
| 94 | Capture Surrounded Regions | Graph, DFS | [`CaptureSurroundedRegions.java`](CaptureSurroundedRegions.java) |  |
| 95 | Number of Enclaves | Graph, DFS | [`NumberOfEnclaves.java`](NumberOfEnclaves.java) |  |
| 96 | Is Bipartite Graph | Graph | [`IsBipartite.java`](IsBipartite.java) |  |
| 97 | Cycle in Undirected Graph | Graph | [`CycleUndirectedGraph.java`](CycleUndirectedGraph.java) |  |
| 98 | Cycle in Directed Graph | Graph | [`CycleDirectedGraph.java`](CycleDirectedGraph.java) |  |
| 99 | Topological Sort | Graph | [`TopoSort.java`](TopoSort.java) |  |
| 100 | Eventual Safe Nodes | Graph | [`EventualSafeNodes.java`](EventualSafeNodes.java) |  |
| 101 | Shortest Path Unweighted Graph | Graph, BFS | [`ShortestPathUnweighted.java`](ShortestPathUnweighted.java) |  |
| 102 | Shortest Path Weighted Graph | Graph, Dijkstra | [`ShortestPathWeighted.java`](ShortestPathWeighted.java) |  |
| 103 | Shortest Path Directed Acyclic Graph | Graph | [`ShortestPathDag.java`](ShortestPathDag.java) |  |
| 104 | Shortest Path in Binary Matrix | Graph, BFS | [`ShortestPathBinaryMatrix.java`](ShortestPathBinaryMatrix.java) |  |
| 105 | Minimum Effort Path | Graph, Dijkstra | [`MinimumEffortPath.java`](MinimumEffortPath.java) |  |
| 106 | Cheapest Flight with K Stops | Graph | [`CheapestFlightKStops.java`](CheapestFlightKStops.java) |  |
| 107 | Number of Shortest Paths | Graph | [`NumberOfShortestPaths.java`](NumberOfShortestPaths.java) |  |
| 108 | Kth Largest Element | Heap | [`KthLargest.java`](KthLargest.java) | 🆕 |
| 109 | Top K Frequent Elements | Heap, Hash Map | [`TopKFrequent.java`](TopKFrequent.java) | 🆕 |
| 110 | Merge K Sorted Lists | Heap, Linked List | [`MergeKSortedLists.java`](MergeKSortedLists.java) | 🆕 |
| 111 | Median from Data Stream | Heap, Design | [`MedianFinder.java`](MedianFinder.java) | 🆕 |
| 112 | Next Greater Element | Stack, Monotonic Stack | [`NextGreaterElement.java`](NextGreaterElement.java) | 🆕 |
| 113 | Daily Temperatures | Stack, Monotonic Stack | [`DailyTemperatures.java`](DailyTemperatures.java) | 🆕 |
| 114 | Largest Rectangle in Histogram | Stack, Monotonic Stack | [`LargestRectangleHistogram.java`](LargestRectangleHistogram.java) | 🆕 |
| 115 | Min Stack | Stack, Design | [`MinStack.java`](MinStack.java) | 🆕 |
| 116 | Longest Substring Without Repeating | Sliding Window, String | [`LongestSubstringWithoutRepeat.java`](LongestSubstringWithoutRepeat.java) | 🆕 |
| 117 | Minimum Window Substring | Sliding Window, String | [`MinimumWindowSubstring.java`](MinimumWindowSubstring.java) | 🆕 |
| 118 | Sliding Window Maximum | Sliding Window, Deque | [`SlidingWindowMaximum.java`](SlidingWindowMaximum.java) | 🆕 |
| 119 | Subsets (Power Set) | Backtracking | [`Subsets.java`](Subsets.java) | 🆕 |
| 120 | Permutations | Backtracking | [`Permutations.java`](Permutations.java) | 🆕 |
| 121 | Generate Parentheses | Backtracking, String | [`GenerateParentheses.java`](GenerateParentheses.java) | 🆕 |
| 122 | Word Search | Backtracking, Grid | [`WordSearch.java`](WordSearch.java) | 🆕 |
| 123 | N-Queens (count) | Backtracking | [`NQueens.java`](NQueens.java) | 🆕 |
| 124 | Level Order Traversal (BFS) | Tree, BFS | [`LevelOrderTraversal.java`](LevelOrderTraversal.java) | 🆕 |
| 125 | Invert Binary Tree | Tree | [`InvertBinaryTree.java`](InvertBinaryTree.java) | 🆕 |
| 126 | Lowest Common Ancestor | Tree | [`LowestCommonAncestor.java`](LowestCommonAncestor.java) | 🆕 |
| 127 | Serialize/Deserialize Tree | Tree, Design | [`SerializeDeserializeTree.java`](SerializeDeserializeTree.java) | 🆕 |
| 128 | Trie (Prefix Tree) | Trie, Design | [`Trie.java`](Trie.java) | 🆕 |
| 129 | Group Anagrams | String, Hash Map | [`GroupAnagrams.java`](GroupAnagrams.java) | 🆕 |
| 130 | Valid Anagram | String, Hash Map | [`ValidAnagram.java`](ValidAnagram.java) | 🆕 |
| 131 | GCD and LCM | Math | [`Gcd.java`](Gcd.java) | 🆕 |
| 132 | Sieve of Eratosthenes | Math | [`SieveOfEratosthenes.java`](SieveOfEratosthenes.java) | 🆕 |
| 133 | Fast Power (Binary Exponentiation) | Math | [`FastPower.java`](FastPower.java) | 🆕 |
