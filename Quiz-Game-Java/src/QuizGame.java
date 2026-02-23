import java.util.Scanner;
public class QuizGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		                String GREEN = "\u001B[32m";
		                String RED = "\u001B[31m";
		                String YELLOW = "\u001B[33m";
		                String BLUE = "\u001B[34m";
		                String RESET = "\u001B[0m";
		                System.out.print("Enter your name: ");
		                String name = sc.nextLine();
		                System.out.print("Enter your gender: ");
		                String gender = sc.nextLine();
		                System.out.print("Enter your qualification: ");
		                String qualification = sc.nextLine();
		                System.out.print("Enter your city: ");
		                String city = sc.nextLine();
		                System.out.println("\n---------- PLAYER DETAILS ----------");
		                System.out.println("Name          : " + name);
		                System.out.println("Gender        : " + gender);
		                System.out.println("Qualification : " + qualification);
		                System.out.println("City          : " + city);
		                System.out.println("------------------------------------");
		                System.out.println("\nWelcome " + name + " to QuizGame ");
		                int reward = 0;
		                boolean audiencePoll = true;
		                boolean fiftyFifty = true;
		                for (int q = 1; q <= 10; q++) {
		                    char correct = ' ';
		                    int prize = 0;
		                    System.out.println("\n----------------------------------");
		                    if (q == 1) {
		                        System.out.println("Q1: Which of these is not a primitive data type in Java?");
		                        System.out.println("A. int\nB. char\nC. String\nD. float");
		                        correct = 'C'; prize = 1000;
		                    }
		                    if (q == 2) {
		                        System.out.println("Q2: Which access modifier allows access only within class?");
		                        System.out.println("A. private\nB. public\nC. default\nD. protected");
		                        correct = 'A'; prize = 2000;
		                    }
		                    if (q == 3) {
		                        System.out.println("Q3: Which keyword is used to inherit a class?");
		                        System.out.println("A. this\nB. super\nC. extends\nD. implements");
		                        correct = 'C'; prize = 3000;
		                    }
		                    if (q == 4) {
		                        System.out.println("Q4: Output of 5 + 5 + \"Java\"?");
		                        System.out.println("A. 10Java\nB. 55Java\nC. Java10\nD. Error");
		                        correct = 'A'; prize = 5000;
		                    }
		                    if (q == 5) {
		                        System.out.println("Q5: Method called during garbage collection?");
		                        System.out.println("A. finalize()\nB. delete()\nC. destroy()\nD. collect()");
		                        correct = 'A'; prize = 10000;
		                    }
		                    if (q == 6) {
		                        System.out.println("Q6: Which interface is used to execute SQL queries in JDBC?");
		                        System.out.println("A. Driver\nB. Connection\nC. Statement\nD. ResultSet");
		                        correct = 'C'; prize = 20000;
		                    }
		                    if (q == 7) {
		                        System.out.println("Q7: Which method is called only once in a Servlet life cycle?");
		                        System.out.println("A. service()\nB. doGet()\nC. doPost()\nD. init()");
		                        correct = 'D'; prize = 40000;
		                    }if (q == 8) {
		                        System.out.println("Q8: Which JSP tag is used to include another file at request time?");
		                        System.out.println("A. <%@ include %>\nB. <jsp:include>\nC. <jsp:forward>\nD. <jsp:useBean>");
		                        correct = 'B'; prize = 80000;
		                    }if (q == 9) {
		                        System.out.println("Q9: Which method is used to stop a thread safely?");
		                        System.out.println("A. stop()\nB. destroy()\nC. interrupt()\nD. suspend()");
		                        correct = 'C'; prize = 160000;
		                    }if (q == 10) {
		                        System.out.println("Q10: Which Spring annotation is used for dependency injection?");
		                        System.out.println("A. @Controller\nB. @Service\nC. @Autowired\nD. @RequestMapping");
		                        correct = 'C'; prize = 320000;
		                    }
		                    System.out.println("E. Lifeline");
		                    System.out.print("Select option: ");
		                    char choice = sc.next().toUpperCase().charAt(0);
		                    if (choice == correct) {
		                        reward = prize;
		                        System.out.println(GREEN +
		                                "Congratulations " + name +
		                                "! Correct answer You won Rs." + reward +
		                                RESET);
		                    }
		                    else if (choice == 'E') {
		                        if (q == 10) {
		                            System.out.println(RED + "Lifelines are not allowed for the last question!" + RESET);
		                            q--;
		                            continue;
		                        }
		                        if (audiencePoll || fiftyFifty) {
		                            System.out.println(YELLOW +
		                                    "Choose Lifeline:\n1. Audience Poll\n2. 50:50" +
		                                    RESET);
		                            int life = sc.nextInt();
		                            if (life == 1 && audiencePoll) {
		                                audiencePoll = false;
		                                System.out.println(YELLOW + " Audience Poll Results:" + RESET);
		                                if (correct == 'A')
		                                    System.out.println(YELLOW + "A - 70%\nB - 10%\nC - 10%\nD - 10%" + RESET);
		                                else if (correct == 'B')
		                                    System.out.println(YELLOW + "A - 10%\nB - 70%\nC - 10%\nD - 10%" + RESET);
		                                else if (correct == 'C')
		                                    System.out.println(YELLOW + "A - 10%\nB - 10%\nC - 70%\nD - 10%" + RESET);
		                                else
		                                    System.out.println(YELLOW + "A - 10%\nB - 10%\nC - 10%\nD - 70%" + RESET);
		                                q--;
		                            }
		                            else if (life == 2 && fiftyFifty) {
		                                fiftyFifty = false;
		                                System.out.println(BLUE + "✂ 50:50 Applied:" + RESET);
		                                if (correct == 'A')
		                                    System.out.println(BLUE + "A. Option A\nB. Option B" + RESET);
		                                else if (correct == 'B')
		                                    System.out.println(BLUE + "B. Option B\nC. Option C" + RESET);
		                                else if (correct == 'C')
		                                    System.out.println(BLUE + "C. Option C\nD. Option D" + RESET);
		                                else
		                                    System.out.println(BLUE + "A. Option A\nD. Option D" + RESET);
		                                q--;
		                            }
		                            else {
		                                System.out.println(RED +
		                                        "Selected lifeline not available!" +
		                                        RESET);
		                                q--;
		                            }
		                        }
		                        else {
		                            System.out.println(RED +
		                                    "No lifelines are available please select the correct option" +
		                                    RESET);
		                            q--;
		                        }
		                    }
		                    else {
		                        System.out.println(RED +
		                                "Wrong Answer,You are out of the game!" +
		                                RESET);
		                        break;
		                    }
		                }
		                System.out.println("\n GAME OVER ");
		                System.out.println("Total Amount Won: Rs." + reward);
		            }
		        }

