class Bicycle {
	public static void main(String[] args) {
		int currentSpeed=10;
		boolean isMoving=true;
		//the "if" clause: bicycle must be moving
		if (isMoving){
			//the "then" clause: decrease current speed
			currentSpeed--;
			//Isso seria igual a currentSpeed=currentSpeed-1 ou --currentSpeed
		}
		System.out.println ("a vel. é " + currentSpeed);
	}
}