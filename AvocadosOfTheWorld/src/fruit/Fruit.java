/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit;
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */


public abstract class Fruit {
		
		private int weight; //in ounces
		private float cost;
		
		
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		
		
		public float getCost() {
			return cost;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
		public String toString() {
			return "weight = " + weight + "cost = " + cost;
		}
		//Constructor because same name as class
		//Could use the this. method as well or the setProperty method
		/***
		 * Constructor
		 * @param weight of Fruit
		 * @param cost of Fruit
		 */
		public Fruit(int weight, float cost){
			setWeight(weight);
			setCost(cost);
			
		}
		
}
