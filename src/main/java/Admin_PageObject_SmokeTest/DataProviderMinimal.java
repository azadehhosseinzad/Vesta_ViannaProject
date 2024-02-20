package Admin_PageObject_SmokeTest;

import com.opencsv.CSVReader;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderMinimal {
	@DataProvider(name="InsertPresentedLesson")
	public Iterator<Object[]> insertPresentedLessonProvider() throws IOException{
		CSVReader reader= new CSVReader(new FileReader("D:/work/Vesta_ViannaProject/src/main/resources/data/CSVFile/CreateLesson/TestCase_PresentedLesson1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InserVideo")
	public Iterator<Object[]> insertvideoProvider() throws IOException{
		CSVReader reader= new CSVReader(new FileReader(".//src//main//resources//data//CSVFile//Video//Video-Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}	
	@DataProvider(name="InsertScorm-1")
	public Iterator<Object[]> insertscorm_1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/main/resources/data/CSVFile/Scorm/Scorm-Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();
	}
	@DataProvider(name="InsertH5p-1")
	public Iterator<Object[]> insertHp5_1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/main/resources/data/CSVFile/H5p/H5p_Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();
}
	@DataProvider(name="InsertFilecontent")
	public Iterator<Object[]> Filecontent_1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/FileContent/FileContent-Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();
}
	@DataProvider(name="InsertPractice_TC1")
	public Iterator<Object[]> insertPractice_1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/Practice/PracticeCreate_Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertForum_1")
	public Iterator<Object[]> insertAETC1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/Forum/Forum-Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertAutoExam_Mch1")
	public Iterator<Object[]> insertAEMch_1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/CreateAutoExam/AutoExamSc-Mch1.csv")
				,',','\'',1);
		
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertSurveyMatrix_1")
	public Iterator<Object[]> insertMatrixSurveyProvider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/MatrixSurvey/Create/Survey-Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertNormalSurvey_1")
	public Iterator<Object[]> insertNormalSurveyProvider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/NormalSurvey/Create/Survey-Testcase1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertQuestionoflesson")
	public Iterator<Object[]> insertQuestionProvider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/Question/AddQuestion.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertAutoExam")
	public Iterator<Object[]> insertAEMch1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/CreateAutoExam/AutoExamSc-Mch1.csv")
				,',','\'',1);
		
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertNormalExamMCH_TC1")
	public Iterator<Object[]> insertMCH1Provider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/CreateNormalExam/NormalExam_MCH_TC1.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertUser")
	public Iterator<Object[]> insertCreateuserProvider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader(".\\src\\main\\resources\\data\\CSVFile\\CreateUserWithExcel\\CreateUser.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	@DataProvider(name="InsertVirClass_TC1")
	public Iterator<Object[]> insertVirClassProvider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/VirClass/CreateVirClass.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	
	@DataProvider(name="InsertVirWithclass")
	public Iterator<Object[]> insertVirWithclassProvider() throws IOException{
		
		CSVReader reader= new CSVReader(new FileReader("./src/test/resources/data/CSVFile/VirClass/CreateVirClass _withClass.csv")
				,',','\'',1);
		List<Object[]>myEntries=new ArrayList<Object[]>();
		String[]nextLine;
		while((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);		
		}
		reader.close();
		return myEntries.iterator();

}
	}

