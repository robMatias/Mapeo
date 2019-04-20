/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campovectorial;

/**
 *
 * @author Desarrollo
 */
public class Vector {
    
    private int _x;
    private int _y;

    public Vector() {
    }

    public Vector(int x, int y) {
        _x = x;
        _y = y;
    }
    
    public int getX() {
        return _x;
    }

    public void setX(int _x) {
        this._x = _x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int _y) {
        this._y = _y;
    }
    
    
    @Override
    public String toString(){
        return "Vector con las siguientes cordenadas \n X = " + _x + " y Y = " + _y;
    }
}
