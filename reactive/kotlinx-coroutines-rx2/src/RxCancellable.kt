/*
 * Copyright 2016-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.rx2

import io.reactivex.functions.*
import kotlinx.coroutines.*

internal class RxCancellable(private val job: Job) : Cancellable {
    override fun cancel() {
        job.cancel()
    }
}