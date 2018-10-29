class Main {
  public boolean validateTask(boolean notEmpty,int taskId,int currentId)
  {
    if(notEmpty==true && taskId-currentId == 1)
    return true;
    else return false;
    
  }
}