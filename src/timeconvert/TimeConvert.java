package timeconvert;

import javax.swing.JOptionPane;

public class TimeConvert
{
    public static void main(String[] args)
    {
        String mTime;
        String normalTime;
        String timeFront;
        String timeBack;
        int timeFrontTemp;
        boolean am = false;
        boolean pm = false;

        mTime = JOptionPane.showInputDialog("Enter in 24 hour time:");
        timeFront = mTime.substring(0, 2);
        timeBack = mTime.substring(3, 5);
        int timeFrontInt = Integer.parseInt(timeFront);

        
        if(timeFrontInt < 24 && timeFrontInt > 12)
        {
            pm = true;
            timeFrontTemp = timeFrontInt - 12;
            JOptionPane.showMessageDialog(null, timeFrontTemp + ":" + timeBack + " pm", "12 Hour Time", JOptionPane.PLAIN_MESSAGE);
        }
        else if(timeFrontInt == 12)
        {
            JOptionPane.showMessageDialog(null, timeFrontInt + ":" + timeBack + " pm", "12 Hour Time", JOptionPane.PLAIN_MESSAGE);
        }
        if(timeFrontInt < 12 && timeFrontInt > 0)
        {
            am = true;
            JOptionPane.showMessageDialog(null, timeFrontInt + ":" + timeBack + " am", "12 Hour Time", JOptionPane.PLAIN_MESSAGE);
        }
        else if(timeFrontInt == 24)
        {
            timeFrontInt = timeFrontInt - 12;
            JOptionPane.showMessageDialog(null, timeFrontInt + ":" + timeBack + " am", "12 Hour Time", JOptionPane.PLAIN_MESSAGE);
        }
        else if(timeFrontInt == 0)
        {
            am = true;
            JOptionPane.showMessageDialog(null, "1:" + timeBack + " am", "12 Hour Time", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
