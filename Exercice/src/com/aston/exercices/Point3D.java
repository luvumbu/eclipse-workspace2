package com.aston.exercices;

public class Point3D extends Point2D{

	private int z;

	public Point3D(int x, int y,int z)
	{
		super(x, y);
		this.z  = this.z;
	}
	public void Point3D(int x , int y)
	{

	}
	public void Translatet(int dx, int dy, int dz)
	{
		super.Translate(dx, dy);
		this.z = dz;
	}







}
