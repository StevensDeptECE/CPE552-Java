"use strict";(globalThis.webpackChunk=globalThis.webpackChunk||[]).push([["app_assets_modules_github_behaviors_keyboard-shortcuts-helper_ts-app_assets_modules_github_di-9b8a64"],{54679(a,b,c){c.d(b,{H:()=>f,v:()=>e});var d=c(59753);function e(){let a=document.getElementById("ajax-error-message");a&&(a.hidden=!1)}function f(){let a=document.getElementById("ajax-error-message");a&&(a.hidden=!0)}(0,d.on)("deprecatedAjaxError","[data-remote]",function(a){let b=a.detail,{error:c,text:d}=b;a.currentTarget===a.target&&"abort"!==c&&"canceled"!==c&&(/<html/.test(d)?(e(),a.stopImmediatePropagation()):setTimeout(function(){!a.defaultPrevented&&e()},0))}),(0,d.on)("deprecatedAjaxSend","[data-remote]",function(){f()}),(0,d.on)("click",".js-ajax-error-dismiss",function(){f()})},94313(a,b,c){c.d(b,{Ty:()=>e,YE:()=>f,Zf:()=>g});var d=c(11793);let e=()=>{let a=document.querySelector("meta[name=keyboard-shortcuts-preference]");return!a||"all"===a.content},f=a=>/Enter|Arrow|Escape|Meta|Control|Esc/.test(a)||a.includes("Alt")&&a.includes("Shift"),g=a=>{let b=(0,d.EL)(a);return!!e()||f(b)}},51754(a,b,c){function d(a){let b=a.getBoundingClientRect();return{top:b.top+window.pageYOffset,left:b.left+window.pageXOffset}}function e(a){let b=a,c=b.ownerDocument;if(!c||!b.offsetParent)return;let d=c.defaultView.HTMLElement;if(b!==c.body){for(;b!==c.body;){if(!(b.parentElement instanceof d))return;b=b.parentElement;let{position:e,overflowY:f,overflowX:g}=getComputedStyle(b);if("fixed"===e||"auto"===f||"auto"===g||"scroll"===f||"scroll"===g)break}return b instanceof Document?null:b}}function f(a,b){let c=b,d=a.ownerDocument;if(!d)return;let e=d.documentElement;if(!e||a===e)return;let f=g(a,c);if(!f)return;c=f._container;let h=c===d.documentElement&&d.defaultView?{top:d.defaultView.pageYOffset,left:d.defaultView.pageXOffset}:{top:c.scrollTop,left:c.scrollLeft},i=f.top-h.top,j=f.left-h.left,k=c.clientHeight,l=c.clientWidth,m=k-(i+a.offsetHeight),n=l-(j+a.offsetWidth);return{top:i,left:j,bottom:m,right:n,height:k,width:l}}function g(a,b){let c=a,d=c.ownerDocument;if(!d)return;let e=d.documentElement;if(!e)return;let f=d.defaultView.HTMLElement,g=0,j=0,k=c.offsetHeight,l=c.offsetWidth;for(;!(c===d.body||c===b);){if(g+=c.offsetTop||0,j+=c.offsetLeft||0,!(c.offsetParent instanceof f))return;c=c.offsetParent}let m,n,o;if(b&&b!==d&&b!==d.defaultView&&b!==d.documentElement&&b!==d.body){if(!(b instanceof f))return;o=b,m=b.scrollHeight,n=b.scrollWidth}else o=e,m=h(d.body,e),n=i(d.body,e);let p=m-(g+k),q=n-(j+l);return{top:g,left:j,bottom:p,right:q,_container:o}}function h(a,b){return Math.max(a.scrollHeight,b.scrollHeight,a.offsetHeight,b.offsetHeight,b.clientHeight)}function i(a,b){return Math.max(a.scrollWidth,b.scrollWidth,a.offsetWidth,b.offsetWidth,b.clientWidth)}c.d(b,{VZ:()=>e,"_C":()=>f,cv:()=>d,oE:()=>g})},41982(a,b,c){c.d(b,{W:()=>d});function d(a,b,c){return[...function*(a,b){for(let c of a){let d=b(c);null!=d&&(yield d)}}(a,a=>{let c=b(a);return null!=c?[a,c]:null})].sort((a,b)=>c(a[1],b[1])).map(([a])=>a)}},54650(a,b,c){c.d(b,{Bt:()=>h,DN:()=>k,KL:()=>n,Se:()=>j,qC:()=>o,sw:()=>l});var d=c(59753),e=c(76177),f=c(54679);function g(a,b,c){return a.dispatchEvent(new CustomEvent(b,{bubbles:!0,cancelable:c}))}function h(a,b){b&&(i(a,b),(0,e.j)(b)),g(a,"submit",!0)&&a.submit()}function i(a,b){if(!(a instanceof HTMLFormElement))throw TypeError("The specified element is not of type HTMLFormElement.");if(!(b instanceof HTMLElement))throw TypeError("The specified element is not of type HTMLElement.");if("submit"!==b.type)throw TypeError("The specified element is not a submit button.");if(!a||a!==b.form)throw Error("The specified element is not owned by the form element.")}function j(a,b){if("boolean"==typeof b){if(a instanceof HTMLInputElement)a.checked=b;else throw TypeError("only checkboxes can be set to boolean value")}else{if("checkbox"===a.type)throw TypeError("checkbox can't be set to string value");a.value=b}g(a,"change",!1)}function k(a,b){for(let c in b){let d=b[c],e=a.elements.namedItem(c);e instanceof HTMLInputElement?e.value=d:e instanceof HTMLTextAreaElement&&(e.value=d)}}function l(a){if(!(a instanceof HTMLElement))return!1;let b=a.nodeName.toLowerCase(),c=(a.getAttribute("type")||"").toLowerCase();return"select"===b||"textarea"===b||"input"===b&&"submit"!==c&&"reset"!==c||a.isContentEditable}function m(a){return new URLSearchParams(a)}function n(a,b){let c=new URLSearchParams(a.search),d=m(b);for(let[e,f]of d)c.append(e,f);return c.toString()}function o(a){return m(new FormData(a)).toString()}(0,d.on)("click",".js-remote-submit-button",async function(a){let b=a.currentTarget,c=b.form;a.preventDefault();let d;try{d=await fetch(c.action,{method:c.method,body:new FormData(c),headers:{Accept:"application/json","X-Requested-With":"XMLHttpRequest"}})}catch{}d&&!d.ok&&(0,f.v)()})},87738(a,b,c){function d(a,b,c=.1){let d=g(a,b,c);if(d&& -1===b.indexOf("/")){let e=a.substring(a.lastIndexOf("/")+1);d+=g(e,b,c)}return d}function e(a,b,c){if(b){let d=a.innerHTML.trim().match(c||function(a){let b=a.toLowerCase().split(""),c="";for(let d=0;d<b.length;d++){let e=b[d],f=e.replace(/[\\^$*+?.()|[\]{}]/g,"\\$&");0===d?c+=`(.*)(${f})`:c+=`([^${f}]*?)(${f})`}return RegExp(`${c}(.*?)$`,"i")}(b));if(!d)return;let e=!1,f=[];for(let g=1;g<d.length;++g){let h=d[g];h&&(g%2==0?e||(f.push("<mark>"),e=!0):e&&(f.push("</mark>"),e=!1),f.push(h))}a.innerHTML=f.join("")}else{let i=a.innerHTML.trim(),j=i.replace(/<\/?mark>/g,"");i!==j&&(a.innerHTML=j)}}c.d(b,{EW:()=>d,Qw:()=>e,qu:()=>h});let f=new Set([" ","-","_"]);function g(a,b,c=.1){let d=a;if(d===b)return 1;let e=d.length,g=0,h=0;for(let i=0;i<b.length;i++){let j=b[i],k=d.indexOf(j.toLowerCase()),l=d.indexOf(j.toUpperCase()),m=Math.min(k,l),n=m> -1?m:Math.max(k,l);if(-1===n)return 0;g+=.1,d[n]===j&&(g+=.1),0===n&&(g+=.9-c,0===i&&(h=1)),f.has(d.charAt(n-1))&&(g+=.9-c),d=d.substring(n+1,e)}let o=b.length,p=g/o,q=(p*(o/e)+p)/2;return h&&q+c<1&&(q+=c),q}function h(a,b){return a.score>b.score?-1:a.score<b.score?1:a.text<b.text?-1:a.text>b.text?1:0}},78459(a,b,c){c.d(b,{Y:()=>l,q:()=>m});var d=c(88149),e=c(86058);let f="dimension_",g,h=["utm_source","utm_medium","utm_campaign","utm_term","utm_content","scid"];try{let i=(0,d.n)("octolytics");delete i.baseContext,g=new e.R(i)}catch(j){}function k(a){let b=(0,d.n)("octolytics").baseContext||{};if(b)for(let c in delete b.app_id,delete b.event_url,delete b.host,b)c.startsWith(f)&&(b[c.replace(f,"")]=b[c],delete b[c]);let e=document.querySelector("meta[name=visitor-payload]");if(e){let g=JSON.parse(atob(e.content));Object.assign(b,g)}let i=new URLSearchParams(window.location.search);for(let[j,k]of i)h.includes(j.toLowerCase())&&(b[j]=k);return Object.assign(b,a)}function l(a){g?.sendPageView(k(a))}function m(a,b={}){let c=document.head?.querySelector('meta[name="current-catalog-service"]')?.content,d=c?{service:c}:{};for(let[e,f]of Object.entries(b))null!=f&&(d[e]=`${f}`);g?.sendEvent(a||"unknown",k(d))}},3626(a,b,c){c.d(b,{vt:()=>q,WF:()=>p,DV:()=>o,jW:()=>u,Nc:()=>l,"$t":()=>e});let d={frequency:.6,recency:.4};function e(a){let b=g(a),c=h(a);return function(a){return f(b.get(a)||0,c.get(a)||0)}}function f(a,b){return a*d.frequency+b*d.recency}function g(a){let b=[...Object.values(a)].reduce((a,b)=>a+b.visitCount,0);return new Map(Object.keys(a).map(c=>[c,a[c].visitCount/b]))}function h(a){let b=function(a,b){return a.sort((a,c)=>b(a)-b(c))}([...Object.keys(a)],b=>a[b].lastVisitedAt),c=b.length;return new Map(b.map((a,b)=>[a,(b+1)/c]))}let i=/^\/orgs\/([a-z0-9-]+)\/teams\/([\w-]+)/,j=[/^\/([^/]+)\/([^/]+)\/?$/,/^\/([^/]+)\/([^/]+)\/blob/,/^\/([^/]+)\/([^/]+)\/tree/,/^\/([^/]+)\/([^/]+)\/issues/,/^\/([^/]+)\/([^/]+)\/pulls?/,/^\/([^/]+)\/([^/]+)\/pulse/],k=[["organization",/^\/orgs\/([a-z0-9-]+)\/projects\/([0-9-]+)/],["repository",/^\/([^/]+)\/([^/]+)\/projects\/([0-9-]+)/]];function l(a){let b=a.match(i);if(b){m(o(b[1],b[2]));return}let c;for(let d=0,e=k.length;d<e;d++){let[f,g]=k[d];if(c=a.match(g)){let h=null,l=null;switch(f){case"organization":h=c[1],l=c[2];break;case"repository":h=`${c[1]}/${c[2]}`,l=c[3]}h&&l&&m(q(h,l));return}}let n;for(let r=0,s=j.length;r<s;r++)if(n=a.match(j[r])){m(p(n[1],n[2]));return}}function m(a){let b=u(),c=n(),d=b[a]||{lastVisitedAt:c,visitCount:0};d.visitCount+=1,d.lastVisitedAt=c,b[a]=d,t(function(a){let b=Object.keys(a);if(b.length<=100)return a;let c=e(a),d=b.sort((a,b)=>c(b)-c(a)).slice(0,50);return Object.fromEntries(d.map(b=>[b,a[b]]))}(b))}function n(){return Math.floor(Date.now()/1e3)}function o(a,b){return`team:${a}/${b}`}function p(a,b){return`repository:${a}/${b}`}function q(a,b){return`project:${a}/${b}`}let r=/^(team|repository|project):[^/]+\/[^/]+(\/([^/]+))?$/,s="jump_to:page_views";function t(a){v(s,JSON.stringify(a))}function u(){let a=w(s);if(!a)return{};let b;try{b=JSON.parse(a)}catch{return t({}),{}}let c={};for(let d in b)d.match(r)&&(c[d]=b[d]);return c}function v(a,b){try{window.localStorage.setItem(a,b)}catch{}}function w(a){try{return window.localStorage.getItem(a)}catch{return null}}},254(a,b,c){c.d(b,{ZG:()=>h,q6:()=>j,w4:()=>i});var d=c(8439);let e=!1,f=new d.Z;function g(a){let b=a.target;if(b instanceof HTMLElement&&b.nodeType!==Node.DOCUMENT_NODE)for(let c of f.matches(b))c.data.call(null,b)}function h(a,b){e||(e=!0,document.addEventListener("focus",g,!0)),f.add(a,b),document.activeElement instanceof HTMLElement&&document.activeElement.matches(a)&&b(document.activeElement)}function i(a,b,c){function d(b){let e=b.currentTarget;e&&(e.removeEventListener(a,c),e.removeEventListener("blur",d))}h(b,function(b){b.addEventListener(a,c),b.addEventListener("blur",d)})}function j(a,b){function c(a){let{currentTarget:d}=a;d&&(d.removeEventListener("input",b),d.removeEventListener("blur",c))}h(a,function(a){a.addEventListener("input",b),a.addEventListener("blur",c)})}},76177(a,b,c){function d(a){let b=a.closest("form");if(!(b instanceof HTMLFormElement))return;let c=e(b);if(a.name){let d=a.matches("input[type=submit]")?"Submit":"",f=a.value||d;c||((c=document.createElement("input")).type="hidden",c.classList.add("js-submit-button-value"),b.prepend(c)),c.name=a.name,c.value=f}else c&&c.remove()}function e(a){let b=a.querySelector("input.js-submit-button-value");return b instanceof HTMLInputElement?b:null}c.d(b,{j:()=>d,u:()=>e})},76932(a,b,c){c.d(b,{RB:()=>d,qC:()=>e,w0:()=>Subscription});class Subscription{constructor(a){this.closed=!1,this.unsubscribe=()=>{a(),this.closed=!0}}}function d(a,b,c,d={capture:!1}){return a.addEventListener(b,c,d),new Subscription(()=>{a.removeEventListener(b,c,d)})}function e(...a){return new Subscription(()=>{for(let b of a)b.unsubscribe()})}},97629(a,b,c){c.d(b,{Z:()=>d});function d(a){var b;return!((b=a).offsetWidth<=0)||!(b.offsetHeight<=0)}}}])
//# sourceMappingURL=app_assets_modules_github_behaviors_keyboard-shortcuts-helper_ts-app_assets_modules_github_di-9b8a64-90e18b621ba9.js.map