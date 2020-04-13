package com.example.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_song_solution.*
import kotlinx.android.synthetic.main.activity_songs_information.*


/**
 * This class stores the whole information of the artist when user buys a song.
 */
class SongsInformation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs_information)

        val intent: Intent = getIntent()
        val information = intent.getStringExtra("key")

        val song1: String = "Ladbroke Grove"
        val song2: String = "Make It Shake"
        val song3: String = "Don't Call Me Angel"
        val song4: String = "Like A Rolling Stone"
        val song5: String = "Professor X"
        val song6: String = "Outnumbered"
        val song7: String = "3 Nights"
        val song8: String = "Take Me Back To London"
        val song9: String = "Your Song"
        val song10: String = "Sweet Child O Mine"
        val song11: String = "Both"
        val song12: String = "Sorry"
        val song13: String = "Imagine"
        val song14: String = "Be Honest"
        val song15: String = "Over The Rainbow"
        val song16: String = "Higher Love"
        val song17: String = "Stairway Of Heaven"
        val song18: String = "Ransom"
        val song19: String = "Billie Jean"
        val song20: String = "Smells Like Teen Spirit"
        val song21: String = "Live Forever"
        val song22: String = "Circles"
        val song23: String = "GoodByes"
        val song24: String = "Bohemian Rhapsody"
        val song25: String = "Ride it"
        val song26: String = "Satisfaction"
        val song27: String = "Post Malone"
        val song28: String = "How Do You Sleep"
        val song29: String = "God Save The Queen"
        val song30: String = "Senorita"
        val song31: String = "Hey Jude"
        val song32: String = "London Calling"
        val song33: String = "Hotel California"
        val song34: String = "Waterloo Sunset"
        val song35: String = "Dance Monkey"
        val song36: String = "One"
        val song37: String = "I Will Always Love You"
        val song38: String = "Strike A Pose"



        if (information.contentEquals(song1)) {
            val infoSong =
                "\nBorn in Brixton and raised in Ladbroke Grove, AJ Tracey has been rapping " +
                        "since the age of six.\n" + "\n" + "He was turned on to hip hop " +
                        "by his parents. His Trinidadian father had a " + "brief career as " +
                        "a rapper," + " while his mother used to be a pirate radio DJ. " + "“She’s " +
                        "white and Welsh" + " and she used to run NWA,” laughs the 22-year-old." +
                        "\n" + "\n" + "Initially performing under the name Looney, he adopted " +
                        "the " + "AJ Tracey persona in 2014. According to an interview on GRM, " +
                        "he chose the surname because of a hardman on his estate. " +
                        "“I thought, if a man has a girl’s name and he’s still scaring people, " +
                        "then maybe I should try doing it so I can be that guy.”\n" +
                        "\n" + "His first official release, Spirit Bomb, arrived in 2015, " +
                        "featuring lyrics about his lifestyle, an affair with a married woman, and " +
                        "references to Pokemon.\n" + "\n" + "The Alex Moran EP and a collaboration " +
                        "with fellow Sound of 2017 nominee Dave cemented his reputation, and in " +
                        "September he won best newcomer at the GRM Daily awards.\n" + "\n" +
                        "But he’s not letting fame go to his head. “With my first cheque from music," +
                        " I didn't even spend any of it,” he says. “I gave it all to my mum.”"
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song2)) {
            val infoSong = "\nAbout\n" +
                    "British independent rapper and songwriter who is known for his hit singles " +
                    "\"Taste (Make it Shake)\" and \"Miss Me With It.\" He has opened for several " +
                    "known rappers including Wiley and Cadet. \n" + "\n" + "Before Fame\n" +
                    "He started his career as a rapper by entering the freestyle scene in England. " +
                    "Then in September of 2017, he started uploading his freestyle videos and " +
                    "raps through his YouTube channel. \n" + "\n" + "Trivia\n" +
                    "He is known for having earned representation from the Primary Talent " +
                    "International agency. \n" + "\n" + "Family Life\n" + "His real name " +
                    "Harrison Armstrong. He was born and raised in New Moston, North Manchester. \n" +
                    "\n" +
                    "Associated With\n" +
                    "He performed alongside fellow rapper jaykae at the 2019 The Great Escape music " +
                    "festival in Brighton. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song3)) {
            val infoSong1 = "\nAriana Grande was born in Boca Raton, Florida, in 1993 " +
                    "and began " + "performing onstage when she was a child. Her involvement " +
                    "in a Broadway play at " + "age 15, followed by some small TV parts, helped her " +
                    "land the role of Cat on " + "TV's Victorious. She followed that with the " +
                    "spinoff Sam & Cat and then " + "dove headfirst into a chart-topping musical " +
                    "career, releasing five albums: " + "Yours Truly (2013), My Everything (2014)," +
                    " Dangerous Woman (2016), " + "Sweetener (2018) and Thank U, Next (2019). " +
                    "Her popularity has been fueled " + "by a strong social media presence on " +
                    "Instagram, Twitter and Facebook." + "Miley Cyrus: " + " After becoming a " +
                    "child television star playing the title character on the hit Disney series " +
                    "Hannah Montana, she went on to become an international pop star with such hit " +
                    "songs as \"Party in the U.S.A.\" and \"Wrecking Ball.\" In 2017, she served " +
                    "as a coach on The Voice."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song4)) {
            val infoSong1 = "\nAbout\n" +
                    "Legendary singer-songwriter who revolutionized folk music in the 1960's " +
                    "with albums such as The Freewheelin' Bob Dylan, Highway 61 Revisited, and " +
                    "Blonde on Blonde and songs such as \"The Times They Are a-Changin',\" " +
                    "\"Like a Rolling Stone,\" and \"Positively 4th Street.\"\n" + "\n" +
                    "Before Fame\n" + "Born Robert Zimmerman, he changed his name to Dylan after " +
                    "the poet Dylan Thomas. He was born into a Jewish family, but later converted " +
                    "to Christianity. While studying at the University of Minnesota, he became more " +
                    "enthused with folk music than rock and roll.\n" + "\n" +
                    "Trivia\n" +
                    "His 1975 protest song \"Hurricane,\" telling the story of the wrongfully " +
                    "imprisoned African-American boxer Rubin \"Hurricane\" Carter, is one of " +
                    "the most well known examples of activism through music. He won a Nobel " +
                    "Prize for Literature in 2016.\n" + "\n" + "Family Life\n" +
                    "He married Sara Dylan on November 22, 1965; after their divorce on June 29, " +
                    "1977, he married Carolyn Dennis on June 4, 1986. He has three daughters and " +
                    "three sons. One of his sons, Jakob, also became a singer and guitar player.\n" +
                    "\n" + "Associated With\n" + "He sang a duet with the great Johnny Cash " +
                    "titled \"Lay Lady Lay\" in 1969. "
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song5)) {
            val infoSong1 = "\nAbout\n" +
                    "South London rapper who became famous for his YouTube debut song, " +
                    "\"Black Box.\" His track \"JKL + HYD\" has over half a million hits " +
                    "and counting.\n" + "\n" + "Before Fame\n" +
                    "He studied philosophy, ethics law, and music in college. " +
                    "He dropped his first hit, \"Black Box,\" the same day he started college.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He was nominated for the Best Breakthrough Award at the KA & " +
                    "GRM Daily Awards in 2016.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He was born Dave Santan in South London. " +
                    "His brother, who is also a rapper, first got him into music.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He has a grime track called \"Thiago Silva\" " +
                    "with rapper AJ Tracey which has racked up over one million views on YouTube."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song6)) {
            val infoSong1 = "\nAbout\n" +
                    "Irish pop singer/songwriter who is best recognized for the 2016 single " +
                    "\"After Rain.\" The single would go on to be considered the catalyst of his " +
                    "career and garnered over 19 million streams on Spotify.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "Folk singer Glen Hansard offered him an opening slot at one " +
                    "of his sold out holiday shows.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He released an EP titled Doves & Ravens in 2017.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He is from Ireland.\n" +
                    "\n" +
                    "Associated With\n" +
                    "Both he and Lorde performed at the 2017 Bonnaroo music festival.\n" +
                    "\n"
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song7)) {
            val infoSong1 = "\nAbout\n" +
                    "American singer who shot to fame after dropping his debut EP Don't " +
                    "Forget About Me, Demos in 2018. The recording featured multiple viral " +
                    "hits including \"She Wants My Money\" and \"King of Everything.\"\n" +
                    "\n" +
                    "Before Fame\n" +
                    "Before releasing any music, he signed with Columbia Records after a " +
                    "bidding war between labels.\n" +
                    "\n" +
                    "Trivia\n" +
                    "The video for his single \"3 Nights\" topped 1 million views on " +
                    "YouTube after just a few months.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He posted a photo of his sister on Instagram in September 2018.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He became a client of the management company Tha Lights Global which " +
                    "also represents Lil Pump."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song8)) {
            val infoSong1 = "\nEd Sheeran:\n " + "\n" + "About\n" +
                    "Singer/songwriter who first gained attention for his hit 2011 song " +
                    "\"The A Team,\" which went 4x platinum. His 2014 single \"Thinking Out Loud\" " +
                    "earned him two Grammy Awards for Song of the Year and Best Pop Solo " +
                    "Performance.  \n" +
                    "\n" +
                    "Before Fame\n" +
                    "He moved to London when he was 16 to pursue a career in music and " +
                    "would play small gigs. He released his own EPs to gain exposure in the " +
                    "music industry. \n" +
                    "\n" +
                    "Trivia\n" +
                    "His album No. 5 Collaborations Project impressed both Elton John and Jamie Foxx" +
                    ". He co-wrote the song \"Moments,\" which the English boyband One Direction" +
                    " made famous.  \n" +
                    "\n" +
                    "Family Life\n" +
                    "His brother Matthew is also a singer. He is the cousin of TV presenter " +
                    "Gordon Burns and fellow musician Jethro Sheeran. He married Cherry Seaborn " +
                    "in 2018. He previously dated fellow singer Ellie Goulding. \n" +
                    "\n" +
                    "Associated With\n" +
                    "He collaborated with Taylor Swift on her album Red." + " Stromzy\n" + "\n" +
                    "About\n" +
                    "English rap and grime artist who first gained attention with his Wicked " +
                    "Skengman " +
                    "series of freestyles as well as songs like \"Not That Deep.\" He was named " +
                    "Best " +
                    "Grime Act at the MOBO Awards in 2014 and was included on the BBC's Sound of " +
                    "2015 " +
                    "list.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He was born in Thornton Heath, London and began battling MC's at local clubs " +
                    "at age 11.\n" +
                    "\n" +
                    "Trivia\n" +
                    "In October 2014, he became the first unsigned rapper ever to perform on Later " +
                    "with Jools Holland.\n" +
                    "\n" +
                    "Family Life\n" +
                    "His birth name is Michael Omari. He began dating TV show host Maya Jama in " +
                    "2015.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He has cited the rapper Wiley, a.k.a. The Godfather of Grime, as a key " +
                    "influence."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song9)) {
            val infoSong1 = "\nAbout\n" +
                    "Rock and roll legend who has sold over 250 million albums in a c" +
                    "areer that's spanned over 50 years. He is best known for such hit songs " +
                    "as \"Rocket Man,\" \"Tiny Dancer,\" \"Bennie and the Jets\" and \"Candle in " +
                    "the Wind." +
                    "\" In 2019, they released the film Rocketman based on his life.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He began playing the piano at age three and won a junior scholarship to the " +
                    "Royal Academy of Music.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He performed at Princess Diana's funeral at Westminster Abbey in 1997 and he " +
                    "was knighted by Queen Elizabeth II in 1998.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He married Renate Blauel on February 14, 1984, and they divorced on November " +
                    "18, 1988. He then married David Furnish on December 21, 2014. He has two sons " +
                    "named Zachary and Elijah.\n" +
                    "\n" +
                    "Associated With\n" +
                    "In 1974, he collaborated with John Lennon on a rendition of \"Lucy in the " +
                    "Sky with Diamonds.\" "
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song10)) {
            val infoSong1 = "\nAbout\n" +
                    "Iconic hard rock band whose debut album Appetite for Destruction hit " +
                    "number one on the Billboard 200 a year after its release. They are known for " +
                    "such hit songs as \"Sweet Child o' Mine,\" \"Paradise City\" and \"Welcome to" +
                    " the Jungle.\" \n" +
                    "\n" +
                    "Trivia\n" +
                    "Their 1993 album \"The Spaghetti Incident?\" was a compilation of " +
                    "cover songs. After its release, they didn't put out another album until " +
                    "2008's Chinese Democracy. "
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song11)) {
            val infoSong1 = "\nAbout\n" +
                    "One half of drill rapper duo Headie One & RV. He has over 160,000 followers " +
                    "on Instagram and he is repped by Starfish Entertainment.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He's done three stints in jail, but took the opportunity to expose himself " +
                    "to different types of music while there and used it to enhance his sound when " +
                    "got out.\n" +
                    "\n" +
                    "Trivia\n" +
                    "Headie One & RV released the popular mixtape Drillers and Trappers in 2017 has " +
                    "been the most successful collaboration between the two. He is also joined by " +
                    "Lowkey in the duo OFB. \n" +
                    "\n" +
                    "Family Life\n" +
                    "He was born and raised in North London.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He's collaborated with Mr Eazi."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song12)) {
            val infoSong1 = "\nAbout\n" +
                    "One half of drill rapper duo Headie One & RV. He has over 160,000 " +
                    "followers on Instagram and he is repped by Starfish Entertainment.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He's done three stints in jail, but took the opportunity to expose " +
                    "himself to different types of music while there and used it to enhance " +
                    "his sound when got out.\n" +
                    "\n" +
                    "Trivia\n" +
                    "Headie One & RV released the popular mixtape Drillers and Trappers " +
                    "in 2017 has been the most successful collaboration between the two. He is " +
                    "also joined by Lowkey in the duo OFB. \n" +
                    "\n" +
                    "Family Life\n" +
                    "He was born and raised in North London.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He's collaborated with Mr Eazi."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song13)) {
            val infoSong1 = "\nAbout\n" +
                    "Became one of the most influential songwriters in the history of " +
                    "popular music after co-founding The Beatles with Paul McCartney and " +
                    "George Harrison. He was a symbol of counterculture, promoting peace, activism " +
                    "and freedom of speech. After his time with The Beatles, he had success as a " +
                    "solo artist with the albums Plastic Ono Band and Imagine.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "His mother bought him his first guitar when he was sixteen, and he used it " +
                    "to play with The Quarrymen, a skiffle/rock group that would eventually evolve " +
                    "into The Beatles.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He released an album in 1980 with Yoko Ono entitled Double Fantasy. The album " +
                    "won the Grammy Award for Album of the Year.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He was married to Cynthia Lennon from 1962 until 1968. He then married Yoko " +
                    "Ono on March 20, 1969 up until his death in 1980. He had two children named " +
                    "Sean and Julian.\n" +
                    "\n" +
                    "Associated With\n" +
                    "Drummer Ringo Starr began playing with The Beatles after their original " +
                    "drummer, Pete Best, was fired by their manager."
            artistInfo.text = infoSong1!!.toString()
        }
        if (information.contentEquals(song14)) {
            val infoSong = "Jorja Smith:\n" + " \nAbout\n" +
                    "British R&B singer who is known for songs like \"Blue Lights\" and " +
                    "\"Where Did I Go?\" The music video for her song \"A Prince\" has over " +
                    "300,000 views on YouTube.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "She wrote her first song called “Life is a Path Worth Taking\" " +
                    "when she was 11 years old.\n" +
                    "\n" +
                    "Trivia\n" +
                    "She has amassed over 2.7 million followers on Instagram.\n" +
                    "\n" +
                    "Family Life\n" +
                    "Her father has been a singer in a neo-soul group called Second Nature.\n" +
                    "\n" +
                    "Associated With\n" +
                    "She collaborated with R&B singer Maverick Sabre on her song \"A Prince.\"" +
                    "Burna Boy\n" +
                    "\nAbout\n" +
                    "Nigerian vocalist and songwriter known for reggae and dancehall albums as " +
                    "L.I.F.E." +
                    " and Burn Notice. He was the recipient of a 2013 Nigeria Entertainment Award.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He rose to fame after releasing a May, 2012 single titled \"Like To Party.\"\n" +
                    "\n" +
                    "Trivia\n" +
                    "His most popular tracks include \"Tonight\" and \"Run My Race.\"\n" +
                    "\n" +
                    "Family Life\n" +
                    "Born Damini Ogulu, he was raised in Rivers State and Lagos State, Nigeria.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He and fellow Nigerian musician Patoranking both became famous for their " +
                    "work in the reggae-dancehall genre."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song15)) {
            val infoSong = "\nAbout\n" +
                    "Movie icon who played Dorothy in The Wizard of Oz and became the youngest " +
                    "winner of the Cecil B. DeMille Award for lifetime achievement at the age of 39" +
                    ". She was nominated for Academy Awards for her roles in the films A Star is " +
                    "Born and Judgment at Nuremberg. In 1969, at the age of 47, she died of a drug " +
                    "overdose. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "She began performing vaudeville at the age of two and a half. \n" +
                    "\n" +
                    "Trivia\n" +
                    "She received a Grammy Lifetime Achievement Award posthumously in 1997. \n" +
                    "\n" +
                    "Family Life\n" +
                    "She married her fifth husband, Mickey Deans, in 1969. Her children, Liza " +
                    "Minnelli and Lorna Luft, became singers and actors. \n" +
                    "\n" +
                    "Associated With\n" +
                    "She starred in the 1954 musical film A Star is Born with James Mason. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song16)) {
            val infoSong = "Kygo\n " + "\nAbout\n" +
                    "Norwegian DJ and producer who first gained fame for his remix of Seinabo Sey's" +
                    " \"Younger,\" which earned more than 80 million views on YouTube and " +
                    "SoundCloud. He has since released original songs such as \"Firestone\" " +
                    "and \"Stole the Show,\" collaborated with artists like Coldplay, Ellie " +
                    "Goulding and Diplo, and played sold out shows around the world. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "He started taking piano lessons at age six and began producing electronic " +
                    "music after discovering Avicii as a teenager. \n" +
                    "\n" +
                    "Trivia\n" +
                    "He teamed up with the EDM company Electric Family to create a specialized " +
                    "bracelet, the proceeds from which were donated to the charity organization " +
                    "Doctors Without Borders. \n" +
                    "\n" +
                    "Family Life\n" +
                    "His birth name is Kyrre Gorvell-Dahll. He was raised alongside his two older " +
                    "sisters, Johanne and Jenny, and a younger half-brother named Sondre.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He was commissioned by Coldplay frontman Chris Martin to create a remix for " +
                    "the band's single \"Midnight.\"" +
                    "Whitney Houston\n " + " \nAbout\n" +
                    "R&B and pop performer who became the most awarded female singer in history " +
                    "for hits such as \"Hold Me\" from her record-breaking self-titled album. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "She grew up in a musical family with cousin Dionne Warwick and her godmother " +
                    "Aretha Franklin.\n" +
                    "\n" +
                    "Trivia\n" +
                    "She created the soundtrack for and starred in the film The Bodyguard " +
                    "alongside Kevin Costner.\n" +
                    "\n" +
                    "Family Life\n" +
                    "She married Bobby Brown on July 18, 1992. They had a daughter named Bobbi " +
                    "and then divorced on April 24, 2007.\n" +
                    "\n" +
                    "Associated With\n" +
                    "She sang a duet with Mariah Carey on the song \"When You Believe\" in 1998."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song17)) {
            val infoSong = "\nAbout\n" +
                    "Their song \"Stairway to Heaven\" was named 31 on Rolling Stone's " +
                    "500 Greatest Songs of All Time. The band was entered into the Rock and Roll " +
                    "Hall of Fame in 1995. They parted ways in 1980, but had reunions in 1985, " +
                    "1988, 1995, and 2007.\n" +
                    "\n" +
                    "Trivia\n" +
                    "They were heavily influenced by blues musicians like Muddy Waters, Skip James, " +
                    "and the country blues sounds of Howlin' Wolf."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song18)) {
            val infoSong = "\nAbout\n" +
                    "Queens, New York rapper who first made a name for himself with the song " +
                    "\"tectri\" which he made in collaboration with his friend Lil Gummybear. " +
                    "In 2018, he released singles called \"My Time\" and \"Callin.\"\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He first starting rapping in the sixth grade, and began to take it more " +
                    "seriously in April 2017.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He established a strong Instagram presence of more than 1.9 million " +
                    "followers.\n" +
                    "\n" +
                    "Family Life\n" +
                    "His real name is Tyler Sharpe.\n" +
                    "\n" +
                    "Associated With\n" +
                    "His sound has been compared to that of Playboi Carti."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song19)) {
            val infoSong = "\nAbout\n" +
                    "The King of Pop who became the most successful singer in American " +
                    "history for releasing award-winning hits like \"Billie Jean\" and " +
                    "\"Beat It.\" \n" +
                    "\n" +
                    "Before Fame\n" +
                    "He first rose to prominence at the age of six singing with the family " +
                    "group The Jackson 5 alongside his brothers Jermaine, Tito, Marlon and " +
                    "Jackie Jackson. \n" +
                    "\n" +
                    "Trivia\n" +
                    "His 1982 album Thriller became the best-selling album in history, " +
                    "winning thirteen Grammy Awards and having thirteen songs reach #1 on " +
                    "the U.S. charts.  \n" +
                    "\n" +
                    "Family Life\n" +
                    "He got married to Lisa Marie Presley, the daughter of Elvis Presley, " +
                    "on May 26, 1994. After their divorce on January 18, 1996, he married " +
                    "Debbie Rowe on November 14, 1996. He had three children named Paris, " +
                    "Prince and Blanket.  \n" +
                    "\n" +
                    "Associated With\n" +
                    "He is the older brother of pop diva Janet Jackson. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song20)) {
            val infoSong = "\nAbout\n" +
                    "Grunge rock band who had their breakthrough hit with the 1991 single " +
                    "\"Smells Like Teen Spirit\" off their second album Nevermind. " +
                    "They have sold more than 75 million albums worldwide. \n" +
                    "\n" +
                    "Trivia\n" +
                    "Dave Grohl joined the band in 1990, making him the band's " +
                    "longest lasting drummer. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song21)) {
            val infoSong = "\nAbout\n" +
                    "Guinness World Records holders for Longest Top 10 UK Chart Run by a Group. " +
                    "They had 22 top ten hits in the UK. \n" +
                    "\n" +
                    "Trivia\n" +
                    "Their song \"Wonderwall\" was nominated for Best Rock Song at the 1997 Grammys." +
                    " The band broke up in 2009.\n" +
                    "\n" +
                    "Associated With\n" +
                    "Lead singer Liam Gallagher would later serve as the lead singer to the band " +
                    "Beady Eye. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song22)) {
            val infoSong = "\nAbout\n" +
                    "Rapper best known for his debut single \"White Iverson,\" " +
                    "which he followed up with songs called \"Too Young,\" \"Holyfield\" and " +
                    "\"Tears.\" He is also talented as a singer, producer and guitarist.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He started playing guitar in 2009 because of Guitar Hero. He taught himself " +
                    "through YouTube videos. He was in a high school hardcore band and began " +
                    "recording his own mixtape when he was 16.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He wrote \"White Iverson\" two days before recording it, and was never " +
                    "intending to record it when he first started writing the song.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He moved to Dallas, Texas when he was 10 years old. He was raised by his " +
                    "father, Rich, who worked for the Dallas Cowboys and his stepmother, Jodie. " +
                    "His father was a DJ growing up and inspired him. He has dated Ashlen Diaz, " +
                    "whom he met after she booked him for a show.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He collaborated with Quavo on the single \"Congratulations.\""
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song23)) {
            val infoSong = "Post Malone\n" + "\nAbout\n" +
                    "Rapper best known for his debut single \"White Iverson,\" " +
                    "which he followed up with songs called \"Too Young,\" \"Holyfield\" and " +
                    "\"Tears.\" He is also talented as a singer, producer and guitarist.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He started playing guitar in 2009 because of Guitar Hero. He taught " +
                    "himself through YouTube videos. He was in a high school hardcore band and " +
                    "began recording his own mixtape when he was 16.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He wrote \"White Iverson\" two days before recording it, and was never " +
                    "intending to record it when he first started writing the song.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He moved to Dallas, Texas when he was 10 years old. He was raised by his " +
                    "father, Rich, who worked for the Dallas Cowboys and his stepmother, Jodie. " +
                    "His father was a DJ growing up and inspired him. He has dated Ashlen Diaz, " +
                    "whom he met after she booked him for a show.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He collaborated with Quavo on the single \"Congratulations.\"" +
                    "Young Thug\n" +
                    "\nAbout\n" +
                    "Atlanta based rapper who gained notoriety in 2013 following the release " +
                    "of his mixtape 1017 Thug. He has collaborated with notable artists such as " +
                    "Rich Homie Quan, Cash Out and Shawty Lo.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He was signed by Gucci Mane's label 1017 Brick Squad Records after Mane " +
                    "listened to his first three mixtapes I Came From Nothing Parts 1, 2, and 3.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He was a part of the 25 New Rappers to Watch Out For list put out by " +
                    "Complex in 2013.\n" +
                    "\n" +
                    "Family Life\n" +
                    "His birth name is Jeffrey Williams. He had six children by four different " +
                    "women. In 2015, he got engaged to Jerrika Karlae; however, they would later " +
                    "break-up in 2017.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He performed at the same Fool's Day Off show as Trick Daddy in 2013."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song24)) {
            val infoSong = "\nAbout\n" +
                    "Known as Smile before Freddie Mercury entered the band, " +
                    "the group's most popular track \"Bohemian Rhapsody\" remained at number " +
                    "one on the UK charts for 9 weeks. Freddie Mercury died in 1991, but the " +
                    "band has toured since.\n" +
                    "\n" +
                    "Trivia\n" +
                    "The Magic Tour in 1986 was the band's last tour with Freddie Mercury. " +
                    "They received the Grammy Lifetime Achievement Award in 2018. Also in 2018, " +
                    "a biopic \nabout Mercury and the group called Bohemian Rhapsody was released " +
                    "starring Rami Malek."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song25)) {
            val infoSong = "\n\nAbout\n" +
                    "Electronic dance music DJ and producer who is predominantly recognized " +
                    "for his remix os the single \"Ride It.\" His rework began charting in 2019 " +
                    "after it became popular on the short form video app TikTok.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He began performing in the EDM genre in 2008.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He was professionally represented by LEAF Management. \n" +
                    "\n" +
                    "Family Life\n" +
                    "He was born in Kosovo.\n" +
                    "\n" +
                    "Associated With\n" +
                    "He and rapper Fero were both born in Kosovo. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song26)) {
            val infoSong = "\n\nAbout\n" +
                    "Classic rock band that was honored with the Grammy Lifetime Achievement " +
                    "Award in 1986, and was inducted into the Rock and Roll Hall of Fame in " +
                    "1989.\n" +
                    "\n" +
                    "Trivia\n" +
                    "Their most well known concert was the Altamont Free Concert at the " +
                    "Altamont Speedway in 1969 where a fan named Meredith Hunter was stabbed " +
                    "to death by a Hells Angel member."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song27)) {
            val infoSong = "Sam Feldt\n" + " \nAbout\n" +
                    "Dutch DJ who specializes in the up-and-coming genre of tropical house " +
                    "music.\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He grew up in Amsterdam.\n" +
                    "\n" +
                    "Trivia\n" +
                    "His remix of the song \"Show Me Love,\" featuring vocals by Kimberly Anne, " +
                    "reached #4 on UK charts.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He has posted Instagram pictures with his mother.\n" +
                    "\n" +
                    "Associated With\n" +
                    "Robin Schulz is another tropical house DJ.\n"
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song28)) {
            val infoSong = "\nAbout\n" +
                    "English pop artist who broke onto the dance scene as a featured artist on " +
                    "the 2012 single \"Latch\" by electronic duo Disclosure. " +
                    "They were named Best New Artist at the 2015 Grammys and their single " +
                    "\"Stay With Me\" won Song of the Year.   \n" +
                    "\n" +
                    "Before Fame\n" +
                    "They and their siblings were raised in the town of Bishops Stortford, " +
                    "Hertfordshire. They were a student at St. Mary's Catholic School before " +
                    "starting their singing career in 2012. \n" +
                    "\n" +
                    "Trivia\n" +
                    "Their vocals were also featured on the #1 Naughty Boy single \"La La La.\"\n" +
                    "\n" +
                    "Family Life\n" +
                    "Their father was a stay-at-home-dad and their mother, a successful banker. " +
                    "They came out as gay in May 2014 and began dating Jay Camilleri in 2016. " +
                    "They then had a relationship with Brandon Flynn from 2017 until 2018. " +
                    "They have also dated actor Jonathan Zeizel and dancer Khasan Brailsford.\n" +
                    "\n" +
                    "Associated With\n" +
                    "In March 2015, they recorded an alternate version of their single " +
                    "\"Lay Me Down,\" featuring vocals from John Legend."
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song29)) {
            val infoSong = "\nAbout\n" +
                    "Controversial band who's single \"God Saved the Queen\" " +
                    "reached number 2 on the UK Singles Chart. Backing vocalist " +
                    "and bassist Sid Vicious died in 1979. \n" +
                    "\n" +
                    "Trivia\n" +
                    "Their 1977 album Never Mind the Bollocks, " +
                    "Here's the Sex Pistols hit #1 on the UK chart and was certified " +
                    "2x Platinum int he UK and certified Platinum in the US. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song30)) {
            val infoSong = "Shawn Mendes\n" + "\nAbout\n" +
                    "First gained recognition on YouTube and Vine through " +
                    "his affiliation with the popular Vine group Magcon Boys " +
                    "alongside Nash Grier, Cameron Dallas and others. " +
                    "He released his first single \"Life of the Party\" in June 2014. " +
                    "His self-titled debut EP reached number one on the iTunes charts in " +
                    "under 40 minutes upon being released in July 2014. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "He created his popular YouTube channel in " +
                    "January 2011. He learned how to play the guitar " +
                    "through watching YouTube videos. \n" +
                    "\n" +
                    "Trivia\n" +
                    "He won the Best Cover of A Great " +
                    "Big World's \"Say Something\" competition over " +
                    "more than 30 other YouTubers. In 2014, he won a " +
                    "Teen Choice Award for Most Popular Web Star in the music category. \n" +
                    "\n" +
                    "Family Life\n" +
                    "He was born in Canada to Karen and Manuel Mendes. " +
                    "His sister Aaliyah had a lot of success on Vine as well. " +
                    "He began a relationship with Camila Cabello. \n" +
                    "\n" +
                    "Associated With\n" +
                    "He collaborated with Camila Cabello on the songs " +
                    "\"I Know What You Did Last Summer\" and \"Señorita.\" " +
                    "Camilla Cabello\n " + "\nAbout\n" +
                    "First appeared as a member of the girl group Fifth Harmony " +
                    "on the second season of The X Factor in 2012, finishing in the top 3. " +
                    "Fifth Harmony's debut 2013 single \"Miss Movin' On\" was certified gold. " +
                    "She left the group in 2016 and released her debut studio album Camila in 2018, " +
                    "which debuted at #1 on the Billboard 200 chart. Her 2017 hit song " +
                    "\"Havana\" has been certified 7x Platinum. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "She'd never performed in front of anyone until her first X Factor audition. \n" +
                    "\n" +
                    "Trivia\n" +
                    "As a solo artist, she has released singles such as \"I Know What You Did " +
                    "Last Summer\" and \"Bad Things,\" which both entered the top 20 on the " +
                    "Billboard's Hot 100.  \n" +
                    "\n" +
                    "Family Life\n" +
                    "She went back and forth between Havana, where she was born, and Mexico " +
                    "for the first 5 years of her life before moving to the U.S. Her parents " +
                    "are Alejandro and Sinuhe Cabello and she has a younger sister named Sofia. " +
                    "She began a relationship with Shawn Mendes in 2019. " +
                    "She previously dated Matthew Hussey for about a year. \n" +
                    "\n" +
                    "Associated With\n" +
                    "She performed alongside Ally Brooke, Lauren Jauregui, " +
                    "Dinah Jane Hansen, and Normani Kordei Hamilton in Fifth Harmony. "
            artistInfo.text = infoSong!!.toString()
        }
        if (information.contentEquals(song31)) {
            val infoSong = "\nAbout\n" +
                    "Iconic band that was on the forefront of the British Invasion " +
                    "in the 1960s, sparking the worldwide phenomenon known as \"Beatlemania." +
                    "\" They hold the record for the most number-one hits on the US Hot 100 " +
                    "chart and they are the best-selling band in history. \n" +
                    "\n" +
                    "Trivia\n" +
                    "The band's original name was The Quarrymen. They received an " +
                    "Academy Award for Best Music (Original Score) for 1971's Let It Be. "
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song32)) {
            val infoSong = "\nAbout\n" +
                    "Their main lineup lasted 1977 to 1982. Rolling Stone magazine " +
                    "called them the 28th greatest artist of all time. They entered the " +
                    "Rock and Roll Hall of Fame in 2003.\n" +
                    "\n" +
                    "Trivia\n" +
                    "Lead singer Joe Strummer died in 2002 of a heart defect. "
            artistInfo.text = infoSong!!.toString()
        }


        if (information.contentEquals(song33)) {
            val infoSong = "\nAbout\n" +
                    "Iconic rock band whose album Their Greatest Hits (1971-1975) " +
                    "became the highest selling album in the 20th century in the U.S., " +
                    "selling over 40 million copies. \n" +
                    "\n" +
                    "Trivia\n" +
                    "Four of their albums, One of These Nights, Hotel California, " +
                    "The Long Run, and Long Road Out of Eden, reached number 1 on the US charts. " +
                    "Five of their singles did the same. They also won 6 Grammy Awards. "
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song34)) {
            val infoSong =
                "The Kinks were formed in 1963 by two brothers, Ray and Dave Davies and at " +
                        "first were named the Ravens. Ray was the lead singer and sometimes " +
                        "played guitar, Dave was the lead guitarist. Ray's friend Peter Quaife " +
                        "join then and played bass and the drummer was Mickey Willett. The first " +
                        "song they recorded, Ray's \"I Took My Baby Home\" was sent to Pye Records " +
                        "in late '63 and they were signed to a contract in '64. Just before doing " +
                        "so, " + "Willett was replaced by Mick Avory on drums. They recorded " +
                        "their first single, a cover of Little Richard's \"Long Tall Sally\" and " +
                        "just before it's release renamed the group \"the Kinks\"."
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song35)) {
            val infoSong = "\nAbout\n" +
                    "Australian pop singer who is best recognized for going under the moniker " +
                    "Tones and I. She is best recognized for her popular singles \"Dance Monkey\", " +
                    "\"Never Seen the Rain\" and \"Johnny Run Away\", all of which were released " +
                    "in 2019. \n" + "\n" + "Before Fame\n" +
                    "She first started learning to play the keyboard and drum pad in high school. " +
                    "She then started busking on the streets of Melbourne and Byron " +
                    "Bay in 2018 until she won the Battle of the Buskers at Buskers " +
                    "By the Creek in 2018. She then went on to release her first single " +
                    "\"Johnny Run Away\" in March of 2019. \n" +
                    "\n" +
                    "Trivia\n" +
                    "She is also known for having made a guest appearance on the " +
                    "children's television series Toasted TV where she performed her song " +
                    "\"Dance Monkey\". \n" +
                    "\n" +
                    "Family Life\n" +
                    "She was born and raised in Mornington Peninsula, Australia and shared a photo " +
                    "with her cousin Cobey to her Instagram in January of 2014. \n" +
                    "\n" +
                    "Associated With\n" +
                    "Lij Gilmour is a fellow Australian pop singer who is also known " +
                    "for having appeared and performed as a guest on Toasted TV. "
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song36)) {
            val infoSong = "\nAbout\n" +
                    "Winner of 22 Grammy Awards. Their album The Joshua Tree obtained two " +
                    "of them and sold more than 25 million copies worldwide. The band was inducted " +
                    "into the Rock and Roll Hall of Fame in 2005.\n" +
                    "\n" +
                    "Trivia\n" +
                    "The 2009 to 2011 U2 360° Tour became the highest grossing concert tour of " +
                    "all time by taking in over \$700,000,000."
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song37)) {
            val infoSong = "Whitney Houston\n" + "\nAbout\n" +
                    "R&B and pop performer who became the most awarded female singer in " +
                    "history for hits such as \"Hold Me\" from her record-breaking self-titled " +
                    "album. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "She grew up in a musical family with cousin Dionne Warwick and her godmother " +
                    "Aretha Franklin.\n" +
                    "\n" +
                    "Trivia\n" +
                    "She created the soundtrack for and starred in the film The Bodyguard alongside " +
                    "Kevin Costner.\n" +
                    "\n" +
                    "Family Life\n" +
                    "She married Bobby Brown on July 18, 1992. They had a daughter named Bobbi " +
                    "and then divorced on April 24, 2007.\n" +
                    "\n" +
                    "Associated With\n" +
                    "She sang a duet with Mariah Carey on the song \"When You Believe\" in 1998."
            artistInfo.text = infoSong!!.toString()
        }

        if (information.contentEquals(song38)) {
            val infoSong = "Young T\n" + "\nAbout\n" +
                    "Hip-hop recording artist who rose to fame as one half of the duo Young T " +
                    "& Bugsey. The two are best known for songs such as \"Gangland,\" \"En Route," +
                    "\" and \"Living Gravy.\"\n" +
                    "\n" +
                    "Before Fame\n" +
                    "He met his rap partner Bugsey at the age of 15.\n" +
                    "\n" +
                    "Trivia\n" +
                    "He has been featured in a number of hip-hop publications such as Clash " +
                    "Magazine.\n" +
                    "\n" +
                    "Family Life\n" +
                    "He was born in England.\n" +
                    "\n" +
                    "Associated With\n" +
                    "His music has been supported by Justin Bieber. \n" +
                    "\n" + "Bugsey\n " + " \nAbout\n" +
                    "Hip-hop recording artist who rose to fame as one half of the duo " +
                    "Young T and Bugsey. He is recognized for singles such as \"No Mickey " +
                    "Mouse Ting,\" \"Living Gravy,\" and \"En Route.\" \n" +
                    "\n" +
                    "Before Fame\n" +
                    "He and Young T met at the age of 15. \n" +
                    "\n" +
                    "Trivia\n" +
                    "His \"Gangland\" single was written and recorded in just seven days.\n" +
                    "\n" +
                    "Family Life\n" +
                    "His parents were of Jamaican heritage.\n" +
                    "\n" +
                    "Associated With\n" +
                    "His music has been championed by fellow rapper Stormzy. " + "Aitch\n " + " \nAbout\n" +
                    "British independent rapper and songwriter who is known for his hit " +
                    "singles \"Taste (Make it Shake)\" and \"Miss Me With It.\" He has opened " +
                    "for several known rappers including Wiley and Cadet. \n" +
                    "\n" +
                    "Before Fame\n" +
                    "He started his career as a rapper by entering the freestyle scene in England. " +
                    "Then in September of 2017, he started uploading his freestyle videos and raps " +
                    "through his YouTube channel. \n" +
                    "\n" +
                    "Trivia\n" +
                    "He is known for having earned representation from the Primary Talent " +
                    "International agency. \n" +
                    "\n" +
                    "Family Life\n" +
                    "His real name Harrison Armstrong. He was born and raised in New Moston, " +
                    "North Manchester. \n" +
                    "\n" +
                    "Associated With\n" +
                    "He performed alongside fellow rapper jaykae at the 2019 The Great Escape " +
                    "music festival in Brighton. "
            artistInfo.text = infoSong!!.toString()
        }
    }
}