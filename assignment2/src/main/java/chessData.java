public class chessData {

        private String name,fide, fed, club,num,rtg;



         public chessData()
         {
            super();
         }

        public chessData(String num, String name, String fide, String fed, String rtg, String club)
        {
            this.num = num;
            this.name = name;
            this.fide = fide;
            this.fed = fed;
            this.rtg = rtg;
            this.club = club;
        }

        public String getNum()
        {
            return num;
        }

        public void setNum(String num)
        {
            this.num = num;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getFide()
        {
            return fide;
        }

        public void setFide(String fide)
        {
            this.fide = fide;
        }

        public String getFed()
        {
            return fed;
        }

        public void setFed(String fed)
        {
            this.fed = fed;
        }

        public String getRtg()
        {
            return rtg;
        }

        public void setRtg(String rtg)
        {
            this.rtg = rtg;
        }

        public String getClub()
        {
            return club;
        }

        public void setClub(String club)
        {
            this.club = club;
        }
    }

