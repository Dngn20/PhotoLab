package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author dgnu9879
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.mirrorVertical();
    beach.mirrorVerticalRightToLeft();
    beach.fullrandomGreen();
    beach.MirrorDiagonal();
    beach.explore();
    beach.write("beach2.jpg");
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.mirrorVerticalRightToLeft();
	  swan.explore();
  }
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.mirrorHorizontalBottomToTop();
	  swan.mirrorVerticalRightToLeft();
	  swan.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture swan = new Picture("butterfly1.jpg");
	  swan.explore();
	  swan.MirrorDiagonal();
	  swan.mirrorDiagonalUpHill();
	  swan.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  
	
  }
  
  public static void testlifeOnTheEdge()
  {
	  Picture snowman = new Picture("swan.jpg");
	  snowman.lifeOnTheEdge(20);
	  snowman.explore();
  }
  
  public static void testfullrandomGreen()
  {
	  
  }
  
  public static void testCopy()
  {
	  Picture snowman = new Picture("swan.jpg");
	  Picture swan = new Picture("snowman.jpg");
	  snowman.copy( swan , 100, 100);
	  snowman.explore();
	  
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//    testMirrorHorizontalBottomToTop();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testMirrorDiagonal();
//    testfullrandomGreen();
//    testCollage();
    testCopy();
//    testEdgeDetection();
//    testlifeOnTheEdge();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}