"use strict";(globalThis.webpackChunk=globalThis.webpackChunk||[]).push([["topic-suggestions","vendors-node_modules_github_remote-form_dist_index_js-node_modules_delegated-events_dist_index_js"],{65935(a,b,c){c.d(b,{AC:()=>j,rK:()=>i,uT:()=>h});class ErrorWithResponse extends Error{constructor(a,b){super(a),this.response=b}}function d(){let a,b,c=new Promise(function(c,d){a=c,b=d});return[c,a,b]}let e,f=[],g=[];function h(a){f.push(a)}function i(a){g.push(a)}function j(a,b){e||(e=new Map,document.addEventListener("submit",k));let c=e.get(a)||[];e.set(a,[...c,b])}function k(a){if(!(a.target instanceof HTMLFormElement)||a.defaultPrevented)return;let b=a.target,c=function(a){let b=[];for(let c of e.keys())if(a.matches(c)){let d=e.get(c)||[];b.push(...d)}return b}(b);if(0===c.length)return;let h=m(b),[i,j,k]=d();a.preventDefault(),l(c,b,h,i).then(async a=>{if(a){for(let c of g)await c(b);n(h).then(j,k).catch(()=>{}).then(()=>{for(let a of f)a(b)})}else b.submit()},a=>{b.submit(),setTimeout(()=>{throw a})})}async function l(a,b,c,e){let f=!1;for(let g of a){let[h,i]=d(),j=()=>(f=!0,i(),e),k={text:j,json:()=>(c.headers.set("Accept","application/json"),j()),html:()=>(c.headers.set("Accept","text/html"),j())};await Promise.race([h,g(b,k,c)])}return f}function m(a){let b={method:a.method||"GET",url:a.action,headers:new Headers({"X-Requested-With":"XMLHttpRequest"}),body:null};if("GET"===b.method.toUpperCase()){let c=function(a){let b=new URLSearchParams,c=new FormData(a).entries();for(let[d,e]of[...c])b.append(d,e.toString());return b.toString()}(a);c&&(b.url+=(~b.url.indexOf("?")?"&":"?")+c)}else b.body=new FormData(a);return b}async function n(a){let b=await window.fetch(a.url,{method:a.method,body:null!==a.body?a.body:void 0,headers:a.headers,credentials:"same-origin"}),c={url:b.url,status:b.status,statusText:b.statusText,headers:b.headers,text:"",get json(){let d=this,e=JSON.parse(d.text);return delete d.json,d.json=e,d.json},get html(){let f=this;return delete f.html,f.html=function(a,b){let c=a.createElement("template");return c.innerHTML=b,a.importNode(c.content,!0)}(document,f.text),f.html}},g=await b.text();if(c.text=g,b.ok)return c;throw new ErrorWithResponse("request failed",c)}},59753(a,b,c){function d(){if(!(this instanceof d))return new d;this.size=0,this.uid=0,this.selectors=[],this.selectorObjects={},this.indexes=Object.create(this.indexes),this.activeIndexes=[]}c.d(b,{f:()=>B,on:()=>A});var e,f=window.document.documentElement,g=f.matches||f.webkitMatchesSelector||f.mozMatchesSelector||f.oMatchesSelector||f.msMatchesSelector;d.prototype.matchesSelector=function(a,b){return g.call(a,b)},d.prototype.querySelectorAll=function(a,b){return b.querySelectorAll(a)},d.prototype.indexes=[];var h=/^#((?:[\w\u00c0-\uFFFF\-]|\\.)+)/g;d.prototype.indexes.push({name:"ID",selector:function(a){var b;if(b=a.match(h))return b[0].slice(1)},element:function(a){if(a.id)return[a.id]}});var i=/^\.((?:[\w\u00c0-\uFFFF\-]|\\.)+)/g;d.prototype.indexes.push({name:"CLASS",selector:function(a){var b;if(b=a.match(i))return b[0].slice(1)},element:function(a){var b=a.className;if(b){if("string"==typeof b)return b.split(/\s/);if("object"==typeof b&&"baseVal"in b)return b.baseVal.split(/\s/)}}});var j=/^((?:[\w\u00c0-\uFFFF\-]|\\.)+)/g;d.prototype.indexes.push({name:"TAG",selector:function(a){var b;if(b=a.match(j))return b[0].toUpperCase()},element:function(a){return[a.nodeName.toUpperCase()]}}),d.prototype.indexes.default={name:"UNIVERSAL",selector:function(){return!0},element:function(){return[!0]}},e="function"==typeof window.Map?window.Map:function(){function a(){this.map={}}return a.prototype.get=function(a){return this.map[a+" "]},a.prototype.set=function(a,b){this.map[a+" "]=b},a}();var k=/((?:\((?:\([^()]+\)|[^()]+)+\)|\[(?:\[[^\[\]]*\]|['"][^'"]*['"]|[^\[\]'"]+)+\]|\\.|[^ >+~,(\[\\]+)+|[>+~])(\s*,\s*)?((?:.|\r|\n)*)/g;function l(a,b){var c,d,e,f,g,h,i=(a=a.slice(0).concat(a.default)).length,j=b,l=[];do if(k.exec(""),(e=k.exec(j))&&(j=e[3],e[2]||!j)){for(c=0;c<i;c++)if(g=(h=a[c]).selector(e[1])){for(d=l.length,f=!1;d--;)if(l[d].index===h&&l[d].key===g){f=!0;break}f||l.push({index:h,key:g});break}}while(e)return l}function m(a,b){var c,d,e;for(c=0,d=a.length;c<d;c++)if(e=a[c],b.isPrototypeOf(e))return e}function n(a,b){return a.id-b.id}d.prototype.logDefaultIndexUsed=function(){},d.prototype.add=function(a,b){var c,d,f,g,h,i,j,k,n=this.activeIndexes,o=this.selectors,p=this.selectorObjects;if("string"==typeof a){for(d=0,p[(c={id:this.uid++,selector:a,data:b}).id]=c,j=l(this.indexes,a);d<j.length;d++)g=(k=j[d]).key,f=k.index,h=m(n,f),h||((h=Object.create(f)).map=new e,n.push(h)),f===this.indexes.default&&this.logDefaultIndexUsed(c),i=h.map.get(g),i||(i=[],h.map.set(g,i)),i.push(c);this.size++,o.push(a)}},d.prototype.remove=function(a,b){if("string"==typeof a){var c,d,e,f,g,h,i,j,k=this.activeIndexes,m=this.selectors=[],n=this.selectorObjects,o={},p=1===arguments.length;for(e=0,c=l(this.indexes,a);e<c.length;e++)for(d=c[e],f=k.length;f--;)if(h=k[f],d.index.isPrototypeOf(h)){if(i=h.map.get(d.key))for(g=i.length;g--;)(j=i[g]).selector===a&&(p||j.data===b)&&(i.splice(g,1),o[j.id]=!0);break}for(e in o)delete n[e],this.size--;for(e in n)m.push(n[e].selector)}},d.prototype.queryAll=function(a){if(!this.selectors.length)return[];var b,c,d,e,f,g,h,i,j={},k=[],l=this.querySelectorAll(this.selectors.join(", "),a);for(b=0,d=l.length;b<d;b++)for(c=0,f=l[b],e=(g=this.matches(f)).length;c<e;c++)j[(i=g[c]).id]?h=j[i.id]:(h={id:i.id,selector:i.selector,data:i.data,elements:[]},j[i.id]=h,k.push(h)),h.elements.push(f);return k.sort(n)},d.prototype.matches=function(a){if(!a)return[];var b,c,d,e,f,g,h,i,j,k,l,m=this.activeIndexes,o={},p=[];for(b=0,e=m.length;b<e;b++)if(i=(h=m[b]).element(a)){for(c=0,f=i.length;c<f;c++)if(j=h.map.get(i[c]))for(d=0,g=j.length;d<g;d++)!o[l=(k=j[d]).id]&&this.matchesSelector(a,k.selector)&&(o[l]=!0,p.push(k))}return p.sort(n)};var o={},p={},q=new WeakMap,r=new WeakMap,s=new WeakMap,t=Object.getOwnPropertyDescriptor(Event.prototype,"currentTarget");function u(a,b,c){var d=a[b];return a[b]=function(){return c.apply(a,arguments),d.apply(a,arguments)},a}function v(){q.set(this,!0)}function w(){q.set(this,!0),r.set(this,!0)}function x(){return s.get(this)||null}function y(a,b){t&&Object.defineProperty(a,"currentTarget",{configurable:!0,enumerable:!0,get:b||t.get})}function z(a){if(function(a){try{return a.eventPhase,!0}catch(b){return!1}}(a)){var b=(1===a.eventPhase?p:o)[a.type];if(b){var c=function(a,b,c){var d=[],e=b;do{if(1!==e.nodeType)break;var f=a.matches(e);if(f.length){var g={node:e,observers:f};c?d.unshift(g):d.push(g)}}while(e=e.parentElement)return d}(b,a.target,1===a.eventPhase);if(c.length){u(a,"stopPropagation",v),u(a,"stopImmediatePropagation",w),y(a,x);for(var d=0,e=c.length;d<e&&!q.get(a);d++){var f=c[d];s.set(a,f.node);for(var g=0,h=f.observers.length;g<h&&!r.get(a);g++)f.observers[g].data.call(f.node,a)}s.delete(a),y(a)}}}}function A(a,b,c){var e=arguments.length>3&& void 0!==arguments[3]?arguments[3]:{},f=!!e.capture,g=f?p:o,h=g[a];h||(h=new d,g[a]=h,document.addEventListener(a,z,f)),h.add(b,c)}function B(a,b,c){return a.dispatchEvent(new CustomEvent(b,{bubbles:!0,cancelable:!0,detail:c}))}},98249(a,b,c){c.d(b,{D:()=>g,a:()=>f});var d=c(2825),e=c(75662);async function f(a,b,c){let f=new Request(b,c);f.headers.append("X-Requested-With","XMLHttpRequest");let g=await self.fetch(f);if(g.status<200||g.status>=300)throw Error(`HTTP ${g.status}${g.statusText||""}`);return(0,d.t)((0,d.P)(a),g),(0,e.r)(a,await g.text())}function g(a,b,c=1e3){return async function c(d){let e=new Request(a,b);e.headers.append("X-Requested-With","XMLHttpRequest");let f=await self.fetch(e);if(f.status<200||f.status>=300)throw Error(`HTTP ${f.status}${f.statusText||""}`);if(200===f.status)return f;if(202===f.status)return await new Promise(a=>setTimeout(a,d)),c(1.5*d);throw Error(`Unexpected ${f.status} response status from poll endpoint`)}(c)}},2825(a,b,c){function d(a){let b=[...a.querySelectorAll("meta[name=html-safe-nonce]")].map(a=>a.content);if(b.length<1)throw Error("could not find html-safe-nonce on document");return b}c.d(b,{P:()=>d,t:()=>e});class ResponseError extends Error{constructor(a,b){super(`${a} for HTTP ${b.status}`),this.response=b}}function e(a,b,c=!1){let d=b.headers.get("content-type")||"";if(!c&&!d.startsWith("text/html"))throw new ResponseError(`expected response with text/html, but was ${d}`,b);if(c&&!(d.startsWith("text/html")||d.startsWith("application/json")))throw new ResponseError(`expected response with text/html or application/json, but was ${d}`,b);let e=b.headers.get("x-html-safe");if(e){if(!a.includes(e))throw new ResponseError("response X-HTML-Safe nonce did not match",b)}else throw new ResponseError("missing X-HTML-Safe nonce",b)}},75662(a,b,c){c.d(b,{r:()=>d});function d(a,b){let c=a.createElement("template");return c.innerHTML=b,a.importNode(c.content,!0)}},29352(a,b,c){var d=c(98249),e=c(59753),f=c(65935);function g(a){let b=a.querySelector(".js-topic-suggestions-box"),c=b.querySelector(".js-topic-suggestion");c||b.remove()}function h(a){let b=a.closest(".js-topic-save-notice-container"),c=b.querySelector(".js-repo-topics-save-notice");c.classList.remove("d-none"),c.classList.add("d-inline-block","anim-fade-in"),setTimeout(()=>{c.classList.remove("d-inline-block"),c.classList.add("d-none")},1900)}async function i(a){let b=a.querySelector(".js-topic-suggestions-container");if(!b)return;let c=b.getAttribute("data-url");if(!c)throw Error("could not get url");let e=await (0,d.a)(document,c);b.innerHTML="",b.appendChild(e)}(0,e.on)("click",".js-accept-topic-button",function(a){let b=a.currentTarget,c=b.closest(".js-topic-form-area"),d=b.closest(".js-topic-suggestion"),e=c.querySelector(".js-template"),f=c.querySelector(".js-tag-input-selected-tags"),h=e.cloneNode(!0),i=b.getAttribute("data-topic-name")||"";h.querySelector("input").value=i,h.querySelector(".js-placeholder-tag-name").replaceWith(i),h.classList.remove("d-none","js-template"),f.appendChild(h),d.remove(),g(c)}),(0,f.AC)(".js-accept-topic-form",async function(a,b){await b.html();let c=a.closest(".js-topic-form-area"),d=a.closest(".js-topic-suggestion"),e=c.querySelector(".js-template"),f=c.querySelector(".js-tag-input-selected-tags"),j=e.cloneNode(!0),k=d.querySelector('input[name="input[name]"]').value;j.querySelector("input").value=k,j.querySelector(".js-placeholder-tag-name").replaceWith(k),j.classList.remove("d-none","js-template"),f.appendChild(j),d.remove(),i(c),g(c),h(a)}),(0,e.on)("click",".js-decline-topic-button",function(a){let b=a.currentTarget,c=b.closest(".js-topic-form-area"),d=b.closest(".js-topic-suggestion");setTimeout(()=>{d.remove(),g(c)},0)}),(0,f.AC)(".js-decline-topic-form",async function(a,b){await b.html(),h(a);let c=a.closest(".js-topic-form-area"),d=a.closest(".js-topic-suggestion");d.remove(),i(c),g(c)})}},a=>{var b,c,d=(b=29352,a(a.s=29352))}])
//# sourceMappingURL=topic-suggestions-fe68547a06f6.js.map