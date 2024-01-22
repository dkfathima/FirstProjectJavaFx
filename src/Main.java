/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
+Name: Dewan Fathima                                                                          +
+Class: CSIT Java 501                                                                         +
+Project Name: HousePicture.java                                                              +
+Description: In this program I will draw a nice picture of a house using shapes with JavaFx. +
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public class Main extends Application
{
    public void start(Stage Primarystage)
    {
        // This is the base of the house using a rectangle
        Rectangle base = new Rectangle(30,100,170,150);
        base.setFill(Color.INDIANRED);

        // The windows of the house of the using rectangles with the color white
        Rectangle upperLeftWin = new Rectangle(50,120,20,20);
        upperLeftWin.setFill(Color.WHITE);

        // Upper right window
        Rectangle upperRightWin = new Rectangle(160,120,20,20);
        upperRightWin.setFill(Color.WHITE);

        // lower left window
        Rectangle lowerLeftWin = new Rectangle(50,170,20,20);
        lowerLeftWin.setFill(Color.WHITE);

        // lower left window
        Rectangle lowerRightWin = new Rectangle(160,170,20,20);
        lowerRightWin.setFill(Color.WHITE);

        // lower left window
        Rectangle door = new Rectangle(99,150,40,60);
        door.setFill(Color.SANDYBROWN);

        // Here is creating the door nob using a circle
        Circle doorNob = new Circle(5,5,5);
        doorNob.setFill(Color.BLACK);
        doorNob.setTranslateX(129);
        doorNob.setTranslateY(175);


        //This is the roof part using 3 lines to create a triangular roof
        Line line1 = new Line(140,30,10, 110);
        line1.setStrokeWidth(4);
        line1.setRotate(-10);

        Line line2 = new Line(199,20,20, 199);
        line2.setStrokeWidth(4);
        line2.setTranslateX(10);
        line2.setRotate(45);

        Line line3 = new Line(137,20,50, 125);
        line3.setStrokeWidth(4);
        line3.setTranslateX(80);
        line3.setTranslateY(2);
        line3.setRotate(105);


        // Here I am grouping all the shapes together to create the entire house part of the picture
        Group housePart1 = new Group(base, upperRightWin, upperLeftWin,lowerLeftWin,lowerRightWin, door, doorNob);
        Group roof = new Group(line1, line2, line3);
        Group housePart2 = new Group(housePart1, roof);

        housePart2.setTranslateX(170);
        housePart2.setTranslateY(30);


        // This is the sun using a circle
        Circle theSun = new Circle(50,50,30);
        theSun.setFill(Color.GOLD);


        // The scenery background
        Rectangle grass = new Rectangle(0,250,500,100);
        grass.setFill(Color.LAWNGREEN);

        // This is adding flowers to the background using circles
        // and use lines to create the stem for the flowers

        // flower 1 with stem
        Circle flower1 = new Circle(10,10,10);
        flower1.setFill(Color.LIGHTPINK);
        flower1.setTranslateX(10);
        flower1.setTranslateY(200);

        Line stem1 = new Line(50,10,10,50);
        stem1.setFill(Color.DARKGREEN);
        stem1.setTranslateX(-10);
        stem1.setTranslateY(200);
        stem1.setRotate(135);

        // Flower 2 with stem
        Circle flower2 = new Circle(10,10,10);
        flower2.setFill(Color.MEDIUMPURPLE);
        flower2.setTranslateX(70);
        flower2.setTranslateY(200);

        Line stem2 = new Line(50,10,10,50);
        stem2.setFill(Color.DARKGREEN);
        stem2.setTranslateX(50);
        stem2.setTranslateY(200);
        stem2.setRotate(135);

        // Flower 3 with stem
        Circle flower3 = new Circle(10,10,10);
        flower3.setFill(Color.PAPAYAWHIP);
        flower3.setTranslateX(130);
        flower3.setTranslateY(200);

        Line stem3 = new Line(50,10,10,50);
        stem3.setFill(Color.DARKGREEN);
        stem3.setTranslateX(110);
        stem3.setTranslateY(200);
        stem3.setRotate(135);


        // Grouping all the components the house, sun, background setting, and the flowers
        // Creating the scene for the house picture
        Group finalHousePic = new Group(housePart2, theSun, grass, stem1,flower1, stem2, flower2, stem3, flower3);
        Scene scene = new Scene(finalHousePic,500,350);
        scene.setFill(Color.LIGHTSKYBLUE);

        //Creating the title
        // setting up the scene
        // displaying the program
        Primarystage.setTitle("The House in the Neighborhood");
        Primarystage.setScene(scene);
        Primarystage.show();

    }
}