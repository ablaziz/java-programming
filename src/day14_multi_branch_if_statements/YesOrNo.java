package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer;
        String result;
        int deletedFiles;
        if(selection== 'y'){
            System.out.println("Your file will be deleted");
            answer=true;
            result = "deleted";
            deletedFiles = 1;
        }else{
            System.out.println("file deletion canceled");
            answer=false;
            result = "not deleted";
        }
        System.out.println("Did file get deleted? - " + answer);
        System.out.println("Did file get deleted? - " + result);

    }
}
