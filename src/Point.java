public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || !(obj instanceof Point))
        {
            return false;
        }
        Point pobj = (Point) obj;
        if(this.x == pobj.x && this.y == pobj.y)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x +  ", y = " + y;
    }
}
