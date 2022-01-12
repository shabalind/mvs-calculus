  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f23(_ v0: Double) -> Double {
    var v7: Double = v0
    var v5: Double = v0
    var v2: Double = v5
    var v1: Double = v2
    var v6: Double = v7
    let v4: Double = v6 / v7
    var v8: Double = v4
    var v19: Double = v4
    v6 = v1
    let v15: Double = v8 / v19
    let v9: [Double] = [v1, v6, v15, v19, v8, v1, v0]
    var v35: [Double] = v9
    let v13: Double = v35[1]
    let v25: [Double] = [v1]
    let v31: Double = v25[0]
    let v24: [[Double]] = [v35, v35]
    v35[6] = v13
    let v49: [Double] = v24[1]
    var v12: [Double] = v25
    v35[5] = v4
    let v75: Double = v12[0]
    let v43: Double = v49[1]
    v7 = v31
    v35[3] = v75
    return v43
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s0, _ v2: Double) -> Double {
    var v36: Double = v2
    var v22: Double = v36
    let v15: Double = f23(v2)
    let v40: Double = f23(v15)
    let v25: Double = f23(v40)
    let v28: Double = v2 / v22
    let v42: Double = v28 + v25
    v36 = v28
    return v42
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])], p1: s0(p0: [[2.0]], p1: [[3.0]]))]
    let v1: s0 = s0(p0: [[4.0]], p1: [[5.0]])
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
