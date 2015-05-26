#!/bin/env python

from util import BaseToaster
from BaseWorker import BaseWorker

class PingWorker(BaseWorker):
    def activity(self, context, task):
        util = BaseToaster()
        status = util.get_status(context.get_hostname())
        if status['SSH'] == 'OK':
            return 'Succeed'
        else:
            return 'Fail'

