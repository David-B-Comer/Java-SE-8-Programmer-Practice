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

     We have two loops here. The fi rst uses index i and goes through the fi rst subarray for
     twoD. The second uses a different loop variable j. It is very important these be different
     variable names so the loops don’t get mixed up. The inner loop looks at how many elements
     are in the second-level array. The inner loop prints the element and leaves a space for readability. When the inner loop completes, the outer loop goes to a new line and repeats the
     process for the next element.
     This entire exercise would be easier to read with the enhanced for loop.
     for (int[] inner : twoD) {
     for (int num : inner)
     System.out.print(num + " ");
     System.out.println();
     }
     We’ll grant you that it isn’t fewer lines, but each line is less complex and there aren’t any
     loop variables or terminating conditions to mix up.
     **/
}
