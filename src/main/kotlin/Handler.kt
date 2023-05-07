interface Handler
{
    fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    fun setNEXT(n1:Handler?, n2:Handler?)

}