package com.cursor.homework3.task1.abstractClasses;

import com.cursor.homework3.task1.interfaces.AreaMeasurable;
import com.cursor.homework3.task1.vertices.Vertex2D;

public abstract class Shape<T extends Vertex2D> implements AreaMeasurable {
    protected T[] vertices;
}
