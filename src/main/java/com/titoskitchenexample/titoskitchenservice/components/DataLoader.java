package com.titoskitchenexample.titoskitchenservice.components;

import com.titoskitchenexample.titoskitchenservice.models.Dessert;
import com.titoskitchenexample.titoskitchenservice.models.MainMeal;
import com.titoskitchenexample.titoskitchenservice.models.Starter;
import com.titoskitchenexample.titoskitchenservice.repositories.DessertRepository;
import com.titoskitchenexample.titoskitchenservice.repositories.MainMealRepository;
import com.titoskitchenexample.titoskitchenservice.repositories.StarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!Test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    StarterRepository starterRepository;

    @Autowired
    MainMealRepository mainMealRepository;

    @Autowired
    DessertRepository dessertRepository;

    public DataLoader(){};

    public void run(ApplicationArguments args){
        Starter grilledCuttlefish = new Starter("Double-eyed Cuttlefish Strips", "The nuclear devastation wrought by the Philosopher bombs resulted in cuttlefish with parallel inward facing eyes. The unfathomable depths of their own subjectivity make them all too eager to jump into the nets of the fishermen.", 12.95);
        starterRepository.save(grilledCuttlefish);

        Starter jonquillsSoup = new Starter("Jonquills Soup", "This hunter plant covered in spines that produce hallucinogenic fugues. Only certain religiously minded youth are entirely immune. Allergen warning: Should not be eaten by anyone with a guilty conscience or those over the age of 30.", 10.95);
        starterRepository.save(jonquillsSoup);

        Starter grecianDust = new Starter("Grecian Dust", "After the Pornographer/Philosopher War ravaged the forests, General Chambers proclaimed that the pollen of the hardy Hoplite Plant that grew around his fortress, will be the national dish. It is a bland dust, but a must try!", 11.95);
        starterRepository.save(grecianDust);

        Starter spillanEgg = new Starter("Spillan Egg", "Prime Minister Jackon Price carried a psychic bomb that activated upon his assassination. To this day the colony of Brillo bird call out, 'Spillan!', the name of his daughter, in an unnervingly human voice. Comes boiled or scrambled, but never poached.", 6.95);
        starterRepository.save(spillanEgg);

        MainMeal wiltedChassis = new MainMeal("Wilted Chassis (served with Greens)", "Side of Chassis Cat melted into a glass-like cube. Those that dream of this purple striped feline are considered suspicious, as if they might be an animal masquerading as a human. Never tell anyone your dreams.", 16.95);
        mainMealRepository.save(wiltedChassis);

        MainMeal fetidWeezilGrubs = new MainMeal("Fetid Weezil Grubs (served with Crispy Rice)", "General Chambers famously lied about this being his favourite meal. He didn't know it was a joke dish concocted by local peasants secretly loyal to the Pornographer faction. Liberally sprinkled with MSG, it is now considered fit for human consumption. ", 18.95);
        mainMealRepository.save(fetidWeezilGrubs);

        MainMeal theBigDeal = new MainMeal("The Big Deal", "The dead are only dreaming and we are that dream. This is not a metaphor in our culture and so we feed our ancestors' graves with great care lest they stop dreaming. We pour this chicken stew on our family grave every week. Contains human blood.", 17.95);
        mainMealRepository.save(theBigDeal);

        MainMeal heapedPork = new MainMeal("Heaped Pork", "During the war, a large pork factory on the Southern Shore was blown up by Pornographer terrorists. Hundreds of pigs washed up on beaches down the coast, burned on the outside and saturated with salt water. It is still made using the same process today.", 17.95);
        mainMealRepository.save(heapedPork);
//
        Dessert creamedOlives = new Dessert("Creamed Olives", "Made using a special technique that involves projecting intention upon a batch of olives until they are made to melt. Some say that this is a hoax perpetuated on the world by the Fomalhautian people. You make up your own mind.", 8.95);
        dessertRepository.save(creamedOlives);

        Dessert flavouredStones = new Dessert("Flavoured Stones with Rum", "This is how we remember. We sleep and dream with stones in our mouths.", 4.95);
        dessertRepository.save(flavouredStones);
    }
}
