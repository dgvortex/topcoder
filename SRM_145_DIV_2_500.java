public class ExerciseMachine
{
	public int getPercentages(String time){
        String myt[] = time.split(":");
        int ptime[] = new int[3];
        ptime[0] = Integer.parseInt(myt[0]);
        ptime[1] = Integer.parseInt(myt[1]);
        ptime[2] = Integer.parseInt(myt[2]);
        double t_sec = ptime[0]*60*60 + ptime[1]*60 + ptime[2];
        //System.out.println(t_sec);
        int md=-1,flag=0;
        for(int i=1;i<t_sec;i++)
        {
            double  m = (t_sec/100)*i;
            md =(int)Math.floor(m);
        	//System.out.println(m);
            if((md*t_sec)==(m*t_sec))     {
                flag=1;
                //System.out.println(md);
                break;
            }
        }
        if(flag==1){
            return (int)((t_sec/md)-1);
        }
        return 0;
    }
}