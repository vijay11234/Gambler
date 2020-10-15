class Gambling
{
        public static int stake=100,bet=1;
        public static void main(String[] args)
        {
                Gambling obj=new Gambling();
                obj.gambler();
        }
        public void gambler()
        {
                int random=(int)Math.floor(Math.random()*10)%2;
                if(random==0)
                        System.out.println("loose");
                else
                        System.out.println("Win");
        }
}
