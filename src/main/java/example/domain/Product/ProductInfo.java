package example.domain.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;


@XmlAccessorType(XmlAccessType.FIELD)
public class ProductInfo implements Serializable {

    @XmlElement(required = true)
    private int ProductNumeric;

    @XmlElement(required = true)
    private long TNVEDCode;

    @XmlElement(required = true)
    private String ProductDescription;

    @XmlElement(required = true)
    private float GrossWeight;

    @XmlElement(required = true)
    private float NetWeight;

    @XmlElement(required = true)
    private float AmountInvoice;

    @XmlElement(required = true)
    private int Currency;

    @XmlElement(required = true)
    private String CountryDispatchCode;

    @XmlElement(required = true)
    private String OriginCountryCode;

    @XmlElement(required = true)
    private float TotalPackageQuantity;

    private String PackCode;

    @XmlElement(required = true)
    private float CurrencyExchangeRates;

    @XmlElement(required = true)
    private int StaticalCost;

    @XmlElement(required = true)
    private int CustomsCost;

    @XmlElement(required = true)
    private String DeclNum;



    public int getProductNumeric() {
        return ProductNumeric;
    }

    public void setProductNumeric(int productNumeric) {
        ProductNumeric = productNumeric;
    }


    public long getTNVEDCode() {
        return TNVEDCode;
    }

    public void setTNVEDCode(long TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public float getGrossWeight() {
        return GrossWeight;
    }

    public void setGrossWeight(float grossWeight) {
        GrossWeight = grossWeight;
    }

    public float getNetWeight() {
        return NetWeight;
    }

    public void setNetWeight(float netWeight) {
        NetWeight = netWeight;
    }

    public float getAmountInvoice() {
        return AmountInvoice;
    }

    public void setAmountInvoice(float amountInvoice) {
        AmountInvoice = amountInvoice;
    }

    public int getCurrency() {
        return Currency;
    }

    public void setCurrency(int currency) {
        Currency = currency;
    }

    public String getCountryDispatchCode() {
        return CountryDispatchCode;
    }

    public void setCountryDispatchCode(String countryDispatchCode) {
        CountryDispatchCode = countryDispatchCode;
    }

    public String getOriginCountryCode() {
        return OriginCountryCode;
    }

    public void setOriginCountryCode(String originCountryCode) {
        OriginCountryCode = originCountryCode;
    }

    public float getTotalPackageQuantity() {
        return TotalPackageQuantity;
    }

    public void setTotalPackageQuantity(float totalPackageQuantity) {
        TotalPackageQuantity = totalPackageQuantity;
    }

    public String getPackCode() {
        return PackCode;
    }

    public void setPackCode(String packCode) {
        PackCode = packCode;
    }

    public float getCurrencyExchangeRates() {
        return CurrencyExchangeRates;
    }

    public void setCurrencyExchangeRates(float currencyExchangeRates) {
        CurrencyExchangeRates = currencyExchangeRates;
    }

    public int getStaticalCost() {
        return StaticalCost;
    }

    public void setStaticalCost(int staticalCost) {
        StaticalCost = staticalCost;
    }

    public int getCustomsCost() {
        return CustomsCost;
    }

    public void setCustomsCost(int customsCost) {
        CustomsCost = customsCost;
    }

    public String getDeclNum() {
        return DeclNum;
    }

    public void setDeclNum(String declNum) {
        DeclNum = declNum;
    }



}
