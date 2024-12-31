import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem obj){
        if(obj != this) {
            fileSystemList.add(obj);
        }

    }

    @Override
    public void ls() {
        System.out.println("Directory name: "+ directoryName);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
        }


    }
}
