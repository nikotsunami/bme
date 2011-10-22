package medizin.client.a_nonroo.app.place;


import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.PlaceHistoryMapperWithFactory;
import com.google.gwt.place.shared.WithTokenizers;

/**
 * This interface is the hub of your application's navigation system. It links
 * the {@link com.google.gwt.place.shared.Place Place}s your user navigates to with
 * the browser history system &mdash; that is, it makes the browser's back and
 * forth buttons work for you, and also makes each spot in your app
 * bookmarkable.
 * <p/>
 * <p/>
 * The simplest way to make new {@link com.google.gwt.place.shared.Place Place}
 * types available to your app is to uncomment the {@literal @}WithTokenizers
 * annotation below and list their corresponding
 * {@link com.google.gwt.place.shared.PlaceTokenizer PlaceTokenizer}s.
 * <p/>
 * <p/>
 * This code generated object looks to both the {@literal @}WithTokenizers
 * annotation and the factory to infer the types of
 * {@link medizin.client.scaffold.place.Place Place}s your app can navigate to. In
 * this case it will find the {@link McAppPlaceHistoryFactory#getProxyListPlaceTokenizer()} and
 * {@link McAppPlaceHistoryFactory#getProxyPlaceTokenizer()} methods, and so be able to handle
 * {@link medizin.client.scaffold.place.ProxyListPlace ProxyListPlace}s (which show
 * all entities of a particular type) and
 * {@link medizin.client.scaffold.place.ProxyPlace ProxyPlace}s (which give access to
 * an individual entity).
 */
// @WithTokenizers({PlaceSystemOverview.Tokenizer.class, 
//	 PlaceAcceptPerson.Tokenizer.class,
//	 PlaceAcceptAnswer.Tokenizer.class,
//	 PlaceAcceptAssQuestion.Tokenizer.class,
//	 PlaceAcceptQuestion.Tokenizer.class,
//	 PlaceAsignAssQuestion.Tokenizer.class,
//	 PlaceAssesment.Tokenizer.class,
//	 PlaceBookAssesment.Tokenizer.class,
//	 PlaceOpenDemand.Tokenizer.class,
//	 PlaceQuestion.Tokenizer.class,
//	 PlaceQuestiontypes.Tokenizer.class,
//	 PlaceQuestiontypesDetails.Tokenizer.class,
//	 PlaceStaticContent.Tokenizer.class,
//	 PlaceUser.Tokenizer.class,
//	 PlaceUserDetails.Tokenizer.class,
//	 PlaceInstitution.Tokenizer.class,
//	 PlaceQuestionEdit.Tokenizer.class,
//	 PlaceInstitutionEvent.Tokenizer.class,
//	 PlaceBookAssesmentDetails.Tokenizer.class})
	 
public interface McAppPlaceHistoryMapper  extends PlaceHistoryMapperWithFactory<McPlaceHistoryFactory>{
}
