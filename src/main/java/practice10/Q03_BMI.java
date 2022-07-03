package practice10;

public class Q03_BMI {
      /*
    Type code to calculate BMI (Do NOT ignore security).

    The BMI is defined as the body mass divided by the square of the body height.
    Major adult BMI classifications are underweight (under 18.5 kg/m2), normal weight (18.5 to 25), overweight (25 to 30), and obese (30 or more).
    */

    private double weight;
    private double height;

    public Q03_BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculationOfBMI(){
        double bmi = weight/(height*height);
        System.out.println("BMI: "+bmi);

        if(bmi>0 && bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("Normal");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("Overweight");
        } else if (bmi>=30) {
            System.out.println("Obese");
        }else {
            System.out.println("Enter valid input");
        }

    }

}
