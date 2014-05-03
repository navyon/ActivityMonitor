package com.smartapps.accel;

import javax.vecmath.Point3d;



public class AccelData {
	private long timestamp;
    private String label;
	private double x;
	private double y;
	private double z;
    private Point3d point3d;



    public AccelData(long timestamp, Point3d point3d, String label) {
        this.timestamp = timestamp;
        this.label = label;
        this.x = x;
        this.y = y;
        this.z = z;
        this.point3d = point3d;

    }
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
    public String getLabel() {return label;}
    public void setLabel(String label) {this.label= label;}
    public Point3d getPoint3D() {return point3d;}
    public void setPoint3D(Point3d point3d) {this.point3d= point3d;}
	
	public String toString()
	{
		return "t="+timestamp+", x="+point3d.getX()+", y="+point3d.getY()+", z="+point3d.getZ();
	}
	

}
