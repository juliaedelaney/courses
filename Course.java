package hw01.sol;

/**
 * This is Matt adding something
 * class representing a course
 *
 */
public class Course {

  /**
   * department - a field representing the department that the course is located
   */
  public String department;

  /**
   * a field representing the number assigned to the specific course
   */
  public int courseNumber;

  /**
   * a field representing the number of credits students would receive upon
   * completing the course
   */
  public double credits;

  /**
   * Constructor for Course class when the credits are not already set
   * 
   * @param department - the String representing the department of the course
   * @param courseNumber - the int representing the course number
   * @param credits - the double representing the number of credits a student
   *          receives from completing the course, either 1.5, 1.0, or .5
   * @throws IllegalArgumentException - throw "not valid credit" when credits
   *           are not 1.5, 1.0, or .5
   */
  public Course(String department, int courseNumber, double credits)
      throws IllegalArgumentException {
    if ((this.credits == 1.5) || (this.credits == 1.0)
        || (this.credits == .5)) {
      this.department = department;
      this.courseNumber = courseNumber;
      this.credits = credits;
    } else {
      throw new IllegalArgumentException("not valid credit");
    }
  }

  /**
   * Constructor for Course class when the credits are automatically set to 1.0
   * 
   * @param department - the String representing the department that the course
   *          is in
   * @param courseNumber - the int representing the course number
   */
  public Course(String department, int courseNumber) {
    this.department = department;
    this.courseNumber = courseNumber;
    this.credits = 1.0;
  }
}
