  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f30(_ v0: Double) -> Double {
    var v6: Double = v0
    let v3: Double = v6 * v0
    let v4: Double = v6 * v3
    var v2: Double = v6
    var v1: Double = v2
    var v7: Double = v3
    var v15: Double = v4
    let v21: [Double] = [v15, v4]
    var v22: [Double] = v21
    v22[1] = v7
    v22[0] = v0
    v22[0] = v1
    let v13: Double = v22[0]
    v6 = v7
    return v13
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v4: Double = f30(v1)
    let v12: Double = f30(v1)
    let v7: Double = f30(v1)
    var v19: Double = v1
    var v51: Double = v12
    let v30: Double = f30(v51)
    let v38: [Double] = [v51, v4, v19, v1, v30, v7]
    let v49: Double = v38[5]
    v51 = v1
    var v56: [Double] = v38
    let v61: Double = f30(v1)
    v56[3] = v49
    v56[3] = v61
    var v74: [Double] = v56
    let v96: Double = v74[1]
    v74[1] = v7
    return v96
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])
    let v1: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
