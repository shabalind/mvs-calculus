  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  func f2(_ v0: Double) -> Double {
    var v1: Double = v0
    var v9: Double = v1
    var v8: Double = v1
    var v2: Double = v0
    var v5: Double = v2
    let v19: Double = v1 * v9
    var v11: Double = v5
    var v32: Double = v19
    var v25: Double = v5
    let v20: Double = v25 - v25
    let v31: [Double] = [v9]
    var v43: [Double] = v31
    v43[0] = v20
    v43[0] = v32
    v43[0] = v5
    v43[0] = v8
    v43[0] = v11
    var v39: [Double] = v43
    let v38: Double = v39[0]
    v43[0] = v20
    var v42: Double = v38
    v43[0] = v5
    v39[0] = v25
    v39[0] = v25
    return v42
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: [[Double]] = v0.p2
    let v5: [Double] = v3[1]
    let v6: Double = v1 + v1
    let v2: Double = f2(v6)
    let v9: [[Double]] = v0.p2
    var v7: [Double] = v5
    v7[0] = v1
    var v11: [Double] = v5
    v11[0] = v1
    v7[0] = v2
    let v20: Double = f2(v2)
    let v17: [Double] = v9[0]
    v11[0] = v20
    let v47: Double = f2(v6)
    let v18: Double = v11[0]
    let v30: Double = f2(v6)
    let v26: Double = f2(v30)
    let v52: Double = v17[0]
    var v40: Double = v47
    v7[0] = v52
    let v15: Double = v40 * v26
    let v35: Double = f2(v18)
    let v94: Double = f2(v30)
    let v48: Double = f2(v18)
    v11[0] = v35
    v11 = v7
    v7[0] = v15
    v11[0] = v94
    return v48
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]])
    let v1: Double = 7.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 7.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
