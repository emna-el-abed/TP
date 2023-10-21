 package tp2;

    public class Personne
    {
        String name;
        String firstName;
        int dayNaiss;
        int yearNaiss;

        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return name;
        }

        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }
        public String getFirstName()
        {
            return firstName;
        }

        public void setDayNaiss(int dayNaiss, int monthNaiss, int yearNaiss)
        {
            this.dayNaiss = dayNaiss;
            this.yearNaiss = yearNaiss;
        }
        void ageEn2023()
        {
            if(yearNaiss !=0)
            {
                System.out.println("L'age de " +firstName+ " " +name+ " par rapport a l'annnée 2023 est : " +(2023-yearNaiss) +"ans.");
            }
            else
            {
                System.out.println("Cette année est uncorrect !!!");
            }
        }
    }

