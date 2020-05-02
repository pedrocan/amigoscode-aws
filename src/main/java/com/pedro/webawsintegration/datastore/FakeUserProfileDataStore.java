package com.pedro.webawsintegration.datastore;

import com.pedro.webawsintegration.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("181ae26e-8c94-4e28-83db-a520b2b5a2a7"),
                "janetjones", null));

        USER_PROFILES.add(new UserProfile(UUID.fromString("d8ea36f1-76c7-48bc-93a5-b35af4629975"),
                "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
