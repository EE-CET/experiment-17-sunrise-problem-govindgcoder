[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/stIj6KRq)
# Experiment 17: Sunrise Problem

## Problem Statement

Given an array $h$ representing heights of buildings. You have to count the buildings which will see the sunrise.
**Assumption:** The sun rises on the side of the array's starting point (index 0).

A building can see the sunrise if it is taller than all the buildings before it.

## Input Format

* Line 1: contains an integer $n$ denoting the size of the array.
* Line 2: contains $n$ space-separated integers denoting elements of the array (heights).

## Output Format

Print a single integer denoting the number of buildings which will see the sunrise.

### Example 1

**Input:**

```text
5
7 4 8 2 9
```

**Output:**

```text
3
```

**Explanation:**
* Building with height 7 can see the sunrise (first building).
* Building 4 is shorter than 7 (blocked).
* Building 8 is taller than 7 (can see).
* Building 2 is shorter than 8 (blocked).
* Building 9 is taller than 8 (can see).
Total: 3 buildings.

### Example 2

**Input:**

```text
6
6 2 8 4 11 13
```

**Output:**

```text
4
```
