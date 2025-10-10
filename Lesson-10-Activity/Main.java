
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
   

  }
  double gpa(double value){
	if(value > 90.0){
		return gpa = value * 1.1;
	}
	else{
		return gpa;
	}
  }

  double isGraduating(int credits, string gradeLevel){
	if(gradeLevel == 12 && credits == 44){
		return true;
	}
	else{
		return false;
	}
  }

  double BMI(double.weight, double height){
	return weight/(height * height);
	if(BMI(weight, height) <= 18.4){
		return "Underweight";
	}
	else if(BMI(weight, height) >= 18.5 || BMI(weight, height) <= 24.9){
		return "Normal";
	}
	else if(BMI(weight, height) >= 25.0 || BMI(weight, height) <= 39.9){
		return "Overweight";
	}
	else if(BMI(weight, height) >= 40.0){
		return "Obese";
	}
  }

 
  
}