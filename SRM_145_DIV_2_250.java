public class ImageDithering 
{
public int count(String dithered,String[] screen){
        int count=0;
        for(int i=0;i<screen.length;i++){
            for(int j=0;j<screen[i].length();j++){
                if(containing(dithered,screen[i].charAt(j)))
                    count++;
            }
        }
        return count;
    }
    
    public boolean containing(String dith,char c)
    {
        for(int i=0;i<dith.length();i++)
            if(dith.charAt(i)==c)
                return true;
        return false;
    }
}