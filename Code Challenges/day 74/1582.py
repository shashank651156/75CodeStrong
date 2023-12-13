class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        count = 0
        for row in mat:
            if sum(row) == 1:
                col = row.index(1)
                if sum(row[col] for row in mat) == 1:
                    count += 1
        return count