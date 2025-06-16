/*CP - Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____*/

import java.util.*;
public class EarthVolume{
	public static void main(String[] args){
        
        double RadiusofEarth=6378.0;
        
        double VolumeEarth=(4/3)*Math.PI*RadiusofEarth*RadiusofEarth*RadiusofEarth;
        System.out.println(VolumeEarth);
	}
}

