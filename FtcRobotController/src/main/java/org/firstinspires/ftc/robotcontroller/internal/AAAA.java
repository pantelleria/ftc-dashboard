
package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;




import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.internal.system.AppUtil;
import org.firstinspires.ftc.robotcore.internal.ui.UILocation;










//@TeleOp(name = "AAAA (Blocks to Java)")
@Autonomous(name = "AAAA (Blocks to Java)")
public class AAAA extends LinearOpMode {

   // private DcMotor Motor0;

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {
        DcMotor Motor0;
        Motor0 = hardwareMap.get(DcMotor.class, "Motor0");


        for (int count = 0; count < 10000000; count++) {
            // if (opModeIsActive()) {
            // Put run blocks here.
            //while (opModeIsActive()) {
            // Put loop blocks here.
            Motor0.setPower(1);
            telemetry.update();
            // }
            // }
        }
    }
}
