
public class Question_1 {
		public static void main (String[] args) 
		{
			int Seconds = 365 * 24 * 60 * 60;
			int BirthRate = Seconds / 7;
			int DeathRate = Seconds / 13;
			int ImmigrantRate = Seconds / 45;
			int CurrentPop = 312032486;
			 for (int i = 1; i <= 5; i++) 
			 {
		            CurrentPop = CurrentPop + BirthRate - DeathRate + ImmigrantRate;
		            System.out.println("The population for Year " + i + ": " + CurrentPop);
			 }
		}
	}

