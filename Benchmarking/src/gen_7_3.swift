  import Dispatch
  func f103(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[0]
    var v3: [[Double]] = v1
    let v2: [Double] = v3[0]
    var v7: [Double] = v2
    v3[0] = v7
    let v6: Double = v4[0]
    v7[0] = v6
    var v9: [[Double]] = v3
    let v20: [[[Double]]] = [v9, v9, v0, v3, v1, v9, v0]
    v9[0] = v4
    let v13: Double = v4[0]
    v7[0] = v13
    v3 = v1
    let v32: Double = v2[0]
    var v21: [[[Double]]] = v20
    var v29: [[[Double]]] = v21
    var v41: [[[Double]]] = v29
    let v67: [[Double]] = v41[3]
    v7[0] = v13
    v7[0] = v32
    return v67
  }
  func f97(_ v0: [[Double]]) -> [[Double]] {
    let v2: [Double] = v0[0]
    let v5: [[Double]] = f103(v0, v0)
    var v7: [[Double]] = v0
    var v8: [[Double]] = v7
    var v1: [[Double]] = v0
    var v4: [[Double]] = v0
    v4[0] = v2
    let v10: [[Double]] = f103(v7, v0)
    let v36: [Double] = v4[0]
    let v18: [[Double]] = f103(v5, v0)
    let v31: [[[Double]]] = [v18, v18]
    let v15: [[Double]] = f103(v8, v10)
    var v92: [[[Double]]] = v31
    v92[1] = v18
    let v14: [Double] = v18[0]
    var v26: [[[Double]]] = v92
    let v29: [[Double]] = f103(v8, v8)
    v8[0] = v2
    let v55: [[Double]] = f103(v8, v1)
    let v35: [[Double]] = v26[0]
    v7[0] = v14
    var v47: [[[Double]]] = v31
    let v60: [[Double]] = f103(v0, v7)
    v4[0] = v36
    let v50: [[Double]] = f103(v29, v35)
    v4[0] = v2
    let v65: [[Double]] = f103(v50, v60)
    let v37: [[Double]] = f103(v50, v4)
    let v84: [[Double]] = v47[0]
    v1 = v65
    let v54: [[[Double]]] = [v55, v37, v84]
    var v134: [[[Double]]] = v54
    let v155: [[Double]] = v134[2]
    v92[1] = v15
    return v155
  }
  func f96(_ v0: [[Double]]) -> [[Double]] {
    let v6: [[Double]] = f103(v0, v0)
    let v8: [[Double]] = f103(v0, v6)
    let v1: [[Double]] = f103(v8, v6)
    let v4: [[Double]] = f103(v8, v1)
    let v28: [[Double]] = f97(v1)
    let v12: [[Double]] = f103(v0, v1)
    let v11: [[Double]] = f103(v12, v28)
    let v30: [[Double]] = f103(v8, v4)
    let v38: [[Double]] = f97(v12)
    let v46: [[Double]] = f103(v8, v38)
    let v27: [[Double]] = f103(v30, v46)
    let v61: [[Double]] = f103(v6, v11)
    let v48: [[Double]] = f103(v27, v61)
    return v48
  }
  func f85(_ v0: [[Double]]) -> [[Double]] {
    let v6: [[Double]] = f96(v0)
    let v3: [[Double]] = f103(v6, v6)
    var v4: [[Double]] = v6
    let v2: [[[Double]]] = [v0, v0, v4, v4, v4, v3, v3]
    var v1: [[[Double]]] = v2
    var v8: [[[Double]]] = v2
    let v17: [[Double]] = f96(v6)
    v1 = v8
    var v11: [[[Double]]] = v1
    let v10: [[Double]] = v2[0]
    v4 = v10
    let v20: [[[[Double]]]] = [v8, v8, v11, v2, v11, v8]
    var v33: [[[Double]]] = v11
    var v42: [[[[Double]]]] = v20
    var v28: [[[[Double]]]] = v20
    v28[2] = v2
    let v32: [[[Double]]] = v42[5]
    var v49: [[[Double]]] = v33
    v28[2] = v33
    var v98: [[[[Double]]]] = v28
    var v38: [[[Double]]] = v49
    v42[1] = v38
    v28 = v98
    let v53: [[[Double]]] = v98[3]
    let v70: [[Double]] = v32[3]
    v28[4] = v8
    v8[5] = v6
    let v104: [[Double]] = f103(v70, v17)
    v42[4] = v53
    return v104
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v7: [[Double]] = f85(v1)
    let v10: [Double] = v7[0]
    let v13: Double = v10[0]
    return v13
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0]]
    let v2: [[Double]] = [[2.0], [3.0], [4.0]]
    let v3: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
