package de.neuefische.muc222.smartphone;

public class BussinessContact extends Contact{
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BussinessContact{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
