  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v4: s0 = v0[0]
    let v6: [[Double]] = v4.p0
    let v8: [Double] = v6[1]
    let v13: [[Double]] = v4.p0
    var v25: [[Double]] = v13
    let v48: [Double] = v25[1]
    let v27: Double = v8[0]
    let v56: Double = v48[0]
    let v62: Double = v56 * v56
    let v51: Double = v27 * v62
    let v228: Double = v27 * v27
    let v155: Double = v228 / v51
    return v155
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]
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
