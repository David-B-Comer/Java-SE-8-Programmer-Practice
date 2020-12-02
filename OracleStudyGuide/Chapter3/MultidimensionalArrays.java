package Chapter3;

public class MultidimensionalArrays {
    /**

     Arrays are objects, and of course array components can be objects. It doesn’t take much
     time, rubbing those two facts together, to wonder if arrays can hold other arrays, and of
     course they can.




     Creating a Multidimensional Array
     Multiple array separators are all it takes to declare arrays with multiple dimensions. You
     can locate them with the type or variable name in the declaration, just as before:
     int[][] vars1; // 2D array
     int vars2 [][]; // 2D array
     int[] vars3[]; // 2D array
     int[] vars4 [], space [][]; // a 2D AND a 3D array

     The first two examples are nothing surprising and declare a two-dimensional (2D) array.
     The third example also declares a 2D array. There’s no good reason to use this style other
     than to confuse readers of your code. The fi nal example declares two arrays on the same
     line. Adding up the brackets, we see that the vars4 is a 2D array and space is a 3D array.
     Again, there’ no reason to use this style other than to confuse readers of your code. The
     exam creators like to try to confuse you, though. Luckily you are on to them and won’t let
     this happen to you!
     You can specify the size of your multidimensional array in the declaration if you like:
     String [][] rectangle = new String[3][2];
     The result of this statement is an array rectangle with three elements, each of which
     refers to an array of two elements. You can think of the addressable range as [0][0] through
     [2][1], but don’t think of it as a structure of addresses like [0,0] or [2,1].




     Using a Multidimensional Array
     The most common operation on a multidimensional array is to loop through it. This example
     prints out a 2D array:
     int[][] twoD = new int[3][2];
     for (int i = 0; i < twoD.length; i++) {
     for (int j = 0; j < twoD[i].length; j++)
     System.out.print(twoD[i][j] + " "); // print element
     System.out.println(); // time for a new row
     }

     **/
}
