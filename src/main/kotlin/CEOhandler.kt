class CEOHandler(public var next1: Handler? = null, public var next2: Handler? = null): Handler
{
    override fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    {
        if(messageToBeProcessed.endsWith("1"))
        {
            println( "Sunt CEOHandler si am prelucrat mesajul "+ messageToBeProcessed)
            next2?.handleRequest("back","CEO a procesat")
        }
        else
            if(messageToBeProcessed.endsWith("2") || messageToBeProcessed.endsWith("3") || messageToBeProcessed.endsWith("4"))
                next1?.handleRequest(forwardDirection,messageToBeProcessed)
            else
                println("Sunt CEO. Taskul a fost realizat de: " + messageToBeProcessed)
    }
    override fun setNEXT(n1:Handler?, n2:Handler?)
    {
        next1 = n1
        next2 = n2
    }
}
