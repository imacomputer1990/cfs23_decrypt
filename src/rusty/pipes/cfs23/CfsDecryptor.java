package rusty.pipes.cfs23;

public class CfsDecryptor
{
    private static final String XOR_KEY = "4282840";
    
    public static void main(String[] args) 
    {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
    public static String xorEncode(String data)
    {
        try
        {
            String xor = "";

            for(int i = 0; i < data.length(); i++)
                xor += (char)(data.charAt(i) ^ XOR_KEY.charAt(i % XOR_KEY.length()));

            return xor;
        }
        catch(Exception err)
        {
            err.printStackTrace();
            return null;
        }
    }
}
