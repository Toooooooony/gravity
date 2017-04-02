package dal.gravity;

class GravityConstant implements GravityModel {

	private double g;
	
	public GravityConstant(double g) {
		this.g = g;
	}
	public void setGravitationalField(double g){
		this.g = g;
	}
	@Override
	public double getGravitationalField() {
		// TODO Auto-generated method stub
		return g;
	}
}
