package medizin.client.a_nonroo.app.place;

import com.google.gwt.place.impl.AbstractPlaceHistoryMapper;
import medizin.client.a_nonroo.app.place.McAppPlaceHistoryMapper;
import medizin.client.a_nonroo.app.place.McPlaceHistoryFactory;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.impl.AbstractPlaceHistoryMapper.PrefixAndToken;
import com.google.gwt.core.client.GWT;

public class McAppPlaceHistoryMapperImpl extends AbstractPlaceHistoryMapper<McPlaceHistoryFactory> implements McAppPlaceHistoryMapper {
  
  protected PrefixAndToken getPrefixAndToken(Place newPlace) {
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAcceptAnswer) {
      medizin.client.a_nonroo.app.place.PlaceAcceptAnswer place = (medizin.client.a_nonroo.app.place.PlaceAcceptAnswer) newPlace;
      return new PrefixAndToken("PlaceAcceptAnswer", factory.getPlaceAcceptAnswerTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion) {
      medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion place = (medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion) newPlace;
      return new PrefixAndToken("PlaceAcceptAssQuestion", factory.getPlaceAcceptAssQuestionTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAcceptPerson) {
      medizin.client.a_nonroo.app.place.PlaceAcceptPerson place = (medizin.client.a_nonroo.app.place.PlaceAcceptPerson) newPlace;
      return new PrefixAndToken("PlaceAcceptPerson", factory.getPlaceAcceptPersonTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAcceptQuestion) {
      medizin.client.a_nonroo.app.place.PlaceAcceptQuestion place = (medizin.client.a_nonroo.app.place.PlaceAcceptQuestion) newPlace;
      return new PrefixAndToken("PlaceAcceptQuestion", factory.getPlaceAcceptQuestionTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion) {
      medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion place = (medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion) newPlace;
      return new PrefixAndToken("PlaceAsignAssQuestion", factory.getPlaceAsignAssQuestionTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAssesment) {
      medizin.client.a_nonroo.app.place.PlaceAssesment place = (medizin.client.a_nonroo.app.place.PlaceAssesment) newPlace;
      return new PrefixAndToken("PlaceAssesment", factory.getPlaceAssesmentTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceAssesmentDetails) {
      medizin.client.a_nonroo.app.place.PlaceAssesmentDetails place = (medizin.client.a_nonroo.app.place.PlaceAssesmentDetails) newPlace;
      return new PrefixAndToken("PlaceAssesmentDetails", factory.getPlaceAssesmentDetailsTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceBookAssesment) {
      medizin.client.a_nonroo.app.place.PlaceBookAssesment place = (medizin.client.a_nonroo.app.place.PlaceBookAssesment) newPlace;
      return new PrefixAndToken("PlaceBookAssesment", factory.getPlaceBookAssesmentTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails) {
      medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails place = (medizin.client.a_nonroo.app.place.PlaceBookAssesmentDetails) newPlace;
      return new PrefixAndToken("PlaceBookAssesmentDetails", factory.getPlaceBookAssesmentDetailsTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceInstitution) {
      medizin.client.a_nonroo.app.place.PlaceInstitution place = (medizin.client.a_nonroo.app.place.PlaceInstitution) newPlace;
      return new PrefixAndToken("PlaceInstitution", factory.getPlaceInstitutionTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceInstitutionEvent) {
      medizin.client.a_nonroo.app.place.PlaceInstitutionEvent place = (medizin.client.a_nonroo.app.place.PlaceInstitutionEvent) newPlace;
      return new PrefixAndToken("PlaceInstitutionEvent", factory.getPlaceInstitutionEventTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceOpenDemand) {
      medizin.client.a_nonroo.app.place.PlaceOpenDemand place = (medizin.client.a_nonroo.app.place.PlaceOpenDemand) newPlace;
      return new PrefixAndToken("PlaceOpenDemand", factory.getPlaceOpenDemandTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceQuestion) {
      medizin.client.a_nonroo.app.place.PlaceQuestion place = (medizin.client.a_nonroo.app.place.PlaceQuestion) newPlace;
      return new PrefixAndToken("PlaceQuestion", factory.getPlaceQuestionTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceQuestionDetails) {
      medizin.client.a_nonroo.app.place.PlaceQuestionDetails place = (medizin.client.a_nonroo.app.place.PlaceQuestionDetails) newPlace;
      return new PrefixAndToken("PlaceQuestionDetails", factory.getPlaceQuestionDetailsTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceQuestionEdit) {
      medizin.client.a_nonroo.app.place.PlaceQuestionEdit place = (medizin.client.a_nonroo.app.place.PlaceQuestionEdit) newPlace;
      return new PrefixAndToken("PlaceQuestionEdit", factory.getPlaceQuestionEditTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceQuestiontypes) {
      medizin.client.a_nonroo.app.place.PlaceQuestiontypes place = (medizin.client.a_nonroo.app.place.PlaceQuestiontypes) newPlace;
      return new PrefixAndToken("PlaceQuestiontypes", factory.getPlaceQuestiontypesTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails) {
      medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails place = (medizin.client.a_nonroo.app.place.PlaceQuestiontypesDetails) newPlace;
      return new PrefixAndToken("PlaceQuestiontypesDetails", factory.getPlaceQuestiontypesDetailsTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceStaticContent) {
      medizin.client.a_nonroo.app.place.PlaceStaticContent place = (medizin.client.a_nonroo.app.place.PlaceStaticContent) newPlace;
      return new PrefixAndToken("PlaceStaticContent", factory.getPlaceStaticContentTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceSystemOverview) {
      medizin.client.a_nonroo.app.place.PlaceSystemOverview place = (medizin.client.a_nonroo.app.place.PlaceSystemOverview) newPlace;
      return new PrefixAndToken("PlaceSystemOverview", factory.getPlaceSystemOverviewTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceUser) {
      medizin.client.a_nonroo.app.place.PlaceUser place = (medizin.client.a_nonroo.app.place.PlaceUser) newPlace;
      return new PrefixAndToken("PlaceUser", factory.getPlaceUserTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceUserDetails) {
      medizin.client.a_nonroo.app.place.PlaceUserDetails place = (medizin.client.a_nonroo.app.place.PlaceUserDetails) newPlace;
      return new PrefixAndToken("PlaceUserDetails", factory.getPlaceUserDetailsTokenizer().getToken(place));
    }
    if (newPlace instanceof medizin.client.a_nonroo.app.place.PlaceUserDetailsEvent) {
      medizin.client.a_nonroo.app.place.PlaceUserDetailsEvent place = (medizin.client.a_nonroo.app.place.PlaceUserDetailsEvent) newPlace;
      return new PrefixAndToken("PlaceUserDetailsEvent", factory.getPlaceUserDetailsEventTokenizer().getToken(place));
    }
    return null;
  }
  
  protected PlaceTokenizer<?> getTokenizer(String prefix) {
    if ("PlaceBookAssesment".equals(prefix)) {
      return factory.getPlaceBookAssesmentTokenizer();
    }
    if ("PlaceAsignAssQuestion".equals(prefix)) {
      return factory.getPlaceAsignAssQuestionTokenizer();
    }
    if ("PlaceQuestionEdit".equals(prefix)) {
      return factory.getPlaceQuestionEditTokenizer();
    }
    if ("PlaceAcceptPerson".equals(prefix)) {
      return factory.getPlaceAcceptPersonTokenizer();
    }
    if ("PlaceBookAssesmentDetails".equals(prefix)) {
      return factory.getPlaceBookAssesmentDetailsTokenizer();
    }
    if ("PlaceQuestion".equals(prefix)) {
      return factory.getPlaceQuestionTokenizer();
    }
    if ("PlaceUserDetails".equals(prefix)) {
      return factory.getPlaceUserDetailsTokenizer();
    }
    if ("PlaceQuestiontypesDetails".equals(prefix)) {
      return factory.getPlaceQuestiontypesDetailsTokenizer();
    }
    if ("PlaceInstitution".equals(prefix)) {
      return factory.getPlaceInstitutionTokenizer();
    }
    if ("PlaceStaticContent".equals(prefix)) {
      return factory.getPlaceStaticContentTokenizer();
    }
    if ("PlaceAcceptQuestion".equals(prefix)) {
      return factory.getPlaceAcceptQuestionTokenizer();
    }
    if ("PlaceInstitutionEvent".equals(prefix)) {
      return factory.getPlaceInstitutionEventTokenizer();
    }
    if ("PlaceQuestionDetails".equals(prefix)) {
      return factory.getPlaceQuestionDetailsTokenizer();
    }
    if ("PlaceOpenDemand".equals(prefix)) {
      return factory.getPlaceOpenDemandTokenizer();
    }
    if ("PlaceAcceptAssQuestion".equals(prefix)) {
      return factory.getPlaceAcceptAssQuestionTokenizer();
    }
    if ("PlaceAssesment".equals(prefix)) {
      return factory.getPlaceAssesmentTokenizer();
    }
    if ("PlaceUserDetailsEvent".equals(prefix)) {
      return factory.getPlaceUserDetailsEventTokenizer();
    }
    if ("PlaceUser".equals(prefix)) {
      return factory.getPlaceUserTokenizer();
    }
    if ("PlaceSystemOverview".equals(prefix)) {
      return factory.getPlaceSystemOverviewTokenizer();
    }
    if ("PlaceAcceptAnswer".equals(prefix)) {
      return factory.getPlaceAcceptAnswerTokenizer();
    }
    if ("PlaceAssesmentDetails".equals(prefix)) {
      return factory.getPlaceAssesmentDetailsTokenizer();
    }
    if ("PlaceQuestiontypes".equals(prefix)) {
      return factory.getPlaceQuestiontypesTokenizer();
    }
    return null;
  }

}
