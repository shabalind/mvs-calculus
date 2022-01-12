  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f33(_ v0: s1) -> s1 {
    var v4: s1 = v0
    let v5: [s0] = v4.p1
    v4.p1 = v5
    var v7: [s0] = v5
    let v2: s0 = v7[0]
    var v12: s1 = v4
    let v1: s0 = v7[0]
    let v3: [s0] = v0.p1
    var v11: s1 = v4
    v7[0] = v2
    var v10: s1 = v4
    var v24: s1 = v0
    let v14: s0 = v5[0]
    let v16: [s1] = [v12, v0, v11, v10, v24, v4]
    v7[0] = v14
    var v13: [s1] = v16
    v10.p0 = v7
    v7[0] = v14
    v13[3] = v12
    let v18: [s0] = v4.p1
    let v31: s0 = v3[0]
    var v36: [s0] = v18
    var v33: s0 = v31
    v11.p0 = v7
    v11.p1 = v36
    v12.p1 = v7
    var v46: [s1] = v13
    let v78: s1 = v46[3]
    let v40: [[Double]] = v1.p1
    v13[3] = v0
    var v60: s1 = v78
    v4.p0 = v7
    let v50: [s0] = v4.p1
    v11 = v10
    v33.p1 = v40
    v4.p0 = v50
    v36[0] = v33
    v4.p0 = v7
    return v60
  }
  func f5(_ v0: Double) -> Double {
    var v3: Double = v0
    let v2: [Double] = [v3]
    var v7: Double = v3
    var v6: Double = v0
    var v5: Double = v3
    var v4: Double = v7
    v5 = v3
    let v10: Double = v2[0]
    var v8: [Double] = v2
    var v14: [Double] = v8
    let v16: Double = v4 + v5
    var v9: [Double] = v14
    v5 = v4
    let v13: Double = v9[0]
    v7 = v6
    var v25: Double = v3
    let v32: Double = v14[0]
    let v17: Double = v14[0]
    let v18: Double = v14[0]
    var v27: Double = v25
    let v28: Double = v8[0]
    var v19: [Double] = v8
    v9[0] = v16
    v27 = v18
    v14[0] = v17
    let v21: Double = v19[0]
    v19[0] = v18
    let v20: Double = v8[0]
    var v55: Double = v27
    v14[0] = v6
    v19[0] = v32
    let v38: Double = v19[0]
    var v34: Double = v21
    v8[0] = v55
    v8[0] = v13
    v8[0] = v10
    v3 = v38
    let v46: [Double] = [v28, v13, v38, v20, v16, v25]
    v19[0] = v34
    var v73: [Double] = v46
    v73[3] = v25
    v9[0] = v25
    v34 = v13
    let v43: Double = v73[2]
    return v43
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v3: s1 = f33(v0)
    let v5: [s0] = v3.p1
    let v4: s0 = v5[0]
    let v14: [[Double]] = v4.p1
    let v36: [Double] = v14[0]
    let v34: Double = v36[0]
    let v35: Double = f5(v34)
    return v35
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])])
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
