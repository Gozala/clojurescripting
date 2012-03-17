(ns clojurescripting.core)

(defn set-html
  "Sets `.innerHTML` of the given tagert element to the give `html`"
  [target & html]
  (set! target.innerHTML (apply str html)))

(defn set-text
  "Sets `.textContent` of the given `tagret`  to the given `text`"
  [target & text]
  (set! target.textContent (apply str text)))

;; Ineject "Hello world!" into document body.
(set-html document.body
          "<div style='background: black; color: white;'>"
          "<p>Hello world!</p>"
          "</div>")
