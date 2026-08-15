import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            
            // 1. Top row
            for (int col = colStart; col <= colEnd; col++) {
                result.add(matrix[rowStart][col]);
            }
            rowStart++;
            
            // 2. Right column
            for (int row = rowStart; row <= rowEnd; row++) {
                result.add(matrix[row][colEnd]);
            }
            colEnd--;
            
            // 3. Bottom row
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    result.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }
            
            // 4. Left column
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    result.add(matrix[row][colStart]);
                }
                colStart++;
            }
        }
        
        return result;
    }
}