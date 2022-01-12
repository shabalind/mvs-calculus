  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: [s1]
    var p1: [s2]
  }
  func f18(_ v0: Double) -> Double {
    var v3: Double = v0
    var v6: Double = v0
    var v4: Double = v6
    var v7: Double = v0
    var v5: Double = v7
    var v8: Double = v0
    var v1: Double = v3
    let v22: [Double] = [v4]
    let v9: Double = v22[0]
    let v12: Double = v22[0]
    let v13: Double = v22[0]
    var v28: Double = v8
    var v29: Double = v1
    v7 = v0
    let v20: Double = v22[0]
    let v56: [Double] = [v20, v9, v6, v9, v8]
    var v64: [Double] = v56
    v29 = v5
    let v48: Double = v22[0]
    var v50: [Double] = v64
    let v74: Double = v22[0]
    v50[2] = v13
    var v84: [Double] = v50
    v84 = v56
    v84[0] = v48
    v84[0] = v12
    v28 = v74
    v84[0] = v28
    v50[3] = v29
    var v165: [Double] = v84
    let v136: Double = v165[2]
    return v136
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    var v16: Double = v1
    let v14: Double = f18(v16)
    let v94: Double = f18(v14)
    return v94
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]]))], p1: [s2(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]]))])]
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
