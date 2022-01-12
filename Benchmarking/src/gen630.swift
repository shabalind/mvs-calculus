  import Dispatch
  func f39(_ v0: [[Double]]) -> [[Double]] {
    let v9: [Double] = v0[0]
    var v16: [Double] = v9
    var v33: [[Double]] = v0
    v33[1] = v16
    var v20: [[Double]] = v33
    return v20
  }
  func f35(_ v0: [[Double]]) -> [[Double]] {
    let v3: [Double] = v0[0]
    var v7: [[Double]] = v0
    var v4: [Double] = v3
    var v9: [[Double]] = v7
    let v22: [Double] = v0[0]
    v9[0] = v22
    v9[0] = v4
    var v10: [[Double]] = v9
    v7[0] = v22
    var v23: [[Double]] = v10
    var v20: [Double] = v3
    v7[0] = v20
    return v23
  }
  func f34(_ v0: [[Double]]) -> [[Double]] {
    let v7: [Double] = v0[0]
    let v3: [[Double]] = f35(v0)
    let v4: [Double] = v3[0]
    var v6: [[Double]] = v0
    let v11: [[Double]] = f35(v6)
    let v1: Double = v4[0]
    v6[0] = v4
    v6[0] = v7
    var v10: [[Double]] = v11
    let v39: [Double] = v0[0]
    let v14: [Double] = [v1]
    var v20: [Double] = v39
    v6[0] = v20
    v10[0] = v14
    let v41: [[Double]] = f35(v10)
    return v41
  }
  func f33(_ v0: [[Double]]) -> [[Double]] {
    let v5: [Double] = v0[1]
    let v4: [[Double]] = f39(v0)
    let v8: [[Double]] = f39(v4)
    let v11: [Double] = v4[1]
    let v23: [[Double]] = f39(v0)
    var v9: [[Double]] = v23
    let v34: [[Double]] = f39(v8)
    let v22: [[Double]] = f39(v34)
    v9 = v22
    v9[1] = v5
    v9[1] = v11
    return v9
  }
  func f31(_ v0: [[Double]]) -> [[Double]] {
    let v6: [[Double]] = f39(v0)
    let v1: [[Double]] = f39(v6)
    var v3: [[Double]] = v0
    let v7: [[Double]] = f39(v3)
    let v11: [[Double]] = f33(v1)
    let v13: [Double] = v6[0]
    let v2: [[Double]] = f39(v7)
    let v9: [[Double]] = f39(v11)
    v3[1] = v13
    let v17: [Double] = v2[0]
    let v12: [Double] = v9[0]
    let v18: [[Double]] = f39(v11)
    var v72: [[Double]] = v18
    v72[0] = v17
    var v38: [[Double]] = v72
    v38[0] = v13
    let v83: [[Double]] = f33(v38)
    v38[1] = v12
    return v83
  }
  func f30(_ v0: [[Double]]) -> [[Double]] {
    let v2: [[Double]] = f34(v0)
    let v6: [[Double]] = f34(v2)
    let v5: [[Double]] = f34(v6)
    var v1: [[Double]] = v6
    let v3: [[Double]] = f34(v0)
    let v7: [[Double]] = f34(v1)
    let v8: [Double] = v5[0]
    v1[0] = v8
    let v18: [Double] = v0[0]
    let v11: Double = v18[0]
    let v16: [[Double]] = f35(v2)
    let v12: [Double] = v1[0]
    let v20: [[Double]] = f34(v16)
    let v35: [[Double]] = f34(v16)
    var v22: Double = v11
    var v25: [Double] = v12
    var v41: [[Double]] = v7
    let v21: Double = v22 + v11
    v25[0] = v21
    let v32: [[Double]] = f35(v41)
    let v29: [[Double]] = f35(v20)
    var v138: [Double] = v18
    let v49: [[Double]] = f34(v6)
    var v44: [Double] = v8
    var v57: [Double] = v138
    let v61: [[Double]] = f34(v29)
    let v46: [[Double]] = f35(v35)
    let v53: [[Double]] = f35(v3)
    v44 = v57
    let v104: [[[Double]]] = [v49, v3, v53, v49, v46, v20, v32]
    v41[0] = v25
    var v128: [[Double]] = v53
    var v115: [[Double]] = v41
    let v97: [[Double]] = v104[0]
    v115[0] = v44
    let v140: [[Double]] = v104[4]
    v1[0] = v57
    let v118: [[Double]] = f34(v140)
    let v172: [[[Double]]] = [v128, v61, v41, v118, v32, v115]
    let v226: [[Double]] = v172[2]
    v1 = v97
    return v226
  }
  func f15(_ v0: [[Double]]) -> [[Double]] {
    var v6: [[Double]] = v0
    return v6
  }
  func f9(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: [[Double]]) -> [[Double]] {
    let v9: [[Double]] = f15(v2)
    let v11: [[Double]] = f15(v2)
    var v8: [[Double]] = v2
    var v21: [[Double]] = v11
    let v6: [[Double]] = f15(v11)
    let v18: [Double] = v9[0]
    let v15: [[Double]] = f30(v2)
    let v23: [[Double]] = f15(v15)
    v8[0] = v18
    v8[0] = v18
    let v13: [Double] = v21[0]
    let v34: [[[Double]]] = [v11, v11, v2, v6, v23, v8]
    let v33: [[[[Double]]]] = [v34, v34, v34, v34, v34, v34]
    var v78: [[[[Double]]]] = v33
    let v27: [[Double]] = f34(v8)
    let v58: [[[Double]]] = v78[0]
    let v52: [[Double]] = v58[5]
    let v46: [Double] = v27[0]
    v8[0] = v46
    let v168: [[Double]] = f35(v52)
    var v143: [[Double]] = v168
    v143[0] = v13
    let v212: [[Double]] = f34(v143)
    return v212
  }
  func f7(_ v0: [[Double]]) -> [[Double]] {
    var v1: [[Double]] = v0
    let v4: [Double] = v0[0]
    var v3: [[Double]] = v1
    let v5: [[Double]] = f39(v3)
    let v2: [Double] = v5[1]
    let v10: [[Double]] = f31(v3)
    var v15: [[Double]] = v10
    v1[0] = v4
    v3[0] = v2
    return v15
  }
  func f2(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v7: [[Double]] = f15(v1)
    let v9: [[Double]] = f34(v7)
    let v15: [[[Double]]] = [v9]
    var v16: [[[Double]]] = v15
    v16[0] = v1
    let v43: [[[[Double]]]] = [v16, v16, v16, v16, v15, v16]
    var v38: [[[[Double]]]] = v43
    v38 = v43
    let v62: [[[Double]]] = v38[0]
    let v113: [[Double]] = v62[0]
    var v94: [[Double]] = v113
    return v94
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: [Double], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    let v5: [[Double]] = f33(v3)
    let v10: [[Double]] = f2(v5, v2)
    let v12: [[Double]] = f7(v3)
    let v19: [[Double]] = f34(v10)
    let v13: [[Double]] = f9(v2, v12, v19, v12, v12)
    let v20: [Double] = v13[0]
    let v52: Double = v20[0]
    return v52
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0, 2.0]
    let v1: [Double] = [3.0, 4.0, 5.0]
    let v2: [[Double]] = [[6.0]]
    let v3: [[Double]] = [[7.0], [8.0]]
    let v4: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
