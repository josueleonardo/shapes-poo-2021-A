package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {

    public TriangleEquilatero(int side) {
        this.base = side;
        this.height = (int) Math.sqrt(Math.pow(side,2)-Math.pow(side/2,2));
        this.name = "Triangle Equilateral";
    }

    public int getPerimeter(){
        return base*3;
    }
}
