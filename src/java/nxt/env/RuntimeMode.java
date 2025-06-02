/*
 * Copyright © 2013-2016 The Nxt Core Developers.
 * Copyright © 2016-2022 Jelurida IP B.V.
 *
 * See the LICENSE.txt file at the top-level directory of this distribution
 * for licensing information.
 *
 * Unless otherwise agreed in a custom licensing agreement with Jelurida B.V.,
 * no part of the Nxt software, including this file, may be copied, modified,
 * propagated, or distributed except according to the terms contained in the
 * LICENSE.txt file.
 *
 * Removal or modification of this copyright notice is prohibited.
 *
 */

package nxt.env;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

public interface RuntimeMode {

    void init();

    void setServerStatus(ServerStatus status, URI wallet, File logFileDir);

    void launchDesktopApplication();

    void shutdown();

    void alert(String message);

    default List<String> getCopyrightMessage() {
        return Arrays.asList(
                "Copyright © 2013-2016 The Nxt Core Developers.",
                "Copyright © 2016-2022 Jelurida IP B.V.",
                "Distributed under the Jelurida Public License version 1.2 for the Nxt Public Blockchain Platform, with ABSOLUTELY NO WARRANTY."
        );
    }
}
