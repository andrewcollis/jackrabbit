/*
 * Copyright 2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.webdav;

/**
 * <code>DavSessionProvider</code> is an interface for components that
 * can initiate and complete {@link DavSession}s. A provider is
 * responsible for supplying references from a {@link WebdavRequest}
 * to a {@link DavSession} when acquired and removing the references
 * when released.

 */
public interface DavSessionProvider {

    /**
     * Acquires a DavSession. Upon success, the WebdavRequest will
     * reference that session.
     *
     * A session will not be available if credentials can not be found
     * in the request (meaning that the  request has not been
     * authenticated).
     *
     * @param request
     * @throws DavException if a problem occurred while obtaining the
     * session
     */
    public void acquireSession(WebdavRequest request) throws DavException;

    /**
     * Releases the reference from the request to the session.
     *
     * @param request
     */
    public void releaseSession(WebdavRequest request);
}
