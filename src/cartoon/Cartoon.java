package cartoon;

import com.sun.tools.javah.Gen;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;

/**
 * Created by djacoronel on 2/25/18.
 */
public class Cartoon extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D canvas = (Graphics2D) g;

        canvas.setStroke(new BasicStroke(3f));

        GeneralPath rectangle = new GeneralPath();
        rectangle.moveTo(110, 35);
        rectangle.lineTo(585, 35);
        rectangle.lineTo(585, 665);
        rectangle.lineTo(110, 665);
        rectangle.lineTo(110, 35);

        Area areaRectangle = new Area(rectangle);
        canvas.setPaint(Color.decode("#F18F42"));
        canvas.setStroke(new BasicStroke(3f));
        canvas.fill(areaRectangle);
        canvas.draw(rectangle);

        GeneralPath leftEar = new GeneralPath();
        leftEar.moveTo(109, 35);
        leftEar.curveTo(178, 99, 299, 170, 358, 264);
        leftEar.quadTo(469, 401, 331, 298);
        leftEar.curveTo(318, 282, 170, 224, 109, 110);

        Area leftEarArea = new Area(leftEar);
        canvas.setPaint(Color.decode("#AAB4B8"));
        canvas.fill(leftEarArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(leftEar);

        GeneralPath leftInnerEar = new GeneralPath();
        leftInnerEar.moveTo(109, 66);
        leftInnerEar.curveTo(167, 118, 325, 223, 358, 305);
        leftInnerEar.curveTo(325, 280, 170, 209, 109, 85);

        Area leftInnerEarArea = new Area(leftInnerEar);
        canvas.setPaint(Color.decode("#FBDAC1"));
        canvas.fill(leftInnerEarArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(leftInnerEar);

        GeneralPath head = new GeneralPath();
        head.moveTo(272, 412);
        head.curveTo(263, 370, 277, 360, 285, 387);
        head.moveTo(280, 374);
        head.quadTo(285, 373, 290, 382);
        head.moveTo(280, 374);
        head.quadTo(303, 331, 348, 305);
        head.quadTo(331, 304, 320, 305);
        head.quadTo(343, 296, 360, 298);
        head.quadTo(348, 287, 327, 278);
        head.quadTo(355, 280, 373, 292);
        head.quadTo(362, 279, 345, 265);
        head.quadTo(379, 275, 390, 295);
        head.curveTo(453, 314, 464, 386, 495, 414);
        head.quadTo(256, 655, 272, 412);

        Area headArea = new Area(head);
        canvas.setPaint(Color.decode("#AAB4B8"));
        canvas.fill(headArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(head);

        GeneralPath upperNose = new GeneralPath();
        upperNose.moveTo(298,498);
        upperNose.quadTo(313,485,331,485);
        upperNose.moveTo(302,490);
        upperNose.quadTo(312,480,321,482);
        canvas.draw(upperNose);

        GeneralPath nose = new GeneralPath();
        nose.moveTo(298, 517);
        nose.quadTo(298, 523, 314, 531);
        nose.quadTo(317, 522, 321, 512);
        nose.quadTo(308, 513, 298, 517);

        Area noseArea = new Area(nose);
        canvas.setPaint(Color.decode("#FA998C"));
        canvas.fill(noseArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(nose);

        GeneralPath neck = new GeneralPath();
        neck.moveTo(428, 606);
        neck.quadTo(416, 629, 409, 668);
        neck.lineTo(355, 668);
        neck.quadTo(354, 644, 346, 625);
        neck.lineTo(428, 606);

        GeneralPath neckLine = new GeneralPath();
        neckLine.moveTo(428, 606);
        neckLine.quadTo(416, 629, 409, 665);
        neckLine.moveTo(355, 665);
        neckLine.quadTo(354, 644, 346, 625);

        Area neckArea = new Area(neck);
        canvas.setPaint(Color.white);
        canvas.fill(neckArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(neckLine);

        GeneralPath greyNeck = new GeneralPath();
        greyNeck.moveTo(431, 667);
        greyNeck.quadTo(448, 613, 467, 590);
        greyNeck.lineTo(428, 606);
        greyNeck.quadTo(416, 629, 409, 667);
        greyNeck.lineTo(431, 667);

        GeneralPath greyNeckLine = new GeneralPath();
        greyNeckLine.moveTo(431, 665);
        greyNeckLine.quadTo(448, 613, 467, 590);
        greyNeckLine.moveTo(428, 606);
        greyNeckLine.quadTo(416, 629, 409, 665);

        Area greyNeckArea = new Area(greyNeck);
        canvas.setPaint(Color.decode("#AAB4B8"));
        canvas.fill(greyNeckArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(greyNeckLine);

        GeneralPath leftEye = new GeneralPath();
        leftEye.moveTo(287, 510);
        leftEye.quadTo(255, 480, 275, 399);
        leftEye.quadTo(300, 456, 287, 510);

        Area leftEyeArea = new Area(leftEye);
        canvas.setPaint(Color.decode("#AAB4B8"));
        canvas.fill(leftEyeArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(leftEye);

        GeneralPath rightEyebrow = new GeneralPath();
        rightEyebrow.moveTo(342,330);
        rightEyebrow.curveTo(356,298,380,288,391,360);
        rightEyebrow.moveTo(378,312);
        rightEyebrow.quadTo(391,316,397,340);
        canvas.draw(rightEyebrow);

        GeneralPath rightEye = new GeneralPath();
        rightEye.moveTo(355, 488);
        rightEye.curveTo(342, 473, 324, 356, 359, 327);
        rightEye.quadTo(385, 349, 391, 451);
        rightEye.lineTo(355, 488);

        Area rightEyeArea = new Area(rightEye);
        canvas.setPaint(Color.decode("#AAB4B8"));
        canvas.fill(rightEyeArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(rightEye);

        GeneralPath rightEyeBall = new GeneralPath();
        rightEyeBall.moveTo(391, 452);
        rightEyeBall.quadTo(363,448,339,470);
        rightEyeBall.moveTo(345,462);
        rightEyeBall.quadTo(347,476,354,488);
        rightEyeBall.quadTo(373,473,391,452);

        Area rightEyeBallArea = new Area(rightEyeBall);
        canvas.setPaint(Color.white);
        canvas.fill(rightEyeBallArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(rightEyeBall);

        GeneralPath rightPupil = new GeneralPath();
        rightPupil.moveTo(391, 451);
        rightPupil.lineTo(374,452);
        rightPupil.lineTo(378,464);
        rightPupil.lineTo(391,451);

        Area rightPupilArea = new Area(rightPupil);
        canvas.fill(rightPupilArea);

        GeneralPath rightEar = new GeneralPath();
        rightEar.moveTo(389, 296);
        rightEar.curveTo(371, 256, 296, 206, 276, 34);
        rightEar.lineTo(366, 34);
        rightEar.curveTo(448, 142, 407, 272, 428, 323);

        GeneralPath rightEarLine = new GeneralPath();
        rightEarLine.moveTo(389, 296);
        rightEarLine.curveTo(371, 256, 296, 206, 276, 35);
        rightEarLine.moveTo(366, 35);
        rightEarLine.curveTo(448, 142, 407, 272, 428, 323);

        Area rightEarArea = new Area(rightEar);
        canvas.setPaint(Color.decode("#AAB4B8"));
        canvas.fill(rightEarArea);

        canvas.setPaint(Color.BLACK);
        canvas.draw(rightEarLine);

        GeneralPath rightInnerEar = new GeneralPath();
        rightInnerEar.moveTo(294,35);
        rightInnerEar.quadTo(301,180,397,274);
        rightInnerEar.moveTo(398,281);
        rightInnerEar.quadTo(406,163,332,35);
        rightInnerEar.lineTo(294,35);

        GeneralPath rightInnerEarLine = new GeneralPath();
        rightInnerEarLine.moveTo(294,35);
        rightInnerEarLine.quadTo(301,180,397,274);
        rightInnerEarLine.moveTo(398,281);
        rightInnerEarLine.quadTo(406,163,332,35);

        Area rightInnerEarArea = new Area(rightInnerEar);
        canvas.setPaint(Color.decode("#FBDAC1"));
        canvas.fill(rightInnerEarArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(rightInnerEarLine);

        GeneralPath cheeks = new GeneralPath();
        cheeks.moveTo(362, 622);
        cheeks.quadTo(300, 630, 246, 600);
        cheeks.quadTo(251, 607, 265, 615);
        cheeks.quadTo(225, 614, 223, 574);
        cheeks.quadTo(224, 596, 228, 604);
        cheeks.quadTo(208, 584, 215, 563);
        cheeks.quadTo(211, 569, 208, 583);
        cheeks.quadTo(210, 495, 272, 487);
        cheeks.quadTo(281, 508, 298, 517);
        cheeks.quadTo(298, 523, 314, 531);
        cheeks.quadTo(317, 522, 321, 512);
        cheeks.curveTo(370, 498, 420, 357, 565, 442);
        cheeks.quadTo(552, 437, 537, 436);
        cheeks.quadTo(567, 444, 567, 477);
        cheeks.quadTo(562, 470, 560, 470);
        cheeks.quadTo(568, 496, 554, 518);
        cheeks.quadTo(554, 507, 550, 501);
        cheeks.quadTo(538, 566, 422, 608);

        Area cheekArea = new Area(cheeks);
        canvas.setPaint(Color.white);
        canvas.fill(cheekArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(cheeks);

        GeneralPath leftEyeBall = new GeneralPath();
        leftEyeBall.moveTo(274,495);
        leftEyeBall.quadTo(282,487,291,486);
        leftEyeBall.quadTo(290,501,286,509);
        leftEyeBall.quadTo(272,499,277,485);

        Area leftEyeBallArea = new Area(leftEyeBall);
        canvas.setPaint(Color.white);
        canvas.fill(leftEyeBallArea);
        canvas.setPaint(Color.BLACK);
        canvas.draw(leftEyeBall);

        GeneralPath leftPupil = new GeneralPath();
        leftPupil.moveTo(291,486);
        leftPupil.lineTo(280,489);
        leftPupil.lineTo(288,501);
        leftPupil.lineTo(291,486);

        Area leftPupilArea = new Area(leftPupil);
        canvas.fill(leftPupilArea);

        GeneralPath mouth = new GeneralPath();
        mouth.moveTo(251,558);
        mouth.quadTo(266,540,292,533);
        mouth.curveTo(290,550,308,551,317,538);
        mouth.curveTo(334,548,361,532,343,519);
        mouth.curveTo(404,523,462,478,482,492);

        mouth.moveTo(298,547);
        mouth.quadTo(315,574,331,587);
        mouth.quadTo(347,591,357,589);
        mouth.quadTo(370,580,373,569);
        mouth.quadTo(360,547,350,531);
        mouth.moveTo(317,538);
        mouth.quadTo(328,554,340,566);
        mouth.lineTo(318,538);

        mouth.moveTo(308,564);
        mouth.quadTo(302,563,295,557);
        mouth.moveTo(363,552);
        mouth.quadTo(373,545,378,534);

        mouth.moveTo(292,534);
        mouth.quadTo(214,539,159,560);
        mouth.moveTo(292,536);
        mouth.quadTo(214,554,155,583);
        mouth.moveTo(291,538);
        mouth.quadTo(220,571,190,591);

        mouth.moveTo(343,519);
        mouth.quadTo(447,442,558,416);
        mouth.moveTo(343,521);
        mouth.quadTo(495,458,584,449);
        mouth.moveTo(343,523);
        mouth.quadTo(483,475,580,479);

        canvas.draw(mouth);
    }

    public static void main(String[] args) {
        Frame frame = new Cartoon();
        frame.setBackground(Color.WHITE);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }
}
