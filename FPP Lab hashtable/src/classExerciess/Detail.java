package classExerciess;

import java.util.Objects;

public class Detail {
	String dep;
	String batch;
	
	Detail(String dep, String batch){
		this.dep = dep;
		this.batch = batch;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	
	@Override
	public String toString() {
		return " "+ getDep()+" "+getBatch();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dep,batch);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Detail)) return false;

		Detail d = (Detail) obj;
		return getDep().equals(d.getDep())&& getBatch().equals(d.getBatch());
	}
	
}
