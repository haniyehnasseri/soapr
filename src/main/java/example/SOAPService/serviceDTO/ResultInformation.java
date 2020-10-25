package example.SOAPService.serviceDTO;

public class ResultInformation {
    private int ProcessStatusCode;
    private String ResultDescription;

    public int getProcessStatusCode() {
        return ProcessStatusCode;
    }

    public void setProcessStatusCode(int processStatusCode) {
        ProcessStatusCode = processStatusCode;
    }

    public String getResultDescription() {
        return ResultDescription;
    }

    public void setResultDescription(String resultDescription) {
        ResultDescription = resultDescription;
    }
}
