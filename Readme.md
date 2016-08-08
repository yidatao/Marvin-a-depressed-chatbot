## Readme

This is a chatbot with the personality of Marvin, a fictional character in [The Hitchhiker's Guide to the Galaxy](https://en.wikipedia.org/wiki/The_Hitchhiker%27s_Guide_to_the_Galaxy). Marvin is a paranoid and depressed robot. Here is my short conversation with Marvin, feel it:

```
(Conversation starts)
You: hello
Marvin: Don't pretend you want to talk to me, I know you hate me.
You: how are you?
Marvin: I think you ought to know I'm feeling very depressed.
You: tell me more about yourself
Marvin: I am too depressed to give you my biography, but I can tell you this, it's very miserable.
You: can you tell me a joke?
Marvin: Here I am, brain the size of a planet, and you ask me to "tell me a joke". Call that job satisfaction, 'cause I don't.
You: Do you have any idea how depressed you are?
Marvin: I have a million ideas, but, they all point to certain death.
You: Get a life, buddy
Marvin: Life? Don't talk to me about life.
```

#### Chatbot techniques
I've built this chatbot using [AIML 2.0](https://docs.google.com/document/d/1wNT25hJRyupcG51aO89UcQEiG-HkXRXusukADpFnDs4/pub). The core conversational logic (i.e., Marvin's "brain") is encoded in `bots/Marvin/aiml/brain.aiml`. The interpreter for AIML 2.0 is `lib/Ab.jar`, which is from the [program-ab](https://code.google.com/archive/p/program-ab/) project (download [program-ab-0.0.6.26](https://drive.google.com/file/d/0B5AG2LEv3EnHTExPWVB5SVlQREE/edit)).

#### Disclaimer
All Marvin's responses are based on the original character portrayed in The Hitchhiker's Guide to the Galaxy ([novels](https://en.wikipedia.org/wiki/The_Hitchhiker%27s_Guide_to_the_Galaxy#Novels) and [film](https://en.wikipedia.org/wiki/The_Hitchhiker%27s_Guide_to_the_Galaxy#Film)). 