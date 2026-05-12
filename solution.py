class Solution:
    x = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    def place(self, k, i):
        for j in range(1, k):
            if self.x[j] == i or abs(self.x[j] - i) == abs(j - k):
                return False

        return True
    
    def queens(self, k, n, count):
        for i in range(1, n + 1):
            if self.place(k, i):
                self.x[k] = i
                if k != n:
                    self.queens(k + 1, n, count)
                else:
                    count[0] += 1

    def totalNQueens(self, n):
        count = [0]
        self.queens(1, n, count)
        return count[0]
