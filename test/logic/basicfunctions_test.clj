(ns logic.basicfunctions-test
  (:require [clojure.test :refer :all]
            [logic.util :refer :all]))

(deftest nand-test
    (is (= false (nand true true)))
    (is (= true (nand true false)))
    (is (= true (nand false true)))
    (is (= true (nand false false)))
    
    (is (= false (nand true true true)))
    (is (= true (nand true true false)))
    (is (= true (nand true false true)))
    (is (= true (nand true false false)))
    (is (= true (nand false true true)))
    (is (= true (nand false true false)))
    (is (= true (nand false false true)))
    (is (= true (nand false false false))))

(deftest nand-test'
  (is (= '(not (and a b)) (macroexpand '(nand a b))))
  (is (= '(not (and a b c)) (macroexpand '(nand a b c))))) 

(deftest nor-test
    (is (= false (nor true true)))
    (is (= false (nor true false)))
    (is (= false (nor false true)))
    (is (= true (nor false false)))
    
    (is (= false (nor true true true)))
    (is (= false (nor true true false)))
    (is (= false (nor true false true)))
    (is (= false (nor true false false)))
    (is (= false (nor false true true)))
    (is (= false (nor false true false)))
    (is (= false (nor false false true)))
    (is (= true (nor false false false))))

(deftest nor-test'
  (is (= '(not (or a b)) (macroexpand-1 '(nor a b))))
  (is (= '(not (or a b c)) (macroexpand-1 '(nor a b c))))) 

(deftest impl-test
    (is (= true (impl true true)))
    (is (= false (impl true false)))
    (is (= true (impl false true)))
    (is (= true (impl false false))))

(deftest impl-test'
  (is (= '(or (not a) b) (macroexpand-1 '(impl a b)))))

(deftest nimpl-test
    (is (= false (nimpl true true)))
    (is (= true (nimpl true false)))
    (is (= false (nimpl false true)))
    (is (= false (nimpl false false))))

(deftest nimpl-test'
  (is (= '(not (or (not a) b))) (macroexpand-1 '(nimpl a b))))

(deftest equiv-test
    (is (= true (equiv true true)))
    (is (= false (equiv true false)))
    (is (= false (equiv false true)))
    (is (= true (equiv false false)))
    
    (is (= true (equiv true true true)))
    (is (= false (equiv true true false)))
    (is (= false (equiv true false true)))
    (is (= false (equiv true false false)))
    (is (= false (equiv false true true)))
    (is (= false (equiv false true false)))
    (is (= false (equiv false false true)))
    (is (= true (equiv false false false))))

(deftest equiv-test'
  (is (= '(or (and a b) (and (not a) (not b))) (macroexpand-1 '(equiv a b))))
  (is (= '(or (and a b c) (and (not a) (not b) (not c))) 
         (macroexpand-1 '(equiv a b c)))))

(deftest cimpl-test
    (is (= true (cimpl true true)))
    (is (= true (cimpl true false)))
    (is (= false (cimpl false true)))
    (is (= true (cimpl false false))))

(deftest cimpl-test'
  (is (= '(or (not b) a) (macroexpand-1 '(cimpl a b)))))

(deftest ncimpl-test
    (is (= false (ncimpl true true)))
    (is (= false (ncimpl true false)))
    (is (= true (ncimpl false true)))
    (is (= false (ncimpl false false))))

(deftest ncimpl-test'
  (is (= '(not (cimpl a b)) (macroexpand-1 '(ncimpl a b)))))

(deftest xor-test
    (is (= false (xor true true)))
    (is (= true (xor true false)))
    (is (= true (xor false true)))
    (is (= false (xor false false))))

(deftest xor-test'
  (is (= '(not (equiv a b)) (macroexpand-1 '(xor a b)))))

(deftest ite-test
  (is (= true  (ite true  true  true)))
  (is (= true  (ite true  true  false)))
  (is (= false (ite true  false true)))
  (is (= false (ite true  false false)))
  (is (= true  (ite false true  true)))
  (is (= false (ite false true  false)))
  (is (= true  (ite false false true)))
  (is (= false (ite false false false))))

(deftest ite-test'
  (is (= '(or (and i t) (and (not i) e) (macroexpand-1 '(ite i t e))))))

(deftest min-kof-test
  (is (= '(or a b c) (min-kof 1 '(a b c))))
  (is (= '(and (or a b) (or a c) (or b c)) (min-kof 2 '(a b c))))
  (is (= '(and a b c) (min-kof 3 '(a b c)))))

(deftest max-kof-test
  (is (= '(and (not a) (not b) (not c)) (max-kof 0 '(a b c))))
  (is (= '(and (or (not a) (not b)) (or (not a) (not c)) (or (not b) (not c)))
         (max-kof 1 '(a b c))))
  (is (= '(or (not a) (not b) (not c) (max-kof 2 '(a b c))))))

(deftest combine-syms-test
  (is (= 'a-b (combine-syms 'a 'b)))
  (is (= 'a-b-c (combine-syms 'a 'b 'c))))