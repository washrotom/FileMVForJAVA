import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//Files.move(soure, target, option);

public class FileMv {
	public static void main(String[] args) {
	}
}

//파일 메타데이터 확인
//폴더 없으면 -> 메타데이터 확인 해서 만듬. // long lastModified = file.lastModified();
class Move  {
	public void moveF(String Dir) {
		File sourceDir = new File(Dir); // 배열로 받은 Dir 를 File 객체로 변환
		File[] source_file = sourceDir.listFiles(); // Dir 에 있는 파일들을 파일객체 리스트 배열로 넣음.
	
		//날짜 데이타 형식 수정을 위한 코드
		String pattern = "yy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
		for(File file : source_file) {//File 객체 리스트 하나씩 읽어옴.
			File temp = new File(sourceDir.getAbsoluteFile() + File.separator + file.getName());
		
			long lastModified = temp.lastModified(); // 읽어온 파일에서 최근 수정날자 가져옴.
			Date lastModifiedDate = new Date( lastModified );
			String SlastModifiedDate = simpleDateFormat.format(pattern);
		
			String targetDir = Dir + SlastModifiedDate; // 디렉토리 만들기 위한 위치 + 날짜
		
			File dirmaker = new File(targetDir);
		
			dirmaker.mkdir();

	}
}
}

