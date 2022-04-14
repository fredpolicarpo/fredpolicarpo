## Draft
I've been building a risk-platform service that evaluates 50K/day applications using a lot of third-party integrations like bureaus and risk-analysis services, in a system strongly based on DDD, and event-driven with Kafka. That is very challenging due to different third parties requiring special error handling and also dealing with reactive/event-driven systems require a lot of care to keep the system consistent working with great resilience. This project is very important for the company as it has as the outcome flag customers as secure or not, so we directly affect the company cash.

I have a mature notion of ownership in a way where I get involved since the idea about what we need to do to solve the user's problem, until monitor and operate the delivery after it got to production.

I've been developed a clear and confident communication with all stakeholders and team, so I've been naturally recognized with a Team leader and I can work properly close to manager/directors/C levels in order to help to improve the engineering culture in a way to have fast delivery balanced with long-term thought about the company main goals. These communication skills are based on agile methodologies that I've been worked with like Scrum, XP, ShapeUp, and Kanban. 

I'm very pragmatic so I always build a set of tools and strategies to develop fast and with the proper quality to solve the real problems that the companies and products require.

## Main (short description)
_TO DO_

## ADDI
I'm building a Risk Platform for the Addi's envrionment. So I'm integrating with some third-parties, in order to collect relavant data that can be used to evaluate if a customer is safe or have some risk associated with.

So here, I've been integrated with systems like: Google Maps API, Iovation(To evaluate device risk), Telesign(To evaluate risk based on the phone number, like SIM Swap and Porting History), Bureaus, EmailAge(Risk based on the e-mail) and Neuro ID(To evaluate the navigation behavior).

It is challenging because each of this providers have their way to integrate, so we build a flexible architecture to make easy to integrate this services, a kind of plug and play architecture.

I would highlight the use of feature toggles, that is imporant for both: the testing phase, and the operation.

As this list of providers don't intend to stop growing, we built here some good partices to monitor it. So we normalize the logs for the requests we do, the responses we receive, and with that we've created normalized monitoring bords and alerts based on status codes of the responses of the callings for this third-parties.

Another highlight is about the communication process with the stackeholders, as the tools were kind of new for everyone, it was required constant communication, validatiom of ideas, continues delivery in a copule of cycles/sprints to achieve the final goal, and I've very proud the way I'm doing it in the team, I consider we are agile and doing a good colaborative work.


#### What I would do differently?

I think if I need to work in a project like that again, I would work a bit upfront in the monitoring definitions. I mean, in that project, we've normalized the monitoring after some months, in the begining the monitring and error handling were a bit harder sometimes. So I believe that with a considerably few effort we can be prepared to do a good monitoring and operation since day 1 in production. And this simple thing would be a big difference in the project produtivity, as it would allow us to delivery fast and condidently and then reduce the cycles of validation and improvment of the product.


## WILL BANK
_TO DO_

## EBANX
_TO DO_

## ZG
_TO DO_

## FIBONACCI
_TO DO_
