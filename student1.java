//write a java program to demonstrate method overloading

import java.lang.*;
import java.util.*;
class demo
{
void add(int a, int b)
{
system.out.println((a+b));
}
void add(int a,int b,int c)
{
system.out.println((a+b+c));
}
void add(double a,double b)
{
system.out.println((a+b));
}
void add(int a,double b)
{
system.out.println((a+b));
}
void add(double a, intb)
{
system.out.println((a+b));
}}
public class add2
{
public static void main(string[]args)
{
demo b1=new();
b1.add(1,2);
b1.add(1,2);
b1.add(1,2);
b1.add(1,2);
}}


