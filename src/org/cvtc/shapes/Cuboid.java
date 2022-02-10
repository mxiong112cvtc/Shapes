package org.cvtc.shapes;
/*
 * Author: Matthew Xiong
 */

import javax.swing.*;

public class Cuboid extends Shape
{
    // Variables
    private float width = 0;
    private float height = 0;
    private float depth = 0;

    // Constructors
    public Cuboid(float width, float height, float depth) {
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    // Methods
    public float getWidth()
    {
        return this.width;
    }

    private void setWidth(float width)
    {
        // Set to 0 if the passed in value is less than 0
        this.width = (width > 0) ? width : 0;
    }

    public float getHeight()
    {
        return this.height;
    }

    private void setHeight(float height)
    {
        this.height = (height > 0) ? height : 0;
    }

    public float getDepth()
    {
        return this.depth;
    }

    private void setDepth(float depth)
    {
        this.depth = (depth > 0) ? depth : 0;
    }

    @Override
    public float surfaceArea()
    {
        // SA = 2 * (w + h + b)
        return 2 * (getWidth() + getHeight() + getDepth());
    }

    @Override
    public float volume()
    {
        // V = w * h * b
        return getWidth() * getHeight() * getDepth();
    }

    @Override
    public void render()
    {
        // Create a new frame for the dialog box
        JFrame frame = new JFrame("Shapes");

        // Bring up a dialog box using the frame with the message as our surface area and volume calculations
        JOptionPane.showMessageDialog(frame, "Surface area of the cuboid is " + surfaceArea() +
                "\nVolume of the cuboid is " + volume());
    }
}
