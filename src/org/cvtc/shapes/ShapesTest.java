package org.cvtc.shapes;
/*
 * Author: Matthew Xiong
 */

import javax.swing.*;

public class ShapesTest
{
    public static void main(String[] args)
    {
        // Create our 3 shapes
        Cuboid cuboid = new Cuboid(5, 10, 5);
        Cylinder cylinder = new Cylinder(20, 50);
        Sphere sphere = new Sphere(32);

        // Call the render method on all of our shapes
        cuboid.render();
        cylinder.render();
        sphere.render();
    }
}
