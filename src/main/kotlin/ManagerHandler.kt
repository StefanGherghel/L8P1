class ManagerHandler(var next1: Handler? = null, var next2: Handler? = null): Handler
{
    override fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    {
        if(messageToBeProcessed.endsWith("3"))
        {
            println( "Sunt Manager Handler si am prelucrat mesajul "+ messageToBeProcessed)
            next2?.handleRequest("back","Manager a procesat")
        }
        else
            next1?.handleRequest(forwardDirection,messageToBeProcessed)
    }
    override fun setNEXT(n1:Handler?, n2:Handler?)
    {
        next1 = n1
        next2 = n2
    }
}
