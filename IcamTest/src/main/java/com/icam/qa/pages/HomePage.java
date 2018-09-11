package com.icam.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.icam.qa.base.TestBase;

public class HomePage extends TestBase {
	
	// @Author Saquib
	@FindBy(xpath="//*[@class='page-header']")
	//@FindBy(xpath="html/body/div[1]/div[2]/div[1]/section/div/section/div/div/div[1]/label[2]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Academics')]") public 
	WebElement academicLink;
	
	@FindBy(xpath="//a[contains(text(),'Courses')]")
	public WebElement courseLink;
	
	@FindBy(xpath="//a[@target='frame' and contains(text(),'Create Course Type')]") public 
	WebElement createCourseType;
	
	@FindBy(linkText="Create Standard & Section")
	public WebElement standardLink;
	
	@FindBy(linkText="Enter Standard Details")
	public WebElement enterStandardDetails;
	
	@FindBy(linkText="Standard Subject Mapping")
	WebElement subjectMappingLink; 
	
	@FindBy(xpath="//span[contains(text(),'Office Administration')]") public 
	WebElement officeAdminLinkForVendor;
	
	@FindBy(linkText="Office Administration")
	WebElement officeAdminLink;
	
	@FindBy(linkText="Academic Setup")
    WebElement academicSetup;
	
	@FindBy(linkText="Configure Financial Year")
	WebElement configFinancialYear;
	
	@FindBy(linkText="Vendor Management") public
    WebElement	vendorManagementLink;
	
	@FindBy(linkText="Add Vendor Type")
	WebElement vendorType;
	
	@FindBy(linkText="Office Administration")
	WebElement officeAdminLinkforStudentCreation;
	
	@FindBy(xpath="//a[contains(text(),'Student Management')]")
	WebElement studentManagementLink;
	
	@FindBy(linkText="Create Student")
	WebElement createStudent;
	
	@FindBy(linkText="Office Administration") public
	WebElement officeAdminLinkForFees;
	
	@FindBy(linkText="Fees Management") public
	WebElement feesManagement;
	
	@FindBy(linkText="Create Fees Structure") public
	WebElement createFeesStructure;
	
	@FindBy(linkText="Create Fees Template") public 
	WebElement templatelink;
	
	
	@FindBy(linkText="Assign Amount") public
	WebElement amount;
	
	@FindBy(linkText="Department")public
	WebElement departmentLink;
	
	@FindBy(linkText="Add Department")public
	WebElement addDepartment;
	
	@FindBy(linkText="Exam & Result")
	WebElement exam;
	
	@FindBy(linkText="New System")
	WebElement newSystem;
	
	@FindBy(linkText="Create Exam")
	WebElement createExam;
	
	@FindBy(linkText="Set Exam Marks")
	WebElement setExamMarksLink;
	
	@FindBy(linkText="Teacher-Standard Allotment")
	WebElement teacherSubjectAllotment;
	
	@FindBy(linkText="Map Teacher-Subject")
	WebElement mapTeacherSubject;
	
	@FindBy(linkText="Teacher-Subject Mapping List")
	WebElement mappingList;
	
	@FindBy(linkText="Teacher-Class Allotment")
	WebElement mapTeacherAllot;
	
	@FindBy(linkText="Map Teacher-Class")
	WebElement mapTeacherClass;
	
	@FindBy(linkText="Upload Result")
	WebElement upldRes;
	
	@FindBy(linkText="Payroll") public
	WebElement payrollLink;
	
	@FindBy(linkText="Employee Details")
	WebElement employeeDtlsLink;
	
	@FindBy(linkText="Enter Employee Details")
	WebElement enterEmployeeDtlsLink;
	
	@FindBy(linkText="Payroll SetUp") public
	WebElement payrollSetup;
	
	@FindBy(linkText="Add Designation Type")
	public WebElement designationType;
	
	@FindBy(linkText="Add Designation")
	public WebElement designationLink;
	
	@FindBy(linkText="Add Designation Level") public
	WebElement designationLevelLink;
	
	@FindBy(linkText="Designation Level Mapping")
	WebElement designationMappingLink;
	
	@FindBy(linkText="Job Type")
	public WebElement jobTypeLink;
	
	@FindBy(linkText="Salary Details") public
	WebElement salaryDetails;
	
	@FindBy(linkText="Salary BreakUp") public
	WebElement salaryBreakup;
	
	@FindBy(linkText="Inventory") public
	WebElement inventoryLink;
	
	@FindBy(linkText="Commodity Management")
	WebElement commodityManag;
	
	@FindBy(linkText="Add Commodity")
	WebElement addCommodity;
	
	@FindBy(linkText="Commodity Vendor Mapping") public
	WebElement commodityVendorMappingLink;
	
	@FindBy(linkText="Map Commodity Vendor") public
	WebElement mapComVendorLink;
	
	@FindBy(how=How.LINK_TEXT,using="Commodity PO")
	@CacheLookup WebElement CommodityPoLink;
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu']/ul/li[9]/ul/li[3]/ul/li[1]/a")
	@CacheLookup WebElement ComPo;
	
	@FindBy(how=How.LINK_TEXT,using="Commodity Allotment History")
	@CacheLookup WebElement commodityAllotHist;
	
	@FindBy(how=How.LINK_TEXT,using="Commodity Allocation And De-Allocation")
	WebElement DeAlloComm;
	
	@FindBy(how=How.LINK_TEXT,using="De-Allocate Commodity")
	WebElement DeAllocate;
	
	@FindBy(how=How.LINK_TEXT,using="Salary Template")
	WebElement salaryTemplateLink;
	
	@FindBy(how=How.LINK_TEXT,using="Disburse Salary")
	WebElement disburseSalary;
	
	@FindBy(how=How.LINK_TEXT,using="Bank Details")
	WebElement bankDetails;
	
	@FindBy(how=How.LINK_TEXT,using="School Bank details")
	WebElement schoolBankDetl;
	
	@FindBy(how=How.LINK_TEXT,using="Library")
	WebElement libraryLink;
	
	@FindBy(how=How.LINK_TEXT,using="Book Management")
	WebElement bookManagement;
	
	@FindBy(how=How.LINK_TEXT,using="Book Cataloging")
	WebElement bookCatalog;
	
	@FindBy(linkText="Facility & Venue Management")
	WebElement facilityVenueManagementLink;
	
	@FindBy(linkText="Location")
	WebElement location;
	
	@FindBy(linkText="Create Location")
	WebElement createLocation;
	
	@FindBy(linkText="Venue")
	WebElement venueLink;
	
	@FindBy(linkText="Create Venue")
	WebElement createVenue;
	
	@FindBy(linkText="Finance")
	WebElement financeLink;
	
	@FindBy(linkText="Budgeting")
	WebElement budgetingLink;
	
	@FindBy(linkText="Budget")
	WebElement budget;
	
	@FindBy(linkText="System Administration")
	WebElement systemAdmin;
	
	@FindBy(linkText="Roles")
	WebElement role;
	
	@FindBy(linkText="Create New Role")
	WebElement createNewRole;
	
	@FindBy(linkText="Functionality Role Mapping")
	WebElement funRolMapping;
	
	@FindBy(linkText="Map Role-Contact")
	WebElement mapRoleContact;
	
	@FindBy(linkText="My Services")
	WebElement myServiceLink;
	
	@FindBy(linkText="My Tickets")
	WebElement myTicket;
	
	@FindBy(linkText="Generate Ticket")
	WebElement generateTicket;
	
	@FindBy(linkText="Admission")
	WebElement admissionLink;
	
	@FindBy(linkText="Admission Openings")
	WebElement admsnOpening;
	
	@FindBy(linkText="Current Openings")
	WebElement cuOpening;
	
	@FindBy(linkText="Hostel")
	public WebElement hstlLink;
	
	@FindBy(linkText="Configure Hostel") public
	WebElement cfgHostel;
	
	@FindBy(linkText="Create Hostel Type") public
	WebElement crtHstlTyp;
	
	@FindBy(linkText="Create Hostel")
	public WebElement createHostel;
	
	@FindBy(linkText="Hostel Facility")
	WebElement hostelFacility;
	
	@FindBy(linkText="Add Hostel Facility")
	WebElement adHostelFacility;
	
	@FindBy(linkText="Room Type")
	WebElement roomType;
	
	@FindBy(linkText="Add Room Type")
	WebElement addRoomType;
	
	@FindBy(linkText="Room")
	WebElement room;
	
	@FindBy(linkText="Add Room in Hostel")
	WebElement roomInHostel;
	
	@FindBy(linkText="Student Assign")
	WebElement stndAssign;
	
	@FindBy(linkText="Assign Hostel to Student")
	WebElement hstlStdnt;
	
	@FindBy(linkText="Commodity Details")
	WebElement comDtls;
	
	@FindBy(linkText="Student")
	WebElement studentLink;
	
	@FindBy(linkText="Create Student Standard Subject Mapping")
	WebElement studentStndrdSubjctMap;
	
	@FindBy(linkText="Edit Student Standard Subject Mapping")
	WebElement edtstndSubMap;
	
	@FindBy(linkText="Interview Schedule")
	WebElement interviewScheduleLink;
	
	@FindBy(linkText="Schedule")
	WebElement schedule;
	
	@FindBy(linkText="Teacher Interview")
	WebElement teacherInterview;
	
	@FindBy(linkText="Configure Subject") public
	WebElement subjectLink;
	
	@FindBy(linkText="Create Subject") public
	WebElement createSubject;
	
	 @FindBy(linkText="Office Administration") public
	 WebElement ofcAdmin;
	 
	 @FindBy(linkText="Vendor Management") public
	 WebElement vm;
	 
	 @FindBy(linkText="Add Vendor") public
	 WebElement vndr;
	 
	 @FindBy(linkText="Admission Drives")
		WebElement admissionDrive;
		
	@FindBy(linkText="Current Drives")
		WebElement currentDrive;
	
	@FindBy(linkText="Active Drives")
	WebElement activeDrive;
		
	@FindBy(linkText="Admission Openings")
	WebElement admissionOpening;
	
	@FindBy(linkText="Admission On Process")
	WebElement admissionOnProcess;
	
	@FindBy(xpath="//a[contains(text(),'Approval')]")
	WebElement approvalLink;
	
	@FindBy(xpath="//a[contains(text(),'Task Configuration')]")
	WebElement taskConfigurationLink;
	
	@FindBy(xpath=".//*[@id='menu']/ul/li[12]/ul/li[18]/ul/li/ul/li[1]/a")
	WebElement createTaskLink;
	
	@FindBy(linkText="Create Category")
	WebElement createCategory;
	
	@FindBy(linkText="Create Ticket Status")
	WebElement ticketStatus;
	
	@FindBy(linkText="Create Task Status")
	WebElement taskStatus;
	
	@FindBy(linkText="Create Category Recipient")
	WebElement recipentGroup;
	
	@FindBy(linkText="Create Category Recipient")
	WebElement catRecipient;
	
	@FindBy(linkText="Examination")
	WebElement examLink;
	
	@FindBy(linkText="Upload Question Papers")
	WebElement uploadQstnPpr;
	
	@FindBy(linkText="Upload Assignment")
	WebElement uploadAssign;
	
	@FindBy(linkText="Promotional Exam")
	WebElement promotionalExam;
	
	@FindBy(linkText="Set Promotional Exam")
	WebElement setPExam;
	/*****************************************************************************************/
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		driver.switchTo().frame("frame");
		return userNameLabel.isDisplayed();
	}
	
	public CourseType clickOnAcademicLink(){
		
		academicLink.click();
		courseLink.click();
		createCourseType.click();

		return new CourseType();
	}
	
	public CreateStandard clickOnAcademicLinkForStandardAndSection(){
		academicLink.click();
		courseLink.click();
		standardLink.click();
		return new CreateStandard();
	}

	
	public StandardDetails clickOnEnterStandardDetails(){
		academicLink.click();
		courseLink.click();
		enterStandardDetails.click();
		return new StandardDetails();
	}
	
	public SubjectMapping clickOnSubjectMappingLink(){
		academicLink.click();
		courseLink.click();
		subjectMappingLink.click();
		return new SubjectMapping();
		
	}
	
	public CreateNewStudent clickOnNewStudent() throws InterruptedException{
		officeAdminLinkforStudentCreation.click();
		Thread.sleep(4000);
		studentManagementLink.click();
		createStudent.click();
		return new CreateNewStudent();
	}
	
	public CreateFeesStructure clickOnFeesManagement(){
		officeAdminLinkForFees.click();
		feesManagement.click();
		createFeesStructure.click();
		return new CreateFeesStructure();
	}
	
	public CreateFeeTemplate clickOnFeeTemplate(){
		officeAdminLinkForVendor.click();// This link is for feeTemplate
		feesManagement.click();
		templatelink.click();
		return new CreateFeeTemplate();
		
	}
	public AssignAmount clickOnAssignAmount(){
		officeAdminLinkForVendor.click();
		feesManagement.click();
		amount.click();
		return new AssignAmount();
	}
	
	public AddDepartment clickOnDepartment(){
		officeAdminLinkForVendor.click();
		departmentLink.click();
		addDepartment.click();
		return new AddDepartment();
	}
	
	public CreateExam clickOnCreateExam(){
		academicLink.click();
		exam.click();
		newSystem.click();
		createExam.click();
		return new CreateExam();
	}
	
	public SetExamMarks clickOnSetExamMarks(){
		academicLink.click();
		exam.click();
		newSystem.click();
		setExamMarksLink.click();
		return new SetExamMarks();
	}
	
	public MapTeacherSubject clickOnTeacherSubjectMapping(){
		academicLink.click();
		teacherSubjectAllotment.click();
		mapTeacherSubject.click();
		return new MapTeacherSubject();
	}
	
	public TeacherList clickOnTeacherList() {
		academicLink.click();
		teacherSubjectAllotment.click();
		mappingList.click();
		return new TeacherList();
	}

	public MapTeacherClass clickOnTeacherClass(){
		academicLink.click();
		mapTeacherAllot.click();
		mapTeacherClass.click();
		return new MapTeacherClass();
	}

	public UploadResult clickOnUploadResultLink(){
		academicLink.click();
		exam.click();
		newSystem.click();
		upldRes.click();
		return new UploadResult();
	}
	
	public EmployeeDetails clickOnEnterEmployeeDetailsLink(){
		payrollLink.click();
		employeeDtlsLink.click();
		enterEmployeeDtlsLink.click();
		return new EmployeeDetails();
	}

	public VendorType clickOnVendorManagement(){
		officeAdminLinkForVendor.click();
		vendorManagementLink.click();
		vendorType.click();
		return new VendorType();
	}
	
	/*public BasicIcamSetup clickOnBasicSetup(){
		systemAdmin.click();
		officeAdminLink.click();
		academicSetup.click();
		configFinancialYear.click();
		return new BasicIcamSetup();
	}*/
	
	public AddDesignationType clickOnDesignationType(){
		payrollLink.click();
		payrollSetup.click();
		designationType.click();
		return new AddDesignationType();
	}
	public AddDesignation clickOnDesignationLink(){
		payrollLink.click();
		payrollSetup.click();
		designationLink.click();
		return new AddDesignation();
		
	}
	public AddDesignationLevel clickOnDesignationLevellink(){
		payrollLink.click();
		payrollSetup.click();
		designationLevelLink.click();
		return new AddDesignationLevel();
	}
	public DesignationLevelMapping clickOnDesignationlevelMappingLink(){
		payrollLink.click();
		payrollSetup.click();
		designationMappingLink.click();
		return new DesignationLevelMapping();
	}
	public JobType clickOnJobTypeLink(){
		payrollLink.click();
		payrollSetup.click();
		jobTypeLink.click();
		return new JobType();
	}

//normal navigation flow
	public void navigateToJobTypeLink(){
		payrollLink.click();
		payrollSetup.click();
		jobTypeLink.click();
	}
	
	public AddCommodity clickOnAddCommodityLink(){
		inventoryLink.click();
		commodityManag.click();
		addCommodity.click();
		return new AddCommodity();
	}
	
	public MapVendorCommodity clickOnMapVendorLink(){
		inventoryLink.click();
		commodityVendorMappingLink.click();
		mapComVendorLink.click();
		return new MapVendorCommodity();
	}
	
	public CommodityPO clickOnCommodityPoLink(){
		inventoryLink.click();
		CommodityPoLink.click();
		ComPo.click();
		return new CommodityPO();
	}
	
	public CommodityAllotmentHistory clickOnCommodityAllotHist(){
		inventoryLink.click();
		commodityManag.click();
		commodityAllotHist.click();
		return new CommodityAllotmentHistory();
	}
	
	public DeAllocateCommodity clickOnDeAllocateCommodityLink(){
		inventoryLink.click();
		DeAlloComm.click();
		DeAllocate.click();
		return new DeAllocateCommodity();
	}
	
	public void clickOnSalaryTemplateLink(){
		payrollLink.click();
		salaryDetails.click();
		salaryTemplateLink.click();
	}
	
	public void clickOnDisburseSalaryLink(){
		payrollLink.click();
		salaryDetails.click();
		disburseSalary.click();
	}
	
	public void clickOnSchoolBankDetails(){
		officeAdminLinkForVendor.click();
		bankDetails.click();;
		schoolBankDetl.click();
	}
	
	public void clickOnBookCatalogLink(){
		libraryLink.click();;
		bookManagement.click();
		bookCatalog.click();
	}
	
	public void clickOnLocationLink(){
		facilityVenueManagementLink.click();
		location.click();
		createLocation.click();
	}
	
	public void clickOnVenueLink(){
		facilityVenueManagementLink.click();
		venueLink.click();
		createVenue.click();
	}
	
	public void clickOnBudgetLink(){
		
		financeLink.click();
		budgetingLink.click();
		budget.click();
	}
	public void clickOnSystemAdmin(){
		systemAdmin.click();
		role.click();
		createNewRole.click();
	}
	
	public void clickOnfunctionMappingLink(){
		systemAdmin.click();
		role.click();
		funRolMapping.click();
	}
	
	public void clickOnMpaRoleContact(){
		systemAdmin.click();
		role.click();
		mapRoleContact.click();
	}
	public void clickOnGenerateTicketLink(){
		myServiceLink.click();
		myTicket.click();
		generateTicket.click();
	}
	public void clickOnAdmissionOpeningLink(){
		admissionLink.click();
		admsnOpening.click();
		cuOpening.click();
	}
	
	public void clicOnHostelType(){
		hstlLink.click();
		cfgHostel.click();
		crtHstlTyp.click();
	}
    public void navigateToHostelLink(){
    	hstlLink.click();
    	cfgHostel.click();
    	createHostel.click();
    }
	
	public void clickOnHostelFacility(){
		hstlLink.click();
		hostelFacility.click();
		adHostelFacility.click();
	}
	
	public void clickOnRoomTypeLink(){
		hstlLink.click();
		roomType.click();
		addRoomType.click();
	}
	
	public void clickOnAddRoomInHostelLink(){
		hstlLink.click();
		room.click();
		roomInHostel.click();
	}
	
	public void clickOnAssignStudentLink(){
		hstlLink.click();
		stndAssign.click();
		hstlStdnt.click();
	}
	public void clickOncommodityDetailsLink(){
		 inventoryLink.click();
		 commodityManag.click();
		 comDtls.click();
	}
	
	public void ClickOnStudentStandardSubjectMapping(){
		academicLink.click();
		studentLink.click();
		studentStndrdSubjctMap.click();
	}
	public void clickOnEditStudentSubjctMapng(){
		academicLink.click();
		studentLink.click();
		edtstndSubMap.click();
	}
	
	public void clickOnTeacherInterviewSchedule(){
		payrollLink.click();
		interviewScheduleLink.click();
		schedule.click();
	}
	
	public void clickOnTeacherInterviewLink(){
		payrollLink.click();
		interviewScheduleLink.click();
		teacherInterview.click();
		
	}
	 public void clickOnCreateSubjectLink(){
		 academicLink.click();
		 subjectLink.click();
		 createSubject.click();
	 }
	 
	 public void clickOnNewVendorLink(){
		 ofcAdmin.click();
		 vm.click();
		 vndr.click();
	 }
	
	
    
	 public SalaryBreakUp clickOnsalaryBreakup(){
		payrollLink.click();
		salaryDetails.click();
		salaryBreakup.click();
		return new SalaryBreakUp();
	}
	
	public ActiveDrive clickOnAdmissionDrive(){
		admissionLink.click();
		admissionDrive.click();
		activeDrive.click();
		return new ActiveDrive();
	}
	
	public AdmissionOnProcess clickOnAdmissionOnProcessLink(){
		admissionLink.click();
		admissionOpening.click();
		admissionOnProcess.click();
		return new AdmissionOnProcess();
	}
	
	
	public void clickOnApprovalLink(){
		officeAdminLink.click();
		approvalLink.click();
		taskConfigurationLink.click();
		createTaskLink.click();
		
	}
	
	public void clickOnCreateCategoryLink(){
		officeAdminLink.click();
		approvalLink.click();
		taskConfigurationLink.click();
		createCategory.click();
	}
	
	public void clickOnTicketStatusLink(){
		officeAdminLink.click();
		approvalLink.click();
		taskConfigurationLink.click();
		ticketStatus.click();
	}
	
	public void clickOnTaskStatusLink(){
		officeAdminLink.click();
		approvalLink.click();
		taskConfigurationLink.click();
		taskStatus.click();
	}
	
	public void clickOnRecipientGroupLink(){
		officeAdminLink.click();
		approvalLink.click();
		taskConfigurationLink.click();
		recipentGroup.click();
	}
	
	public void clickOnCreateCategoryRecipientLink(){
		officeAdminLink.click();
		approvalLink.click();
		taskConfigurationLink.click();
		catRecipient.click();
	}
	
	public void clickOnUploadQuestionPaper(){
		academicLink.click();
		examLink.click();
		uploadQstnPpr.click();
		
	}
	
	public void clickOnUploadAssignment(){
		academicLink.click();
		examLink.click();
		uploadAssign.click();
		
	}
	
	public void clickOnSetPromotionalExamLink(){
		academicLink.click();
		promotionalExam.click();
		setPExam.click();
		
	}
	
	
	
	
	
	
}
