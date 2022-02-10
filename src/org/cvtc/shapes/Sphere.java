package org.cvtc.shapes;
/*
 * Author: Matthew Xiong
 */

import javax.swing.*;

public class Sphere extends Shape
{
    // Variables
    private float radius = 0;

    // Constructors
    public Sphere(float radius) {
        setRadius(radius);
    }

    // Methods
    public float getRadius()
    {
        return this.radius;
    }

    private void setRadius(float radius)
    {
        // Set to 0 if the passed in value is less than 0
        this.radius = (radius > 0) ? radius : 0;
    }

    @Override
    public float surfaceArea()
    {
        // SA = 4 * π * r^2
        return 4 * (float)Math.PI * (getRadius() * getRadius());
    }

    @Override
    public float volume()
    {
        // V = 4/3 * π * r^3
        return 4 / 3 * (float)Math.PI * (getRadius() * getRadius() * getRadius());
    }

    @Override
    public void render()
    {
        // Create a new frame for the dialog box
        JFrame frame = new JFrame("Shapes");

        // Bring up a dialog box using the frame with the message as our surface area and volume calculations
        JOptionPane.showMessageDialog(frame, "Surface area of the sphere is " + surfaceArea() +
                "\nVolume of the sphere is " + volume());
    }
}
