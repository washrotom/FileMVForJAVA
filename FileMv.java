import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//Files.move(soure, target, option);

public class FileMv {
	public static void main(String[] args) {
	}
}

//���� ��Ÿ������ Ȯ��
//���� ������ -> ��Ÿ������ Ȯ�� �ؼ� ����. // long lastModified = file.lastModified();
class Move  {
	public void moveF(String Dir) {
		File sourceDir = new File(Dir); // �迭�� ���� Dir �� File ��ü�� ��ȯ
		File[] source_file = sourceDir.listFiles(); // Dir �� �ִ� ���ϵ��� ���ϰ�ü ����Ʈ �迭�� ����.
	
		//��¥ ����Ÿ ���� ������ ���� �ڵ�
		String pattern = "yy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
		for(File file : source_file) {//File ��ü ����Ʈ �ϳ��� �о��.
			File temp = new File(sourceDir.getAbsoluteFile() + File.separator + file.getName());
		
			long lastModified = temp.lastModified(); // �о�� ���Ͽ��� �ֱ� �������� ������.
			Date lastModifiedDate = new Date( lastModified );
			String SlastModifiedDate = simpleDateFormat.format(pattern);
		
			String targetDir = Dir + SlastModifiedDate; // ���丮 ����� ���� ��ġ + ��¥
		
			File dirmaker = new File(targetDir);
		
			dirmaker.mkdir();

	}
}
}

