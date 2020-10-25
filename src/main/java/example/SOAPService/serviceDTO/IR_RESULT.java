package example.SOAPService.serviceDTO;

import java.util.Date;

public class IR_RESULT extends RESULT {
    private static String DocumentID;
    private static String RefDocumentID;
    private static String ConsignmentIdentifier;
    private static Date DateTime;
    private static ResultInformation ResultInformation;

    public static String getDocumentID() {
        return DocumentID;
    }

    public  void setDocumentID(String documentID) {
        DocumentID = documentID;
    }

    public  String getRefDocumentID() {
        return RefDocumentID;
    }

    public  void setRefDocumentID(String refDocumentID) {
        RefDocumentID = refDocumentID;
    }

    public  String getConsignmentIdentifier() {
        return ConsignmentIdentifier;
    }

    public  void setConsignmentIdentifier(String consignmentIdentifier) {
        ConsignmentIdentifier = consignmentIdentifier;
    }

    public  Date getDateTime() {
        return DateTime;
    }

    public  void setDateTime(Date dateTime) {
        DateTime = dateTime;
    }

    public  example.SOAPService.serviceDTO.ResultInformation getResultInformation() {
        return ResultInformation;
    }

    public  void setResultInformation(example.SOAPService.serviceDTO.ResultInformation resultInformation) {
        ResultInformation = resultInformation;
    }
}
