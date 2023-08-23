package com.example.nytnews.data

import com.example.nytnews.model.Article
import com.example.nytnews.model.BookCategory
import com.example.nytnews.model.BookInfo

object NYTApiInstance {

    //    const val API_KEY = "kDdqWRo5BVGGSt5GDWT4DAT3G7IlFDdg"
//    private const val BASE_URL = "https://api.nytimes.com/svc/"
//
//    private val retrofit: Retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    val nytService: NYTService by lazy {
//        retrofit.create(NYTService::class.java)
//    }

    val businessArticleList = listOf(
        Article(
            "U.K. Inflation Eases to 6.8% as Energy Prices Fall",
            "The slowdown in price pressures comes as wages are rising at a record pace, which could lead to further increases in interest rates by the Bank of England.",
            "https://www.nytimes.com/2023/08/16/business/uk-inflation-july.html",
            "By Liz Alderman",
            "2023-08-16T03:08:44-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/16/multimedia/16uk-cpi-cflq/16uk-cpi-cflq-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/16/multimedia/16uk-cpi-cflq/16uk-cpi-cflq-threeByTwoSmallAt2X.jpg",
                "https://static01.nyt.com/images/2023/08/16/multimedia/16uk-cpi-cflq/16uk-cpi-cflq-thumbLarge.jpg"
            )
        ),
        Article(
            "Lebanon Freezes Accounts of Former Central Bank Governor",
            "The action comes days after a U.S.-led coalition accused Riad Salameh of decades of corruption to enrich himself at the expense of his country.",
            "https://www.nytimes.com/2023/08/16/business/lebanon-former-central-bank-governor-riad-salameh.html",
            "By Liz Alderman",
            "2023-08-16T06:00:23-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/16/world/16lebanon/16lebanon-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/16/world/16lebanon/16lebanon-thumbLarge.jpg"
            )
        ),
        Article(
            "Walmart Draws More Shoppers, Helping to Bolster the Economy",
            "The company raised its forecasts for revenue and profit this year, a sign that consumers, the engine of the U.S. economy, remain resilient.",
            "https://www.nytimes.com/2023/08/17/business/walmart-consumer-spending.html",
            "By Jordyn Holman",
            "2023-08-17T10:38:14-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/17/business/17walmart/17walmart-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/17/business/17walmart/17walmart-thumbLarge.jpg"
            )
        ),
        Article(
            "China Launches First Crew to New Space Station",
            "The Shenzhou-24 spacecraft is set to dock with the Tianhe core module of China's new space station, kicking off a mission expected to last about six months.",
            "https://www.nytimes.com/2023/08/16/science/china-space-station-crew-launch.html",
            "By Steven Lee Myers and Quoctrung Bui",
            "2023-08-16T09:47:02-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/16/science/16china-launch-1/16china-launch-1-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/16/science/16china-launch-1/16china-launch-1-thumbLarge.jpg"
            )
        ),
        Article(
            "How Europe Can Catch Up in the Chip Race",
            "Europe's chip industry lags in making the most advanced semiconductors, but the European Union is pouring money and investment into changing that.",
            "https://www.nytimes.com/2023/08/15/technology/europe-chip-industry-investment.html",
            "By Adam Satariano",
            "2023-08-15T10:00:14-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/14/business/14EUROPE-CHIPS-promo/14EUROPE-CHIPS-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/14/business/14EUROPE-CHIPS-promo/14EUROPE-CHIPS-promo-thumbLarge.jpg"
            )
        ),
        Article(
            "Drought Threatens to Empty Brazil’s Biggest Reservoir",
            "The historic dry spell in the region has left the Cantareira reservoir at less than 5 percent of its capacity, putting millions of people at risk.",
            "https://www.nytimes.com/2023/08/16/world/americas/brazil-drought-cantareira-reservoir.html",
            "By Letícia Casado and Manuela Andreoni",
            "2023-08-16T10:00:03-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/12/world/00brazil-drought-promo/00brazil-drought-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/12/world/00brazil-drought-promo/00brazil-drought-promo-thumbLarge.jpg"
            )
        ),
        Article(
            "Record Heat in the U.S. Southwest",
            "The heat wave, which has baked the Southwest for weeks, is putting power grids to the test and putting people in danger.",
            "https://www.nytimes.com/2023/08/16/us/record-heat-southwest-us.html",
            "By Henry Fountain",
            "2023-08-16T09:56:15-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/14/climate/14CLI-HEAT-promo/14CLI-HEAT-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/14/climate/14CLI-HEAT-promo/14CLI-HEAT-promo-thumbLarge.jpg"
            )
        ),
        Article(
            "After Taliban Takeover, Afghanistan Is Running Out of Food",
            "The country faces a food security crisis, exacerbated by drought and conflict, as the international community struggles to respond to the Taliban government.",
            "https://www.nytimes.com/2023/08/16/world/asia/afghanistan-food-shortage.html",
            "By David Zucchino and Fatima Faizi",
            "2023-08-16T06:00:21-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/14/world/16afghanistan-hunger-promo/16afghanistan-hunger-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/14/world/16afghanistan-hunger-promo/16afghanistan-hunger-promo-thumbLarge.jpg"
            )
        ),
        Article(
            "Italy Approves Plan to Curb Mafia’s Looting of Cultural Artifacts",
            "The government's plan includes investing in research, increasing law enforcement efforts, and improving international cooperation to combat the trafficking of stolen artifacts.",
            "https://www.nytimes.com/2023/08/15/world/europe/italy-mafia-cultural-artifacts.html",
            "By Elisabetta Povoledo",
            "2023-08-15T08:42:31-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/12/world/12ITALY-ARTIFACTS-promo/12ITALY-ARTIFACTS-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/12/world/12ITALY-ARTIFACTS-promo/12ITALY-ARTIFACTS-promo-thumbLarge.jpg"
            )
        ),
        Article(
            "K-pop Group BTS Signs Deal With McDonald's for Meal",
            "The band's meal will be available in 50 countries and is the latest collaboration between a fast-food company and a music superstar.",
            "https://www.nytimes.com/2023/08/16/business/bts-mcdonalds-meal.html",
            "By Melena Ryzik",
            "2023-08-16T07:50:47-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/16/business/16BTS/16BTS-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/16/business/16BTS/16BTS-thumbLarge.jpg"
            )
        ),
        Article(
            "Germany Struggles to Form Government Amid Political Uncertainty",
            "After inconclusive election results, the country's political parties are facing challenges in forming a coalition government, leading to uncertainty in German politics.",
            "https://www.nytimes.com/2023/08/16/world/europe/germany-coalition-government.html",
            "By Katrin Bennhold",
            "2023-08-16T11:40:58-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/15/world/15germany-politics-promo/15germany-politics-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/15/world/15germany-politics-promo/15germany-politics-promo-thumbLarge.jpg"
            )
        ),
        Article(
            "Vaccine Mandates Gain Traction in U.S. as Delta Variant Persists",
            "As the Delta variant continues to spread, more U.S. companies, cities, and states are imposing vaccine mandates to curb the virus's impact and encourage vaccinations.",
            "https://www.nytimes.com/2023/08/15/us/vaccine-mandates-delta-variant.html",
            "By Rebecca Robbins",
            "2023-08-15T14:47:58-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/15/us/15VIRUS-MANDATES-promo/15VIRUS-MANDATES-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/15/us/15VIRUS-MANDATES-promo/15VIRUS-MANDATES-promo-thumbLarge.jpg"
            )
        )
    )


    val autoMobileArticleList = listOf(
        Article(
            "Carvana, Used Car Dealer, Reaches Deal to Restructure Debt",
            "Most of the company’s bondholders have agreed to accept bonds as...",
            "https://www.nytimes.com/2023/07/19/business/carvana-apollo-debt-restructuring.html",
            "By Neal E. Boudette and Joe Rennison",
            "2023-07-19T06:37:50-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/19/multimedia/19CARVANA-02-hkgp/19CARVANA-02-hkgp-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/19/multimedia/19CARVANA-01/19CARVANA-01-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "How a Historian Uncovered His Past as an Undercover Cop",
            "After spending years as a leftist activist, Gary Potter switched sides and...",
            "https://www.nytimes.com/2023/07/19/us/how-a-historian-uncovered-his-past-as-an-undercover-cop.html",
            "By Matthew Kneale",
            "2023-07-19T10:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/16/multimedia/16Kneale1/16Kneale1-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/16/multimedia/16Kneale2/16Kneale2-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "Genetic Advances Help Parrots Outpace People in the Race for Evolution",
            "Scientists say parrots’ superior ability to evolve may help them survive...     ",
            "https://www.nytimes.com/2023/07/19/science/parrots-genetics.html",
            "By Carl Zimmer",
            "2023-07-19T08:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/15/multimedia/15parrots1/15parrots1-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/15/multimedia/15parrots1/15parrots1-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "What We Still Don’t Know About the Omicron Variant",
            "The rapid spread of Omicron late last year was...",
            "https://www.nytimes.com/2023/07/19/health/omicron-variant-questions.html",
            "By Apoorva Mandavilli",
            "2023-07-19T12:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/01/24/science/00VIRUS-OMICRON-QUESTIONS-promo/00VIRUS-OMICRON-QUESTIONS-promo-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/01/24/science/00VIRUS-OMICRON-QUESTIONS-promo/00VIRUS-OMICRON-QUESTIONS-promo-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "The Battle Over America’s 2000 Nuclear Warheads",
            "The standoff between the U.S. and Russia may be the ultimate test...",
            "https://www.nytimes.com/2023/07/19/us/politics/nuclear-warheads-arms-control.html",
            "By David E. Sanger and Edward Wong",
            "2023-07-19T10:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/14/us/00NUKES-PREVIEW-02/merlin_223746177_8066420c-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/14/us/00NUKES-PREVIEW-01/merlin_223746178_f7f4374e-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "Violence Spikes in Afghanistan as Talks Falter and U.S. Withdraws",
            "The surge in attacks has exposed a gap between the...",
            "https://www.nytimes.com/2023/07/19/world/asia/afghanistan-violence-taliban-talks.html",
            "By Thomas Gibbons-Neff and Mujib Mashal",
            "2023-07-19T10:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/18/world/18afghanistan/18afghanistan-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/18/world/18afghanistan/18afghanistan-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "In South Korea, K-Pop’s Biggest Stars Battle Image-Killing Scandals",
            "The K-pop industry is grappling with a series of...",
            "https://www.nytimes.com/2023/07/19/world/asia/south-korea-kpop-scandals.html",
            "By Choe Sang-Hun",
            "2023-07-19T09:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/18/world/18skorea-kpop/18skorea-kpop-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/18/world/18skorea-kpop/18skorea-kpop-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "Dozens of Children Die Every Year in Hot Cars. Could Technology Save Them?",
            "A moment of forgetfulness by a distracted or sleep-deprived parent can be devastating. Experts and child-safety advocates have called for interior motion sensors in all vehicles.",
            "https://www.nytimes.com/2023/08/10/us/hot-car-deaths-sensors.html",
            "By Michael Levenson",
            "2023-08-10T05:30:10-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/08/10/multimedia/10xp-hotcars-qvcj/10xp-hotcars-qvcj-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/08/10/multimedia/10xp-hotcars-qvcj/10xp-hotcars-qvcj-threeByTwoSmallAt2X.jpg"
            )
        ),
        Article(
            "China’s Growing Military Ambitions in Space",
            "In a milestone for China’s space program, its astronauts...",
            "https://www.nytimes.com/2023/07/19/china/china-space-military.html",
            "By Steven Lee Myers and Reed Epstein",
            "2023-07-19T10:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/18/world/18china-space1/18china-space1-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/18/world/18china-space1/18china-space1-mediumThreeByTwo225.jpg"
            )
        ),
        Article(
            "After Riot, Democrats Plan to Recall Tennessee Legislators",
            "Democrats in Tennessee say they are planning a recall...",
            "https://www.nytimes.com/2023/07/19/us/tennessee-recall-democrats.html",
            "By Rick Rojas",
            "2023-07-19T08:00:00-04:00",
            listOf(
                "https://static01.nyt.com/images/2023/07/18/multimedia/18tennessee-recall01/18tennessee-recall01-superJumbo.jpg",
                "https://static01.nyt.com/images/2023/07/18/multimedia/18tennessee-recall01/18tennessee-recall01-mediumThreeByTwo225.jpg"
            )
        )
    )


    val bookInfoList = listOf(
        BookInfo(
            "AMERICAN PROMETHEUS",
            "A biography of J. Robert Oppenheimer. Winner of the Pulitzer Prize in 2006 and an inspiration for the film “Oppenheimer.”",
            "Kai Bird and Martin J. Sherwin",
            "Vintage"
        ),
        BookInfo(
            "KILLERS OF THE FLOWER MOON",
            "The story of a murder spree in 1920s Oklahoma that targeted Osage Indians, whose lands contained oil.",
            "David Grann",
            "Doubleday"
        ),
        BookInfo(
            "OUTLIVE",
            "A look at recent scientific research on aging and longevity.",
            "Peter Attia with Bill Gifford",
            "Harmony"
        ),
        BookInfo(
            "THE WAGER",
            "The survivors of a shipwrecked British vessel on a secret mission during an imperial war with Spain have different accounts of events.",
            "David Grann",
            "Doubleday"
        ),
        BookInfo(
            "THE BODY KEEPS THE SCORE",
            "How trauma affects the body and mind, and innovative treatments for recovery.",
            "Bessel van der Kolk",
            "Penguin"
        ),
        BookInfo(
            "I'M GLAD MY MOM DIED",
            "The actress and filmmaker describes her eating disorders and difficult relationship with her mother.",
            "Jennette McCurdy",
            "Simon & Schuster"
        ),
        BookInfo(
            "EVERYTHING I KNOW ABOUT LOVE",
            "The British journalist shares stories and observations; the basis of the TV series.",
            "Dolly Alderton",
            "Harper Perennial"
        ),
        BookInfo(
            "BRAIDING SWEETGRASS",
            "A botanist and member of the Citizen Potawatomi Nation espouses having an understanding and appreciation of plants and animals.",
            "Robin Wall Kimmerer",
            "Milkweed Editions"
        ),
        BookInfo(
            "THE IN-BETWEEN",
            "A hospice nurse shares some of her most impactful experiences and questions some of society's beliefs around end-of-life care.",
            "Hadley Vlahos",
            "Ballantine"
        ),
        BookInfo(
            "BEYOND THE STORY",
            "An oral history of the K-pop group that is celebrating its 10th anniversary.",
            "BTS and Myeongseok Kang",
            "Flatiron"
        ),
        BookInfo(
            "BORN A CRIME",
            "A memoir about growing up biracial in apartheid South Africa by the host of “The Daily Show.”",
            "Trevor Noah",
            "One World"
        ),
        BookInfo(
            "ALL ABOUT LOVE",
            "The late feminist icon explores the causes of a polarized society and the meaning of love.",
            "bell hooks",
            "Morrow"
        ),
        BookInfo(
            "PRISONERS OF THE CASTLE",
            "The author of “The Spy and the Traitor” profiles Allied prisoners detained by the German Army in Colditz Castle during World War II.",
            "Ben Macintyre",
            "Crown"
        ),
        BookInfo(
            "CRYING IN H MART",
            "The daughter of a Korean mother and Jewish American father, and leader of the indie rock project Japanese Breakfast, describes creating her own identity after losing her mother to cancer.",
            "Michelle Zauner",
            "Vintage"
        ),
        BookInfo(
            "THE GLASS CASTLE",
            "The author recalls how she and her siblings were constantly moved from one bleak place to another.",
            "Jeannette Walls",
            "Scribner"
        )
    )


    val bookCategoryDataSets = listOf(
        BookCategory(
            "Combined Print & E-Book Nonfiction",
            "combined-print-and-e-book-nonfiction"
        ),
        BookCategory(
            "Hardcover Fiction",
            "hardcover-fiction"
        ),
        BookCategory(
            "Hardcover Nonfiction",
            "hardcover-nonfiction"
        ),
        BookCategory(
            "Paperback Trade Fiction",
            "trade-fiction-paperback"
        ),
        BookCategory(
            "Paperback Mass-Market Fiction",
            "mass-market-paperback"
        ),
        BookCategory(
            "Paperback Nonfiction",
            "paperback-nonfiction"
        ),
        BookCategory(
            "E-Book Fiction",
            "e-book-fiction"
        ),
        BookCategory(
            "E-Book Nonfiction",
            "e-book-nonfiction"
        ),
        BookCategory(
            "Hardcover Advice & Misc.",
            "hardcover-advice"
        ),
        BookCategory(
            "Manga",
            "manga"
        )
    )

}