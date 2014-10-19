package com.lviv.jobsuma.component.base;


import com.lviv.jobsuma.componet.abstractelm.ExtendedFieldDecorator;
import com.lviv.jobsuma.page.BasePage;
import com.lviv.jobsuma.page.IndexPage;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author lvorozhbyt
 */
public class PageFactory {

    protected WebDriver driver;
    private DialogPageBuilder dialogBuilder;
    private ElementWrapper elementWrapper;
    
    private IndexPage indexPage;
     public IndexPage getIndexPage() {
        return (indexPage == null) ? initPage(indexPage = new IndexPage()) : indexPage;
    }
//    private MainPage mainPage;
//    private WarningDialogPage warningDialogPage;
//    private InformationDialogPage informationDialogPage;
//    private ManageWebServicesPage manageWebServicesPage;
//    private ActionSearchPage actionSearchPage;
//    private OptionalFieldsTabPage optionalFieldsTabPage;
//    private MilestonesTabPage milestonesTabPage;
//    private FileDocumentsTabPage fileDocumentsTabPage;
//    private AddFileDocumentsPage addFileDocumentsPage;
//    private DeleteFileDocumentDialogPage deleteFileDocumentDialogPage;
//    private EditOptionalFieldsPage editOptionalFieldsPage;
//    private EditScheduledDateMilestonesPage editScheduledDateMilestonesPage;
//    private EditCompletedDateMilestonesPage editCompletedDateMilestonesPage;
//    private EditAllDatesMilestonesPage editAllDatesMilestonesPage;
//    private ClearScheduledDatePage clearScheduledDatePage;
//    private AddWebServicePage addWebServicePage;
//    private EditWebServicePage editWebServicePage;
//    private DeleteWebServiceDialog deleteWebServiceDialog;
//    private ErrorDialogPage errorDialog;
//    private ClearCompletedDateMilestonesPage clearCompletedDateMilestonesPage;
//    private PostBillableItemMilestonesPage postBillableItemMilestonesPage;
//    private InvoiceSummaryMilestonesPage invoiceSummaryMilestonesPage;
//    private InvoiceDetailsPage invoiceDetailsPage;
//    private CalcDateMielstonePage calcDateMielstonePage;
//    private ManageQuoteTypesPage manageQuoteTypesPage;
//    private EditQuoteTypePage editQuoteTypePage;
//    private AddQuoteTypePage addQuoteTypePage;
//    private ManageWizardsPage manageManageWizardsPage;
//    private AddNewActionWizardPage addNewActionWizardPage;
//    private ManageMiscellaneousCostDescriptionPage manageMiscellaneousCostDescription;
//    private AddMiscellaneousCostDescriptionPage addMiscellaneousCostDescriptionPage;
//    private EditMiscellaneousCostDescriptionPage editMiscellaneousCostDescriptionPage;
//    private DeleteMiscellaneousCostDescriptionPage deleteMiscellaneousCostDescriptionPage;
//    private QuotesTabPage quotesTabPage;
//    private AddQuotePage addQuotePage;
//    private AddEditWizardPage addEditWizardPage;
//    private WizardsOfficesPage wizardsOfficesPage;
//    private GeneralTabPage generalTabPage;
//    private EditWizardPage editWizartPage;
//    private DocumentsTabPage documentsTabPage;
//    private AddDocumetsPage addDocumetsPage;
//    private ChangeWizardTypePage changeWizardTypePage;
//    private DeleteWizardPage deleteWizardPage;
//    private EditQuotePage editQuotePage;
//    private CreateFromExistingQuotePage createFromExistingQuotePage;
//    private DeleteQuotePage deleteQuotePage;
//    private WarningChangeWizardTypePage warningChangeWizardTypePage;
//    private CaseFileWizardPage caseFileWizardPage;
//    private SelectClientPage selectClientPage;
//    private EditAddressPage editAddressPage;
//    private NewActionWizardSelectionPage newActionWizardSelectionPage;
//    private WebPageDialog webPageDialog;
//    private AddQuoteFromWizardPage addQuoteFromWizardPage;
//    private EditQuoteFromWizardPage editQuoteFromWizardPage;
//    private EditWizardSelectionPage editWizardSelectionPage;
//    private WizardPage wizardPage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
        this.dialogBuilder = new DialogPageBuilder(this);
        this.elementWrapper = new ElementWrapper(driver);
    }

    public DialogPageBuilder getDialogBuilder() {
        return this.dialogBuilder;
    }

    public <E extends BasePage> E initPage(E page) {
            org.openqa.selenium.support.PageFactory.initElements(new ExtendedFieldDecorator(driver), page);
            page.setDriver(driver);
            page.setPageFactory(this);
            page.setElementWrapper(elementWrapper);
            return page;
        }
    }