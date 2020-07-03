package me.karim;
import java.util.Scanner;
public class MaxDeuxNombres
{
    public static void main(String[] args)
    {
        System.out.println("Saisissez la valeur du 1er nombre x :");
        Scanner nombre1=new Scanner(System.in);
        float x=nombre1.nextFloat();
        System.out.println("Saisissez la valeur du 2ème nombre y :");
        Scanner nombre2=new Scanner(System.in);
        float y=nombre2.nextFloat();
        if (x<=y)
        {
            System.out.println("Le maximum des deux nombres " + x + " et " + y + " est "+ y);
        }
        else
        System.out.println("Le maximum des deux nombres" + x + "et" + y + "est"+ x);

        }
    }

