package string;

public class Jsonbean {

	private  String name ;
	private  String age;
    private  String job;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Jsonbean [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	

}
