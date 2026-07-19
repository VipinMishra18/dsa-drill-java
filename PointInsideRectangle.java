// point = {x, y}; rect = {{x1,y1}, {x2,y2}} opposite corners. Strictly inside.
class PointInsideRectangle {
    static boolean pointInsideRect(int[] point, int[][] rect) {
        int x = point[0], y = point[1];
        int xmin = Math.min(rect[0][0], rect[1][0]);
        int xmax = Math.max(rect[0][0], rect[1][0]);
        int ymin = Math.min(rect[0][1], rect[1][1]);
        int ymax = Math.max(rect[0][1], rect[1][1]);
        return x > xmin && x < xmax && y > ymin && y < ymax;
    }
}
