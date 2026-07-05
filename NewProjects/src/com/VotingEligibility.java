package com;

public class VotingEligibility {
	public static void main(String[] args) {
		VotingEligibility obj = new VotingEligibility ();
		obj.voterAge();
		obj.calculateAge();
		
		
		
	}	
		void voterAge () {
			
	int personAge = 20;
	int minimumVotingAge =18;
	boolean ageEligible = personAge >= minimumVotingAge;
	
	
	System.out.println("person age is "+personAge);
	System.out.println("minimum voting age is  "+ minimumVotingAge);
	System.out.println("the person is eligible to vote "+ ageEligible);
			
		}
		
		void calculateAge () {
			
		int boyAge = 15;
		int minimumVotingAge = 18;
		 int leftYearsToVote = minimumVotingAge - boyAge ;
		 
		 System.out.println(" boys age is "+boyAge);
		 System.out.println("left years to voting "+ leftYearsToVote);
		 System.out.println("the person is eligible to vote "+ (boyAge >= minimumVotingAge));
		 
			
		}
	}


