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

package io.crossbar.autobahn.wamp.interfaces;

import java8.util.concurrent.CompletableFuture;

import io.crossbar.autobahn.wamp.Session;
import io.crossbar.autobahn.wamp.messages.Challenge;
import io.crossbar.autobahn.wamp.messages.Authenticate;


public interface IAuthenticator {
    CompletableFuture<Authenticate> onChallenge(Session session, Challenge challenge);
    String getAuthMethod();
}
