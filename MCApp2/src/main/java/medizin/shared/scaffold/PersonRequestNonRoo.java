package medizin.shared.scaffold;

import java.util.List;

import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.server.domain.Answer;
import medizin.server.domain.Person;



import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;

@Service(Person.class)
public interface PersonRequestNonRoo extends RequestContext {

	InstanceRequest<PersonProxy, Void> loginPerson();

	Request<PersonProxy> myGetLoggedPerson();
}

