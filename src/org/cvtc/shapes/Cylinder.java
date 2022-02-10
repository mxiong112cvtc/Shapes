package org.cvtc.shapes;
/*
 * Author: Matthew Xiong
 */

import javax.swing.*;

public class Cylinder extends Shape
{
    // Variables
    private float radius = 0;
    private float height = 0;

    // Constructors
    public Cylinder(float radius, float height) {
        setRadius(radius);
        setHeight(height);
    }

    // Methods
    public float getRadius()
    {
        return this.radius;
    }

    private void setRadius(float radius)
    {
        this.radius = (radius > 0) ? radius : 0;
    }

    public float getHeight()
    {
        return this.height;
    }

    private void setHeight(float height)
    {
        this.height = (height > 0) ? height : 0;
    }

    @Override
    public float surfaceArea()
    {
        // SA = (2 * π * r * h) + (2 * π * r^2)
        return 2 * (float)Math.PI * getRadius() * getHeight() + 2 * (float)Math.PI * (getRadius() * getRadius());
    }

    @Override
    public float volume()
    {
        // V = π * r^2 * h
        return (float)Math.PI * (getRadius() * getRadius()) * getHeight();
    }

    @Override
    public void render()
    {
        // Create a new frame for the dialog box
        JFrame frame = new JFrame("Shapes");

        // Bring up a dialog box using the frame with the message as our surface area and volume calculations
        JOptionPane.showMessageDialog(frame, "Surface area of the cylinder is " + surfaceArea() +
                "\nVolume of the cylinder is " + volume());
    }
}
