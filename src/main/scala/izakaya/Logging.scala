package izakaya

import org.slf4j.LoggerFactory

trait Logging {

  protected[izakaya] var log = LoggerFactory.getLogger(getClass)

}
