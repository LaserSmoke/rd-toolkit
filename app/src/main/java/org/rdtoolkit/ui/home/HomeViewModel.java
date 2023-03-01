package org.rdtoolkit.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.rdtoolkit.util.UtilsKt;

import org.rdtoolkit.model.session.AppRepository;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> patientId=new MutableLiveData<String>();
    private MutableLiveData<String> testId=new MutableLiveData<String>();

    public MutableLiveData<String> getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientid){
        patientId.setValue(patientid);
    }

    public MutableLiveData<String> getTestId() {
        return testId;
    }

    public void setTestId(String testid){
        testId.setValue(testid);
    }

    AppRepository appRepository;

    public HomeViewModel(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public AppRepository getAppRepository() {
        return appRepository;
    }
}