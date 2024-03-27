class Rectangle 
{
    private double length;
    private double breath;

    public Rectangle()
    {
        length=1.0;
        breath=1.0;
    }

    public Rectangle(double length, double breath)
    {
        this.length=length;
        this.breath=breath;
    }

    public double Area()
    {
        return length*breath;
    }

    public static void main(String[] args)
    {
        Rectangle A1 = new Rectangle();
        System.out.println("Area of Rectangle: "+A1.Area());

        Rectangle A2 = new Rectangle(23.5,10.0);
        System.out.println("Area of Rectangle: "+A2.Area());
    }
}