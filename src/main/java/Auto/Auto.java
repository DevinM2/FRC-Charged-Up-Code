package Auto;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBase;

public class Auto extends CommandBase
{
    
  
    DriveBase driveBase;

    public Auto(DriveBase driveBase)
    {
        System.out.println("StraightDrive Construction Started");
        this.driveBase = driveBase;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(driveBase);
    }


    // Called when the command is initially scheduled.
    @Override
    public void initialize() 
    {
        //driveBase.resetBot_PosRot();
        System.out.println("StraightDrive Auto Initialized");
       
    }

    @Override
    public void execute() 
    {
        
        driveBase.arcadeDrive(.2, 0);


    }

    @Override
    public void end(boolean interrupted) 
    {
        driveBase.arcadeDrive(0, 0);
        System.out.println("Auto Finished");
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() 
    {
        return false;
        
        
    }


}
