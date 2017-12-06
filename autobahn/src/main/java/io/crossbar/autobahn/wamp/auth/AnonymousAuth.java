///////////////////////////////////////////////////////////////////////////////
//
//   AutobahnJava - http://crossbar.io/autobahn
//
//   Copyright (c) Crossbar.io Technologies GmbH and contributors
//
//   Licensed under the MIT License.
//   http://www.opensource.org/licenses/mit-license.php
//
///////////////////////////////////////////////////////////////////////////////

package io.crossbar.autobahn.wamp.auth;

import io.crossbar.autobahn.wamp.messages.Authenticate;
import java8.util.concurrent.CompletableFuture;

import io.crossbar.autobahn.wamp.interfaces.IAuthenticator;
import io.crossbar.autobahn.wamp.messages.Challenge;
import io.crossbar.autobahn.wamp.Session;

public class AnonymousAuth implements IAuthenticator {

    public final String authmethod = "anonymous";
    public final String authid = null;

    public AnonymousAuth () {
    }

    public CompletableFuture<Authenticate> onChallenge(Session session, Challenge challenge) {
        // anonymous authentication in WAMP will NOT invoke this callback!
        // FIXME
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public String getAuthMethod() {
        return "anonymous";
    }
}
