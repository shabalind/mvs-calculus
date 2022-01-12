  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v3: s0 = v0[0]
    let v6: [[Double]] = v3.p0
    let v11: [Double] = v6[0]
    let v5: Double = v2 - v2
    let v15: Double = v11[0]
    let v8: [Double] = v6[0]
    let v20: Double = v5 + v2
    var v28: [Double] = v11
    var v33: [Double] = v28
    let v30: Double = v8[0]
    var v49: [Double] = v33
    v33[0] = v15
    v49[0] = v15
    v49[0] = v15
    let v39: Double = v5 + v30
    var v70: Double = v20
    let v66: Double = v8[0]
    v28[0] = v66
    v28[0] = v5
    v28[0] = v70
    v33[0] = v39
    let v106: Double = v49[0]
    return v106
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]])]
    let v1: s0 = s0(p0: [[6.0]], p1: [[7.0], [8.0]])
    let v2: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
