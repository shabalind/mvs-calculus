  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    var v5: Double = v1
    let v6: [[Double]] = v0.p0
    let v8: [Double] = v0.p1
    let v7: [Double] = v0.p1
    let v30: [Double] = v6[0]
    let v13: Double = v30[0]
    let v17: Double = v8[2]
    let v31: Double = v7[2]
    let v16: [Double] = [v5, v17, v31, v17, v13]
    var v33: [Double] = v16
    let v58: [[Double]] = [v33, v16]
    var v44: [[Double]] = v58
    let v170: [Double] = v44[0]
    let v158: Double = v170[3]
    return v158
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0, 4.0])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
